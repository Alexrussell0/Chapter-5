import java.util.Scanner;

public class RockPaperSicciors {

        public static void main(String[] args){
            int userChoice;

            Scanner input = new Scanner(System.in);
            d("Welcome to Rock Paper Scissors Please enter a ");
            d("1) Rock");
            d("2) Paper");
            d("3) Scissors");
            userChoice = input.nextInt();
            int random = (int)(Math.random() * 50 + 1);

            if(userChoice == 1){
                if(random == 1){
                    d("Tie");}
                else if(random == 2){
                d("You Lose");
                }
                else if(random == 3){
                    d("You win!!!!");
                }
            }
            else if(userChoice==2){
                if(random == 1){
                    d("You win!!"); }
                else if(random == 2){
                    d("Tie"); }
                else if(random == 3){
                    d("You Lose");
                }
            }
            else if(userChoice == 3){
                if(random == 1){
                    d("You Lose");
                }
                else if(random == 2){
                    d("You win");
                }
                else if(random == 3){
                    d("Tie");
                }
            }

        }
        public static void d(String displayMessage){
            System.out.println(displayMessage);
        }
}ctv
