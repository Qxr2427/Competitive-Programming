package twentyotwo;

import java.util.Scanner;

public class S2FractionAction {
  public static void main(String[]args) {
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    if(x>y) {
      int res=x/y;
      
      x=x-res*y;
      if(x==0) {
        System.out.print(res);
      }
      else {
        System.out.print(res);
      for(int i=2;i<=x;i++) {
        if(x%i==0&&y%i==0) {
          x=x/i;
          y=y/i;
        }
      } System.out.print(" "+x+"/"+y);
      } 
     
    }
    else if(x==y) {
      System.out.println(1);
    }
    else if(x==0) {
      System.out.println(0);
    }
    else {
      for(int i=2;i<=x;i++) {
        if(x%i==0&&y%i==0) {
          x=x/i;
          y=y/i;
        }
      }
      
      System.out.println(x+"/"+y);
    }
  }
}
