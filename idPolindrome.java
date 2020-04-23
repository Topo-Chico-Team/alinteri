public class isPolindrome 
{
    public static void isPalindrome(int num)
    {
        //WRITE YOUR CODE HERE
        String str = String.valueOf(num);
        String str1 = "";
        for(int i = 0 ; i<str.length() ; i++)
        {
            str1 += ""+str.charAt(str.length()-1-i);
        }
        if(str.equals(str1))
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
    }
}
