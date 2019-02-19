package twentytwelve;

import java.util.Scanner;

public class J4BigBangSecrets {
	public static char[] BigBang(String x, int z) {
		char[] y=x.toCharArray();
		for(int i=0;i<y.length;i++) {
			y[i]=(char) (3*(i+1)+z);
			if(y[i]>90) {
				y[i]=(char) (y[i]-26);
			}
		}
		return y;
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		String y=sc.next();
		System.out.println(BigBang(y, c));
		
	}
	
}
