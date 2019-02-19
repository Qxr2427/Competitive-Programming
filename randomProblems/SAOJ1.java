package randomProblems;

import java.math.BigInteger;
import java.util.Scanner;
public class SAOJ1 {
  
  public static void main(String[]args) {
    Scanner sc=new Scanner(System.in);
    long x=sc.nextLong();
    long res=0;
    for(int i=0;i<=x;i++) {
      res= (long)  (res%(Math.pow(10, 9))+(Math.pow(i, 6)%(Math.pow(10, 9)))%(Math.pow(10, 9)));
      
    }
    System.out.println(res);
  }
}
