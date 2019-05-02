import java.util.Scanner;

public class AgelnsultGnerator {
    public static void main(String[] args) {
        int age;
        String job;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to my age insult generator.");
        System.out.print("Please enter your age >>>>");
        age = input.nextInt();

        String result = null;
        if (age <= 12) {
            result = "youare not a teenager, and probably needs to learn how to use deodorant.";
        } else if (age > 12 && age < 20) {
            result = "you might be a teenager";
        } else if (age >= 21 && age < 30) {
            result = "I hope you went to college and got a job!";
            System.out.print("Did you her a job >>");
            job = input.next();
            if (job == "yes") {
                result = "yes. I have a job";
            } else
                result = "No, I am a dead beat";
        } else if (age >= 31 && age < 40) {
            result = "I hope you aren't still with yoru parents";
            System.out.print("Do you have kids >>");
            job = input.next();
            if (job == "yes") {
                result = "yes. I have kids";
            } else
                result = "No, I hae kids";
        }
    }

    {
        String result = null;
        displayMessage(result);
        }
        public static void displayMessage(String result){
            System.out.println(result);
        }
    }

