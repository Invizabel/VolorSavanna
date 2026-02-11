Volor Savanna is a text adventure game

COMPLETE:
* C
* Python

TODO:
* Go
* TI
* Web

To play:
* Python (Windows): pip install VolorSavanna && python3 -m VolorSavanna
* Python (Linux): python3 -m venv env && source env/bin/activate && pip install VolorSavanna && python3 -m VolorSavanna

To compile to DLL:
* gcc -fPIC -shared -o VolorSavanna.so VolorSavanna.c

To use DLL (Python):

```
import ctypes
import os
current_directory = os.getcwd()
game = ctypes.CDLL(f"{current_directory}/VolorSavanna.so")
print(game.main())
```

Security GCC Flags:
* -Werror -fstack-protector-strong -fstack-protector-all -fstack-clash-protection -D_FORTIFY_SOURCE=2 -fPIE -pie -fno-common -fvisibility=hidden -fno-builtin -fno-plt -pipe -O3
* Example: ```gcc VolorSavanna.c -o VolorSavanna.bin -Werror -fstack-protector-strong -fstack-protector-all -fstack-clash-protection -D_FORTIFY_SOURCE=2 -fPIE -pie -fno-common -fvisibility=hidden -fno-builtin -fno-plt -pipe -O3```
