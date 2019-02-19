package mockCCC5;

import java.util.Scanner;

public class J1 {
	public static boolean check(char[] y) {
		for(int i=0;i<y.length-2;i++) {
			if(y[i]=='C'&&y[i+1]=='C'&&y[i+2]=='C') {
			return true;}
	}
			return false;}
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		char[] y = x.toCharArray();
		if(check(y)==true) {
System.out.println("NO");
				}
			if(check(y)==false) {
				System.out.println("YES");
	}
	}
}

		
			
			
		
	

