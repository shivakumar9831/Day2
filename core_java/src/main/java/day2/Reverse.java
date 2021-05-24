

package day2;
import java.util.Scanner;

public class Reverse {
	public static void main(String [] args)
	{
		int rem;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the integer number");
		int num=s1.nextInt();
		int rev=0;
		while(num!=0)
		{    rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
			System.out.println("Result:"+rev);
	}

}
}
