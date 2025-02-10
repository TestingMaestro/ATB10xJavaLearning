package z_practiceprograms.strings;

public class Palindrome {
    static String s1 = "madamm";

    static void palindrome() {
        boolean isPalindrome = true;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s1.charAt(s1.length() - 1 - i)) {

                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else System.out.println("Not Palindrome");
    }

    public static void main(String[] args) {

        System.out.println();

        boolean isPalindrome = false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == s1.charAt(s1.length() - 1 - i)) {

                isPalindrome = true;
            }
        }
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else System.out.println("Not Palindrome");
    }
}
