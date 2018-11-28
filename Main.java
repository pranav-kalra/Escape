import java.util.Scanner;

public class Main {
    public static boolean foyerSet = false;
    public static boolean matches = false;
    public static boolean candle = false;
    public static boolean bench = false;
    public static boolean note = false;
    public static boolean openChest = false;
    public static boolean door1 = false;
    public static boolean door1Opened = false;

    public static boolean librarySet = false;
    public static boolean bookWritten = false;
    public static boolean pen = false;
    public static boolean book = false;
    public static boolean door2 = false;
    public static boolean door2Opened = false;

    public static boolean conservatorySet = false;
    public static boolean trumpet = false;
    public static boolean piano = false;
    public static boolean drum = false;
    public static boolean door3 = false;

    public static int count = 30;
    public static Scanner scan;
    public static String test;
    public static String name = "";

    public static void main(String[] args) {

        System.out.println("ESCAPE ROOM\n");
        System.out.println("In this level, you can use these verbs: \n" +
                "open, light, read, look, get");
        System.out.println("In this level, you can use these nouns: \n" +
                "door, bench, chest, candle, note, matches");
        System.out.println("Also, you can always type \"go\" + a direction (North/South/East/West)");
        System.out.println();

        System.out.println("You find yourself in a large foyer. There is a door to the north. To the west is a bench against the wall.\n" +
                "To the east is a chest on the floor. In the center of the room is a large candle. The candle is unlit");

        while(foyerSet == false) {
            foyer();
            counter();
        }

        System.out.println("\nIn this level, you can use these verbs: \n" +
                "open, read, write, look, get");
        System.out.println("In this level, you can use these nouns: \n" +
                "door, room, shelves, book, pen, scroll");
        System.out.println();

        System.out.println("In the library there are stacks of books lining the shelves, and there is a desk, a pen, and a scroll.\n" +
                "There is another locked door to the north.");

        while (librarySet == false) {
            library();
            counter();
        }

        System.out.println("\nIn this level, you can use these verbs: \n" +
                "open, read, play");
        System.out.println("In this level, you can use these nouns: \n" +
                "music, trumpet, piano, drum");
        System.out.println();

        System.out.println("In the conservatory, there is a large door to the north that is locked. There are three instruments here,\n" +
                "a trumpet, a drum, and a piano. There is a piece of sheet music on a stand in the center of the room.");
        while (conservatorySet == false) {
            conservatory();
            counter();
        }

        System.out.println("CONGRATULATIONS! YOU ESCAPED");


    }


    public static void foyer() {
        scan = new Scanner(System.in);
        System.out.print("\n>> ");
        test = scan.nextLine();
        System.out.println();
        switch (test) {
            case "go west":
            case "look bench":
                System.out.println("There is a bench on the western wall. There is a small note here.");
                bench = true;
                break;

            case "read note":
                if (bench == false) {
                    System.out.println("What note?");
                }
                else {
                    System.out.println("The note is written on a piece of embossed vellum paper. In script writing you make out \n" +
                            "the phrase \"May my light show you the way.\"");
                    note = true;
                }
                break;

            case "go east":
            case "look chest":
                System.out.println("You see a chest. It is closed. It doesn't appear to be locked.");
                break;

            case "open chest":
                System.out.println("You open the chest. There is a box of matches inside.");
                openChest = true;
                break;

            case "get matches":
                if (openChest == false) {
                    System.out.println("What matches?");
                }
                if (openChest == true) {
                    System.out.println("You take the box of matches out of the chest.");
                    matches = true;
                }
                break;

            case "look door":
            case "go door":
                if (candle == false) {
                    System.out.println("The door is locked");
                }
                if (candle == true) {
                    System.out.println("The door to the north is closed, but unlocked.");
                    door1 = true;
                }
                break;

            case "look candle":
                System.out.println("It isn't lit right now.");
                break;

            case "light candle":
                if (matches == false) {
                    System.out.println("The candle in the center of the room is not lit.");
                }
                if (matches == true) {
                    System.out.println("You light the candle, and fierce wind blows through the room, extinguishing the match in your \n" +
                            "hand, but making the candle burn brighter. You hear a loud metal grinding sound from the north.");
                    candle = true;
                }
                break;

            case "open door":
                if (candle == false) {
                    System.out.println("The door is locked");
                }
                if (candle == true) {
                    System.out.println("The north door is open.");
                    door1Opened = true;
                }
                break;

            case "go north":
                if (door1Opened == false && door1 == true) {
                    System.out.println("The door is closed.");
                }
                if (door1Opened == true) {
                    System.out.println("You leave the foyer, the door behind you closes with a loud slam, and you hear the locking \n" +
                            "mechanism relock the door. You cannot return to the foyer.");
                    foyerSet = true;
                }
                if (door1 == false) {
                    System.out.println("The door is locked.");
                }
                break;

            default:
                System.out.println("You find yourself in a large foyer. There is a door to the north. To the west is a bench against the wall.\n" +
                        "To the east is a chest on the floor. In the center of the room is a large candle.");
                break;

            case "bypass":
                foyerSet = true;
                break;
        }

    }




