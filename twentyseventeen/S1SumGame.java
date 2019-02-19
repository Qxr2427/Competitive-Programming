package twentyseventeen;

import java.util.Scanner;

public class S1SumGame {
	public static void main(String[]args) {
	  Scanner sc=new Scanner(System.in);
	  int a=0;
	  int x=sc.nextInt();
	  int[] y=new int[x];
	  int[] z=new int[x];
	  int sum1=0;
	  int sum2=0;
	  for(int i=0;i<x;i++) {
	    y[i]=sc.nextInt();
	  }
	  for(int i=0;i<x;i++) {
        z[i]=sc.nextInt();
      }
	  
	    for(int i=0;i<x;i++) {
	      sum1=sum1+y[i];
	      sum2=sum2+z[i]; 
	      if(sum1==sum2) {
	      a=i+1;
	    }
	      
	  
	      
	    }
	    System.out.println(a);
	 
	    
	       
	    }
	  
	   
	    
	  }
	
	
	
	
	
		
		
	
	

