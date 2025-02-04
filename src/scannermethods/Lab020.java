package scannermethods;

import java.util.Scanner;

public class Lab020 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name");
        String name = sc.next();
        System.out.println("Name: " +name);
        sc.nextLine();
        System.out.println("Enter the Name1");
        String name1 = sc.nextLine();
        System.out.println("Name: " +name1);

        System.out.println("Enter the Name1");
        int num1 = sc.nextInt();
        System.out.println("Number: " +num1);

        System.out.println("Enter the Name1");
        double num2 = sc.nextDouble();
        System.out.println("Number: " +num2);

        System.out.println("Enter the Name1");
        float num3 = sc.nextFloat();
        System.out.println("Number: " +num3);

        System.out.println("Enter the Name1");
        long num4 = sc.nextLong();
        System.out.println("Number: " +num4);

    }
}
