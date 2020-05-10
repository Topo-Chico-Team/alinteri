import java.util.*;

class Main
{
  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);
    int size = scan.nextInt();
    int[] nums = new int[size];
    for(int i=0; i < size; i++){
      nums[i] = scan.nextInt();
    }
    printUniqueNumbers(nums);
  }
  
  public static void printUniqueNumbers(int[] nums)
  {
    //WRITE YOUR CODE HERE
			//int[] arr1 = new int[nums.length]
			for (int i = 0 ; i<nums.length ; i++)
			{
				for (int j = 0 ; j<nums.length ; j++)
				{
					if(j>i&&nums[i]==nums[j])
					{
						nums[j]=0;
						nums[i]=0;
						continue;
					}
				}
			}
			for (int i = 0 ; i<nums.length ; i++)
			{
				if(nums[i]!=0)
				{
					System.out.println(nums[i]);
				}
			}
  }
}


 
