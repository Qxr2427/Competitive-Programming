package twentyseventeen;
import java.util.Scanner;

public class J2ShiftingSum {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		
		int n=sc.nextInt();
		int k=sc.nextInt();int sum = n;
		for(int i=1;i<=k;i++) {
			sum = (int) (sum+Math.pow(10, i)*n);
			
		}System.out.println(sum);
	}
}
