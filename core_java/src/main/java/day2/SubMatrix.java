package day2;

public class SubMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{2,2,4},{2,9,3},{3,4,5}};
		int b[][]= {{1,2,4},{2,7,3},{1,2,3}};
		int c[][]=new int[4][4];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=a[i][j]-b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}

	}

}
