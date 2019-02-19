package twentysixteen;

import java.util.Scanner;

public class J2MagicSquares {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int [][] x= new int[4][4];
		int row=0;
		int col=0;
		for(row=0;row<x.length;row++) {
			for(col=0;col<x.length;col++) {
				x[row][col]=sc.nextInt();
			}
			
		
				
			}int sum =x[0][0]+x[1][0]+x[2][0]+x[3][0];
			if(sum==x[0][1]+x[1][1]+x[2][1]+x[3][1]&&sum==x[0][2]+x[1][2]+x[2][2]+x[3][2]&&sum==x[0][3]+x[1][3]+x[2][3]+x[3][3]&&sum==x[0][0]+x[0][1]+x[0][2]+x[0][3]&&sum==x[1][0]+x[1][1]+x[1][2]+x[1][3]&&sum==x[2][0]+x[2][1]+x[2][2]+x[2][3]&&sum==x[3][0]+x[3][1]+x[3][2]+x[3][3]) {
				System.out.println("magic"); 	
				
			}else System.out.println("not magic");
	}
}
		
		
	
	
