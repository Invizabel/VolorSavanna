#include <furi.h>
#include <gui/gui.h>
#include <gui/view_dispatcher.h>
#include <gui/modules/text_input.h>
#include <gui/modules/text_box.h>
#include "VolorSavanna.h"

typedef struct {
    ViewDispatcher * view_dispatcher;
    SceneManager * scene_manager;
    TextInput * text_input;
    TextBox * text_box;

    char input_buffer[2];
    FuriString * display_text;
} App;

enum {
    AppViewTextInput, 
    AppViewTextBox, 
};

static void text_input_callback(void * context)
{
    App * app = context;

    // Update display text
    furi_string_set(app->display_text, character_prompt);

    // Push text into text box
    text_box_set_text(app->text_box, furi_string_get_cstr(app->display_text));

    // Switch to display view
    view_dispatcher_switch_to_view(app->view_dispatcher, AppViewTextBox);
}

bool text_box_back_callback(void * context)
{
    App* app = context;

    view_dispatcher_switch_to_view(app->view_dispatcher, AppViewTextInput);

    return true;
}

int32_t VolorSavanna(void * p)
{
    UNUSED(p);
    // Variables needed for game
    char name[7] = "Player";
    char is_choice[18] = "Make your choice ";
    strcpy(is_choice + strlen(is_choice),  name);
    strcpy(is_choice + strlen(is_choice),  ":");

    // Alocating memory
    App * app = malloc(sizeof(App));
    app->display_text = furi_string_alloc();

    // Setup
    Gui * gui = furi_record_open(RECORD_GUI);
    app->view_dispatcher = view_dispatcher_alloc();
    
    view_dispatcher_set_event_callback_context(app->view_dispatcher, app);
    view_dispatcher_set_navigation_event_callback(app->view_dispatcher, text_box_back_callback);

    view_dispatcher_attach_to_gui(app->view_dispatcher, gui, ViewDispatcherTypeFullscreen);

    // Choice View
    app->text_input = text_input_alloc();
    text_input_set_header_text(app->text_input, is_choice);
    text_input_set_result_callback(app->text_input, text_input_callback, app, app->input_buffer, sizeof(app->input_buffer), true);
    view_dispatcher_add_view(app->view_dispatcher, AppViewTextInput, text_input_get_view(app->text_input));

    // Adventure View
    app->text_box = text_box_alloc();
    text_box_set_font(app->text_box, TextBoxFontText);
    text_box_set_focus(app->text_box, TextBoxFocusStart);
    view_dispatcher_add_view(app->view_dispatcher, AppViewTextBox, text_box_get_view(app->text_box));

    // Start Game
    view_dispatcher_switch_to_view(app->view_dispatcher, AppViewTextInput);
    view_dispatcher_run(app->view_dispatcher);

    // Cleanup
    text_input_free(app->text_input);
    text_box_free(app->text_box);
    view_dispatcher_free(app->view_dispatcher);
    furi_string_free(app->display_text);
    furi_record_close(RECORD_GUI);
    free(app);

    return 0;
}