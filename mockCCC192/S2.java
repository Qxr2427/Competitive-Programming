package mockCCC192;

import java.text.NumberFormat;
import java.util.Scanner;

public class S2 {
  public static void main(String[]args) {
    Scanner sc=new Scanner(System.in);
    double x=sc.nextInt();
    double y=sc.nextInt();
    double x1=sc.nextInt();
    double y1=sc.nextInt();
    double x2=sc.nextInt();
    double y2=sc.nextInt();  NumberFormat nf = NumberFormat.getInstance();
      nf.setGroupingUsed(false);
      nf.setMinimumFractionDigits(3);
      nf.setMaximumFractionDigits(3);
    if(x1<=x&&x<=x2) {
    
      double ae=(Math.min(Math.abs(y1-y), Math.abs(y-y2)));
        System.out.println(nf.format(ae));

      }
    else if(y1<=y&&y<=y2) {
     double ae=Math.min(Math.abs(x1-x),Math.abs(x-x2));
     System.out.println(nf.format(ae));

    }
    else {
      double a=Math.min(Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1)), Math.sqrt((x-x2)*(x-x2)+(y-y2)*(y-y2)));
      double b=Math.min(a, Math.sqrt((x-x1)*(x-x1)+(y-y2)*(y-y2)));
      double c=Math.min(b, Math.sqrt((x-x2)*(x-x2)+(y-y1)*(y-y1)));
      System.out.println(nf.format(c));
    }
  
        //slopex+bo=invx+b
      }
    
    
    
  }  /*else if(y1<=x&&x<=y2){
        int c1=x;
        int c2=y;
        int a1=
      }*/


