package randomProblems;

import java.util.Scanner;

public class kusac {
  public static int GCF(int a, int b) {
    if (b == 0) return a;
    else return (GCF (b, a % b));
}
  public static void main(String[]args) {
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    int z;
    if(x%y==0) {
      System.out.println(0);
    }
    else if(x%y!=0) {
      int a=1; int b;
     if(y%x==0) {
      a=GCF(x,y);
       y=y/a;
       b=(y-1)*a;
       
     }
     else if(x>y) {
      z=x-(x/y)*y;
      double m=z;
      double n=y;
      if(m/n<0.5) {
        if(y%z==0) {
          a=GCF(x,y);
           y=y/a;
           b=(y-1)*a;
         
         }
        else {
          b=(y-1)*a;
        }
      
      }
      else {
        b=z*a;
      }
     }
     else {
     double m=x;
     double n=y;
     if(m/n<0.5) {
     b=(y-1);
   
     }
     else {
       b=x;
       if(y%(y-x)!=0) {
         b=x+x/2;
       }
     }
     }
      System.out.println(b);
      
    }
  }
}
