public static void main(String[] args)
    {
        int[] arr = {4,5,8,11,-14,62,66,44,3,4};
        int a = arr.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        // maximum degeri bulmak icin en kucuk int degerine ihtiyacimiz var
        // cunku her bir array degerini sirayla deneyecegiz
        // ilk deger dahi ilk iteration da en buyuk olmali
        // sonra ilk ikinciyle sinayacaz
        // eger ikinci buyukse max degeri ona esit olacak
        // eger ikinci kucukse max degeri ayni kalacak
        // siradaki deger elimizdeki max degerinde buyukse max degeri o olacak
        // degilse deger ayni kalmaya devam edecek
        for (int i = 0 ; i<arr.length ; i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        System.out.println(max);
        // minumum degeri bulmak icin maximum int degerine ihtiyacimiz var
        // ilk iteration da bizim ilk degerimiz ondan kucuk olacagi icin
        // min degerimiz artik o olacak
        // sonra sirayla bu min degeriyle yanindakin sinayacaz
        // o deger eger kucukse o min olacak degilse elimizdeki deger min olarak kalacak
        for (int i = 0 ; i<a ; i++)
        {
            if(arr[i]<min)
            {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
