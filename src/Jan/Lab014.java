package Jan;

public class Lab014
{
    static  int a = 20;
    int b = 40;
    public static void main(String[] args)
    {
        a=50;
        System.out.println(a);
        Lab014 obj = new Lab014();
        obj.display();

    }
    void display()
    {
        b = 70;
        System.out.println(this.b);
    }
}
