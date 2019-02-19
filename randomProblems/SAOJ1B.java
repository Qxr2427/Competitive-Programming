package randomProblems;

import java.math.BigInteger;
import java.util.Scanner;
public class SAOJ1B {
  
  public static void main(String[]args) {
    Scanner sc=new Scanner(System.in);
    long x=sc.nextLong();

    long ans = 0;
    for(int i=1;i<=x;i++)
    {
        long pow = 1;
        for(int j=1;j<=6;j++) {
            pow = (pow * i) % 1000000000;
            }
        ans = (ans + pow) % 1000000000;
    }
    System.out.println(ans);
  }
}
