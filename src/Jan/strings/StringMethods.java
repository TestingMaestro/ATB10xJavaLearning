package Jan.strings;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Yashodhar Karki";

        // length of the string
        int len = str.length();
        System.out.println("Length Of the String " + len);

        // Character pos
        char sub = str.charAt(6);
        // char sub1 = str.charAt(19); [StringIndexOutOfBoundsException ]
        System.out.println("Char " + sub);
        //System.out.println("Char "+sub1);

        // contains
        boolean isPresent = str.contains("ar");
        boolean isNotPresent = str.contains("po");
        System.out.println(isPresent);
        System.out.println(isNotPresent);

        // indexOf the char returns -1 if the character or string is not present

        int ind = str.indexOf('a');
        int ind1 = str.indexOf('h');
        int ind2 = str.indexOf("Karki");
        System.out.println(ind);
        System.out.println(ind1);
        System.out.println(ind2);

        // Last index of

        int indd = str.lastIndexOf('a');
        int indd1 = str.lastIndexOf('h');
        int indd2 = str.lastIndexOf("Karki");
        System.out.println(indd);
        System.out.println(indd1);
        System.out.println(indd2);

        //starts and ends with

        boolean isYes = str.startsWith("Ya");
        boolean isNo = str.startsWith("sh");
        System.out.println(isYes);
        System.out.println(isNo);

        boolean isYess = str.endsWith("arki");
        boolean isNoo = str.endsWith("sh");
        System.out.println(isYess);
        System.out.println(isNoo);


        // substring

        String substr = str.substring(5);
        System.out.println("Substring with start index " + substr);
        String substr1 = str.substring(0,15);
        System.out.println("Substring with start and end index " + substr1);

        // Split
        String newStr = "         Java is fun to learn    ";
        String [] splitStr = newStr.split(" ");
        System.out.println(Arrays.toString(splitStr));

        //trim
        System.out.println(str.trim());
        System.out.println(newStr.trim());

    }

}
