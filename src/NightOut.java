/**
 * Created by charlynbuchanan on 3/13/15.
 */

import java.util.Scanner;

public class NightOut {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String answer;
        String name;
        int account = 100;
        int cash = 0;
        int balance = account - cash;
        int pizza = 3;
        int taco = 5;
        int sandwich = 7;
        int overdraft = 35;
        int beer = 7;
        int martini = 15;
        int wine = 10;


        System.out.println("Hey there. What's your name?");
        name = input.next();
        System.out.println(name + ", after a long day, you've finally made it home, but you forgot it's your sort-of friend's \n " +
                "birthday. You fell asleep twice on the way home, you're exhausted and you'd never make it on time anyway. \n" +
                "Looks like it's raining. Do you stay or go?");
        answer = input.next();
        if (answer.equalsIgnoreCase("stay")) {
            System.out.println("Good call. Who wants to lug around an umbrella all night, anyway? You call your friend to \n" +
                    "let them know you won't make it. Right before you let them down easy, they tell you that everyone is flaking\n" +
                    " out one by one. Your sort-of-friend is devastated. Looks like you're going out after all. " +
                    "\n" +
                    "\n" +

                    "▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
                    "▓▓▓▓████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
                    "▓▓▓▓█████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
                    "▓▓▓▓█▓████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
                    "▓▓▓▓█▓█████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
                    "▓▓▓▓█▓▓█████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████▓\n" +
                    "▓▓▓▓█▓██████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓███████▓\n" +
                    "▓▓▓▓█▓████▓▒░░░░─░░░░▒▒▓▓▓▓▓▓▓███████▓█▓\n" +
                    "▓▓▓▓████▒░──░░░░░░░░░───░▒▓▓████████▓▓█▓\n" +
                    "▓▓▓▓██▒───░░░░░░░░░░░░░░░░─░▓███████▓█▓▓\n" +
                    "▓▓▓▓▓░────░─░▒░░░░░─░░░░░░░──░█████▓██▓▓\n" +
                    "▓▓▓▓░▓█▓▒░░▓▓█▒░░─░▓▒──░░░░░░──██████▓▓▓\n" +
                    "▓▓▒▓██████▓▓██▓─░░██░▓▒░──░░░░──▓████▓▓▓\n" +
                    "▓▓▒▓█▒▓███████▒─░▓█▓██▓▒░░░░──░──███▓▓▓▓\n" +
                    "▓▓░▓█▒▒███████──▒███████████▓░─░─░██▓▓▓▓\n" +
                    "▓▓░▓█▓▒▓██▓▒█▒──▓█▓▓▓█████████▒─░─▓█▓▓▓▓\n" +
                    "▓▓▒░██▓▒▒▒▒▓█░──▒█▓░▒▓████▓▓▓██▓──▒▓▓▓▓▓\n" +
                    "▓▓▒░████▓███▒───▓██▒▒▓███▓▒▒░▓██──░▓▓▓▓▓\n" +
                    "▓▓▓░▓█████▓▒▒▓░─███▓▒▒▓▓▓▓▓▒▓███░─▒▓▓▓▓▓\n" +
                    "▓▓▓░░██▓────▓▓░─▓███▓▒▒▒▒▒▒▓███░─░▒▓▓▓▓▓\n" +
                    "▓▓▓▓─▒▒─▓▓▓▓▓▓───▓████▓▓▓▓████▒─░─▒▓▓▓▓▓\n" +
                    "▓▓▓▓░░─▓▓────▓▓───██▓████████▓─░░░▒▓▓▓▓▓\n" +
                    "▓▓█▒░░─▓──────▓▓──▒████████▓▒─░░░░▓▓▓▓▓▓\n" +
                    "▓▓█░─▒───░░──░─▓▓──▓▓███▓▓▒──░░░░▒█▓▓▓▓▓\n" +
                    "▓█▓─░░░─░░▒░────▓──░──░────░░░░░▒▒█▓▓▓▓▓\n" +
                    "▓█▒─░░░░░░░▒░░──░──▒░░░░░░░░░░░░░▒█▓▓▓▓▓\n" +
                    "▓▓░░░░░░░░░░░░░░──░▒░░░░░░░░░░░░─▒█▓▓▓▓▓\n" +
                    "▓▓─░░░░░░░░░░░░░░░▒░░░░░░░░░░░░░─▓█▓▓▓▓▓\n" +
                    "        Everything is terrible.\n");
            System.out.println("Gotta get going! How will you get there: train or cab?");
            answer = input.next();
            if (answer.equals("train")) {
                System.out.println(" You catch a train (finally!) and your mind wanders to what song you'll pick for karaoke.\n" +
                        "You then remember you don't have any cash for the cash-only bar. You stop by an ATM before you get to\n" +
                        "the bar. You have a balance of $100. How much do you take out?(enter a number)");
                cash = input.nextInt();
                if (cash <= 100) {
                    System.out.println("OK, you've got $" + cash + " cash to spend tonight and $" + (balance - cash) + " in your account.\n" +
                            "You were in such a rush, you forgot to eat before you left the your and now your hungry. Your options are:\n" +
                            "pizza $3, taco $5 and sandwich $7. Remember, you have $" + cash + " cash and $" + (balance -= cash) + " in your account");
                    answer = input.next();
                    if (answer.equalsIgnoreCase("pizza")) {
                        if (cash < pizza) {
                            System.out.println("you didn't take out enough");
                        }
                        if (cash >= pizza) {
                            System.out.println("It hits the spot. It was a cash-only spot, so you've got $" + (cash - pizza) + " cash left. You\n" +
                                    "can wash it down with free water at the bar (times are hard!) You finally get to the bar. You don't see your freind\n" +
                                    "so you head to the bar. What will you drink? Beer $7, Martini $15, Wine $10");
                        }
                        answer = input.next();
                        if (answer.equalsIgnoreCase("beer")) {
                            if (cash < beer) {
                                System.out.println("you don't have enough. game over.");
                            }
                            if (cash > beer * 2) {
                                System.out.println("You decide to get one for your friend, too. The total is $" + (beer * 2) + ". You've got $" + (cash -= beer * 2) + " left. You\n" +
                                        "spot your friend and give them their beer. One drink turns into several. You've blown all ou cash! Time to go home. \n" +
                                        "\"Happy birthday. Bye!\" The end.");
                            }
                        }

                        if (answer.equalsIgnoreCase("sandwich")) {
                            System.out.println("Sandwich shop takes cash and debit. How do you pay?");
                            answer = input.next();
                            if (answer.equalsIgnoreCase("cash")) {
                                if ((cash < sandwich)) {
                                    System.out.println("You don't have enough :-(");
                                }
                                if ((cash > sandwich)) {
                                    System.out.println("You've got $" + (cash - sandwich) + " cash left, account balance still $" + (balance) + " in\n" +
                                            "your account.");
                                }
                                if (answer.equals("debit")) {
                                    System.out.println("You've still got all your $" + cash + " cash, and $" + (balance - sandwich) + " in your account. Party on! You get to the\n" +
                                            "bar and find your friend. You promise to get them the drink of their choice. The options are Beer $7, Martini $15, Wine $10.\n" +
                                            "They want a martini. Two martinis, coming up?");
                                    if (((martini * 2) > (cash)) && (cash > martini)) {
                                        System.out.println("Crap! You can't afford both. You only have $" + (cash) + " left. Get your friend their drink and get the hell out asap. Game over.");
                                    }
                                    if (((martini * 2) > cash) && (cash < martini)) {
                                        System.out.println("You can't afford any of this. Abort!!!");
                                    }
                                    if ((martini * 2) < cash) {
                                        System.out.println("Cheers! Party on(with caution)! You've got $" + (cash - (martini * 2)) + " cash, and $" + (balance) + " in your account.");
                                    }

                                    if ((balance - sandwich) < 0) {
                                        System.out.println("Oh no! You didn't have enough in your account and got an overdraft fee. Your balance is now $" + (balance -= sandwich + overdraft) + ".\n" +
                                                "This was a terrible idea. You can't afford to blow any more cash tonight. Go home. The end.");
                                    }
                                }
                            }

                        }
                        if (cash > 100) {
                            System.out.println("You're too broke for that. C'mon. Take out less");
                            cash = input.nextInt();
                            if (cash <= 100) {
                                System.out.println("OK, you've got $" + cash + " to spend tonight and $" + (balance -= cash) + " in your account");
                            }
                            if (cash > 100) {
                                System.out.println("Fine. You've got your $" + cash + " but you've also got an overdraft fee of $35.00.  Your account is now $" + (balance -= cash + overdraft) + ".\n" +
                                        "This is an omen. Just go home.");
                                return;
                            }
                        }
                    } if (answer.equalsIgnoreCase("taco")) {
                        System.out.println("Taco stand only takes cash, so you've got $" + (cash - taco) + " cash left. Off to the bar!\n" +
                                "\n\n\nಠ_ಠ\n\n\n The taco has rebelled against you. You aren't going to make it to the bar. Game over. Hurry home!! ");
                    }




                }
            }if (answer.equals("cab")) {
                System.out.println("On a Friday night in the rain? lol. Try again. Game over.");
            }
        }if (answer.equals("go")) {
            System.out.println("Get dressed, loser. You're going out. The weather is horrible. How about a little liquid courage before you leave?\n" +
                    "Pregame or nah?");
            answer = input.next();
            if (answer.equalsIgnoreCase("Pregame")) {
                System.out.println("You're in a slightly better mood. Let's do this. Cab or train?");
                answer = input.next();
                if (answer.equals("cab")) {
                    System.out.println("Luck is on your side. You caught a cab in this weather in less than 10 mins. You tell the driver\n" +
                            "your destination. You spot a bag on the seat left by a previous rider. You tell the driver, but he isn't concerned.\n" +
                            "You look in the bag and find: a fancy pen, a pair of new socks, a flask, and a banana.\n" +
                            " ٩(͡๏̯͡ ๏)۶ Finders, keepers. You open the flask. You're 98% sure it's whiskey. Do you drink it?");
                    answer = input.next();
                    if (answer.equalsIgnoreCase("yes") || (answer.equalsIgnoreCase("y"))) {
                        System.out.println("Everything's coming up " + name + "!! Nothing could possibly go wrong. Plus, random freebies! \n" +
                                "The driver stops the cab and tells you to get out. The area is unfamiliar and you were too busy getting whiskied away\n" +
                                "to pay attention to the route. This isn't right\n" +
                                "\"This isn't the place, sir,\" you tell the driver. \n" +
                                "\"Pay me and get out or I'll have you removed.\" What does that even mean? The driver glares at you in the rear view mirror.\n" +
                                "This took a weird turn. You get out, without paying, confused. There is someone sitting on the curb and you ask them where you are.\n" +
                                "\"Why should I help you? How do I know you're not in on it?\" they ask.\n" +
                                "\"In on what?\" you ask.\n" +
                                "\"A weird cab dropped me off. Idunno where I am.\" they say.\n" +
                                "\"OMG me too! Let's stick together and get outta here. I'm " + name + ", by the way.\n" +
                                "\"I'm Jamie. I was on my way to Tootsie's but somehow ended up here. \"\n" +
                                "\"I was on my way to the Lower East Side and ended up here. This doesn't even look like NYC! \"\n" +
                                "I got in the cab in Nashville, but from the looks of that tower, we're in Chicago.\n" +
                                "It is becoming clear that the \"whiskey\" you drank probably wasn't whiskey. Note to self, don't drink unmarked booze.\n" +
                                "You two head toward to Willis tower when suddenly, you are confronted by a hobo. You're getting mugged! What do you do?\n" +
                                "a) stab him with your fancy pen\n" +
                                "b) offer him your banana\n");
                        answer = input.next();
                        if (answer.equals("a")) {
                            System.out.println("He deflates and out of his clothes hops a frog. That speaks!! \n" +
                                    "\n　　　（●）-－-（●）\n" +
                                    "　　　/　　 ,＿__,　\"ﾍ\n" +
                                    "　　　|　 　 ヽ _ﾝ　　ﾉ\n" +
                                    "　　　＞,､ _____, , イ\n" +
                                    "\"Thank you! I've gotta get back to the magic manhole before I revert back! It will send me back home!\"\n" +
                                    "You and Jamie follow the frog to the magic manhole. You slip your new socks over your hands and help Jamie lift\n" +
                                    "the cover. Frog hops in, followed by Jamie. You cautiously climb down, looking for them, but they are long gone.\n" +
                                    "You continue to climb down the ladder into darkness, but you slip and fall off.\n" +
                                    "You wake up in your bed, dressed up. In a daze, you check your phone. It's 4:30am and you have 7 missed calls from\n" +
                                    "your friend. You never even made it out of your room. The Benadryl and pregame knocked you ot. \n" +
                                    "Moral of the story: Don't drink and take meds. The end.");
                        }
                        if (answer.equals("b")) {
                            System.out.println("\"Thank you. I'm not myself when I'm hungry. Sorry about that. I wasn't mugging you. I'm just easily excited.\n" +
                                    "Here, you dropped your fancy pen. I had a pen like that. I have an MFA in English, and I've collected many a fine pen\n" +
                                    "in my day. Anyways, what brings you to Chicago?\" Just then, you get a text from your sort-of-freind. \n\n" +
                                    "(´°̥̥̥̥̥̥̥̥ω°̥̥̥̥̥̥̥̥｀)\n\n \"I got in a cab in ny and ended up here. I need to get back!\" The man then told them \" If you solve\n" +
                                    "my riddle, I'll get you back home. Ok?");
                            answer = input.next();
                            System.out.println("\" Poor people have it. Rich people need it. If you eat it you die. What is it?\" he asked");
                            answer = input.next();
                            if (answer.equalsIgnoreCase("nothing")) {
                                System.out.println("Correct! Poof! Your home.");
                            }
                            if (!answer.equalsIgnoreCase("Nothing")) {
                                System.out.println("Nope. Try again. Can't get home until you get it right");
                            }
                        }

                    } if (answer.equalsIgnoreCase("no") || (answer.equalsIgnoreCase("n"))) {
                        System.out.println("Where's you adventurous spirit? boo!");
                    }


                }
                if (answer.equals("train")) {
                    System.out.println("You catch a train and your mind wanders to what song your going to pick for karaoke.\n" +
                            "Just then, someone calls your name on the train. You look up to see who it is. It's your ex. Great.\n" +
                            "Hey," + name + "! Long time. How've you been? I reached out to you a while back. I just got back from n\"" +
                            "blah, blah, blah....\n" +
                            "\"Oh look!\" You interject. \"This is my stop! Bye!!!\" You hop off the train, but it wasn't your stop.\n" +
                            "While you're waiting for the train, you spot a white bunny on the platform. It hops toward the exit and you follow it\n" +
                            "upstairs. \n" +
                            "                     _        _\n" +
                            "                    / \\     / \\\n" +
                            "                   {   }   {   }\n" +
                            "                   {   {   }   }\n" +
                            "                    \\   \\ /   /\n" +
                            "                     \\   Y   /\n" +
                            "                     .-\"`\"`\"-.\n" +
                            "                   ,`         `.\n" +
                            "                  /             \\\n" +
                            "                 /               \\\n" +
                            "                {     ;\"\";,       }\n" +
                            "                {  /\";`'`,;       }\n" +
                            "                 \\{  ;`,'`;.     /\n" +
                            "                  {  }`\"\"`  }   /}\n" +
                            "                  {  }      {  //  \n" +
                            "                  {||}      {  /\n" +
                            "                  `\"'       `\"'\n\n" +
                            "\nYou get above ground and there's no bunny to be seen. Anywhere. Your standing in the rain looking for a non-\n" +
                            "existent bunny. Go home.");
                }

            }  if (answer.equals("nah")) {
                System.out.println("You're lame. Game over.");
            }

        }
    }
}
