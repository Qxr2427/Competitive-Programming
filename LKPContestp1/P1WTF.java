package LKPContestp1;

import java.util.Scanner;

public class P1WTF {
  public static void main(String[]args) {
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    int[] c=new int[x];
    for(int i=0;i<x;i++) {
      c[i]=sc.nextInt();
      
    }
    if(y%c[0]!=0){
      System.out.println(-1);
    }
    else {
    int count=0;
    int a=c.length-1;
    while(y>0) {
      if(y>=c[a]) {
        y-=c[a];
        count++;
        
      }
      else {
        a--;
      }
    }
    System.out.println(count);
  }
  }
}
