package twentyseventeen;
import java.util.Scanner;

public class J3ExactlyElectrical {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int x=sc.nextInt();
		if((Math.abs(c-a)+Math.abs(d-b))%2==0&&x%2==0&&x>=(Math.abs(c-a)+Math.abs(d-b))) {
			System.out.println("Y");
		}if((Math.abs(c-a)+Math.abs(d-b))%2==0&&x%2==1&&x>=(Math.abs(c-a)+Math.abs(d-b))) {
			System.out.println("N");
			
		}if((Math.abs(c-a)+Math.abs(d-b))%2==1&&x%2==1&&x>=(Math.abs(c-a)+Math.abs(d-b))) {
			System.out.println("Y");
		}if((Math.abs(c-a)+Math.abs(d-b))%2==1&&x%2==0&&x>=(Math.abs(c-a)+Math.abs(d-b))) {
			System.out.println("N");
		}
		if(x<(Math.abs(c-a)+Math.abs(d-b)))
			System.out.println("N");
	}
}
