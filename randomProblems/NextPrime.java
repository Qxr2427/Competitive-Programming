 package randomProblems;

import java.util.Scanner;

public class NextPrime {
  public static void main(String[]args) {
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    if(x==1) {
      System.out.println(2);
    }
    else {
    for(int i=2;i<=Math.sqrt(x);i++) {
      if(x%i==0) {
        x++;
        
        i=1;
        
    }
      else {
        continue;
      }
      
  }
    System.out.println(x);
    }
  }
}
