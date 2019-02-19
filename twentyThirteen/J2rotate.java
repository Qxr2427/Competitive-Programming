package twentyThirteen;

import java.util.Scanner;

public class J2rotate {
  public static boolean a(String x) {
    boolean a=false;
    for(int i=0;i<x.length();i++) {
      if(x.charAt(i)==x.charAt(x.length()-i-1)) {  
        a=true;
      }
      else {
        a=false;
        break;
      }
      
      }
    
    return a;
  }
  public static void main(String[]args) {
    Scanner sc=new Scanner(System.in);
    String x=sc.next();
    if(a(x)==true) {
      System.out.println("YES");
    } if(a(x)==false) {
      System.out.println("NO");
    }
    
}
}