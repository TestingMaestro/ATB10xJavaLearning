package Jan.strings;

import java.util.Date;

public class StringFormating
{
    public static void main(String[] args) {

        String name = "Yashodhar";
        int age = 30;
        double percent = 12.36556;
        System.out.println(String.format("Name: %s, Age: %d",name,age));

        System.out.println(String.format("Name: %-5s Age: %5d",name,age));

        System.out.println(String.format("%.2f",percent));

        System.out.println(String.format("%-10s %-5s","Name","Age"));
        System.out.println(String.format("%-10s %d","Yash",30));
        System.out.println(String.format("%-10s %d","Sou",28));

        Date date = new Date();
        System.out.println(String.format("Today's date is %tT",date));

        char grade = 'A';
        System.out.printf("Your grade is %c ",grade);

        System.out.println(String.format("and you have scored 90%% is your academics"));

        // Modifiers "%.nf"
        double price = 220.878678678687;
        System.out.println(String.format("Price of lap is %.2f",price));
        // or
        System.out.println(String.format("Price of lap is %.2f",price));

        System.out.printf("I love java %n","I love you");

        double salary = 1556.697989456;

        System.out.println(String.format("Salary is: %15.1f",salary));



    }
}
