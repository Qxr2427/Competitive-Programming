package valentines2019;

import java.util.Scanner;

public class J3Love {
  public static void main(String[]args) {
    Scanner sc=new Scanner(System.in);
    String x=sc.nextLine();
    char[] a= x.toCharArray();
    long e=0;
    long v=0;
    long o=0;
    long l=0;
    for(int i=a.length-1;i>=0;i--) {
      if(a[i]=='e') e++;
      else if(a[i]=='v')v+=e;
      else if(a[i]=='o')o+=v;
      else if(a[i]=='l')l+=o;
      
    }
    System.out.println(l);
  }
}
