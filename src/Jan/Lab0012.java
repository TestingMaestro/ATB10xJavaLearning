package Jan;

public class Lab0012 {
    static int y; //Global variable
    static int z = 30;
    //y=10; we cant do this
    public static void main(String[] args) {
        /*Global Variables
         * A variable which is declared outside the class and outside the method
         * Scope is from beginning of the class till end of the class
         * Global variables have default values
         * it can be classified into static/non-static
         * once it is declared we cannot initialize it globally
         * it can be declared globally and initialize within the method
         * We can declare and initialize within the same line globally
         * */
        z=200;
        System.out.println(y);
        System.out.println(z);
    }
}
