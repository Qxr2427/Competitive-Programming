package twentyseventeen;
import java.util.Scanner;

public class J4FavouriteTimesSolu2 {

	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		int x =sc.nextInt();
		int num = 1200;
		int counter = 0;
	for(int i=0, rem=x%720;i<rem;i++) {
		num++;
		int mn =num%100; int hr=num/100;
		if(mn>=60) {
			mn-=60;hr++;
		 if (hr>12)
					hr-=12;}
				
				
		 num = hr*100+mn;
		 if(num<1000) { int a=num/100, b=num%100/10, c=num%10;
		 if(a-b==b-c) {
			 counter++;
		 }
		
		 }

	
 else {
			 int a=num/1000, b=num%1000/100, c=(num%100)/10, d=num%10;
         if(a-b == b-c && b-c==c-d){
             counter++;
}
	}
}counter+=31*(x/720);
	System.out.println(counter);}
}
