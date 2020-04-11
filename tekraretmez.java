// bu code verilen bir stringin icinde eger ayni harften iki tane varsa onu yazdirmiyor. 
// ic ice 4 for iki if kullaniminin sebebi eger 2 for kullanilsaydi bazen bir harf fazla kereler yan yana yazilirsa onu elemine edemiyordu
// problemi gidermek icin ayni for dongulerinden bi tane daha koydum if le sorun cozuldu. simdi tikir tikir.

public class tekraretmez
{
    public static void main(String[] args) {
    // stringi buraya yaziyosun
        String a = "aatyy";

        for (int i = 0 ; i<a.length();i++)
        {
            for (int j = 0 ; j<a.length(); j++)
            {
                if(i!=j&&a.charAt(i)==(a.charAt(j)))
                {
                    for (int ii = 0 ; ii<a.length();ii++)
                    {
                        for (int jj = 0 ; jj<a.length(); jj++)
                        {
                            if(ii!=jj&&a.charAt(ii)==(a.charAt(jj)))
                            {
                            a=a.substring(0,jj) + a.substring(jj+1);
                            }
                        }

                    }
                }
            }
        }
        System.out.println(a);
    }
}