    public static void library() {
        scan = new Scanner(System.in);
        System.out.print("\n>> ");
        test = scan.nextLine();
        System.out.println();
        switch (test) {
            case "look scroll":
                System.out.println("The scroll says, \"Share your story.\"");
                break;

            case "look shelves":
                System.out.println("When you search te bookshelf, there is an open book on one shelf titled \n" +
                        "\"The Autobiography of...\" with the rest of the title empty.");
                break;

            case "read book":
                if (bookWritten == false) {
                    System.out.println("\"The Autobiography of...\"");
                }
                if (bookWritten == true) {
                    System.out.println("\"The Autobiography of " + name + "\"");
                }
                break;

            case "get pen":
                System.out.println("You pick up the pen");
                pen = true;
                break;

            case "get book":
                System.out.println("You pick up the book");
                book = true;
                break;

            case "write name":
            case "write book":
                if (bookWritten == true) {
                    System.out.println("You have already written in the book.");
                }
                if (!bookWritten && pen && book) {
                    System.out.print("Write your name:");
                    name = scan.nextLine();
                    bookWritten = true;
                    door2 = true;
                    System.out.println("You hear something move.");
                }
                if (!pen || !book) {
                    System.out.println("With what?");
                }
                break;

            case "look door":
            case "open door":
                if (door2 == false) {
                    System.out.println("The door is closed and locked.");
                }
                if (door2 == true) {
                    System.out.println("The door opens.");
                    door2Opened = true;
                }
                break;

            case "go north":
                if (door2 == false) {
                    System.out.println("The door is closed and locked.");
                }

                if (door2Opened == false && door2 == true) {
                    System.out.println("The door is closed and unlocked.");
                }
                if (door2Opened == true) {
                    System.out.println("You leave the library behind you and the door shuts and locks.");
                    librarySet = true;
                }
                break;

              default:
                  System.out.println("In the library there are stacks of books lining the shelves, and there is a desk, a pen, and a scroll.\n" +
                          "There is also a door to the north.");
                  break;

            case "bypass":
                librarySet = true;
                break;
            }
        }

