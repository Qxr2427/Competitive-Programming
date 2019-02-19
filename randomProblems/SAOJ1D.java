package randomProblems;

import java.util.Scanner;

public class SAOJ1D {
  public static void main(String[]args) {
    Scanner sc=new Scanner(System.in);
    long x=sc.nextLong();
    long ans=0;
   
    for(long i=1;i<=x;i++) { long temp=1;
      for(int j=1;j<=6;j++) {
        temp=(temp*i)%1000000000;
      }
     
     ans=(long) ((ans+temp)%1000000000);
   
    }
    System.out.println(ans);
  }
}
