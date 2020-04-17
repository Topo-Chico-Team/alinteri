import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample
{
    public static void main(String[] args)
    {
        ArrayList<String> usernames = new ArrayList<>();
        ArrayList<String> passwords = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        //String name = input.nextLine();
        while(true)
        {
            System.out.println("jevoDB ye hosgeldiniz");
            while(true)
            {
                System.out.println("sign up icin 1 e , sign in icin 2 ye basin");
                int a = input.nextInt();
                if(a==1)
                {
                    System.out.println("kullanmak istedigin usename i yaz");
                    String b = input.nextLine();
                    String bb = input.nextLine();
                    usernames.add(bb);
                    System.out.println("simdi bu usename icin bir sifre yaz");
                    String c = input.nextLine();
                    passwords.add(c);
                    System.out.println("your account has been created");
                    break;

                }
                else if (a==2)
                {
                    System.out.println("lutfen usename inizi giriniz");
                    String d = input.nextLine();
                    String dd = input.nextLine();
                    for(int i = 0 ; i<usernames.size() ; i++)
                    {
                        if(dd.equals(usernames.get(i)))
                        {
                            System.out.println("username iniz bulundu found in jevoDB");
                            System.out.println("lutfen sifrenizi girin");
                            String e = input.nextLine();
                            if(passwords.get(i).equals(e))
                            {
                                System.out.println("giris basarili");
                                System.out.println("simdi naapacan yine basa donuyoruz");
                                break;
                            }
                            else
                            {
                                System.out.println(" bu password username le eslesmedi");
                                System.out.println("lutfen bilgilerinizi dogru duzgun giriniz");
                                System.out.println("sistem yenileniyor");
                            }
                        }
                        else
                        {
                            System.out.println(" bu username database de bulunamadi");
                            System.out.println("lutfen bilgilerinizi dogru duzgun giriniz");
                            System.out.println("sistem yenileniyor");
                        }
                    }

                }

            }
        }

    }
}
