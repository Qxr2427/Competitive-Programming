package randomProblems;

import java.util.Scanner;

public class XOR {
  public static long f(long a) {
    long res[] = {a,1,a+1,0};
    return res[(int) (a%4)];
}

 long getXor(long  a, long  b) {
    return f(b)^f(a-1);
}
 public static void main(String[]args) {
   Scanner sc=new Scanner(System.in);
   int x=sc.nextInt();
   for(int i=0;i<x;i++) {
     int a=sc.nextInt();
     int b=sc.nextInt();
     System.out.println(f(b)^f(a-1));
   }
 }
}
