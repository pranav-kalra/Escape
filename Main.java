import java.util.Scanner;

public class Main {

    public static boolean outside = false;
    public static boolean inside = false;
    public static boolean desk = false;
    public static boolean photo = false;
    public static boolean room = false;
    public static int count = 30;
    public static String test;
    public static Scanner scan;

    public static void main(String[] args) {
        // write your code here
        //first design the story
        //ruh roh raggy; randomize the error messages for wasting turns
        //every 5 turns say "tick tock"

        System.out.println("Scoobert Doobert");
        //put in controls
        System.out.println("Uh oh! It looks like we have a mystery in our hands." +
                "You(Shaggy), Fred, Daphne, Velma, and Scooby Doo are investigating a mystery in " +
                "the middle of the woods. There seems to be a ghost around town haunting people.\n");
        System.out.println("You and the gang are somehow in the middle of the woods in front of a large castle.\n");

        while (outside == false) {
            out();
        }


        System.out.println("As soon as everyone walks in, the door slams closed. In the corner of the room, the scarce moonlight" +
                " illuminates a grandfather clock. It is at the 6 o’clock position. You hear a sharp tick as the minutes hand moves:" +
                " 30 minutes until who knows what.\n");
        //ask what direction you want to go

        while (inside == false) {
            in();
            counter();
        }

        System.out.println("You go to the desk and you grab the photo");

        while (photo == false) {
            photon();
            counter();
        }

        System.out.println("\"Yikes,\" mutters Scooby.");
        System.out.println("You also see a button.");

        while (desk == false) {
            desker();
            counter();
        }

        while (room == false) {
            roomer();
            counter();

        }

        System.out.println("“Daphne and I will take the bedroom,” exclaims Fred.\n" +
                " Gee, it’s not like they take the same place every time. I wonder what they’re gonna do there.");
        System.out.println("You and Scooby take the kitchen, naturally, because somehow your gut is like a black hole. Man, some people would \n" +
                "kill -- sorry, wrong choice of words --  for that metabolism. Inside, you raid the kitchen. As you feast on what ever dares to \n" +
                " exist in the fridge. You have a choice on what to eat: a scrumptious-looking turkey, a thick saucy pizza, or a juicy hamburger.\n");

        eat();
        counter();


    }

    public static void out() {
        scan = new Scanner(System.in);
        test = scan.nextLine();
//            test = "hello";
        switch (test) {
            case "go north":
                System.out.println("It appears the door is bolted shut. You’re going to have to find another way in. I mean, that is if you want go inside.");
                break;

            case "go east":
                System.out.println("You walk toward the Mystery Machine. You remember that it ran out of gas and Fred forgot to refill it at the last rest stop. Dang it, Fred, you had one job!");
                break;

            case "go south":
                System.out.println("You see a long, winding, dark road going for miles and miles in the forest. It looks really dangerous and you definitely don’t remember seeing anything except trees for the last half an hour.");
                break;

            case "go west":
                System.out.println("You travel behind the house and you see a window.");
                System.out.println("Fred says it is a good idea to go inside. You, with common sense, incessantly object, but Velma tosses a couple Scooby snacks inside and well ya gotta do what ya gotta do.\n");
                outside = true;
                break;
            default:
                System.out.println("?? I don't know what that means dawg. I can \"go\" in a direction");
        }
    }

    public static void in() {
        scan = new Scanner(System.in);
        test = scan.nextLine();
        switch (test) {
            case "go north":
                System.out.println("You can’t go that way. It’s, I don’t know, LOCKED.");
                break;

            case "go south":
                System.out.println("You see a desk with a photo");
                inside = true;
                break;

            case "go east":
                System.out.println("Just a wall");
                break;

            case "go west":
                System.out.println("Only a long, scary corridor");
                break;
        }
    }


    public static void photon() {
        scan = new Scanner(System.in);
        test = scan.nextLine();
        switch (test) {
            case "look photo":
                System.out.println("You pick up the photo frame, showing what looks to be a married couple. A tall, brunette man wearing a checkered polo\n" +
                        " stands tall next to his cute, blonde wife. But in the background, you see a yellow suit which resembles some kind of creature?");
                photo = true;
                break;

            default:
                System.out.println("C'mon there is one thing you are looking at and there is one motion you could do");
                break;
        }
    }