        public static void conservatory() {
            scan = new Scanner(System.in);
            System.out.print("\n>> ");
            test = scan.nextLine();
            System.out.println();
            switch (test) {
                case "read music":
                    System.out.println("The sheet music is empty, but has this phrase written on the musical staff:\n" +
                            "\"Timbre, Tone, and Time\" representing the Trumpet, Piano, and Drum.");
                    break;

                case "play trumpet":
                    System.out.println("*Trumpet Noises*");
                    trumpet = true;
                    piano = false;
                    drum = false;
                    break;

                case "play piano":
                    System.out.println("♪♪♪♪♫♫♫♫ ♫♪♫♪♫ ♫♫♪♪♪ ♪ ♫");
                    piano = true;
                    drum = false;
                    break;

                case "play drum":
                    System.out.println("The ting goes skrrrahh, pap, pap, ka-ka-ka Skidiki-pap-pap, and a pu-pu-pudrrrr-boom");
                    drum = true;
                    break;

                case "look door":
                case "open door":
                    if (door3) {
                        System.out.println("You open the door and you take a big step out.");
                        conservatorySet = true;
                    }
                    if (!door3) {
                        System.out.println("It's locked.");
                    }
                    break;

                default:
                    System.out.println("In the conservatory, there is a large door to the north that is locked. There are three instruments here," +
                            "\"a trumpet, a drum, and a piano. There is a piece of sheet music on a stand in the center of the room.\n" +
                            "Maybe play those in order.");
                    break;

                case "bypass":
                    conservatorySet = true;

            }
            if (trumpet && piano && drum) {
                System.out.println("Something happe--");
                door3 = true;
                trumpet = false;
                piano = false;
                drum = false;
            }
        }



    public static void counter() {
        count --;
        System.out.println("You have " + count + " turns left.");
        if (count == 0) {
            System.out.println("You failed.");
            System.exit(0);
        }
    }

//SHORTEST ANSWERS
//open chest, get matches, light candle, open door, go north
//look shelves, get pen, get book, write book, open door, go north
//play trumpet, play piano, play drum, open door




}




//well I messed up
//When you said "get creative", I took it too literally. I created the same game, but based on Scooby-Doo.

