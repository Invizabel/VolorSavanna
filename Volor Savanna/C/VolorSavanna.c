#include <stdbool.h>
#include <stdio.h>
#include <string.h>
#include "VolorSavanna.h"

int main()
{
    char pause[1];
    printf("%s", name_prompt);
    scanf("%s", name);
    
    while (true)
    {
        printf("%s", character_prompt);;
        scanf("%s", character);
        if (strcmp(character, "e") == 0)
        {
            return 0;
        }
            
        else
        {
            while (true)
            {
                printf("%s", VolorSavannaGame());
                if (level == 0)
                {
                    printf("%s", "\nPress any key to continue!");
                    scanf("%s", pause);
                    break;
                }

                else if (level == -1)
                {
                    level = 0;
                    break;
                }

                else
                {
                    printf("%s", "\nInvalid choice!\nPress any key to continue!");
                    scanf("%s", pause);
                    break;
                }
                
                scanf("%s", choice);
            }

        }
    }
    
    return 0;
}