    public static void desker() {
        scan = new Scanner(System.in);
        test = scan.nextLine();
        switch (test) {
            case "press button":
                System.out.println("A bookshelf in the corner swings open. It reveals a secret room. ");
                desk = true;
                break;
            default:
                System.out.println("C'mon there is one thing you are looking at and there is one motion you could do");
                break;
        }
    }

    public static void roomer() {
        scan = new Scanner(System.in);
        test = scan.nextLine();
        switch (test) {
            case "go room":
                System.out.println("This isn’t much of a room, but more like a foyer. You see a kitchen, a staircase, and study.");
                room = true;
                break;
            default:
                System.out.println("C'mon there is one thing you are looking at and there is one motion you could do");
                break;

        }
    }

    public static void eat() {
        scan = new Scanner(System.in);
        test = scan.nextLine();
        switch (test) {
            default:
                System.out.println("As you munch, you hear an ominous noise.");
        }
    }






    public static void counter() {
        count--;
//        if ((count != 30) && (count % 5) && (count !%% 10)){
//            System.out.println("Like, hurry up dude");
//        }
//        if ((count != 30) && (count % 10)) {
//            System.out.println("Like, what's taking so long man");
//        }
//
//        if ((count <= 3) && (count > 0)) {
//            System.out.println("You're running out of time");
//        }
        System.out.println("You have " + count + "turns left");
        if (count == 0) {
            System.out.println("You failed!");
            System.exit(0);
        }
    }




}


// instead of løøp, just rerun the method inside the case

