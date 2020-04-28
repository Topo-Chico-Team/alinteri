import java.util.Scanner;

public class Polindrome
{


    public static String  tersyuz(String b)
    {
        String c= "";
        for(int i = 0 ; i<b.length(); i++)
        {
            c += "" + b.charAt(b.length()-1-i);
        }
        return (c);
    }
    public static void tersyuz(int a )
    {
        String b = String.valueOf(a);
        String c= "";
        for(int i = 0 ; i<b.length(); i++)
        {
            c += "" + b.charAt(b.length()-1-i);
        }
        System.out.println(c);
    }
    public static void tersyuz(long a )
    {
        String b = String.valueOf(a);
        String c= "";
        for(int i = 0 ; i<b.length(); i++)
        {
            c += "" + b.charAt(b.length()-1-i);
        }
        System.out.println(c);
    }
    public static boolean polindrome(String a, String b)
    {
        if(a.equals(tersyuz(b)))
        {
            return true;
        }
        else    return false;
    }
    public static boolean polindrome(int a, String b)
    {
        String c = String.valueOf(a);
        if(c.equals(tersyuz(b)))
        {
            return true;
        }
        else    return false;
    }


    public static void main(String[] args)
    {
        tersyuz("aliverlika kmail");
        tersyuz(123412341);
        tersyuz(111);
        System.out.println(polindrome("alig","gila"));
        System.out.println(polindrome("ali","alik"));
        System.out.println(polindrome(123,"123"));
        System.out.println(polindrome(123,"321"));

    }
}
