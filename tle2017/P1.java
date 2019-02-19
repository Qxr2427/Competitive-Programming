package tle2017;

import java.util.Scanner;

public class P1 {
	public static char[] c;
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		for(int i=1;i<=x;i++) {
			c[i]=(char) sc.nextInt();
		}
	}
}
