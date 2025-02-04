package scannermethods;

import java.util.Scanner;

public class Lab021 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size");
        int size = sc.nextInt();

        int[] intArray = new int[size];

        // Storing the elements inside the array

        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Enter the element at " + i + " th index");
            intArray[i] = sc.nextInt();
        }
        for (int j : intArray) {
            System.out.println(j);
        }
    }
}
