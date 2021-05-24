package day2;
import java.util.Scanner;

public class Patter1 {
	public static void main(String [] args)
	{
		Scanner s3=new Scanner(System.in);
		System.out.println("How many rows?");
		int rows=s3.nextInt();
		System.out.println(0);
		for(int i =2;i <=rows;i++)
		{
			for(int j =0;j <i;j++)
			{
				System.out.print(j*i);
				
		}
			System.out.println();
		}
		s3.close();
	}

}
