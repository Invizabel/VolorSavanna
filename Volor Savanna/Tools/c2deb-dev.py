# https://itsfoss.gitlab.io/post/how-to-create-a-simple-deb-debian-package/
import os

os.system("rm -rf VolorSavanna")
os.system("rm -rf volorsavanna")
os.system("git clone https://github.com/Invizabel/VolorSavanna")
os.system("gcc -fPIC -shared -o volorsavanna-dev.so 'VolorSavanna/Volor Savanna/C/VolorSavanna.c'")
os.system("chmod +x volorsavanna-dev.so")
os.system("mkdir -p volor-savanna-dev/DEBIAN")
os.system("mkdir -p volor-savanna-dev/usr/local/bin")

with open("volor-savanna-dev/DEBIAN/control", "w") as file:
    file.write("""Package: volorsavanna-dev
Version: 1.0.0
Architecture: all
Maintainer: Michael Mueller
Description: Volor Savanna is a text adventure game!
""")

with open("volor-savanna-dev/debian-binary", "w") as file:
    file.write("2.0")

os.system("cp volorsavanna-dev.so volor-savanna-dev/usr/local/bin/volorsavanna")
os.system("dpkg-deb --build volor-savanna-dev")
