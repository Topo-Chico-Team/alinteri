import java.util.Arrays;

class sortarray
{
    public static int[] reversesortthearray(int[] arr)
    {
        Arrays.sort(arr);
        int[] arr3 = new int[arr.length];
        int a = arr.length;
        for (int i = 0 ; i<a ; i++)
        {
            arr3[i]=arr[a-1-i];
        }
        return arr3;
    }

    public static void main(String[] args) {
        int[] arr = {4,6,23,66,12,1,6};
        System.out.println(Arrays.toString(reversesortthearray(arr)));
    }
    public static int[] sortthearray(int[] arr)
    {
        Arrays.sort(arr);
        return arr;
    }
}
