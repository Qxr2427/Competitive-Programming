package dmopc201812;

import java.util.Scanner;

public class P0 {
  public static void main(String[]args) {
    Scanner sc=new Scanner(System.in);
    int min=999999999;
    int a=0;
    int b=0;
    
    int x=sc.nextInt();
    int y=sc.nextInt();
    int z=sc.nextInt();
    for(int i=1;i<=3;i++) {
      int q=sc.nextInt();
      int w=sc.nextInt();
      int e=sc.nextInt();
      if(e<min) {
        min=e;
        a=q;
        b=w;
      }
  
    }
    int as=(a-y)*(a-y);
    int bs=(b-z)*(b-z);
    int rs=x*x;
    if(as+bs<rs) {
      System.out.println("What a beauty!");
    }
    else if(as+bs>=rs){
      
      System.out.println("Time to move my telescope!");
    }
  }
}
