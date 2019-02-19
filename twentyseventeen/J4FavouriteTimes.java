package twentyseventeen;
import java.util.Scanner;

public class J4FavouriteTimes {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		int x =sc.nextInt();
		int hr = 12;
		int mn = 0;
		int counter = 0;
	for(int i=0;i<=x;i++) {
		mn++;
		if(mn>=60) {
			mn=mn-60;
			if (hr+1<13) {
				hr++; }
				else if (hr+1>=13) {
					hr=(hr+1)%12;
				
				}
				
				
			}
				
		if (hr == 1 && mn == 11) 
		    counter ++ ;
		    if (hr == 1 && mn == 23)
		    	 counter ++;
		  if (hr == 1 && mn == 35) counter ++;  if (hr == 1 && mn == 47)
			  counter ++;
		  if (hr == 1 && mn == 59)
			  counter ++; 
		    
		  if (hr == 2 && mn == 22) counter ++;if (hr == 2 && mn == 10)
			  counter ++;
		  if (hr == 2 && mn == 34) counter ++;if (hr == 2 && mn == 46)
			  counter ++;
		  if (hr == 2 && mn == 58 )
			  counter ++;
		  
		  if (hr == 3 && mn == 33)counter ++; if (hr == 3 && mn == 21)
			  counter ++;
		  if (hr == 3 && mn == 45) counter ++;if (hr ==  3 && mn == 57)
			  counter ++;
		    
		  if (hr == 4 && mn == 44) counter ++;if (hr == 4 && mn == 32)
			  counter ++;
		  if (hr == 4 && mn == 56)counter ++; if (hr == 4 && mn == 20)
			  counter ++;
		    
		  if (hr == 5 && mn == 55)counter ++; if (hr == 5 && mn == 43)
			  counter ++;
		  if (hr == 5 && mn == 31)
			  counter ++;
		    
		  if (hr == 6 && mn == 54) counter ++;if (hr == 6 && mn == 42)
		    counter++;
		  if (hr == 6 && mn == 30)
		    counter++;
		    
		  if (hr == 7 && mn == 53)counter ++ ;if (hr == 7 && mn == 41)
		    counter++;
		    
		  if (hr == 8 && mn == 52)counter ++; if (hr == 8 && mn == 40)
		    counter++;
		    
		  if (hr == 9 && mn == 51) counter ++; if (hr == 11 && mn == 11)
		    counter++;
		  
		  if (hr == 12 && mn == 34)
		    counter++;}
		
		  	System.out.println(counter);
	}
	
}
	