/*
import java.util.Scanner;

public class Main {

    public static Scanner scan;
    public static int movesLeft = 30;
    public static String output = "You find yourself in a large foyer. There is a door to the north. To the west is a bench against the wall. To the east is a chest on the floor. In the center of the room is a large candle. The candle is unlit.";

    public static boolean inFoyer = true;
    public static boolean inLibrary = false;
    public static boolean inConservatory = false;

    //foyer conditions
    public static boolean chestOpen = false;
    public static boolean hasMatches = false;
    public static boolean candleLit = false;
    public static boolean door1Locked = true;
    public static boolean door1Open = false;

    //library conditions
    public static boolean getPen = false;
    public static boolean writeBook = false;
    public static boolean door2Locked = true;
    public static boolean door2Open = false;

    //conservatory conditions
    public static boolean playTrumpet = false;
    public static boolean playPiano = false;
    public static boolean playDrum = false;

    public static void main(String[] args) {

        System.out.printf("Welcome to The House. You have 30 moves to escape. There is a set of verbs and nouns that will allow you to leave in the format of verb (open, close, light, read, write, play, look, get), noun (door, room, bench, chest, candle, note, matches, shelves, book, pen, scroll, music, trumpet, piano, drum, lock), or to move, indicate direction (north, south, east, west). Good luck.\n\n");
        for (int i = 1; i < 31; i++) {
            gameUsage();
            movesLeft--;
            if (playTrumpet && playPiano && playDrum) {
                break;
            }
        }
        if (playTrumpet && playPiano && playDrum) {
            System.out.printf("\nCongratulations! You have completed the escape room challenge successfully in with %d moves to spare.", movesLeft);
        }
        else {
            System.out.printf("\nYou have failed the escape room challenge. Try again!");
        }
    }

    public static void gameUsage() {
        if (inFoyer) {
            foyer();
        }
        else if (inLibrary) {
            library();
        }
        else if (inConservatory) {
            conservatory();
        }
    }

    public static void foyer() {
        System.out.printf("%s You have %d moves left.\n>>", output, movesLeft);
        scan = new Scanner(System.in);
        String test = scan.nextLine();

        switch (test) {

            case "look bench":
                output = "There is a note on the bench.";
                break;

            case "read note":
                output = "May my light show you the way.";
                break;

            case "look chest":
                output = "the chest is closed.";
                break;

            case "open chest":
                chestOpen = true;
                output = "There are matches in the chest.";
                break;

            case "get matches":
                hasMatches = true;
                output = "You have a box of matches.";
                break;

            case "light candle":
                if (hasMatches) {
                    candleLit = true;
                    door1Locked = false;
                    output = "The candle is lit. You heard a metal grinding sound from the north.";
                }
                else {
                    output = "You don't have any matches.";
                }
                break;

            case "look door":
                if (!door1Locked) {
                    if (door1Open) {
                        output = "The door is unlocked and open.";
                    }
                    else {
                        output = "The door is unlocked, but closed.";
                    }
                }
                else {
                    output = "The door is locked.";
                }
                break;

            case "open door":
                if (!door1Locked) {
                    door1Open = true;
                    output = "The north door is open.";
                }
                break;

            case "north":
                if (door1Open) {
                    inFoyer = false;
                    inLibrary = true;
                    output = "You have left the foyer. On your way out, the door slammed and locked. You are now in the library and cannot return to the foyer. In the library there are stacks of books lining the shelves, a desk, a pen, and a scroll. There is another locked door to the north.";
                }
                break;
        }
    }

    public static void library() {
        System.out.printf("%s You have %d moves left.\n>>", output, movesLeft);
        scan = new Scanner(System.in);
        String test = scan.nextLine();

        switch (test) {

            case "look bookshelf":
                output = "There is a book titled 'The Autobiography of ...' with the rest of the title empty.";
                break;

            case "get pen":
                getPen = true;
                output = "You have acquired the pen.";
                break;

            case "read scroll":
                output = "the scroll says, 'Share your story.'";
                break;

            case "write book":
            case "write name":
                writeBook = true;
                door2Locked = false;
                output = "You have completed the autobiography You heard a metal grinding sound from the north.";
                break;

            case "look door":
                if (!door2Locked) {
                    if (door2Open) {
                        output = "The door is unlocked and open.";
                    }
                    else {
                        output = "The door is unlocked, but closed.";
                    }
                }
                else {
                    output = "The door is locked.";
                }
                break;

            case "open door":
                if (!door2Locked) {
                    door2Open = true;
                    output = "The north door is open.";
                }
                break;

            case "north":
                if (door1Open) {
                    inLibrary = false;
                    inConservatory = true;
                    output = " You have left the library. On your way out, the door slammed and locked. You are now in the conservatory and cannot return to the library. In the conservatory there are there are three instruments: a trumpet, a piano, and a drum. There is a sheet of music on a stand.";
                }
                break;

            default:
                output = "In the library there are stacks of books lining the shelves, a desk, a pen, and a scroll. There is another locked door to the north.";
        }
    }

    public static void conservatory()  {
        System.out.printf("%s You have %d moves left.\n>>", output, movesLeft);
        scan = new Scanner(System.in);
        String test = scan.nextLine();

        switch (test) {
            case "read music":
                output = "Timbre, Tone, Time";
                break;

            case "play trumpet":
                if (!playPiano && !playDrum) {
                    playTrumpet = true;
                    output = "*trumpet noise*";
                }
                else {
                    output = "Hmm... Something seems to be wrong with the trumpet. It isn't playing correctly.";
                }
                break;

            case "play piano":
                if (playTrumpet && !playDrum) {
                    playPiano = true;
                    output = "*piano noise*";
                }
                else {
                    output = "Hmm... Something seems to be wrong with the piano. It isn't playing correctly.";
                }
                break;

            case "play drum":
                if (playTrumpet && playPiano) {
                    playDrum = true;
                    output = "*drum noise*";
                }
                else {
                    output = "Hmm... Something seems to be wrong with the drum. It isn't playing correctly.";
                }
                break;

            default:
                output = "In the conservatory there are there are three instruments: a trumpet, a piano, and a drum. There is a sheet of music on a stand.";
        }
    }
}



/*

import java.util.Scanner;
public class Main {
    public static int room = 0;
    public static boolean hasLooked = false;
    public static boolean hasMatches = false;
    public static int matches = 30;
    public static boolean hasTouchedBooks = false;
    public static boolean hasLookedatDesk = false;
    public static boolean hasTouchedDesk = false;
    public static boolean hasLookedatDecoration = false;
    public static boolean hasPressedButton = false;
    public static int walk = 0;
    public static void main(String[] args) {
        initialize();
    }
    public static void initialize() {
        System.out.println("You awaken. Type help for a list of commands.\n");
        seekInput();
    }
    public static void seekInput() {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        check(input);
    }
    public static String check(String input) {
        if (room == 3)
            return "Success";
        if (input.equals("debug")) {
            matches = 1000;
        }
        if (input.equals("db0")) {
            room = 0;
            hasLooked = false;
            hasMatches = false;
            matches = 30;
            hasTouchedBooks = false;
            hasLookedatDesk = false;
            hasTouchedDesk = false;
            hasLookedatDecoration = false;
            hasPressedButton = false;
            walk = 0;
        }
        if (input.equals("db1")) {
            room = 1;
            hasLooked = false;
            hasMatches = true;
            matches = 30;
            hasTouchedBooks = false;
            hasLookedatDesk = false;
            hasTouchedDesk = false;
            hasLookedatDecoration = false;
            hasPressedButton = false;
            walk = 0;
        }
        if (input.equals("db2")) {
            room = 2;
        }
        if (input.equals("quit")) {
            matches = 0;
        }
        if (room == 0) {
            if (input.equals("help")) {
                System.out.println("\nThese are all actions you can take right now:");
                if (hasLooked == false) {
                    System.out.print("look  |   help\n");
                }
                if ((hasLooked == true) && (hasMatches == false)) {
                    System.out.println("look  |   help\nget");
                }
                if (hasMatches == true) {
                    System.out.println("look  |   help\nlight");
                }
                System.out.println("\nThese are all the things you can interact with right now:");
                if (hasLooked == false) {
                    System.out.print("\n");
                }
                if (hasLooked == true) {
                    System.out.println("matches\n");
                }
            }
            if (input.equals("look")) {
                if (hasMatches == false) {
                    hasLooked = true;
                    System.out.println("\nThe brightness of your surroundings causes you great pain. You squint as you attempt to make out where you may be, but find yourself in a place entirely unfamiliar. A vast, empty expanse stretches out before you. A box of matches sits in front of you.\n");
                }
                if (hasMatches == true) {
                    hasLooked = true;
                    System.out.println("\nThe brightness of your surroundings causes you great pain. You squint as you attempt to make out where you may be, but find yourself in a place entirely unfamiliar. A vast, empty expanse stretches out before you.\n");
                }
            }
            if (input.equals("look matches")) {
                System.out.println("\nA box of matches, with a well worn magnesium strike pad on the side.\n");
            }
            if (input.equals("get matches")) {
                hasMatches = true;
                System.out.println("\nYou pick up the box of matches.\n");
            }
            if (input.equals("light matches")) {
                room = 1;
                matches--;
                System.out.printf("\nYou strike the match, and as it sparks to life, you are transported somewhere new. You have %d matches left.\n\n", matches);
                hasLooked = false;
            }
            if (matches <= 0) {
                System.out.println("\nYou have succumbed to the darkness.\n");
                return "Fail";
            }
            seekInput();
        }
        if (room == 1) {
            if (input.equals("help")) {
                System.out.println("\nThese are all actions you can take right now:");
                if (hasLooked == false) {
                    System.out.println("look  |   help");
                }
                if (hasLooked == true && hasLookedatDecoration == false) {
                    System.out.println("look  |   help\ntouch");
                }
                if (hasLooked == true && hasLookedatDecoration == true && hasPressedButton == false) {
                    System.out.println("look  |   help\ntouch  |  press");
                }
                if (hasLooked == true && hasLookedatDecoration == true && hasPressedButton == true) {
                    System.out.println("look  |   help\ntouch  |  press\nclimb");
                }
                System.out.println("\nThese are all the things you can interact with right now:");
                if (hasLooked == false) {
                    System.out.print("\n");
                }
                if ((hasLooked == true) && (hasTouchedBooks == true) && hasTouchedDesk == false) {
                    System.out.println("desk  |  stair\n");
                }
                if ((hasLooked == true) && (hasTouchedBooks == false) && hasTouchedDesk == false) {
                    System.out.println("desk  |  stair\nbooks\n");
                }
                if ((hasLooked == true) && (hasTouchedBooks == false) && hasTouchedDesk == true && hasLookedatDecoration == false) {
                    System.out.println("desk  |  stair\nbooks  |  decoration\n");
                }
                if ((hasLooked == true) && (hasTouchedBooks == true) && hasTouchedDesk == true && hasLookedatDecoration == false) {
                    System.out.println("desk  |  stair\ndecoration\n");
                }
                if ((hasLooked == true) && (hasTouchedBooks == false) && hasTouchedDesk == true && hasLookedatDecoration == true && hasPressedButton == false) {
                    System.out.println("desk  |  stair\nbooks  |  decoration\nbutton\n");
                }
                if ((hasLooked == true) && (hasTouchedBooks == true) && hasTouchedDesk == true && hasLookedatDecoration == true && hasPressedButton == false) {
                    System.out.println("desk  |  stair\ndecoration  |  button\n");
                }
                if ((hasLooked == true) && (hasTouchedBooks == false) && hasTouchedDesk == true && hasLookedatDecoration == true && hasPressedButton == true) {
                    System.out.println("desk  |  stair\nbooks  |  decoration\nbutton  |  ladder\n");
                }
                if ((hasLooked == true) && (hasTouchedBooks == true) && hasTouchedDesk == true && hasLookedatDecoration == true && hasPressedButton == true) {
                    System.out.println("desk  |  stair\ndecoration  |  button\nladder\n");
                }
            }
            if (input.equals("look")) {
                if (hasLooked == true && hasTouchedBooks == false) {
                    hasLooked = true;
                    System.out.println("\nYou come to the conclusion that you are in some sort of study. Piles of books loom menacingly over you, threatening to topple at any moment. An ornate wooden desk sits before you. A set of stairs spirals overhead, peculiarly ending a good ten feet above the floor.\n");
                    matchCount();
                }
                if (hasLooked == false) {
                    hasLooked = true;
                    System.out.println("\nYou find yourself in total darkness aside from the light emitted from your match, which is already beginning to dwindle. You will have to routinely light them if you want to see anything from here on out. As your eyes begin to adjust to the darkness, you come to the conclusion you are in some sort of study. Piles of books loom menacingly over you, threatening to topple at any moment. An ornate wooden desk sits before you. A set of stairs spirals overhead, peculiarly ending a good ten feet above the floor.\n");
                    matchCount();
                }
                if (hasLooked == true && hasTouchedBooks == true) {
                    hasLooked = true;
                    System.out.println("\nYou come to the conclusion that you are in some sort of study. Hundreds of books are strewn across the floor, almost as if some rude person had just gone ahead and knocked them all over. An ornate wooden desk sits before you. A set of stairs spirals overhead, peculiarly ending a good ten feet above the floor.\n");
                    matchCount();
                }
            }
            if (hasTouchedBooks == false) {
                if (input.equals("look books")) {
                    System.out.println("\nYou examine a column of tomes, noticing only now how truly precarious each book's position is. It almost begs you to touch it.\n");
                    matchCount();
                }
                if (input.equals("touch books")) {
                    System.out.println("\nYou lay a finger upon the spine of a rather weighty book situated in the middle of the stack and apply the slightest pressure. In one great avalance of knowledge, you find yourself knocked on the floor, covered in a mountain of literature and paper cuts. It seems you may have lost a few matches in the whole ordeal.\n");
                    matches -= 7;
                    matchCount();
                    hasTouchedBooks = true;
                }
            }
            if (hasLookedatDesk == true) {
                if (input.equals("look desk")) {
                    System.out.println("\nYou look at the old desk. Hundreds of pages soaked with ink are messily sprawled across it.\n");
                    matchCount();
                }
            }
            if (input.equals("look desk") && hasLookedatDesk == false) {
                System.out.println("\nYou glance at the desk and notice a few stray matches resting upon a crystal ashtray.\n");
                matches += 4;
                hasLookedatDesk = true;
                matchCount();
            }
            if (input.equals("touch desk")) {
                System.out.println("\nYou place your hand upon the desk's corner, lightly running it across the intricate designs carved upon the wooden edge. You are suprised when your fingers fall upon something unusually cold.\n");
                hasTouchedDesk = true;
                matchCount();
            }
            if (input.equals("look stair")) {
                if (hasPressedButton == false) {
                    System.out.println("\nThe stairs are grated metal, reminscient of an old fire escape. There appears to be a mechanism at the final step.\n");
                    matchCount();
                }
                if (hasPressedButton == true) {
                    System.out.println("\nThe stairs are grated metal, reminscient of an old fire escape. A ladder hangs from the final step, just barely touching the ground.\n");
                    matchCount();
                }
            }
            if (input.equals("touch stair")) {
                if (hasPressedButton == false) {
                    System.out.println("\nYou try your best to to touch the stairs, but they are too far out of reach.\n");
                    matchCount();
                }
                if (hasPressedButton == true) {
                    System.out.println("\nYou place your hand upon the stair and begin to wonder why you feel such a compulsion to touch everything you come across.\n");
                    matchCount();
                }
            }
            if (input.equals("look decoration")) {
                System.out.println("\nUpon closer inspection, you see that there is a small metal button hidden in the woodwork.\n");
                hasLookedatDecoration = true;
                matchCount();
            }
            if (input.equals("touch decoration")) {
                System.out.println("\nYou touch the decoration again. There definitely is something going on there.\n");
                matchCount();
            }
            if (input.equals("press button") || input.equals("touch button")) {
                System.out.println("\nYou press the button and hear a grinding of gears overhead.\n");
                hasPressedButton = true;
                matchCount();
            }
            if (input.equals("look button")) {
                System.out.println("\nYou take a look at the button, unsure of what to do with it. Then, in an astounding revelation, you remember: buttons are meant to be pressed.\n");
            }
            if (input.equals("look ladder")) {
                System.out.println("\nOh look, a ladder. How convenient that this ladder has emerged, now allowing you to go a direction which was previously unavailable to you! This truly is a happy and fortuitous occasion. Congratulations and good luck in all future laddering endeavours.\n");
                matchCount();
            }
            if (input.equals("climb ladder") || input.equals("climb stair")) {
                System.out.println("\nYou clamber up the ladder and onto the stairs. You flinch as the stairs begin to move and you are lifted towards a large balcony.\n");
                room = 2;
                hasLooked = false;
                matchCount();
            }
            if (input.equals("climb desk")) {
                System.out.println("\nA high pitched whine echoes throughout the study, causing you to fall to the floor in pain. Deep down, you know it's because of your strange desire to climb things you have no business climbing. You lose some matches.\n");
                matches -= 3;
                matchCount();
            }
            if (input.equals("climb books")) {
                System.out.println("\nA high pitched whine echoes throughout the study, causing you to fall to the floor in pain. Deep down, you know it's because of your strange desire to climb things you have no business climbing. You lose some matches.\n");
                matches -= 3;
                matchCount();
            }
            if (input.equals("climb decoration")) {
                System.out.println("\nA high pitched whine echoes throughout the study, causing you to fall to the floor in pain. Deep down, you know it's because of your strange desire to climb things you have no business climbing. You lose some matches.\n");
                matches -= 3;
                matchCount();
            }
            if (input.equals("climb button")) {
                System.out.println("\nA high pitched whine echoes throughout the study, causing you to fall to the floor in pain. Deep down, you know it's because of your strange desire to climb things you have no business climbing. You lose some matches.\n");
                matches -= 3;
                matchCount();
            }
            if (input.equals("press stair") || input.equals("press desk") || input.equals("press ladder") || input.equals("press decoration") || input.equals("press books")) {
                System.out.println("\nYou think about pressing it, but realize how dumb you would have to be to just go randomly pressing things. You are better than this.\n");
                matchCount();
            }
            if (matches < 0) {
                System.out.println("\nYou have succumbed to the darkness.\n");
                return "Fail";
            }
            seekInput();
        }
        if (room == 2) {
            if (input.equals("help")) {
                System.out.println("\nThese are all actions you can take right now:");
                if (hasLooked == false && walk < 4) {
                    System.out.println("look  |   help");
                }
                if (hasLooked == false && walk >= 4) {
                    System.out.println("look  |   help\nwalk");
                }
                if (hasLooked == true) {
                    System.out.println("look  |   help\nwalk");
                }
                System.out.println("\nThese are all the things you can interact with right now:");
                if (hasLooked == false || hasLooked == true) {
                    System.out.print("\n");
                }
            }
            if (input.equals("look")) {
                if (hasLooked == true && walk == 0) {
                    System.out.println("\nA hallway stretches out in front of you, its end obscured by darkness.\n");
                    matchCount();
                }
                if (hasLooked == true && walk > 0) {
                    System.out.println("\nYou look back, expecting to see the balcony you just left. However, you are dismayed to find that something frightening has occurred; where once there was a balcony, now is just more hallway, going on for as far as you can see. You steel your nerves and prepare to move onward.\n");
                    matchCount();
                }
                if (hasLooked == false && walk == 0) {
                    hasLooked = true;
                    System.out.println("\nAs you step onto the balcony, the stairs recede back to their original position. A hallway stretches out in front of you, its end obscured by darkness.\n");
                    matchCount();
                }
                if (hasLooked == false && walk >= 4) {
                    System.out.println("\nYou look out upon a beautiful seascape. As you begin to step forward, you quickly realize there is not much to step on. A rocky landing goes about a foor in front of where you stand, quickly dropping off into a sheer cliff face. You recognize the crashing waves below you as the source of the noises you previously heard.\n");
                }
            }
            if (input.equals("walk") && walk == 4) {
                walk++;
                System.out.println("\nYou look back into the dark of the hallway, and then out into the waters below. You decide you are not going back in there. You step beyond the cliff and begin your descent, wind screaming past your ears as you yourself scream towards the ocean. You realize all too late that stepping off of cliffs is usually not a very good decision. You close your eyes and pray to God as you fall to what you are sure will be your demise. Just as you are about to impact, there is silence.\n\n");
                Scanner scan = new Scanner(System.in);
                String end = scan.nextLine();
                System.out.println("You open your eyes and sit up off the ground, once again unsure of what just happened. You look around and for the first time find yourself in a familiar place: your bedroom. From what you can tell, it appears you fell off your bed sometime in the night while having a nightmare. You let out a haggard breath and sit back down onto your bed. You can't believe you had such a bad dream; it all had seemed so real at the time. As you lie down to go back to sleep, you feel something in your pocket. You reach your hand in and pull out a small box. You turn on the light beside your bed to get a better look at it. Your heart pounds as you realize that you are holding the matchbox. Suddenly, the light beside your bed flickers off and you are left in total darkness.\n\nYou have one match left.\n");
                room = 3;
            }
            if (input.equals("walk") && walk == 3) {
                System.out.println("\nYou step into the light, blinded at first by its intensity. Soon, your eyes adjust.\n");
                hasLooked = false;
                walk++;
            }
            if (input.equals("walk") && walk == 2) {
                walk++;
                System.out.println("\nYou see a faint white light ahead of you. It appears you have finally reached the end of the hall! As you begin to run towards the light, you put the matchbox into your pocket, no longer relying on it to see.\n");
                matchCount();
            }
            if (input.equals("walk") && walk == 1) {
                walk++;
                System.out.println("\nYou continue slowly down the hall, the noise ahead crescendoing to a deafening roar. A strong gust of wind travels down the hallway, nearly knocking you off balance.\n");
                matchCount();
            }
            if (input.equals("walk") && walk == 0) {
                walk++;
                if (matches == 4) {
                    System.out.println("\nYou take your first step into the hall. You are startled by a strange noise coming from deep within the darkness.\n");
                    matchCount();
                }
                if (matches < 4) {
                    System.out.println("\nYou take your first step into the hall. You are startled by a strange noise coming from deep within the darkness. You stumble and fall. As you are getting up, you notice some mataches strewn across the ground.\n");
                    matches = 4;
                    matchCount();
                }
                if (matches > 4) {
                    System.out.println("\nYou take your first step into the hall. You are startled by a strange noise coming from deep within the darkness. You stumble and drop some matches.\n");
                    matches = 4;
                    matchCount();
                }
            }
            if (matches < 0) {
                System.out.println("\nYou have succumbed to the darkness.\n");
                return "Fail";
            }
            seekInput();

            return "Fail";
        }
        return "Fail";
    }
    public static void matchCount() {
        matches--;
        if (matches >= 0)
            System.out.printf("You have %d matches left.\n\n", matches);
    }
}

*/
