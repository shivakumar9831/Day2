package day2;
import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
   Scanner sc =new Scanner(System.in);
   System.out.println("Enetr the radius");
   int radius=sc.nextInt();
   double area=Math.PI*radius*radius;
   
   System.out.println("Area Of Circle is "+area );
	}

}
