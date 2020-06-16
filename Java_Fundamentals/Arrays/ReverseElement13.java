package Array;

public class ReverseElement13 {

	public static void main(String[] args) {
		int a=args.length;
		int b[][]=new int[4][4];
		if(a<4) {
			System.out.println("Please enter 4 integer numbers");
		}if(a==4) {
			int c=0;
			for(int i=0;i<2;i++) {
				for(int j=0;j<2;j++) {
					b[i][j]=Integer.parseInt(args[c]);
					c++;
				}
			}
			for(int i=1;i>=0;i--) {
				for(int j=1;j>=0;j--) {
					System.out.print(b[i][j]+" ");
				}System.out.println();
			}
		}
	}
}
