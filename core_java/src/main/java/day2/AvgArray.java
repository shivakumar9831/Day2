package day2;

public class AvgArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] number=new int[] {10,20,15,25,16,85,100};
    int sum=0;
    for(int i=0;i<number.length;i++)
    {
    	sum=sum+number[i];
    }
    double avg=sum/number.length;
    System.out.println("Sum of array elements is: "+sum);
    System.out.println("Average of array elements is: "+avg);
    
	}

}
