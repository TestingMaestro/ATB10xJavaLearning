package Jan.staticconcept;

public class FacebookTest
{
    static String messageDm = "Hello This is fb Private chat";
    static String messageGroup = "Hello This is fb Group chat";

    static void privateMessage()
    {
        System.out.println(messageDm+ " and this is shown to only the user");
    }

    static void groupMessage()
    {
        System.out.println(messageGroup+ " and this is shown to all the members of the group");
    }
}