/*

import java.util.Scanner;

public class Main {

    public static boolean outside = false;
    public static boolean inside = false;
    public static boolean desk = false;
    public static boolean photo = false;
    public static boolean room = false;
    public static boolean ready = false;
    public static boolean trapped1 = false;
    public static boolean trapped2 = false;
    public static int count = 40;
    public static String test;
    public static Scanner scan;

    public static void main(String[] args) {
        // write your code here
        //ruh roh raggy; randomize the error messages for wasting turns
        //every 5 turns say "tick tock"

        System.out.println("The Scoobert Doobert Escape Room");
        //put in controls
        System.out.println("Uh oh! It looks like we have a mystery in our hands." +
                "You(Shaggy), Fred, Daphne, Velma, and Scooby Doo are investigating a mystery in " +
                "the middle of the woods. There seems to be a ghost around town haunting people.");
        System.out.println("You and the gang are somehow in the middle of the woods in front of a large castle.");
        System.out.println("Where do you want to 'go' and what direction(NSEW)?");

        while (outside == false) {
            out();
        }


        System.out.println("As soon as everyone walks in, the door slams closed. In the corner of the room, the scarce moonlight" +
                " illuminates a grandfather clock. It is at the 6 o’clock position. You hear a sharp tick as the minutes hand moves:" +
                " 30 minutes until who knows what.");
        System.out.println("Now where do you want to go?");
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
                " exist in the fridge. You have a choice on what to eat: a scrumptious-looking turkey, a thick saucy pizza, or a juicy hamburger.");

        eat();
        counter();

        System.out.println("“What was that Scoob?”");
        System.out.println("“Ruh Roh Raggy”");
        System.out.println("*GULP* “Ya me too buddy. Like Fred? Daphne? Velma? You guys there?”");
        System.out.println("A large monster jumps out. You remember that it looks exactly like the one from the photo.\n" +
                " You and Scooby abandon all of that food and run back to the foyer. Somehow, the entire gang manages to \n" +
                "crash into each other.");
        System.out.println("“Shaggy, Scooby?” Velma asks.\n" +
                "“Fred, Daphne?” Shaggy asks.\n" +
                "“We just saw a monster” Fred says.\n" +
                "“Us too”.\n" +
                "“Let’s set a trap for it.”\n");
        System.out.println("They make you the bait, because, why not. You are going to have to run and jump the tripwire in 5 seconds. \n" +
                "After, you are going to flip the switch for the trap to let the rope catch the bad guy. Tell us “ready” when you are ready.");

        boolean beginTrap = false;

        while (ready == false) {
            readdier();
            counter();
            if (ready == true) {
                beginTrap = true;
            }
        }

        //if you're wondering why this stuff is unnecessary, I had bigger plans to have a timer on the input but that
        //wasn't working so its just easier to do this
        if (beginTrap == true) {
            while (trapped1 == false) {
                trap1();
                counter();
            }
        }

        while (trapped2 == false) {
            trap2();
            counter();
        }

        System.out.println("Good Going Gang");
        System.out.println("“Time to see who this bad guy really is.” Daphne yanks the mask off of its face.\n" +
                "“RUH ROH”\n" +
                "“JINKIES”\n" +
                "“ZOINKS”\n" +
                "“JEEPERS”\n" +
                "“F-“This is a PG SHOW!\n" +
                "It looks like the monster in this real case was Doug Winnie! He has been meddling with the town of APCSper1 with his monstrous 1 point quiz. I guess we can call this mystery closed.\n" +
                "\n" +
                "CONGRATULATIONS! YOU BEAT THE ESCAPE ROOM.");

        System.exit(0);

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
                System.out.println("Fred says it is a good idea to go inside. You, with common sense, incessantly object, but Velma tosses a couple Scooby snacks inside and well ya gotta do what ya gotta do.");
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

    public static void readdier() {
        scan = new Scanner(System.in);
        test = scan.nextLine();
        switch (test) {
            case "ready":
                ready = true;
                break;

            default:
                System.out.println("Just tell me when you are ready");
                 break;
        }
    }

    public static void timer() {
        scan = new Scanner(System.in);
        int i, j;
        boolean bean = false;
        for(i = 1; i < 7; i++) {
            int delay = (i * 1000);
            long start = System.currentTimeMillis();
            while(start >= System.currentTimeMillis() - delay);

            System.out.println(6-i);
            j = scan.nextInt();
            if (j == 3) {
                System.out.println("yes");
                break;
            }
            if (i == 6) {
                bean = true;
            }
        }
        if (bean == true) {
            timer();
        }
    }

    public static void trap1() {
        if (trapped1 == false) {

        for (int i = 1; i < 6; i++) {
            System.out.println(6-i);
            int delay = 2000;
            double start = System.currentTimeMillis();
            while(start >= System.currentTimeMillis() - delay);
            scan = new Scanner(System.in);
            test = scan.nextLine();
            switch (test) {
                case "jump tripwire":
                    trapped1 = true;
                    System.out.println("Now execute the second part");
                    break;

                case "flip switch":
                    System.out.println("Not yet, genius! That just cost us some time");
                    int j = (int)(10 * Math.random());
                    while (i > 6) {
                        j = (int)(10 * Math.random());
                    }
                    count = count - j;
                    break;

                default:
                    System.out.println("Jump the tripwire man");
                    j = (int)(10 * Math.random());
                    while (i > 3) {
                        j = (int)(10 * Math.random());
                    }
                    count = count - j;
                    break;
            }
            if (trapped1 == true) {
                break;
            }
            count--;
            if (i == 5) {
                System.out.println("It's ok. Just run another loop. But remember, time is running out.");
            }
        }
    }
    else {
        trap1();
        } }


    public static void trap2() {
        scan = new Scanner(System.in);
        test = scan.nextLine();
        switch (test) {
            case "flip switch":
                trapped2 = true;
                break;

            default:
                System.out.println("Good job. You missed");
                count = count - 3;
                break;
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
        System.out.println("You have " + count + " turns left");
        if (count == 0) {
            System.out.println("You failed!");
            System.exit(0);
        }
    }

}

*/

