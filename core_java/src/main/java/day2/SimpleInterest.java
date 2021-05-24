package day2;
import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double principle,rate,time,repeter;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter principle amount:");
		principle=sc.nextDouble();
		System.out.println("Enter Interset rate:");
		rate=sc.nextDouble();
		System.out.println("Enter time in a year:");
		time=sc.nextDouble();
		double interest;
		interest=(principle*time*rate)/100;
		System.out.println("Simple Interest="+interest+"return= "+(interest+principle));
		

	}

}
