#include "dolphin/dolphin.h"
#include <furi.h>
#include <gui/gui.h>
#include "VolorSavanna.h"

bool is_right = false;
bool is_left = false;
bool pause = false;
char text_str[4096];

static void draw_callback(Canvas* canvas, void * context)
{
    UNUSED(context);
    canvas_clear(canvas);

    if (pause == false)
    {
        snprintf(text_str, sizeof(text_str), "%s", VolorSavannaGame());
        canvas_draw_str(canvas,2,8,text_str);
        pause = true;
    }

    canvas_commit(canvas);
}

static void input_callback(InputEvent* event, void * context)
{
    FuriMessageQueue* queue = (FuriMessageQueue *)context;
    if(event->type == InputTypeShort || event->type == InputTypeRepeat || event->type == InputTypePress)
    {
        if (event->key == InputKeyRight)
        {
            is_right = true;
        }

        if (event->key == InputKeyLeft)
        {
            is_left = true;
        }
    }

    if(event->type == InputTypeRelease)
    {
        if (event->key == InputKeyRight)
        {
            is_right = false;
        }

        if (event->key == InputKeyLeft)
        {
            is_left = false;
        }
    }
    
    furi_message_queue_put(queue, event, FuriWaitForever);
}

int main()
{
    FuriMessageQueue* queue = furi_message_queue_alloc(8, sizeof(InputEvent));
    ViewPort* view_port = view_port_alloc();
    view_port_draw_callback_set(view_port, draw_callback, NULL);
    view_port_input_callback_set(view_port, input_callback, queue);
    Gui * gui = (Gui *)furi_record_open("gui");
    gui_add_view_port(gui, view_port, GuiLayerFullscreen);
    dolphin_deed(DolphinDeedPluginGameStart);

    InputEvent event;
    bool running = true;
    while(running)
    {
        if(furi_message_queue_get(queue, &event, FuriWaitForever) == FuriStatusOk)
        {
            if(event.type == InputTypeShort && event.key == InputKeyBack)
            {
                running = false;
            }
        }
        view_port_update(view_port);
    }

    view_port_enabled_set(view_port, false);
    furi_message_queue_free(queue);
    gui_remove_view_port(gui, view_port);
    view_port_free(view_port);
    furi_record_close(RECORD_GUI);
    return 0;
}