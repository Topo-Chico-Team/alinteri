import java.util.Scanner;

public class fibonacci

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    fib(num);
  }
  
  public static void fib(int num){
		//WRITE YOUR CODE HERE

		int[]arr=new int[num+1];
		arr[0]=0;arr[1]=1;
		for(int i=2;i<num+1;i++)
		{
		arr[i]=arr[i-2]+arr[i-1];
		}
		System.out.println(arr[num]);
		}

