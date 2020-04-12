// bu method verilen bir stringin icinde eger ayni harften iki tane veya daha fazla varsa onu yazdirmiyor. 
// once string i array a ceviriyo sonra loopa sokaraktan i ve j degerleri verdiriyo fekat j ler her daim i lerden buyuk yoksa 
// ilk eslesmeden sonra kafasi karisabilir diye i ler hep artarak gidiyo ve tabiki j lerde hep ilerden buyuk. 
// daha sonra i ve j degerleri bu sartlar altinda match ederuse j nin degerini bos olarak atayoruz. o sekil verilikten kelli
// string arrayini stringe cevirirunce son kertede icinde ayni harf tekrar etmeyen bir stringe haiz oluptur. 

import java.util.*;

public class noduplicatesinastring
{
    public static void noduplicatesinastring(String str)
    {
        int a = str.length();
        String strfinal = "";
        String[] array1 = new String[str.length()];
        array1 = str.split("");
        System.out.println(Arrays.toString(array1));
        int b = array1.length;

        for(int i = 0 ; i<b ; i++)
        {
            for(int j = 0 ; j<b ; j++)
            {
                if(j>i&&array1[i].equals(array1[j]))
                {
                    System.out.println(i+ " " + j);
                    array1[j]="";
                }
            }
        }
        System.out.println(Arrays.toString(array1));
        for (int i = 0 ; i< array1.length; i++)
        {
            strfinal= strfinal+array1[i];

        }
        System.out.println(strfinal);
    }

    private static void array1(int i) {
    }


    public static void main(String[] args) {
        noduplicatesinastring("kamilasdfasdfasdfka");
    }
}

