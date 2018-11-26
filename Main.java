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
    public static boolean win = false;
    public static int count = 30;
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

        while (outside == false) {
            out();
        }


        System.out.println("As soon as everyone walks in, the door slams closed. In the corner of the room, the scarce moonlight" +
                " illuminates a grandfather clock. It is at the 6 o’clock position. You hear a sharp tick as the minutes hand moves:" +
                " 30 minutes until who knows what.");
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
                "It looks like the monster in this real case was Doug Winnie! He has been meddling with the town of APCS1st Per. with his monstrous 1 point quiz. I guess we can call this mystery closed.\n" +
                "\n" +
                "CONGRATULATIONS! YOU BEAT THE ESCAPE ROOM.");

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

