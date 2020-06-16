package Array;

public class Middle12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[][]=new int[9][9];
		int c=0;
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
			arr1[i][j]=Integer.parseInt(args[c]);
			c++;
			
		}
		}System.out.println("The MiddleWay Element is "+arr1[0][1]+ " and "+arr1[1][1]);
	
	}

}
