package Jan.staticconcept;

class WhatsApp
{
    static String name = "Yash";

    static void privateChat()
    {
        System.out.println("Running Private chat....Hello "+name);
        System.out.println(String.format("Running Private chat....Hello %s",name));
        System.out.printf("Running Private chat....Hello %s",name);
    }
}
public class Lab023
{
    public static void main(String[] args) {
        WhatsApp.name = "Souparnika!!";
        WhatsApp.privateChat();

    }
}
