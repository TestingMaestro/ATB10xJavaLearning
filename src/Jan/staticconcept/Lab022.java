package Jan.staticconcept;

class Demo {
    static int count = 0; // Static variable (Single copy for all objects)

    Demo() {
        count++;  // Increments the single copy of count
    }

    void show() {
        System.out.println("Count: " + count);
    }
}

public class Lab022
{
    static int a = 20;

    static void test()
    {
        System.out.println("Running test "+a);
    }
    public static void main(String[] args) {
        a = 30;
        test();
        Demo obj1 = new Demo();
        Demo obj2 = new Demo();
        Demo obj3 = new Demo();
        Demo obj4 = new Demo();

        obj1.show(); // Output: Count: 3
        obj2.show(); // Output: Count: 3
        obj3.show(); // Output: Count: 3

        System.out.println("Final count accessed via class: " + Demo.count);

    }
}
