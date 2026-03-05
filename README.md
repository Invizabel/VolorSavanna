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

To use DLL (Python) (Non-Debian Linux):

```
import ctypes
import os
current_directory = os.getcwd()
game = ctypes.CDLL(f"{current_directory}/VolorSavanna.so")
print(game.main())
```

To use DLL (Python) (Debian Linux): git clone https://github.com/Invizabel/VolorSavanna && cd VolorSavanna/Volor\ Savanna/Tools && python3 c2deb.py && sudo dpkg -i volor-savanna.deb

```
import ctypes
import os
game = ctypes.CDLL(f"libvolorsavanna.so")
print(game.main())
```

* To compile to debian package (in the Tools folder): python3 c2deb.py
