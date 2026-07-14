package volor.savanna;

import java.util.Scanner;
import java.util.Random;

public class VolorSavanna {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Scanner myScannern = new Scanner(System.in);
        Random code = new Random();
        Random rand = new Random();
        int math;
        int y = 0;
        double reply;
        System.out.print("What is your name: ");
        String name = myScannern.next();
        System.out.println("");
        System.out.println("You are a member of an African tribe!");
        System.out.println("");
        System.out.println("Roles: 1- Hunter; 2- Farmer; 3- Warrior; 4- Medicine Person; 5- Crafter; 3.14- DLC");
        System.out.print("Choose your role: ");
        reply = myScanner.nextDouble();
        math = code.nextInt(2);
        if (reply == 1) {
            System.out.println("");
            System.out.println("Part 1");
            System.out.println("You have chosen to be a hunter!");
            System.out.println("Do you choose to go hunt or stay put?");
            System.out.println("6- Hunt; 7- Stay put");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 2) {
            System.out.println("");
            System.out.println("Part 1");
            System.out.println("You have chosen to be a farmer!");
            System.out.println("Do you choose to go farm or sleep in?");
            System.out.println("8- Farm; 9- Sleep in");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 3) {
            System.out.println("");
            System.out.println("Part 1");
            System.out.println("You have chosen to be a warrior!");
            System.out.println("Do you choose to go hunt the mighty lion or stay put?");
            System.out.println("10- Hunt the mighty lion; 11- Stay put");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 4) {
            System.out.println("");
            System.out.println("Part 1");
            System.out.println("You have chosen to be a medicine person!");
            System.out.println("A man is very sick with a fever.");
            System.out.println("What do you choose to do?");
            System.out.println("12- Not do anything; 13- Wash him");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 5) {
            System.out.println("");
            System.out.println("Part 1");
            System.out.println("You have chosen to be a crafter!");
            System.out.println("You need to craft some arrows.");
            System.out.println("How do you make them?");
            System.out.println("14- Put red dye on the feathers; 15- Just make them");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 6) {
            System.out.println("");
            System.out.println("Part 2");
            System.out.println("You have chosen to go hunt!");
            System.out.println("You have gone hunting.");
            System.out.println("You didn't find any food.");
            System.out.println("You return to your village.");
            System.out.println("Luckily, the farmer has enough crops to last your tribe a week.");
            System.out.println("Do choose to go hunt right away to make up lost time or do you choose to go eat?");
            System.out.println("16- Hunt; 17- Eat");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 7) {
            System.out.println("");
            System.out.println("Part 2");
            System.out.println("You have chosen to stay put.");
            System.out.println("Your whole village starves.");
            System.out.println("Your whole village parishes from hunger.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 8) {
            System.out.println("");
            System.out.println("Part 2");
            System.out.println("You have chosen to farm!");
            System.out.println("You have had a successful season!");
            System.out.println("You village has a feast.");
            System.out.println("Do you choose to store the rest of the food for winter or distribute the food to the whole village?");
            System.out.println("18- Store the food for later; 19- Distribute the food to the whole village");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 9) {
            System.out.println("");
            System.out.println("Part 2");
            System.out.println("You have chosen to sleep in.");
            System.out.println("A prairie fire destroys you crops and your whole village.");
            System.out.println("Everyone has escaped and survived.");
            System.out.println("Everyone except for one person.");
            System.out.println("You.");
            System.out.println("You have died in the fire.");
            System.out.println("You were burnt into ashes in your sleep.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 10) {
            System.out.println("");
            System.out.println("Part 2");
            System.out.println("You have chosen to hunt the mighty lion!");
            System.out.println("You have been on your journey for about a week now.");
            System.out.println("The trail splits into three sections.");
            System.out.println("Do you choose to go through the canyon?");
            System.out.println("How about the prairie?");
            System.out.println("Or what about continuing through the forest?");
            System.out.println("20- Canyon; 21- Prairie; 22- Forest");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 11) {
            System.out.println("");
            System.out.println("Part 2");
            System.out.println("You have chosen to stay put.");
            System.out.println("Without warning a neigboring tribe attacks.");
            System.out.println("Do you choose to go get your bow and arrows in your hut or do you choose to fight them off with your knife on hand?");
            System.out.println("23- Go get my bow and arrows; 24- Use my knife");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 12) {
            System.out.println("");
            System.out.println("Part 2");
            System.out.println("You have chosen not to do anything.");
            System.out.println("The man dies.");
            System.out.println("The man's family is very angry at you.");
            System.out.println("You are tried for murder.");
            System.out.println("You have been found guilty.");
            System.out.println("So you are put to death.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 13) {
            System.out.println("");
            System.out.println("Part 2");
            System.out.println("You have chosen to wash him.");
            System.out.println("The man recovers from his fever.");
            System.out.println("You are a hero in your village.");
            System.out.println("The chief rewards you with a big meal.");
            System.out.println("The chief offers you a week off.");
            System.out.println("What do you do?");
            System.out.println("25- Take a week off; 26- Tend to more sick people");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 14) {
            System.out.println("");
            System.out.println("Part 2");
            System.out.println("You have chosen to put red dye on the feathers!");
            System.out.println("Because you put red dye on the feathers none were lost so the hunters were able to bring home more food.");
            System.out.println("Because of this you have one month worths of food for the winter!");
            System.out.println("You have been asked to craft some spear heads.");
            System.out.println("How do you make them?");
            System.out.println("27- Put poison on the spear heads; 28- Just make them");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 15) {
            System.out.println("");
            System.out.println("Part 2");
            System.out.println("You have chosen to just make the arrows.");
            System.out.println("Because of this the hunters lost some arrows and didn't bring home much food.");
            System.out.println("Just enough to last a couple days.");
            System.out.println("You have been asked to craft some spear heads.");
            System.out.println("How do you make them?");
            System.out.println("27- Put poison on the spear head; 28- Just make them");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 16) {
            System.out.println("");
            System.out.println("Part 3");
            System.out.println("You have chosen to go hunt!");
            System.out.println("You go on a succesful hunt that should last your tribe a month.");
            System.out.println("However, you are very tired and because you didn't eat, you have become very sick with malnutrition.");
            System.out.println("Unlucky for you, The tribes medicine women is very busy and has a lot of patients to take care of first.");
            System.out.println("Do you wish to wait for the her or tough it out?");
            System.out.println("29- Wait for her; 30- Tough it out");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 17) {
            System.out.println("");
            System.out.println("Part 3");
            System.out.println("You have chosen to eat.");
            System.out.println("You are fully fueled with energy.");
            System.out.println("Do want to go hunting or play a game with the rest of your tribe?");
            System.out.println("31- Hunt; 32- Play a game with the rest of my tribe");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 18) {
            System.out.println("");
            System.out.println("Part 3");
            System.out.println("You have chosen to store the food for later.");
            System.out.println("Because you have chosen to store the food for winter your tribe doesn't go hungry.");
            System.out.println("Last year you grew wheat.");
            System.out.println("Do you choose to grow wheat again this year or farm corn for the first time in your life?");
            System.out.println("33- Grow wheat again; 34- Farm corn");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 19) {
            System.out.println("");
            System.out.println("Part 3");
            System.out.println("You have chosen to distribute the food to the whole village.");
            System.out.println("Everyone has enough food for the whole winter.");
            System.out.println("However, the food rots in a winter storm.");
            System.out.println("Your village dies of starvation.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 20) {
            System.out.println("");
            System.out.println("Part 3");
            System.out.println("You have chosen to go through the canyon!");
            System.out.println("The canyon is the quickest route to the mighty lion.");
            System.out.println("You're almost out of the canyon when a flash flood occurs.");
            System.out.println("You get wiped away instantly and drown to death.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 21) {
            System.out.println("");
            System.out.println("Part 3");
            System.out.println("You have chosen to go through the prairie!");
            System.out.println("Which way do you travel?");
            System.out.println("35- Left; 36- Right");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 22) {
            System.out.println("");
            System.out.println("Part 3");
            System.out.println("You have chosen to go through the forest!");
            System.out.println("You see a river.");
            System.out.println("Do you drink from it?");
            System.out.println("37- Yes; 38- No");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 23) {
            System.out.println("");
            System.out.println("Part 3");
            System.out.println("You have chosen to go get your bow and arrows.");
            System.out.println("The enemy beats you to it and shoots you on the spot.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 24) {
            System.out.println("");
            System.out.println("Part 3");
            System.out.println("You have chosen to use your knife.");
            System.out.println("You are very skilled with a knife.");
            System.out.println("Eventually the enemy tribe retreats.");
            System.out.println("The chief has told you to go take a weekend off at the big pond.");
            System.out.println("You go to the big pond and enjoy it very much.");
            System.out.println("You see a crying baby by the side of the pond.");
            System.out.println("Do you pick up the baby and bring him home or just ingnore him?");
            System.out.println("39- Pick the baby up and bring him home; 40- Just ingore him");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 25) {
            System.out.println("");
            System.out.println("Part 3");
            System.out.println("You have chosen to take a week off.");
            System.out.println("You come back and someone is very sick.");
            System.out.println("You are low on medicine.");
            System.out.println("Do you go gather more herbs for your remedies or heal the patient with what you have.");
            System.out.println("41- Go gather more herbs; 42- Heal the patient");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }

        if (reply == 26) {
            System.out.println("");
            System.out.println("Part 3");
            System.out.println("You have chosen to tend to more sick people.");
            System.out.println("You are very good at your craft.");
            System.out.println("You heal most of the people.");
            System.out.println("However, you are low on herbs.");
            System.out.println("Do you go gather some more herbs or tend to a couple more patients?");
            System.out.println("43- Go gather more herbs; 44- Go tend to a couple more patients");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 27) {
            System.out.println("");
            System.out.println("Part 3");
            System.out.println("You have chosen to put poison on the spear heads.");
            System.out.println("The animals die easier and your tribe gets more food for the winter.");
            System.out.println("To be exact one more month.");
            System.out.println("Some whiteman come to your tribe.");
            System.out.println("They're paying a fortune for you to craft them some of your best acacia furniture.");
            System.out.println("Do you want to craft some expensive acacia furniture for them or do you not want to craft them the furniture their asking for.");
            System.out.println("45- Craft them furniture; 46- Not craft them furniture");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 28) {
            System.out.println("");
            System.out.println("Part 3");
            System.out.println("You have chosen to just make the spear heads.");
            System.out.println("Because you didn't put poison on the spear heads the hunters only brought back three gazelles which should only last about two or three weeks.");
            System.out.println("Some whiteman come to your tribe.");
            System.out.println("They're paying a fortune for you to craft them some of your best acacia furniture.");
            System.out.println("Do you want to craft some expensive acacia furniture for them or do you not want to craft them the furniture they're asking for.");
            System.out.println("45- Craft them furniture; 46- Not craft them furniture");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 29) {
            System.out.println("");
            System.out.println("Part 4");
            System.out.println("Because You have chosen to wait for her patiently she attends to you in a matter of a couple days.");
            System.out.println("You are better in a week.");
            System.out.println("Some whiteman have come to your tribe.");
            System.out.println("They're asking to trade you guns for some of your tribe's animal pelts.");
            System.out.println("Do you trade pelts for guns?");
            System.out.println("47- Trade; 48- Not trade");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 30) {
            System.out.println("");
            System.out.println("Part 4");
            System.out.println("You have chosen to tough it out.");
            System.out.println("Because of this you die from malnutrition.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 31) {
            System.out.println("");
            System.out.println("Part 4");
            System.out.println("You have chosen to hunt.");
            System.out.println("You have found a bunch of zebras to eat.");
            System.out.println("Some whiteman are willing to trade your tribe rifles for some of your zebras.");
            System.out.println("Recently, there has been some highly wanted criminals that trade weopons and drugs on the black market.");
            System.out.println("The problem is, you don't know if that's them.");
            System.out.println("Do you trade? What about decline the offer?");
            System.out.println("Or do you report them to the authorities?");
            System.out.println("49- Trade; 50- Decline the trade; 51- Report them to the authorities");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 32) {
            System.out.println("");
            System.out.println("Part 4");
            System.out.println("You have chosen to play a game with the rest of your tribe.");
            System.out.println("Everyone has a good time and you guys have an awesome feast.");
            System.out.println("There is a hunting challenge that your's and a your fellow tribes are having.");
            System.out.println("The challenge is to go hunt the mighty lion!");
            System.out.println("Do you choose to go hunt the mighty lion with your tribe to win the challenge?");
            System.out.println("52- Yes; 53- No");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 33) {
            System.out.println("");
            System.out.println("Part 4");
            System.out.println("You have chosen to grow wheat again for the second year in a row.");
            System.out.println("There are no nutrients in the soil so all your wheat dies.");
            System.out.println("Your village starves.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 34) {
            System.out.println("");
            System.out.println("Part 4");
            System.out.println("You have chosen to farm corn for the first time in your life.");
            System.out.println("Luckily for you, someone else in your village knows how to grow corn.");
            System.out.println("Because of this you grow a lot of corn and your village has a feast.");
            System.out.println("Do you choose to store the rest of the food for the winter or distribute the rest of the food to your whole village?");
            System.out.println("54- Store the food for later; 55- Distribute the food to your whole village");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 35) {
            System.out.println("");
            System.out.println("Part 4");
            System.out.println("You have chosen to go left.");
            System.out.println("There are hyenas in front of you after only about an hour of walking.");
            System.out.println("They see you and kill you.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 36) {
            System.out.println("");
            System.out.println("Part 4");
            System.out.println("You have chosen to go right.");
            System.out.println("There are zebras in front of you after only about an hour of walking.");
            System.out.println("Do you kill them for food?");
            System.out.println("56- Yes; 57- No");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 37) {
            System.out.println("");
            System.out.println("Part 4");
            System.out.println("You have chosen to drink from the river.");
            System.out.println("Luckily, the water doesn't have any diseases or viruses.");
            System.out.println("You are full.");
            System.out.println("You need to cross the river.");
            System.out.println("However, the river is very deep.");
            System.out.println("You could make a temporary bridge but that would kill vital time to hunt the mighty lion.");
            System.out.println("The fastest way to cross the river is to make a raft.");
            System.out.println("What do you do?");
            System.out.println("58- Make a bridge; 59- Build a raft");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 38) {
            System.out.println("");
            System.out.println("Part 4");
            System.out.println("You have chosen not to drink from the river.");
            System.out.println("Your fellow warriors have.");
            System.out.println("The river doesn't make them sick because the river comes from a far off glacier.");
            System.out.println("You cross the river and find no more water sources.");
            System.out.println("You die from dehydration.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 39) {
            System.out.println("");
            System.out.println("Part 4");
            System.out.println("You have chosen to pick up the baby.");
            System.out.println("The baby turns out to be an orphan.");
            System.out.println("His mother was killed by the enemy tribe and was buried in the sand by the big pond.");
            System.out.println("You raise him as your own.");
            System.out.println("He becomes a great warrior and you name him Bobert.");
            System.out.println("You need to go hunt down the enemy that attacked your tribe years ago.");
            System.out.println("Do you take your son with you?");
            System.out.println("60- Yes; 61- No");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 40) {
            System.out.println("");
            System.out.println("Part 4");
            System.out.println("You have chosen to just ingore him.");
            System.out.println("Do you choose to go after the enemy tribe with the few warriors you have left?");
            System.out.println("62- Yes; 63- No");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 41) {
            System.out.println("");
            System.out.println("Part 4");
            System.out.println("You have chosen to go gather more herbs.");
            System.out.println("Because of this the patient dies!");
            System.out.println("You are tried for murder.");
            System.out.println("Are you found guilty?");
            System.out.println("Press 64 or 65");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 42) {
            System.out.println("");
            System.out.println("Part 4");
            System.out.println("You have chosen to heal the patient.");
            System.out.println("Luckily you have enough herbs to heal the patient.");
            System.out.println("You need to go gather some more herbs.");
            System.out.println("You go gather some more herbs.");
            System.out.println("While gathering more herbs you find a singal that says: 'S.O.S. >'");
            System.out.println("What do you do?");
            System.out.println("66- Go investigate the distress signal; 67- Ignore it; 68- Go back to your tribe and tell someone about it");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 43) {
            System.out.println("");
            System.out.println("Part 4");
            System.out.println("You have chosen to go gather more herbs.");
            System.out.println("You go gather more herbs.");
            System.out.println("Luckily, none of the patients die and you heal all of them.");
            System.out.println("While gathering more herbs you find a singal that says: 'S.O.S. >'");
            System.out.println("What do you do?");
            System.out.println("66- Go follow the distress signal; 67- Ignore it; 68- Go back to your tribe and tell someone about it");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 44) {
            System.out.println("");
            System.out.println("Part 4");
            System.out.println("You have chosen to go tend to a couple more patients.");
            System.out.println("You run out of herbs and go gather more herbs.");
            System.out.println("While gathering herbs all your patients die!");
            System.out.println("You are tried for murder.");
            System.out.println("You are found guilty.");
            System.out.println("How do you want to be executed?");
            System.out.println("69- Arrows; 70- Sword; 71- Flying lawnmower; 72- Musket; 73- Bob the Blobfish");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 45) {
            System.out.println("");
            System.out.println("Part 4");
            System.out.println("You have chosen to craft them furniture.");
            System.out.println("The people you give the furniture to like your work.");
            System.out.println("They pay you in gold.");
            System.out.println("You can use this to buy a miling machine from a city near by.");
            System.out.println("Do you buy a miling machine?");
            System.out.println("74- Yes; 75- No");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 46) {
            System.out.println("");
            System.out.println("Part 4");
            System.out.println("You have chosen not to craft them furniture.");
            System.out.println("Because of this they want to kill you.");
            System.out.println("Do you escape?");
            System.out.println("Press 76 or 77");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 47) {
            System.out.println("");
            System.out.println("Part 5");
            System.out.println("You have chosen to trade.");
            System.out.println("They trade you guns. Do you choose to go hunt the mighty lion?");
            System.out.println("78- Yes; 79- No");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 48) {
            System.out.println("");
            System.out.println("Part 5");
            System.out.println("You have chosen to not trade.");
            System.out.println("Because of this they want to kill you.");
            System.out.println("Do you escape?");
            System.out.println("Press 76 or 77");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 1) {
            System.out.println("");
            System.out.println("Part 6");
            System.out.println("You do not escape.");
            System.out.println("They kill you.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 49) {
            System.out.println("");
            System.out.println("Part 5");
            System.out.println("You have chosen to trade.");
            System.out.println("Luckily, these aren't the criminals that are wanted.");
            System.out.println("A couple months later the whiteman settle here.");
            System.out.println("People keep on flooding to the whiteman's settlement.");
            System.out.println("They ask you if you want to go to school.");
            System.out.println("You don't know what school is but these people say it's good for you.");
            System.out.println("Do you want to go to school?");
            System.out.println("80- Yes; 81- No");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 50) {
            System.out.println("");
            System.out.println("Part 5");
            System.out.println("You have chosen to decline the trade");
            System.out.println("Unfortunately, these people have small pox.");
            System.out.println("They transmit it to your tribe.");
            System.out.println("Because you tribe doesn't have any immunity to small pox your whole tribe dies!");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 51) {
            System.out.println("");
            System.out.println("Part 5");
            System.out.println("You have chosen to report them to the authorities.");
            System.out.println("These guys turn out to be criminals.");
            System.out.println("Your tribe gains importance in the African community because you turned these criminals into the authorities.");
            System.out.println("Do you choose to go hunt the mighty Lion?");
            System.out.println("78- Yes; 79- No");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 52) {
            System.out.println("");
            System.out.println("Part 5");
            System.out.println("You have chosen to go hunt the mighty lion.");
            System.out.println("You have been on your journey for about a week now.");
            System.out.println("The trail splits into three sections.");
            System.out.println("Do you choose to go through a canyon?");
            System.out.println("How about the prairie?");
            System.out.println("Or what about keep continuing through the forest?");
            System.out.println("80- Canyon; 81- Prairie; 82- Forest");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 53) {
            System.out.println("");
            System.out.println("Part 5");
            System.out.println("You have chosen not to hunt the mighty lion.");
            System.out.println("Unfortunately, you die from malaria.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 54) {
            System.out.println("");
            System.out.println("Part 5");
            System.out.println("You have chosen to store the food for later.");
            System.out.println("The corn lasts your tribe the whole winter.");
            System.out.println("Your tribe is thriving!");
            System.out.println("You find out that you have extra corn.");
            System.out.println("It would be nice to get some oxen to help you plow the field.");
            System.out.println("Do you sell your extra corn for oxen?");
            System.out.println("83- Yes; 84- No");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 55) {
            System.out.println("");
            System.out.println("Part 5");
            System.out.println("You have chosen to distribute the food to your whole village.");
            System.out.println("Because you have chosen to do this your food rots.");
            System.out.println("Your whole village starves.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 56) {
            System.out.println("");
            System.out.println("Part 5");
            System.out.println("You have chosen to kill the zebras.");
            System.out.println("Because you have chosen to do this you don't go hungry.");
            System.out.println("Night falls.");
            System.out.println("Do you sleep on the ground or in a tree?");
            System.out.println("85- Ground; 86- Tree");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 57) {
            System.out.println("");
            System.out.println("Part 5");
            System.out.println("You have chosen to not kill the zebras.");
            System.out.println("Because of this you starve.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 58) {
            System.out.println("");
            System.out.println("Part 5");
            System.out.println("You have chosen to make a bridge.");
            System.out.println("Your patience pays off and you get across the river in no time!");
            System.out.println("The path splits in two.");
            System.out.println("Do you travel through the hills or the extreme hills?");
            System.out.println("87- Hills; 88- Extreme hills");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 59) {
            System.out.println("");
            System.out.println("Part 5");
            System.out.println("You have chosen to build a raft.");
            System.out.println("Unfortunately, the river brings you to the rapids before you are able to reach the other side.");
            System.out.println("The rapids are heading to a waterfall so you panic.");
            System.out.println("You throw your paddle into the river.");
            System.out.println("You fall down the waterfall and hit the rocks at the bottom.");
            System.out.println("Your head splits open and you die.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 60) {
            System.out.println("");
            System.out.println("Part 5");
            System.out.println("You have chosen to take your son with you.");
            System.out.println("Your hunting party would have died if you didn't have your son.");
            System.out.println("Since your son is a great warrior the enemy tribe which you now know as Yosimite plans on never attacking your tribe again!");
            System.out.println("You return home and find out your son has a brand new kid.");
            System.out.println("Bobert, your son, names him Mighty " + name + " Jr.");
            System.out.println("You finally have  a grandson.");
            System.out.println("You die at a good old age.");
            System.out.println("You pass away happily in your sleep.");
            System.out.println(name + ", YOU WIN!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 61) {
            System.out.println("");
            System.out.println("Part 5");
            System.out.println("You have chosen not to take your son with you.");
            System.out.println("Because you didn't take your son, the enemy tribe, Yosimite, kills your whole hunting party.");
            System.out.println("You guys are no match for them!");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 62) {
            System.out.println("");
            System.out.println("Part 5");
            System.out.println("You have chosen to go after the enemy tribe!");
            System.out.println("The enemy tribe, Yosimite, kills your whole hunting party.");
            System.out.println("You guys are no match for them!");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 63) {
            System.out.println("");
            System.out.println("Part 5");
            System.out.println("You have chosen not to go after the enemy tribe.");
            System.out.println("Unfortunately, your village gets swept away by a flash flood.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 64 && math == 0) {
            System.out.println("");
            System.out.println("Part 5");
            System.out.println("You have been found guilty.");
            System.out.println("How do you choose to be executed?");
            System.out.println("91- Arrows; 92- Sword; 93- Stoned; 94- Knife; 95- Gun");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 64 && math == 1) {
            System.out.println("");
            System.out.println("Part 5");
            System.out.println("You are not found guilty.");
            System.out.println("Some whiteman come to your tribe.");
            System.out.println("They're asking you if they can settle near you.");
            System.out.println("Do you want them to settle near you?");
            System.out.println("89- Yes; 90- No");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 65 && math == 0) {
            System.out.println("");
            System.out.println("Part 5");
            System.out.println("You have been found guilty.");
            System.out.println("How do you choose to be executed?");
            System.out.println("91- Arrows; 92- Sword; 93- Stoned; 94- Knife; 95- Gun");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 65 && math == 1) {
            System.out.println("");
            System.out.println("Part 5");
            System.out.println("You are not found guilty.");
            System.out.println("Some whiteman come to your tribe.");
            System.out.println("They're asking you if they can settle near you.");
            System.out.println("Do you want them to settle near you?");
            System.out.println("89- Yes; 90- No");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 66) {
            System.out.println("");
            System.out.println("Part 5");
            System.out.println("You have chosen to go investigate the distress signal.");
            System.out.println("Unfortunately, you get eaten by a wolf pack.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 67) {
            System.out.println("");
            System.out.println("Part 5");
            System.out.println("You have chosen to ignore it.");
            System.out.println("Unfortuntely, on your way back you get eaten by a cheetah.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 68) {
            System.out.println("");
            System.out.println("Part 5");
            System.out.println("You have chosen to go back to your tribe and tell someone about it.");
            System.out.println("Apparently, some members in your tribe say a mother was kidnapped and that there is a $10,000(€8,900) reward for the finding of the kidnapper!");
            System.out.println("Do you want to go hunt the kidnapper?");
            System.out.println("96- Yes; 97- No");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 69) {
            System.out.println("");
            System.out.println("Part 5");
            System.out.println("You have chosen to die from arrows.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 70) {
            System.out.println("");
            System.out.println("Part 5");
            System.out.println("You have chosen to die from a sword.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 71) {
            System.out.println("");
            System.out.println("Part 5");
            System.out.println("You have chosen to die from a flying lawnmower.");
            System.out.println("Seriously though, how do you manage to die from a flying lawnmower?");
            System.out.println("I guess someone strapped jet engines or rockets to a lawnmower and it became a flying lawnmower!");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 72) {
            System.out.println("");
            System.out.println("Part 5");
            System.out.println("You have chosen to die from a musket.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 73) {
            System.out.println("");
            System.out.println("Part 5");
            System.out.println("You have chosen to die from Bob the Blobfish.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 74) {
            System.out.println("");
            System.out.println("Part 5");
            System.out.println("You have chosen to buy a miling machine.");
            System.out.println("Some business men have come in and asked you to build them some wooden toys with your miling machine.");
            System.out.println("Do you want to build them wooden toys with your milling machine?");
            System.out.println("98- Yes; 99- No");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 75) {
            System.out.println("");
            System.out.println("Part 5");
            System.out.println("You have chosen not to buy a miling machine.");
            System.out.println("Unfortunately, you tribe dies from a famine.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 76 && math == 0) {
            System.out.println("");
            System.out.println("Part 5");
            System.out.println("You escape.");
            System.out.println("Unfortunately though, an astroid hitd the earth and detroys the whole planet.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 76 && math == 1) {
            System.out.println("");
            System.out.println("Part 5");
            System.out.println("You don't escape.");
            System.out.println("They kill you on the spot.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 77 && math == 0) {
            System.out.println("");
            System.out.println("Part 5");
            System.out.println("You escape.");
            System.out.println("Unfortunately though, an astroid hitd the earth and detroys the whole planet.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 77 && math == 1) {
            System.out.println("");
            System.out.println("Part 5");
            System.out.println("You don't escape.");
            System.out.println("They kill you on the spot.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 78) {
            System.out.println("");
            System.out.println("Part 6");
            System.out.println("You have chosen to hunt the mighty lion!");
            System.out.println("You have been on your journey for about a week now.");
            System.out.println("The trail splits into three sections.");
            System.out.println("Do you choose to go through a canyon?");
            System.out.println("How about the prairie?");
            System.out.println("Or what about keep continuing through the forest?");
            System.out.println("100- Canyon; 101- Prairie; 102- Forest");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 79) {
            System.out.println("");
            System.out.println("Part 6");
            System.out.println("You have chosen not to hunt the mighty lion.");
            System.out.println("Unfortunately, a lightning bolt from out of the sky, probably from Zeus, kills you.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 80) {
            System.out.println("");
            System.out.println("Part 6");
            System.out.println("You have chosen to go to school.");
            System.out.println("You get straight A's!");
            System.out.println("You can go to college now.");
            System.out.println("It would be groundbreaking if you did because no one from your tribe has ever gone to college before.");
            System.out.println("However, you would miss your family.");
            System.out.println("Do you want to go to college?");
            System.out.println("If you don't go to college now you will miss the once in a lifetime chance.");
            System.out.println("103- College; 104- Stay home with your family");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 81) {
            System.out.println("");
            System.out.println("Part 6");
            System.out.println("You have chosen to go through the prairie!");
            System.out.println("Which way do you travel?");
            System.out.println("105- Left; 106- Right");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 82) {
            System.out.println("");
            System.out.println("Part 6");
            System.out.println("You have chosen to go through the forest!");
            System.out.println("You see a river.");
            System.out.println("Do you drink from it?");
            System.out.println("107- Yes; 108- No");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 83) {
            System.out.println("");
            System.out.println("Part 6");
            System.out.println("You have chosen to sell your extra corn for oxen.");
            System.out.println("You choose to grow cotton.");
            System.out.println("At the end of the season you have surplus cotton.");
            System.out.println("Do you choose to sell your cotton?");
            System.out.println("109- Yes; 110- No");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 84) {
            System.out.println("");
            System.out.println("Part 6");
            System.out.println("You have chosen to not sell your extra corn for oxen.");
            System.out.println("Unfortunately, Bob the Blobfish plops out from a nearby by lake and you die because your eyes bleed to death.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 85) {
            System.out.println("");
            System.out.println("Part 6");
            System.out.println("You have chosen to sleep on the ground.");
            System.out.println("Unfortunately, a hyena comes up and gobbles you up.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 86) {
            System.out.println("");
            System.out.println("Part 6");
            System.out.println("You have chosen to sleep in a tree.");
            System.out.println("No animals eat you.");
            System.out.println("You see a river.");
            System.out.println("Do you drink from it?");
            System.out.println("111- Yes; 112- No");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 87) {
            System.out.println("");
            System.out.println("Part 6");
            System.out.println("You have chosen to go through the hills.");
            System.out.println("You travel through the hills and see the mighty lion.");
            System.out.println("What weopon do you use?");
            System.out.println("113- Knife; 114- Bow and arrows; 115- Spear; 116- Gun");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 88) {
            System.out.println("");
            System.out.println("Part 6");
            System.out.println("You have chosen to go through the extreme hills.");
            System.out.println("You freeze to death.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 89) {
            System.out.println("");
            System.out.println("Part 6");
            System.out.println("You have chosen to let them settle here.");
            System.out.println("They build a hospital.");
            System.out.println("Their settlement grows.");
            System.out.println("Your village thrives because of the new settlement");
            System.out.println(name + ", YOU WIN!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 90) {
            System.out.println("");
            System.out.println("Part 6");
            System.out.println("You have chosen to go through the extreme hills.");
            System.out.println("You freeze to death.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 91) {
            System.out.println("");
            System.out.println("Part 6");
            System.out.println("You die from arrows.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 92) {
            System.out.println("");
            System.out.println("Part 6");
            System.out.println("You get stabbed to death by a sword.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 93) {
            System.out.println("");
            System.out.println("Part 6");
            System.out.println("You get stoned to death.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 94) {
            System.out.println("");
            System.out.println("Part 6");
            System.out.println("You get stabbed to death by a knife.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 95) {
            System.out.println("");
            System.out.println("Part 6");
            System.out.println("You are shot to death with a bebe gun.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 96) {
            System.out.println("");
            System.out.println("Part 6");
            System.out.println("You go hunt the kidnapper.");
            System.out.println("Do you caputure him?");
            System.out.print("Press 117 or 1118");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 97) {
            System.out.println("");
            System.out.println("Part 6");
            System.out.println("You do not go hunt the kidnapper.");
            System.out.println("Unfortunately, Zeus comes out from the middle of nowhere and shocks you to death.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 98) {
            System.out.println("");
            System.out.println("Part 6");
            System.out.println("You have chosen to use your miling machine to make them wooden toys.");
            System.out.println("You have a successful life!");
            System.out.println(name + ", YOU WIN!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 99) {
            System.out.println("");
            System.out.println("Part 6");
            System.out.println("You have chosen to not make them wooden toys.");
            System.out.println("Unfortunately, your milling machine cathes on fire and burns down your whole house.");
            System.out.println("What's even more unfortunate is that you get caught on fire and burn to death");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 100) {
            System.out.println("");
            System.out.println("Part 7");
            System.out.println("You have chosen to go through the canyon!");
            System.out.println("The canyon is the quickest route to the mighty lion.");
            System.out.println("You're almost out of the canyon when a flash flood occurs.");
            System.out.println("You get wiped away intstantly and drown to death.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 101) {
            System.out.println("");
            System.out.println("Part 7");
            System.out.println("You have chosen to go through the prairie!");
            System.out.println("Which way do you travel?");
            System.out.println("119- Left; 120- Right");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 102) {
            System.out.println("");
            System.out.println("Part 7");
            System.out.println("You have chosen to go through the forest!");
            System.out.println("You see a river.");
            System.out.println("Do you drink from it?");
            System.out.println("121- Yes; 122- No");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 103) {
            System.out.println("");
            System.out.println("Part 7");
            System.out.println("You have chosen to go to college.");
            System.out.println("You get educated.");
            System.out.println(name + ", YOU WIN!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 104) {
            System.out.println("");
            System.out.println("Part 7");
            System.out.println("You have chosen to stay home with your family");
            System.out.println("Unfortunately, you family gets sick and dies.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 105) {
            System.out.println("");
            System.out.println("Part 7");
            System.out.println("You have chosen to go left.");
            System.out.println("There are hyenas in front of you after only about an hour of walking.");
            System.out.println("They see you and kill you.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 106) {
            System.out.println("");
            System.out.println("Part 7");
            System.out.println("You have chosen to right.");
            System.out.println("There are zebras in front of front of you after only about an hour of walking.");
            System.out.println("Do you kill them for food?");
            System.out.println("123- Yes; 124- No");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 107) {
            System.out.println("");
            System.out.println("Part 7");
            System.out.println("You have chosen to drink from the river.");
            System.out.println("Luckly, the water doesn't have any diseases of viruses.");
            System.out.println("You are full.");
            System.out.println("You need to cross the river.");
            System.out.println("However, the river is very deep.");
            System.out.println("You could make a temporary bridge but that would kill vital time to hunt the mighty lion.");
            System.out.println("The fastest way to cross the river is to make a raft.");
            System.out.println("What do you do?");
            System.out.println("125- Make a bridge; 126- Build a raft");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 108) {
            System.out.println("");
            System.out.println("Part 7");
            System.out.println("You have chosen not to drink from the river.");
            System.out.println("Your fellow warriors have.");
            System.out.println("The river doesn't make them sick because the river comes from a far off glacier.");
            System.out.println("You cross the river and find no more water sources.");
            System.out.println("You die from dehydration.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 109) {
            System.out.println("");
            System.out.println("Part 7");
            System.out.println("You sell your surplus cotton.");
            System.out.println("You are now rich!");
            System.out.println(name + ", YOU WIN!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 110) {
            System.out.println("");
            System.out.println("Part 7");
            System.out.println("You do not sell your surplus cotton");
            System.out.println("Unfortunately, you die from food poisoning.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 111) {
            System.out.println("");
            System.out.println("Part 7");
            System.out.println("You have chosen to drink from the river.");
            System.out.println("Luckily, the water doesn't have any diseases or viruses.");
            System.out.println("You are full.");
            System.out.println("You need to cross the river.");
            System.out.println("However, the river is very deep.");
            System.out.println("You could make a temporary bridge but that would kill vital time to hunt the mighty lion.");
            System.out.println("The fastest way to cross the river is to make a raft.");
            System.out.println("What do you do?");
            System.out.println("125- Make a bridge; 126- Build a raft");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 112) {
            System.out.println("");
            System.out.println("Part 7");
            System.out.println("You have chosen not to drink from the river.");
            System.out.println("Your fellow warriors have.");
            System.out.println("The river doesn't make them sick because the river comes from a far off glacier.");
            System.out.println("You cross the river and find no more water sources.");
            System.out.println("You die from dehydration.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 113) {
            System.out.println("");
            System.out.println("Part 7");
            System.out.println("You have chosen to use your handy knife to kill the lion.");
            System.out.println("So, " + name + ", do you kill the mighty lion?");
            System.out.println("Press 127 or 128 to choose");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 114) {
            System.out.println("");
            System.out.println("Part 7");
            System.out.println("You have chosen to use your mighty bow and arrows to kill the lion.");
            System.out.println("So, " + name + ", do you kill the mighty lion?");
            System.out.println("Press 129 or 130 to choose");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 115) {
            System.out.println("");
            System.out.println("Part 7");
            System.out.println("You have chosen to use your powerful spear to kill the lion.");
            System.out.println("So, " + name + ", do you kill the mighty lion?");
            System.out.println("Press 131 or 132 to choose");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 116) {
            System.out.println("");
            System.out.println("Part 7");
            System.out.println("You have chosen to use your overpowered gun.");
            System.out.println("Unfortunately, your gun explodes in face.");
            System.out.println("You die.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 117 && math == 0) {
            System.out.println("");
            System.out.println("Part 7");
            System.out.println("You do not capture the kidnapper.");
            System.out.println("Unfortunately though, the kidnapper put you guys in a trap and kills you.");
            System.out.println("You die.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 117 && math == 1) {
            System.out.println("");
            System.out.println("Part 7");
            System.out.println("You capture the kidnapper.");
            System.out.println("You recieve $10k(€8,900) from the local authorities.");
            System.out.println(name + ", YOU WIN!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 118 && math == 0) {
            System.out.println("");
            System.out.println("Part 7");
            System.out.println("You do not capture the kidnapper.");
            System.out.println("Unfortunately though, the kidnapper put you guys in a trap and kills you.");
            System.out.println("You die.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 118 && math == 1) {
            System.out.println("");
            System.out.println("Part 7");
            System.out.println("You capture the kidnapper.");
            System.out.println("You recieve $10k(€8,900) from the local authorities.");
            System.out.println(name + ", YOU WIN!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 119) {
            System.out.println("");
            System.out.println("Part 8");
            System.out.println("You have chosen to go left.");
            System.out.println("There are hyenas in front of you after only about an hour of walking.");
            System.out.println("They see you and kill you.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 120) {
            System.out.println("");
            System.out.println("Part 8");
            System.out.println("You have chosen to go right.");
            System.out.println("There are zebras in front of front of you after only about an hour of walking.");
            System.out.println("Do you kill them for food?");
            System.out.println("133- Yes; 134- No");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 121) {
            System.out.println("");
            System.out.println("Part 8");
            System.out.println("You have chosen to drink from the river.");
            System.out.println("Luckly, the water doesn't have any diseases of viruses.");
            System.out.println("You are full.");
            System.out.println("You need to cross the river.");
            System.out.println("However, the river is very deep.");
            System.out.println("You could make a temporary bridge but that would kill vital time to hunt the mighty lion.");
            System.out.println("The fastest way to cross the river is to make a raft.");
            System.out.println("What do you do?");
            System.out.println("135- Make a bridge; 136- Build a raft");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 122) {
            System.out.println("");
            System.out.println("Part 8");
            System.out.println("You have chosen not to drink from the river.");
            System.out.println("Your fellow warriors have.");
            System.out.println("The river doesn't make them sick because the river comes from a far off glacier.");
            System.out.println("You cross the river and find no more water sources.");
            System.out.println("You die from dehydration.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 123) {
            System.out.println("");
            System.out.println("Part 8");
            System.out.println("You have chosen to kill the zebras.");
            System.out.println("Because you have chosen to do this you don't go hungry.");
            System.out.println("Night falls.");
            System.out.println("Do you sleep on the ground or in a tree?");
            System.out.println("137- Ground; 138- Tree");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 124) {
            System.out.println("");
            System.out.println("Part 8");
            System.out.println("You have chosen not to kill the zebras.");
            System.out.println("Because of this you starve.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 125) {
            System.out.println("");
            System.out.println("Part 8");
            System.out.println("You have chosen to make a bridge.");
            System.out.println("Your patience pays off and you get across the river in no time!");
            System.out.println("The path splits in two.");
            System.out.println("Do you travel through the hills or the extreme hills?");
            System.out.println("139- Hills; 140- Extreme hills");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 126) {
            System.out.println("");
            System.out.println("Part 8");
            System.out.println("You have chosen to build a raft.");
            System.out.println("Unfortunately, the river brings you to the rapids before you are able to reach the other side.");
            System.out.println("The rapids are heading to a waterfall so you panic.");
            System.out.println("You throw your paddle into the river.");
            System.out.println("You fall down the waterfall and hit the rocks at the bottom.");
            System.out.println("Your head splits open and you die.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 127 && math == 0) {
            System.out.println("");
            System.out.println("Part 8");
            System.out.println("You do not kill the mighty lion.");
            System.out.println("The mighty lion eats you.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 127 && math == 1) {
            System.out.println("");
            System.out.println("Part 8");
            System.out.println("You kill the mighty lion.");
            System.out.println("Your tribe celebrates.");
            System.out.println(name + ", YOU WIN!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 128 && math == 0) {
            System.out.println("");
            System.out.println("Part 8");
            System.out.println("You do not kill the mighty lion.");
            System.out.println("The mighty lion eats you.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 128 && math == 1) {
            System.out.println("");
            System.out.println("Part 8");
            System.out.println("You kill the mighty lion.");
            System.out.println("Your tribe celebrates.");
            System.out.println(name + ", YOU WIN!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 129 && math == 0) {
            System.out.println("");
            System.out.println("Part 8");
            System.out.println("You kill the mighty lion.");
            System.out.println("Your tribe celebrates.");
            System.out.println(name + ", YOU WIN!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 129 && math == 1) {
            System.out.println("");
            System.out.println("Part 8");
            System.out.println("You do not kill the mighty lion.");
            System.out.println("The mighty lion eats you.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 130 && math == 0) {
            System.out.println("");
            System.out.println("Part 8");
            System.out.println("You kill the mighty lion.");
            System.out.println("Your tribe celebrates.");
            System.out.println(name + ", YOU WIN!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 130 && math == 1) {
            System.out.println("");
            System.out.println("Part 8");
            System.out.println("You do not kill the mighty lion.");
            System.out.println("The mighty lion eats you.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 131 && math == 0) {
            System.out.println("");
            System.out.println("Part 8");
            System.out.println("You kill the mighty lion.");
            System.out.println("Your tribe celebrates.");
            System.out.println(name + ", YOU WIN!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 131 && math == 1) {
            System.out.println("");
            System.out.println("Part 8");
            System.out.println("You do not kill the mighty lion.");
            System.out.println("The mighty lion eats you.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 132 && math == 0) {
            System.out.println("");
            System.out.println("Part 8");
            System.out.println("You kill the mighty lion.");
            System.out.println("Your tribe celebrates.");
            System.out.println(name + ", YOU WIN!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 132 && math == 1) {
            System.out.println("");
            System.out.println("Part 8");
            System.out.println("You do not kill the mighty lion.");
            System.out.println("The mighty lion eats you.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 133) {
            System.out.println("");
            System.out.println("Part 9");
            System.out.println("You have chosen to kill the zebras.");
            System.out.println("Because you have chosen to do this you don't go hungry.");
            System.out.println("Night falls.");
            System.out.println("Do you sleep on the ground or in a tree?");
            System.out.println("137- Ground; 138- Tree");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 134) {
            System.out.println("");
            System.out.println("Part 9");
            System.out.println("You have chosen not to kill the zebras.");
            System.out.println("Because of this you starve.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 135) {
            System.out.println("");
            System.out.println("Part 9");
            System.out.println("You have chosen to make a bridge.");
            System.out.println("Your patience pays off and you get across the river in no time!");
            System.out.println("The path splits in two.");
            System.out.println("Do you travel through the hills or the extreme hills?");
            System.out.println("139- Hills; 140- Extreme hills");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 136) {
            System.out.println("");
            System.out.println("Part 9");
            System.out.println("You have chosen to build a raft.");
            System.out.println("Unfortunately, the river brings you to the rapids before you are able to reach the other side.");
            System.out.println("The rapids are heading to a waterfall so you panic.");
            System.out.println("You throw your paddle into the river.");
            System.out.println("You fall down the waterfall and hit the rocks at the bottom.");
            System.out.println("Your head splits open and you die.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 137) {
            System.out.println("");
            System.out.println("Part 10");
            System.out.println("You have chosen to sleep on the ground.");
            System.out.println("Unfortunately, a hyena comes up and gobbles you up.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 138) {
            System.out.println("");
            System.out.println("Part 10");
            System.out.println("You have chosen to sleep in a tree.");
            System.out.println("No animals eat you.");
            System.out.println("You see a river.");
            System.out.println("Do you drink from it?");
            System.out.println("141- Yes; 142- No");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 139) {
            System.out.println("");
            System.out.println("Part 10");
            System.out.println("You have chosen to go through the hills.");
            System.out.println("You travel through the hills and see the mighty lion.");
            System.out.println("What weopon do you use?");
            System.out.println("143- Knife; 144- Bow and arrows; 145- Spear; 146- Gun");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 140) {
            System.out.println("");
            System.out.println("Part 10");
            System.out.println("You have chosen to go through the extreme hills.");
            System.out.println("You freeze to death.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 141) {
            System.out.println("");
            System.out.println("Part 11");
            System.out.println("You have chosen to drink from the river.");
            System.out.println("Luckly, the water doesn't have any diseases of viruses.");
            System.out.println("You are full.");
            System.out.println("You need to cross the river.");
            System.out.println("However, the river is very deep.");
            System.out.println("You could make a temporary bridge but that would kill vital time to hunt the mighty lion.");
            System.out.println("The fastest way to cross the river is to make a raft.");
            System.out.println("What do you do?");
            System.out.println("147- Make a bridge; 148- Build a raft");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 142) {
            System.out.println("");
            System.out.println("Part 11");
            System.out.println("You have chosen not to drink from the river.");
            System.out.println("Your fellow warriors have.");
            System.out.println("The river doesn't make them sick because the river comes from a far off glacier.");
            System.out.println("You cross the river and find no more water sources.");
            System.out.println("You die from dehydration.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 143) {
            System.out.println("");
            System.out.println("Part 11");
            System.out.println("You have chosen to use your handy knife to kill the lion.");
            System.out.println("So, " + name + ", do you kill the mighty lion?");
            System.out.println("Press 149 or 150 to choose");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 144) {
            System.out.println("");
            System.out.println("Part 11");
            System.out.println("You have chosen to use your mighty bow and arrows to kill the lion.");
            System.out.println("So, " + name + ", do you kill the mighty lion?");
            System.out.println("Press 151 or 152 to choose");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 145) {
            System.out.println("");
            System.out.println("Part 11");
            System.out.println("You have chosen to use your powerful spear to kill the lion.");
            System.out.println("So, " + name + ", do you kill the mighty lion?");
            System.out.println("Press 153 or 154 to choose");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 146) {
            System.out.println("");
            System.out.println("Part 11");
            System.out.println("You have chosen to use your overpowered gun.");
            System.out.println("Unfortunately, your gun explodes in face.");
            System.out.println("You die.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 147) {
            System.out.println("");
            System.out.println("Part 12");
            System.out.println("You have chosen to make a bridge.");
            System.out.println("Your patience pays off and you get across the river in no time!");
            System.out.println("The path splits in two.");
            System.out.println("Do you travel through the hills or the extreme hills?");
            System.out.println("155- Hills; 156- Extreme hills");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 148) {
            System.out.println("");
            System.out.println("Part 12");
            System.out.println("You have chosen to build a raft.");
            System.out.println("Unfortunately, the river brings you to the rapids before you are able to reach the other side.");
            System.out.println("The rapids are heading to a waterfall so you panic.");
            System.out.println("You throw your paddle into the river.");
            System.out.println("You fall down the waterfall and hit the rocks at the bottom.");
            System.out.println("Your head splits open and you die.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 149 && math == 0) {
            System.out.println("");
            System.out.println("Part 12");
            System.out.println("You do not kill the mighty lion.");
            System.out.println("The mighty lion eats you.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 149 && math == 1) {
            System.out.println("");
            System.out.println("Part 12");
            System.out.println("You kill the mighty lion.");
            System.out.println("Your tribe celebrates.");
            System.out.println(name + ", YOU WIN!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 150 && math == 0) {
            System.out.println("");
            System.out.println("Part 12");
            System.out.println("You do not kill the mighty lion.");
            System.out.println("The mighty lion eats you.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 150 && math == 1) {
            System.out.println("");
            System.out.println("Part 12");
            System.out.println("You kill the mighty lion.");
            System.out.println("Your tribe celebrates.");
            System.out.println(name + ", YOU WIN!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 151 && math == 0) {
            System.out.println("");
            System.out.println("Part 12");
            System.out.println("You do not kill the mighty lion.");
            System.out.println("The mighty lion eats you.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 151 && math == 1) {
            System.out.println("");
            System.out.println("Part 12");
            System.out.println("You kill the mighty lion.");
            System.out.println("Your tribe celebrates.");
            System.out.println(name + ", YOU WIN!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 152 && math == 0) {
            System.out.println("");
            System.out.println("Part 12");
            System.out.println("You do not kill the mighty lion.");
            System.out.println("The mighty lion eats you.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 152 && math == 1) {
            System.out.println("");
            System.out.println("Part 12");
            System.out.println("You kill the mighty lion.");
            System.out.println("Your tribe celebrates.");
            System.out.println(name + ", YOU WIN!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 153 && math == 0) {
            System.out.println("");
            System.out.println("Part 12");
            System.out.println("You do not kill the mighty lion.");
            System.out.println("The mighty lion eats you.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 153 && math == 1) {
            System.out.println("");
            System.out.println("Part 12");
            System.out.println("You kill the mighty lion.");
            System.out.println("Your tribe celebrates.");
            System.out.println(name + ", YOU WIN!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 154 && math == 0) {
            System.out.println("");
            System.out.println("Part 12");
            System.out.println("You do not kill the mighty lion.");
            System.out.println("The mighty lion eats you.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 154 && math == 1) {
            System.out.println("");
            System.out.println("Part 12");
            System.out.println("You kill the mighty lion.");
            System.out.println("Your tribe celebrates.");
            System.out.println(name + ", YOU WIN!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 155) {
            System.out.println("");
            System.out.println("Part 13");
            System.out.println("You have chosen to go through the hills.");
            System.out.println("You travel through the hills and see the mighty lion.");
            System.out.println("What weopon do you use?");
            System.out.print("157- Knife; 158- Bow and arrows; 159- Spear; 160- Gun");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 156) {
            System.out.println("");
            System.out.println("Part 13");
            System.out.println("You have chosen to go through the extreme hills.");
            System.out.println("You freeze to death.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 157) {
            System.out.println("");
            System.out.println("Part 14");
            System.out.println("You have chosen to use your handy knife to kill the lion.");
            System.out.println("So, " + name + ", do you kill the mighty lion?");
            System.out.println("Press 161 or 162 to choose");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 158) {
            System.out.println("");
            System.out.println("Part 14");
            System.out.println("You have chosen to use your mighty bow and arrows to kill the lion.");
            System.out.println("So, " + name + ", do you kill the mighty lion?");
            System.out.println("Press 163 or 164 to choose");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 159) {
            System.out.println("");
            System.out.println("Part 14");
            System.out.println("You have chosen to use your powerful spear to kill the lion.");
            System.out.println("So, " + name + ", do you kill the mighty lion?");
            System.out.println("Press 165 or 166 to choose");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 160) {
            System.out.println("");
            System.out.println("Part 14");
            System.out.println("You have chosen to use your overpowered gun.");
            System.out.println("Unfortunately, your gun explodes in face.");
            System.out.println("You die.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 161 && math == 0) {
            System.out.println("");
            System.out.println("Part 15");
            System.out.println("You do not kill the mighty lion.");
            System.out.println("The mighty lion eats you.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 161 && math == 1) {
            System.out.println("");
            System.out.println("Part 15");
            System.out.println("You kill the mighty lion.");
            System.out.println("Your tribe celebrates.");
            System.out.println(name + ", YOU WIN!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 162 && math == 0) {
            System.out.println("");
            System.out.println("Part 15");
            System.out.println("You do not kill the mighty lion.");
            System.out.println("The mighty lion eats you.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 162 && math == 1) {
            System.out.println("");
            System.out.println("Part 15");
            System.out.println("You kill the mighty lion.");
            System.out.println("Your tribe celebrates.");
            System.out.println(name + ", YOU WIN!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 163 && math == 0) {
            System.out.println("");
            System.out.println("Part 15");
            System.out.println("You do not kill the mighty lion.");
            System.out.println("The mighty lion eats you.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 163 && math == 1) {
            System.out.println("");
            System.out.println("Part 15");
            System.out.println("You kill the mighty lion.");
            System.out.println("Your tribe celebrates.");
            System.out.println(name + ", YOU WIN!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 164 && math == 0) {
            System.out.println("");
            System.out.println("Part 15");
            System.out.println("You do not kill the mighty lion.");
            System.out.println("The mighty lion eats you.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 164 && math == 1) {
            System.out.println("");
            System.out.println("Part 15");
            System.out.println("You kill the mighty lion.");
            System.out.println("Your tribe celebrates.");
            System.out.println(name + ", YOU WIN!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 165 && math == 0) {
            System.out.println("");
            System.out.println("Part 15");
            System.out.println("You do not kill the mighty lion.");
            System.out.println("The mighty lion eats you.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 165 && math == 1) {
            System.out.println("");
            System.out.println("Part 15");
            System.out.println("You kill the mighty lion.");
            System.out.println("Your tribe celebrates.");
            System.out.println(name + ", YOU WIN!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 166 && math == 0) {
            System.out.println("");
            System.out.println("Part 15");
            System.out.println("You do not kill the mighty lion.");
            System.out.println("The mighty lion eats you.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 166 && math == 1) {
            System.out.println("");
            System.out.println("Part 15");
            System.out.println("You kill the mighty lion.");
            System.out.println("Your tribe celebrates.");
            System.out.println(name + ", YOU WIN!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 3.14) {
            System.out.println("");
            System.out.println("Do you want to download DLC.");
            System.out.println("3.141=Yes; 0=No");
            reply = myScanner.nextDouble();
        }
        if (reply == 3.141) {
            System.out.println("");
            System.out.println("Downloading.");
            System.out.println("Downloading Baby.");
            int time = rand.nextInt(5000);
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Downloading Baby.");
            System.out.println("1%");
            System.out.println("2%");
            System.out.println("3%");
            System.out.println("4%");
            System.out.println("5%");
            System.out.println("6%");
            System.out.println("7%");
            System.out.println("8%");
            System.out.println("9%");
            System.out.println("10%");
            System.out.println("11%");
            System.out.println("12%");
            System.out.println("13%");
            System.out.println("14%");
            System.out.println("15%");
            System.out.println("16%");
            System.out.println("17%");
            System.out.println("18%");
            System.out.println("19%");
            System.out.println("20%");
            System.out.println("21%");
            System.out.println("22%");
            System.out.println("23%");
            System.out.println("24%");
            System.out.println("25%");
            System.out.println("26%");
            System.out.println("27%");
            System.out.println("28%");
            System.out.println("29%");
            System.out.println("30%");
            System.out.println("31%");
            System.out.println("32%");
            System.out.println("33%");
            System.out.println("34%");
            System.out.println("35%");
            System.out.println("36%");
            System.out.println("37%");
            System.out.println("38%");
            System.out.println("39%");
            System.out.println("40%");
            System.out.println("41%");
            System.out.println("42%");
            System.out.println("43%");
            System.out.println("44%");
            System.out.println("45%");
            System.out.println("46%");
            System.out.println("47%");
            System.out.println("48%");
            System.out.println("49%");
            System.out.println("50%");
            System.out.println("51%");
            System.out.println("52%");
            System.out.println("53%");
            System.out.println("54%");
            System.out.println("55%");
            System.out.println("56%");
            System.out.println("57%");
            System.out.println("58%");
            System.out.println("59%");
            System.out.println("60%");
            System.out.println("61%");
            System.out.println("62%");
            System.out.println("63%");
            System.out.println("64%");
            System.out.println("65%");
            System.out.println("66%");
            System.out.println("67%");
            System.out.println("68%");
            System.out.println("69%");
            System.out.println("70%");
            System.out.println("71%");
            System.out.println("72%");
            System.out.println("73%");
            System.out.println("74%");
            System.out.println("75%");
            System.out.println("76%");
            System.out.println("77%");
            System.out.println("78%");
            System.out.println("79%");
            System.out.println("80%");
            System.out.println("81%");
            System.out.println("82%");
            System.out.println("83%");
            System.out.println("84%");
            System.out.println("85%");
            System.out.println("86%");
            System.out.println("87%");
            System.out.println("88%");
            System.out.println("89%");
            System.out.println("90%");
            System.out.println("91%");
            System.out.println("92%");
            System.out.println("93%");
            System.out.println("94%");
            System.out.println("95%");
            System.out.println("96%");
            System.out.println("97%");
            System.out.println("98%");
            System.out.println("99%");
            System.out.println("100%");
            System.out.println("Updating Baby.");
            System.out.println("1%");
            System.out.println("2%");
            System.out.println("3%");
            System.out.println("4%");
            System.out.println("5%");
            System.out.println("6%");
            System.out.println("7%");
            System.out.println("8%");
            System.out.println("9%");
            System.out.println("10%");
            System.out.println("11%");
            System.out.println("12%");
            System.out.println("13%");
            System.out.println("14%");
            System.out.println("15%");
            System.out.println("16%");
            System.out.println("17%");
            System.out.println("18%");
            System.out.println("19%");
            System.out.println("20%");
            System.out.println("21%");
            System.out.println("22%");
            System.out.println("23%");
            System.out.println("24%");
            System.out.println("25%");
            System.out.println("26%");
            System.out.println("27%");
            System.out.println("28%");
            System.out.println("29%");
            System.out.println("30%");
            System.out.println("31%");
            System.out.println("32%");
            System.out.println("33%");
            System.out.println("34%");
            System.out.println("35%");
            System.out.println("36%");
            System.out.println("37%");
            System.out.println("38%");
            System.out.println("39%");
            System.out.println("40%");
            System.out.println("41%");
            System.out.println("42%");
            System.out.println("43%");
            System.out.println("44%");
            System.out.println("45%");
            System.out.println("46%");
            System.out.println("47%");
            System.out.println("48%");
            System.out.println("49%");
            System.out.println("50%");
            System.out.println("51%");
            System.out.println("52%");
            System.out.println("53%");
            System.out.println("54%");
            System.out.println("55%");
            System.out.println("56%");
            System.out.println("57%");
            System.out.println("58%");
            System.out.println("59%");
            System.out.println("60%");
            System.out.println("61%");
            System.out.println("62%");
            System.out.println("63%");
            System.out.println("64%");
            System.out.println("65%");
            System.out.println("66%");
            System.out.println("67%");
            System.out.println("68%");
            System.out.println("69%");
            System.out.println("70%");
            System.out.println("71%");
            System.out.println("72%");
            System.out.println("73%");
            System.out.println("74%");
            System.out.println("75%");
            System.out.println("76%");
            System.out.println("77%");
            System.out.println("78%");
            System.out.println("79%");
            System.out.println("80%");
            System.out.println("81%");
            System.out.println("82%");
            System.out.println("83%");
            System.out.println("84%");
            System.out.println("85%");
            System.out.println("86%");
            System.out.println("87%");
            System.out.println("88%");
            System.out.println("89%");
            System.out.println("90%");
            System.out.println("91%");
            System.out.println("92%");
            System.out.println("93%");
            System.out.println("94%");
            System.out.println("95%");
            System.out.println("96%");
            System.out.println("97%");
            System.out.println("98%");
            System.out.println("99%");
            System.out.println("100%");
            System.out.println("Done.");
            System.out.println("Downloading Bob_the_Blobfish.");
            System.out.println("1%");
            System.out.println("2%");
            System.out.println("3%");
            System.out.println("4%");
            System.out.println("5%");
            System.out.println("6%");
            System.out.println("7%");
            System.out.println("8%");
            System.out.println("9%");
            System.out.println("10%");
            System.out.println("11%");
            System.out.println("12%");
            System.out.println("13%");
            System.out.println("14%");
            System.out.println("15%");
            System.out.println("16%");
            System.out.println("17%");
            System.out.println("18%");
            System.out.println("19%");
            System.out.println("20%");
            System.out.println("21%");
            System.out.println("22%");
            System.out.println("23%");
            System.out.println("24%");
            System.out.println("25%");
            System.out.println("26%");
            System.out.println("27%");
            System.out.println("28%");
            System.out.println("29%");
            System.out.println("30%");
            System.out.println("31%");
            System.out.println("32%");
            System.out.println("33%");
            System.out.println("34%");
            System.out.println("35%");
            System.out.println("36%");
            System.out.println("37%");
            System.out.println("38%");
            System.out.println("39%");
            System.out.println("40%");
            System.out.println("41%");
            System.out.println("42%");
            System.out.println("43%");
            System.out.println("44%");
            System.out.println("45%");
            System.out.println("46%");
            System.out.println("47%");
            System.out.println("48%");
            System.out.println("49%");
            System.out.println("50%");
            System.out.println("51%");
            System.out.println("52%");
            System.out.println("53%");
            System.out.println("54%");
            System.out.println("55%");
            System.out.println("56%");
            System.out.println("57%");
            System.out.println("58%");
            System.out.println("59%");
            System.out.println("60%");
            System.out.println("61%");
            System.out.println("62%");
            System.out.println("63%");
            System.out.println("64%");
            System.out.println("65%");
            System.out.println("66%");
            System.out.println("67%");
            System.out.println("68%");
            System.out.println("69%");
            System.out.println("70%");
            System.out.println("71%");
            System.out.println("72%");
            System.out.println("73%");
            System.out.println("74%");
            System.out.println("75%");
            System.out.println("76%");
            System.out.println("77%");
            System.out.println("78%");
            System.out.println("79%");
            System.out.println("80%");
            System.out.println("81%");
            System.out.println("82%");
            System.out.println("83%");
            System.out.println("84%");
            System.out.println("85%");
            System.out.println("86%");
            System.out.println("87%");
            System.out.println("88%");
            System.out.println("89%");
            System.out.println("90%");
            System.out.println("91%");
            System.out.println("92%");
            System.out.println("93%");
            System.out.println("94%");
            System.out.println("95%");
            System.out.println("96%");
            System.out.println("97%");
            System.out.println("98%");
            System.out.println("99%");
            System.out.println("100%");
            System.out.println("Updating Bob_the_Blobfish.");
            System.out.println("1%");
            System.out.println("2%");
            System.out.println("3%");
            System.out.println("4%");
            System.out.println("5%");
            System.out.println("6%");
            System.out.println("7%");
            System.out.println("8%");
            System.out.println("9%");
            System.out.println("10%");
            System.out.println("11%");
            System.out.println("12%");
            System.out.println("13%");
            System.out.println("14%");
            System.out.println("15%");
            System.out.println("16%");
            System.out.println("17%");
            System.out.println("18%");
            System.out.println("19%");
            System.out.println("20%");
            System.out.println("21%");
            System.out.println("22%");
            System.out.println("23%");
            System.out.println("24%");
            System.out.println("25%");
            System.out.println("26%");
            System.out.println("27%");
            System.out.println("28%");
            System.out.println("29%");
            System.out.println("30%");
            System.out.println("31%");
            System.out.println("32%");
            System.out.println("33%");
            System.out.println("34%");
            System.out.println("35%");
            System.out.println("36%");
            System.out.println("37%");
            System.out.println("38%");
            System.out.println("39%");
            System.out.println("40%");
            System.out.println("41%");
            System.out.println("42%");
            System.out.println("43%");
            System.out.println("44%");
            System.out.println("45%");
            System.out.println("46%");
            System.out.println("47%");
            System.out.println("48%");
            System.out.println("49%");
            System.out.println("50%");
            System.out.println("51%");
            System.out.println("52%");
            System.out.println("53%");
            System.out.println("54%");
            System.out.println("55%");
            System.out.println("56%");
            System.out.println("57%");
            System.out.println("58%");
            System.out.println("59%");
            System.out.println("60%");
            System.out.println("61%");
            System.out.println("62%");
            System.out.println("63%");
            System.out.println("64%");
            System.out.println("65%");
            System.out.println("66%");
            System.out.println("67%");
            System.out.println("68%");
            System.out.println("69%");
            System.out.println("70%");
            System.out.println("71%");
            System.out.println("72%");
            System.out.println("73%");
            System.out.println("74%");
            System.out.println("75%");
            System.out.println("76%");
            System.out.println("77%");
            System.out.println("78%");
            System.out.println("79%");
            System.out.println("80%");
            System.out.println("81%");
            System.out.println("82%");
            System.out.println("83%");
            System.out.println("84%");
            System.out.println("85%");
            System.out.println("86%");
            System.out.println("87%");
            System.out.println("88%");
            System.out.println("89%");
            System.out.println("90%");
            System.out.println("91%");
            System.out.println("92%");
            System.out.println("93%");
            System.out.println("94%");
            System.out.println("95%");
            System.out.println("96%");
            System.out.println("97%");
            System.out.println("98%");
            System.out.println("99%");
            System.out.println("100%");
            System.out.println("Done.");
            System.out.println("Downloading Invizabel's Grandpa.");
            System.out.println("1%");
            System.out.println("2%");
            System.out.println("3%");
            System.out.println("4%");
            System.out.println("5%");
            System.out.println("6%");
            System.out.println("7%");
            System.out.println("8%");
            System.out.println("9%");
            System.out.println("10%");
            System.out.println("11%");
            System.out.println("12%");
            System.out.println("13%");
            System.out.println("14%");
            System.out.println("15%");
            System.out.println("16%");
            System.out.println("17%");
            System.out.println("18%");
            System.out.println("19%");
            System.out.println("20%");
            System.out.println("21%");
            System.out.println("22%");
            System.out.println("23%");
            System.out.println("24%");
            System.out.println("25%");
            System.out.println("26%");
            System.out.println("27%");
            System.out.println("28%");
            System.out.println("29%");
            System.out.println("30%");
            System.out.println("31%");
            System.out.println("32%");
            System.out.println("33%");
            System.out.println("34%");
            System.out.println("35%");
            System.out.println("36%");
            System.out.println("37%");
            System.out.println("38%");
            System.out.println("39%");
            System.out.println("40%");
            System.out.println("41%");
            System.out.println("42%");
            System.out.println("43%");
            System.out.println("44%");
            System.out.println("45%");
            System.out.println("46%");
            System.out.println("47%");
            System.out.println("48%");
            System.out.println("49%");
            System.out.println("50%");
            System.out.println("51%");
            System.out.println("52%");
            System.out.println("53%");
            System.out.println("54%");
            System.out.println("55%");
            System.out.println("56%");
            System.out.println("57%");
            System.out.println("58%");
            System.out.println("59%");
            System.out.println("60%");
            System.out.println("61%");
            System.out.println("62%");
            System.out.println("63%");
            System.out.println("64%");
            System.out.println("65%");
            System.out.println("66%");
            System.out.println("67%");
            System.out.println("68%");
            System.out.println("69%");
            System.out.println("70%");
            System.out.println("71%");
            System.out.println("72%");
            System.out.println("73%");
            System.out.println("74%");
            System.out.println("75%");
            System.out.println("76%");
            System.out.println("77%");
            System.out.println("78%");
            System.out.println("79%");
            System.out.println("80%");
            System.out.println("81%");
            System.out.println("82%");
            System.out.println("83%");
            System.out.println("84%");
            System.out.println("85%");
            System.out.println("86%");
            System.out.println("87%");
            System.out.println("88%");
            System.out.println("89%");
            System.out.println("90%");
            System.out.println("91%");
            System.out.println("92%");
            System.out.println("93%");
            System.out.println("94%");
            System.out.println("95%");
            System.out.println("96%");
            System.out.println("97%");
            System.out.println("98%");
            System.out.println("99%");
            System.out.println("100%");
            System.out.println("Updating Invizabel's_Grandpa.");
            System.out.println("1%");
            System.out.println("2%");
            System.out.println("3%");
            System.out.println("4%");
            System.out.println("5%");
            System.out.println("6%");
            System.out.println("7%");
            System.out.println("8%");
            System.out.println("9%");
            System.out.println("10%");
            System.out.println("11%");
            System.out.println("12%");
            System.out.println("13%");
            System.out.println("14%");
            System.out.println("15%");
            System.out.println("16%");
            System.out.println("17%");
            System.out.println("18%");
            System.out.println("19%");
            System.out.println("20%");
            System.out.println("21%");
            System.out.println("22%");
            System.out.println("23%");
            System.out.println("24%");
            System.out.println("25%");
            System.out.println("26%");
            System.out.println("27%");
            System.out.println("28%");
            System.out.println("29%");
            System.out.println("30%");
            System.out.println("31%");
            System.out.println("32%");
            System.out.println("33%");
            System.out.println("34%");
            System.out.println("35%");
            System.out.println("36%");
            System.out.println("37%");
            System.out.println("38%");
            System.out.println("39%");
            System.out.println("40%");
            System.out.println("41%");
            System.out.println("42%");
            System.out.println("43%");
            System.out.println("44%");
            System.out.println("45%");
            System.out.println("46%");
            System.out.println("47%");
            System.out.println("48%");
            System.out.println("49%");
            System.out.println("50%");
            System.out.println("51%");
            System.out.println("52%");
            System.out.println("53%");
            System.out.println("54%");
            System.out.println("55%");
            System.out.println("56%");
            System.out.println("57%");
            System.out.println("58%");
            System.out.println("59%");
            System.out.println("60%");
            System.out.println("61%");
            System.out.println("62%");
            System.out.println("63%");
            System.out.println("64%");
            System.out.println("65%");
            System.out.println("66%");
            System.out.println("67%");
            System.out.println("68%");
            System.out.println("69%");
            System.out.println("70%");
            System.out.println("71%");
            System.out.println("72%");
            System.out.println("73%");
            System.out.println("74%");
            System.out.println("75%");
            System.out.println("76%");
            System.out.println("77%");
            System.out.println("78%");
            System.out.println("79%");
            System.out.println("80%");
            System.out.println("81%");
            System.out.println("82%");
            System.out.println("83%");
            System.out.println("84%");
            System.out.println("85%");
            System.out.println("86%");
            System.out.println("87%");
            System.out.println("88%");
            System.out.println("89%");
            System.out.println("90%");
            System.out.println("91%");
            System.out.println("92%");
            System.out.println("93%");
            System.out.println("94%");
            System.out.println("95%");
            System.out.println("96%");
            System.out.println("97%");
            System.out.println("98%");
            System.out.println("99%");
            System.out.println("100%");
            System.out.println("Done.");
            System.out.println("Downloading Mage.");
            System.out.println("1%");
            System.out.println("2%");
            System.out.println("3%");
            System.out.println("4%");
            System.out.println("5%");
            System.out.println("6%");
            System.out.println("7%");
            System.out.println("8%");
            System.out.println("9%");
            System.out.println("10%");
            System.out.println("11%");
            System.out.println("12%");
            System.out.println("13%");
            System.out.println("14%");
            System.out.println("15%");
            System.out.println("16%");
            System.out.println("17%");
            System.out.println("18%");
            System.out.println("19%");
            System.out.println("20%");
            System.out.println("21%");
            System.out.println("22%");
            System.out.println("23%");
            System.out.println("24%");
            System.out.println("25%");
            System.out.println("26%");
            System.out.println("27%");
            System.out.println("28%");
            System.out.println("29%");
            System.out.println("30%");
            System.out.println("31%");
            System.out.println("32%");
            System.out.println("33%");
            System.out.println("34%");
            System.out.println("35%");
            System.out.println("36%");
            System.out.println("37%");
            System.out.println("38%");
            System.out.println("39%");
            System.out.println("40%");
            System.out.println("41%");
            System.out.println("42%");
            System.out.println("43%");
            System.out.println("44%");
            System.out.println("45%");
            System.out.println("46%");
            System.out.println("47%");
            System.out.println("48%");
            System.out.println("49%");
            System.out.println("50%");
            System.out.println("51%");
            System.out.println("52%");
            System.out.println("53%");
            System.out.println("54%");
            System.out.println("55%");
            System.out.println("56%");
            System.out.println("57%");
            System.out.println("58%");
            System.out.println("59%");
            System.out.println("60%");
            System.out.println("61%");
            System.out.println("62%");
            System.out.println("63%");
            System.out.println("64%");
            System.out.println("65%");
            System.out.println("66%");
            System.out.println("67%");
            System.out.println("68%");
            System.out.println("69%");
            System.out.println("70%");
            System.out.println("71%");
            System.out.println("72%");
            System.out.println("73%");
            System.out.println("74%");
            System.out.println("75%");
            System.out.println("76%");
            System.out.println("77%");
            System.out.println("78%");
            System.out.println("79%");
            System.out.println("80%");
            System.out.println("81%");
            System.out.println("82%");
            System.out.println("83%");
            System.out.println("84%");
            System.out.println("85%");
            System.out.println("86%");
            System.out.println("87%");
            System.out.println("88%");
            System.out.println("89%");
            System.out.println("90%");
            System.out.println("91%");
            System.out.println("92%");
            System.out.println("93%");
            System.out.println("94%");
            System.out.println("95%");
            System.out.println("96%");
            System.out.println("97%");
            System.out.println("98%");
            System.out.println("99%");
            System.out.println("100%");
            System.out.println("Updating Mage.");
            System.out.println("1%");
            System.out.println("2%");
            System.out.println("3%");
            System.out.println("4%");
            System.out.println("5%");
            System.out.println("6%");
            System.out.println("7%");
            System.out.println("8%");
            System.out.println("9%");
            System.out.println("10%");
            System.out.println("11%");
            System.out.println("12%");
            System.out.println("13%");
            System.out.println("14%");
            System.out.println("15%");
            System.out.println("16%");
            System.out.println("17%");
            System.out.println("18%");
            System.out.println("19%");
            System.out.println("20%");
            System.out.println("21%");
            System.out.println("22%");
            System.out.println("23%");
            System.out.println("24%");
            System.out.println("25%");
            System.out.println("26%");
            System.out.println("27%");
            System.out.println("28%");
            System.out.println("29%");
            System.out.println("30%");
            System.out.println("31%");
            System.out.println("32%");
            System.out.println("33%");
            System.out.println("34%");
            System.out.println("35%");
            System.out.println("36%");
            System.out.println("37%");
            System.out.println("38%");
            System.out.println("39%");
            System.out.println("40%");
            System.out.println("41%");
            System.out.println("42%");
            System.out.println("43%");
            System.out.println("44%");
            System.out.println("45%");
            System.out.println("46%");
            System.out.println("47%");
            System.out.println("48%");
            System.out.println("49%");
            System.out.println("50%");
            System.out.println("51%");
            System.out.println("52%");
            System.out.println("53%");
            System.out.println("54%");
            System.out.println("55%");
            System.out.println("56%");
            System.out.println("57%");
            System.out.println("58%");
            System.out.println("59%");
            System.out.println("60%");
            System.out.println("61%");
            System.out.println("62%");
            System.out.println("63%");
            System.out.println("64%");
            System.out.println("65%");
            System.out.println("66%");
            System.out.println("67%");
            System.out.println("68%");
            System.out.println("69%");
            System.out.println("70%");
            System.out.println("71%");
            System.out.println("72%");
            System.out.println("73%");
            System.out.println("74%");
            System.out.println("75%");
            System.out.println("76%");
            System.out.println("77%");
            System.out.println("78%");
            System.out.println("79%");
            System.out.println("80%");
            System.out.println("81%");
            System.out.println("82%");
            System.out.println("83%");
            System.out.println("84%");
            System.out.println("85%");
            System.out.println("86%");
            System.out.println("87%");
            System.out.println("88%");
            System.out.println("89%");
            System.out.println("90%");
            System.out.println("91%");
            System.out.println("92%");
            System.out.println("93%");
            System.out.println("94%");
            System.out.println("95%");
            System.out.println("96%");
            System.out.println("97%");
            System.out.println("98%");
            System.out.println("99%");
            System.out.println("100%");
            System.out.println("Done.");
            System.out.println("Downloading Silent_Walrus.");
            System.out.println("1%");
            System.out.println("2%");
            System.out.println("3%");
            System.out.println("4%");
            System.out.println("5%");
            System.out.println("6%");
            System.out.println("7%");
            System.out.println("8%");
            System.out.println("9%");
            System.out.println("10%");
            System.out.println("11%");
            System.out.println("12%");
            System.out.println("13%");
            System.out.println("14%");
            System.out.println("15%");
            System.out.println("16%");
            System.out.println("17%");
            System.out.println("18%");
            System.out.println("19%");
            System.out.println("20%");
            System.out.println("21%");
            System.out.println("22%");
            System.out.println("23%");
            System.out.println("24%");
            System.out.println("25%");
            System.out.println("26%");
            System.out.println("27%");
            System.out.println("28%");
            System.out.println("29%");
            System.out.println("30%");
            System.out.println("31%");
            System.out.println("32%");
            System.out.println("33%");
            System.out.println("34%");
            System.out.println("35%");
            System.out.println("36%");
            System.out.println("37%");
            System.out.println("38%");
            System.out.println("39%");
            System.out.println("40%");
            System.out.println("41%");
            System.out.println("42%");
            System.out.println("43%");
            System.out.println("44%");
            System.out.println("45%");
            System.out.println("46%");
            System.out.println("47%");
            System.out.println("48%");
            System.out.println("49%");
            System.out.println("50%");
            System.out.println("51%");
            System.out.println("52%");
            System.out.println("53%");
            System.out.println("54%");
            System.out.println("55%");
            System.out.println("56%");
            System.out.println("57%");
            System.out.println("58%");
            System.out.println("59%");
            System.out.println("60%");
            System.out.println("61%");
            System.out.println("62%");
            System.out.println("63%");
            System.out.println("64%");
            System.out.println("65%");
            System.out.println("66%");
            System.out.println("67%");
            System.out.println("68%");
            System.out.println("69%");
            System.out.println("70%");
            System.out.println("71%");
            System.out.println("72%");
            System.out.println("73%");
            System.out.println("74%");
            System.out.println("75%");
            System.out.println("76%");
            System.out.println("77%");
            System.out.println("78%");
            System.out.println("79%");
            System.out.println("80%");
            System.out.println("81%");
            System.out.println("82%");
            System.out.println("83%");
            System.out.println("84%");
            System.out.println("85%");
            System.out.println("86%");
            System.out.println("87%");
            System.out.println("88%");
            System.out.println("89%");
            System.out.println("90%");
            System.out.println("91%");
            System.out.println("92%");
            System.out.println("93%");
            System.out.println("94%");
            System.out.println("95%");
            System.out.println("96%");
            System.out.println("97%");
            System.out.println("98%");
            System.out.println("99%");
            System.out.println("100%");
            System.out.println("Updating Silent_Walrus.");
            System.out.println("1%");
            System.out.println("2%");
            System.out.println("3%");
            System.out.println("4%");
            System.out.println("5%");
            System.out.println("6%");
            System.out.println("7%");
            System.out.println("8%");
            System.out.println("9%");
            System.out.println("10%");
            System.out.println("11%");
            System.out.println("12%");
            System.out.println("13%");
            System.out.println("14%");
            System.out.println("15%");
            System.out.println("16%");
            System.out.println("17%");
            System.out.println("18%");
            System.out.println("19%");
            System.out.println("20%");
            System.out.println("21%");
            System.out.println("22%");
            System.out.println("23%");
            System.out.println("24%");
            System.out.println("25%");
            System.out.println("26%");
            System.out.println("27%");
            System.out.println("28%");
            System.out.println("29%");
            System.out.println("30%");
            System.out.println("31%");
            System.out.println("32%");
            System.out.println("33%");
            System.out.println("34%");
            System.out.println("35%");
            System.out.println("36%");
            System.out.println("37%");
            System.out.println("38%");
            System.out.println("39%");
            System.out.println("40%");
            System.out.println("41%");
            System.out.println("42%");
            System.out.println("43%");
            System.out.println("44%");
            System.out.println("45%");
            System.out.println("46%");
            System.out.println("47%");
            System.out.println("48%");
            System.out.println("49%");
            System.out.println("50%");
            System.out.println("51%");
            System.out.println("52%");
            System.out.println("53%");
            System.out.println("54%");
            System.out.println("55%");
            System.out.println("56%");
            System.out.println("57%");
            System.out.println("58%");
            System.out.println("59%");
            System.out.println("60%");
            System.out.println("61%");
            System.out.println("62%");
            System.out.println("63%");
            System.out.println("64%");
            System.out.println("65%");
            System.out.println("66%");
            System.out.println("67%");
            System.out.println("68%");
            System.out.println("69%");
            System.out.println("70%");
            System.out.println("71%");
            System.out.println("72%");
            System.out.println("73%");
            System.out.println("74%");
            System.out.println("75%");
            System.out.println("76%");
            System.out.println("77%");
            System.out.println("78%");
            System.out.println("79%");
            System.out.println("80%");
            System.out.println("81%");
            System.out.println("82%");
            System.out.println("83%");
            System.out.println("84%");
            System.out.println("85%");
            System.out.println("86%");
            System.out.println("87%");
            System.out.println("88%");
            System.out.println("89%");
            System.out.println("90%");
            System.out.println("91%");
            System.out.println("92%");
            System.out.println("93%");
            System.out.println("94%");
            System.out.println("95%");
            System.out.println("96%");
            System.out.println("97%");
            System.out.println("98%");
            System.out.println("99%");
            System.out.println("100%");
            System.out.println("Done.");
            System.out.println("Finished.");
            System.out.print("Press 3.1415 to confirm or press 0 to cancel: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 3.1415) {
            System.out.println("");
            System.out.println("Which DLC do you want to use?");
            //System.out.println("Press 538.040 for Mage!");
            System.out.println("Press 287.945 for Ned the Silent Walrus!");
            System.out.println("Press 987.732 for Bob the Blobfish!");
            System.out.println("Press 297.847 for Invizabel's Grandpa");
            System.out.println("Press 855.194 for Baby");
            //System.out.println("Press 622.197 *add dlc here*");
            reply = myScanner.nextDouble();
        }
        if (reply == 538.040) {
            //System.out.println("Add Mage Here");

            reply = myScanner.nextDouble();
        }
        if (reply == 287.945) {
            System.out.println("");
            System.out.println("Part 1");
            System.out.println("You have chosen Ned the Silent Walrus!");
            System.out.println("Do you want to eat fish?");
            System.out.println("287.946- Eat fish; 287.947- Don't eat fish");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 287.946) {
            System.out.println("");
            System.out.println("Part 2");
            System.out.println("You eat fish.");
            System.out.println("Do you want to go storm the castle?");
            System.out.println("287.948- Yes; 287.949- No");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 287.947) {
            System.out.println("");
            System.out.println("Part 2");
            System.out.println("You do not eat the fish.");
            System.out.println("You die from hunger.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 287.948) {
            System.out.println("");
            System.out.println("Part 3");
            System.out.println("You storm the castle.");
            System.out.println("Do you storm it successfully?");
            System.out.println("Press 287.950 or 287.951");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 287.949) {
            System.out.println("");
            System.out.println("Part 3");
            System.out.println("You do not storm the castle.");
            System.out.println("Unforutantely, you get eaten by a sea unicorn");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 287.950 && math == 0) {
            System.out.println("");
            System.out.println("Part 4");
            System.out.println("You storm the castle succesfully.");
            System.out.println(name + ", YOU WIN!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 287.950 && math == 1) {
            System.out.println("");
            System.out.println("Part 4");
            System.out.println("You don't storm the castle succesfully.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 287.951 && math == 0) {
            System.out.println("");
            System.out.println("Part 4");
            System.out.println("You storm the castle succesfully.");
            System.out.println(name + ", YOU WIN!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 287.951 && math == 1) {
            System.out.println("");
            System.out.println("Part 4");
            System.out.println("You don't storm the castle succesfully.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 987.732) {
            System.out.println("");
            System.out.println("Part 1");
            System.out.println("You have chosen Bob the Blobfish!");
            System.out.println("Do you choose to plop into the toilet?");
            System.out.println("987.733- Yes; 987.734- No");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 987.733) {
            System.out.println("");
            System.out.println("Part 2");
            System.out.println("You plop into the toilet.");
            System.out.println("Do you want to go to Hawaii or the moon?");
            System.out.println("987.735- Hawaii; 987.736- The moon");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 987.734) {
            System.out.println("");
            System.out.println("Part 2");
            System.out.println("You do not plop into the toilet.");
            System.out.println("Unfortunately, Godzilla breaks into your house and burns you into ashes.");
            System.out.println("Then he eats you.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 987.735) {
            System.out.println("");
            System.out.println("Part 3");
            System.out.println("You go to Hawaii.");
            System.out.println("Do you want to go see Ned the Silent Walrus?");
            System.out.println("987.737- Yes; 987.738- No");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 987.736) {
            System.out.println("");
            System.out.println("Part 3");
            System.out.println("You go to the moon");
            System.out.println("Did you forget?");
            System.out.println("There's no water on the moon.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 987.737) {
            System.out.println("");
            System.out.println("Part 4");
            System.out.println("You go see Ned the Silent Walrus.");
            System.out.println("Unfortunately, Ned's wife got walrus-napped by an Orca.");
            System.out.println("Do you want to go see your sister, Jayden the Blobfish in China?");
            System.out.println("987.739- Yes; 987.740- No");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 987.738) {
            System.out.println("");
            System.out.println("Part 4");
            System.out.println("You don't go see Ned the Silent Walrus");
            System.out.println("Unfortunately, a wild pekka comes out of nowhere and pwns you!");
            System.out.println("Do you want to go see your sister, Jayden the Blobfish?");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 987.739) {
            System.out.println("");
            System.out.println("Part 5");
            System.out.println("You go see your sister, Jayden the Blobfish in China.");
            System.out.println("You love China.");
            System.out.println("Unfortunately, Jayden drowns on the last day that you're there.");
            System.out.println("Yes, that's right, a blobfish, drowning.");
            System.out.println("Weird hah?");
            System.out.println("Luckily for you, someone gives you a lottery ticket to help with Jayden's death.");
            System.out.println("Do you win the lottery?");
            System.out.println("Press 987.741 or 987.742");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 987.740) {
            System.out.println("");
            System.out.println("Part 5");
            System.out.println("You don't go see you sister, Jayden the Blobfish in China.");
            System.out.println("Unfortunately, You choke on a Lego piece and DIE!!!");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 987.741 && math == 0) {
            System.out.println("");
            System.out.println("Part 6");
            System.out.println("You win the lottery!");
            System.out.println(name + ", YOU WIN!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 987.741 && math == 1) {
            System.out.println("");
            System.out.println("Part 6");
            System.out.println("You don't win the lottery.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 987.742 && math == 0) {
            System.out.println("");
            System.out.println("Part 6");
            System.out.println("You win the lottery!");
            System.out.println(name + ", YOU WIN!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 987.742 && math == 1) {
            System.out.println("");
            System.out.println("Part 6");
            System.out.println("You don't win the lottery.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 297.847) {
            System.out.println("");
            System.out.println("Part 1");
            System.out.println("You have chosen Invizabel's Grandpa.");
            System.out.println("Do you want to buy a Grandfather Hippie Van 9000?");
            System.out.println("297.848- Yes; 297.849- No");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 297.848) {
            System.out.println("");
            System.out.println("Part 2");
            System.out.println("You go buy a Grandfather Hippie Van 9000.");
            System.out.println("Do you want to go camping?");
            System.out.println("297.850- Yes; 297.851- No");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 297.849) {
            System.out.println("");
            System.out.println("Part 2");
            System.out.println("You don't buy a hippie van 9000.");
            System.out.println("Your lucky because Grandma didn't want you to get a Grandfather Hippie Van 9000 because she thinks it's a piece of junk.");
            System.out.println("You live until 85.");
            System.out.println("You die peacefully in your sleep.");
            System.out.println(name + ", YOU WIN!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 297.850) {
            System.out.println("");
            System.out.println("Part 3");
            System.out.println("You go camping.");
            System.out.println("You only brought hotdogs and Twin Brook Creamery creamy choclate milk in a glass bottle.");
            System.out.println("In case you didn't already know grandma's mad at you.");
            System.out.println("Do you cook the hotdogs on the grill?");
            System.out.println("297.852- Yes; 297.853- No");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 297.851) {
            System.out.println("");
            System.out.println("Part 3");
            System.out.println("You go don't go camping.");
            System.out.println("Unfortunately, your narrator for this DLC is Michael 'Invizabel' Mueller.");
            System.out.println("Since I'm the narrator I give you sudden death.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 297.852) {
            System.out.println("");
            System.out.println("Part 4");
            System.out.println("You cook the hotdogs on the grill.");
            System.out.println("Unfortunately, your grill explodes in your face.");
            System.out.println("The grill starts a forest fire.");
            System.out.println("You need to get out of the forest.");
            System.out.println("Do you take a shortcut?");
            System.out.println("297.854- Yes; 297.855- No");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 297.853) {
            System.out.println("");
            System.out.println("Part 4");
            System.out.println("You don't cook the hotdogs on the grill.");
            System.out.println("Unfortunately, you get food poisoning.");
            System.out.println("Since your in the middle of nowhere, no one can save you.");
            System.out.println("You die!");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 297.854) {
            System.out.println("");
            System.out.println("Part 5");
            System.out.println("You take a shortcut.");
            System.out.println("Unfortunately, since you have chosen Ivizabel's Grandpa you actually take the long way around.");
            System.out.println("For some reason, you enjoy seeing the scenic view of the forest burning.");
            System.out.println("Your Grandfather Hippie Van 9000 get's caught on fire.");
            System.out.println("You burn to death!");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 297.855) {
            System.out.println("");
            System.out.println("Part 5");
            System.out.println("You don't take a a shortcut.");
            System.out.println("Do you escape the million degree inferno?");
            System.out.println("Press 297.856 or 297.857");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 297.856) {
            System.out.println("");
            System.out.println("Part 6");
            System.out.println("You don't escape the millions of degrees inferno");
            System.out.println("You burn to death!");
            System.out.println("Hopefully you have learned your lesson.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 297.857) {
            System.out.println("");
            System.out.println("Part 6");
            System.out.println("You escape the millions of degrees inferno");
            System.out.println("Hopefully you have learned your lesson.");
            System.out.println(name + ", YOU WIN!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 855.194) {
            System.out.println("");
            System.out.println("Part 1");
            System.out.println("You have chosen to be a baby!");
            System.out.println("Do you want to cry?");
            System.out.println("855.195- Yes; 855.196- No");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 855.195) {
            System.out.println("");
            System.out.println("Part 1");
            System.out.println("You start crying.");
            System.out.println("Because of this you get some milk.");
            System.out.println("Do you want to cry again?");
            System.out.println("855.197- Yes; 855.198- No");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 855.196) {
            System.out.println("");
            System.out.println("Part 1");
            System.out.println("You don't cry.");
            System.out.println("Because you don't cry your parents don't know your hungry.");
            System.out.println("You starve to death,.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 855.197) {
            System.out.println("");
            System.out.println("Part 2");
            System.out.println("You start to cry again.");
            System.out.println("You wet your diaper.");
            System.out.println("Your parents change you.");
            System.out.println("You are now three years old.");
            System.out.println("You see some marbles.");
            System.out.println("Do you play with them?");
            System.out.println("855.199- Yes; 855.200- No");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 855.198) {
            System.out.println("");
            System.out.println("Part 2");
            System.out.println("You don't cry again.");
            System.out.println("You wet your diaper.");
            System.out.println("Your parents don't know you wet your diaper.");
            System.out.println("You get an infection.");
            System.out.println("Your parents take you to the hospital.");
            System.out.println("Unfortunately, the doctors can't save you.");
            System.out.println("You die at the hospital.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 855.199) {
            System.out.println("");
            System.out.println("Part 3");
            System.out.println("You play with the marbles.");
            System.out.println("You choke on them and die!");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 855.200) {
            System.out.println("");
            System.out.println("Part 3");
            System.out.println("You don't play with the marbles.");
            System.out.println("Because you don't play with the marbles you don't choke on them.");
            System.out.println("You are now five years old.");
            System.out.println("You see some round candies in the laundry room.");
            System.out.println("Do you eat them?");
            System.out.println("855.201- Yes; 855.202- No");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 855.201) {
            System.out.println("");
            System.out.println("Part 4");
            System.out.println("You eat the round candies in the laundry room.");
            System.out.println("Unfortunately, these candies aren't candies.");
            System.out.println("They're laundry detergent pods.");
            System.out.println("You get food poisoning.");
            System.out.println("You die at the hospital.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 855.202) {
            System.out.println("");
            System.out.println("Part 4");
            System.out.println("You don't eat the round candies in the laundry room.");
            System.out.println("Luckily for you, these candies are actually laundry detergent pods.");
            System.out.println("You are now 13 years old.");
            System.out.println("You get a laptop for your birthday.");
            System.out.println("What you didn't know is that your parents want you to be computer programmer.");
            System.out.println("Do you play Minecraft on it or learn to program the 'Hello World' program?");
            System.out.println("855.203- Play Minecraft on it; 855.204- Learn to program the 'Hello World' program");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 855.203) {
            System.out.println("");
            System.out.println("Part 5");
            System.out.println("You have chosen to play Minecraft.");
            System.out.println("You have never played Minceraft before and you become addicted to it immediately.");
            System.out.println("You become obese");
            System.out.println("You die from a heart attack.");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 855.204) {
            System.out.println("");
            System.out.println("Part 5");
            System.out.println("You learn to make the 'Hello World' Command.");
            System.out.println("It turns out, you like programmng.");
            System.out.println("You are now 18 years old.");
            System.out.println("You go to college and get a Bachelor's degree in computer science!");
            System.out.println("You found your own company.");
            System.out.println("You make a text adventure game called: Volor Savanna.");
            System.out.println("Does it sell well?");
            System.out.println("Press 855.205 or 855.206");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 855.205 && math == 0) {
            System.out.println("");
            System.out.println("Part 6");
            System.out.println("It sells very well.");
            System.out.println("You become rich and famous.");
            System.out.println(name + ", YOU WIN!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 855.205 && math == 1) {
            System.out.println("");
            System.out.println("Part 6");
            System.out.println("It sells horribly.");
            System.out.println("The game took all of your life savings to make.");
            System.out.println("You become very poor.");
            System.out.println("You die from hunger");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 855.206 && math == 0) {
            System.out.println("");
            System.out.println("Part 6");
            System.out.println("It sells very well.");
            System.out.println("You become rich and famous.");
            System.out.println(name + ", YOU WIN!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 855.206 && math == 1) {
            System.out.println("");
            System.out.println("Part 6");
            System.out.println("It sells horribly.");
            System.out.println("The game took all of your life savings to make.");
            System.out.println("You become very poor.");
            System.out.println("You die from hunger");
            System.out.println(name + ", YOU LOSE!");
            System.out.println("THE END!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 538.040) {
            System.out.println("");
            System.out.println("Part 1");
            System.out.println("Your village is running low on food.");
            System.out.println("What do you do?");
            System.out.println("538.041- Go hunting; 538.042- Try and summon rain; 538.043- Go to alternate dimension; 538.044- Go to the castle and ask for more food");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 538.041) {
            System.out.println("");
            System.out.println("Part 2");
            System.out.println("You get two deer.");
            System.out.println("538.045- Continue hunting; 538.046- Go back");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 538.042) {
            System.out.println("");
            System.out.println("Part 2");
            System.out.println("You cause a flood.");
            System.out.println("538.047- Leave; 538.048- Try and say sorry");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 538.043) {
            System.out.println("");
            System.out.println("Part 2");
            System.out.println("you go to an alternate dimension.");
            System.out.println("538.049- Search for the portal; 538.050- Stay and live off the new land");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 538.044) {
            System.out.println("");
            System.out.println("Part 2");
            System.out.println("You go to the castle and ask for more food.");
            System.out.println("The queen agrees to help you if you help her fight the giant spider.");
            System.out.println("538.051- Help fight the giant spider; 538.052- You say you can't");
            System.out.print(name + ", Make Your Choice: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 1312016) {
            System.out.println("");
            System.out.println("    --");
            System.out.println("   |  |");
            System.out.println(" --    --");
            System.out.println("|         |");
            System.out.println(" --    --");
            System.out.println("   |  |");
            System.out.println("    --");
            System.out.println("January 31, 2016- When Invizabel officialy became a christian!");
            System.out.println(name + ", you found an easter egg!");
            System.out.print("Type 0 for credits: ");
            reply = myScanner.nextDouble();
        }
        if (reply == 0) {
            System.out.println("");
            System.out.println("Credits:");
            System.out.println("Thank you for playing Volor Savanna!");
            System.out.println("Game made by Invizabel and Flish!");
            System.out.println("Operating Systems used in the production of this game: Windows 7, Windows 10 , Mac OS X Sierra!");
            System.out.println("Game made using Netbeans IDE!");
        } else {
            System.out.println("");
            System.out.println("This is not a possible choice.");
        }
    }
}
