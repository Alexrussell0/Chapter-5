import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("What type of triangle are you solving for?");
        System.out.println("1. Right Triangle");
        System.out.println("2. Isosceles");
        System.out.println("3. Equalater");

        choice = input.nextInt();

        if (choice == 1)
            rightTriangle();
        else if (choice == 2)
            isoscelesTriangle();
        else if (choice == 3)
            equalateralTriangle();


    }

    public static void isoscelesTriangle() {
        //triangle with two equal sides always try to find the base and area




    }

    public static void equalateralTriangle() {
        //all sides are equal find the parameter and height
    }

    public static void rightTriangle() {
        Scanner input = new Scanner(System.in);
        double sideA = 0;
        double sideB;
        double sideC;
        String sideChoice;

        System.out.println("What side of the triangle are you trying to solve for? A, B, or C");
        sideChoice = input.next();

        if (sideChoice.equals("A")) {
            System.out.println("What is side B? >>>");
            sideB = input.nextDouble();
            System.out.println("What is side C >>> ");
            sideC = input.nextDouble();
            calculateSideA(sideB,sideC,sideChoice);
        } else if (sideChoice.equals("B")) {
            System.out.println("What is side A? >>>");
            sideB = input.nextDouble();
            System.out.println("What is side C >>> ");
            sideC = input.nextDouble();
            calculateSideB(sideA,sideC,sideChoice);
        } else if (sideChoice.equals("C")) {
            System.out.println("What is side A? >>>");
            sideB = input.nextDouble();
            System.out.println("What is side B >>> ");
            sideC = input.nextDouble();
            calculateSideC(sideA,sideB,sideChoice);
        }else
            triangleDoesNotExist();
    }

    public static void calculateSideA(double b, double c, String choice) {
        double a;

        a = Math.sqrt(c * c - b * b);
        System.out.println("The side " + choice + " = " + a);
    }

    public static void calculateSideB(double a, double c, String choice) {
        double b;

        b = Math.sqrt(a * a - c * c);
        System.out.println("The side " + choice + " = " + a);
    }

    public static void calculateSideC(double a, double b, String choice) {
        double c;

        a = Math.sqrt(a * a + b * b);
        System.out.println("The side " + choice + " = " + a);
    }


        public static void triangleDoesNotExist(){
        System.out.println("This triangle is not possible");
    }

}

