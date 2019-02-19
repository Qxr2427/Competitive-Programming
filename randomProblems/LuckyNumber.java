package randomProblems;

import java.math.BigInteger;
import java.util.Scanner;

public class LuckyNumber {
  public static void main(String[]agrs) {
    Scanner sc=new Scanner(System.in);
    
    long x=sc.nextInt();
    for(int i=0;i<x;i++) {
     BigInteger s=sc.nextBigInteger();
      while(s.compareTo(BigInteger.valueOf(9))==1) {
        s=s.mod(BigInteger.valueOf(10)).add(s.divide(BigInteger.valueOf(10)));
      }
      System.out.println(s);
    }
  }
}
