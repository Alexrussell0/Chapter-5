import java.util.Scanner;

public class GradeLevel {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String year;
        System.out.println("Please enter what year you are in high school");
        year = input.next();

        String result;
        switch (year){
            case "Freshman":
                result = "you are a frist year student.";
                break;
            case "Sophomore":
                result = "You are a second year student";
                break;
            case "Junior":
                result = "You are a thrid year student";
                break;
            case "senior":
                result = "This is your last year as a student";
                break;
            default:
                result = "Invalid student";
        }
        System.out.println(result);
        aDifferentCaseBreak();
    }
    public static void aDifferentCaseBreak(){
        String result;
        Scanner input = new Scanner(System.in);
        System.out.println("please enter what yea you are in high school");
        int num = input.nextInt();

        switch (num)
        {
            case 1:
                result = "that is the number " + num;
                break;
            case 2:
                result = "That is the number"+ num;
                break;
            default:
                result = "That is not a number available";
        }
        System.out.println(result);
    }
}
