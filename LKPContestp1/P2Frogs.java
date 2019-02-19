package LKPContestp1;

import java.util.Scanner;

public class P2Frogs {
    public static void main(String[]args) {
      Scanner sc=new Scanner(System.in);
      long x=sc.nextInt();
     if(x%2==0) {
       System.out.println(x*x/2);
     }
     else {
       System.out.println((x+1)*(x+1)/2-x-1);
     }
      
    }

}
