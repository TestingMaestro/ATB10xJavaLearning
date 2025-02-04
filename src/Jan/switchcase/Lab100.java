package Jan.switchcase;

import java.util.Scanner;

public class Lab100 {
    static Scanner sc = new Scanner(System.in);

    static void assign(String op, double a, double b) {
        switch (op) {

            case "1":
                double sum = a + b;
                System.out.println("Addition: " + sum);
                break;
            case "2":
                double sub = a - b;
                System.out.println("Subtraction: " + sub);
                break;
            case "3":
                double mul = a * b;
                System.out.println("Multiplication: " + mul);
                break;
            case "4":
                if (b == 0) {
                    System.out.println("Number Cannot be divisible by zero");
                } else {
                    double div = a / b;
                    System.out.println("Division: " + div);
                }
                break;
            case "5":
                double mod = a % b;
                System.out.println("Modulus: " + mod);
                break;
            default:
                System.out.println("Invalid Entry");
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter the Arithmetic operation");
        System.out.println("Enter 1: Addition");
        System.out.println("Enter 2: Subtraction");
        System.out.println("Enter 3: Multiplication");
        System.out.println("Enter 4: Division");
        System.out.println("Enter 5: Modulus");
        String op = sc.nextLine();
        try {
            System.out.println("Assign the value for a and b");
            double x = Double.parseDouble(sc.nextLine());
            double y = Double.parseDouble(sc.nextLine());
            assign(op, x, y);
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid number.");
        }

    }
}

