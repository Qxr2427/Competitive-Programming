package twentysixteen;

import java.util.Scanner;

public class J1TournamentSelection {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		int count=0;
		for(int i=0;i<6;i++) {
			String x= sc.nextLine();
			if (x.equals("W")) {
				count++;}
				if (count==5||count==6) 
			System.out.println("1");
		}if (count==3||count==4) 
			System.out.println("2");
			
	if (count==1||count==2) 
		System.out.println("3");

	if(count==0)
		System.out.println("-1");
	

			
		
	}
	
}
