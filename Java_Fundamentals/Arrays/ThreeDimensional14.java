package Array;

public class ThreeDimensional14 {

	public static void main(String[] args) {
		int a=args.length;
		int min=0;
		int b[][][]=new int[3][3][3];
		if(a<9) {
			System.out.println("Please enter 9 integer numbers");
		}if(a==9) {
			int c=0;
			System.out.println("The given array is :");
			for(int i=0;i<1;i++) {
				for(int j=0;j<3;j++) {
					for(int k=0;k<3;k++) {
					b[i][j][k]=Integer.parseInt(args[c]);
					c++;
					
					System.out.print(b[i][j][k]+" ");
					if(b[i][j][k]>min) {
						min=b[i][j][k];
						
					}
					
				}System.out.println();
				}System.out.println("The biggest number in the given array is "+min);
			}
		
		}

	}

}
