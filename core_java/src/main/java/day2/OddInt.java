package day2;
import java.util.Scanner;

public class OddInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s2=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=s2.nextInt();
		int sum=0;
		for(int i=1;i<num;i++)
		{
			
		   if(i%2 !=0) {
			   sum=sum+i;
		
		   }
			
			
		}
	
		System.out.println(sum);
	}

}
