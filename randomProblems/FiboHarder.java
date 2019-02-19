package randomProblems;

import java.math.BigInteger;
import java.util.Scanner;

public  class FiboHarder {
  static long a=0;
    public static final long s=1000000007;
    static int f[]; 


    public static long getNthfibo(long x) {
       
        if (x <= 1) return x;

        long[][] result = {{1, 0}, {0, 1}}; 
        long[][] fiboM = {{1, 1}, {1, 0}};

        while (x > 0) {
            if (x%2 == 1) {
                multMatrix(result, fiboM);
            }
            x = x / 2;
            multMatrix(fiboM, fiboM);
        }

        return result[1][0];
    }
    

    private static void multMatrix(long[][] m, long [][] n) {
        long a = (((m[0][0]%s) * (n[0][0]%s))%s +  ((m[0][1]%s) * (n[1][0]%s))%s)%s;
        long b = (((m[0][0]%s) * (n[0][1]%s))%s +  ((m[0][1]%s) * (n[1][1]%s))%s)%s;
        long c = (((m[1][0]%s) * (n[0][0]%s))%s +  ((m[1][1]%s) * (n[1][0]%s))%s)%s;
        long d = (((m[1][0]%s) * (n[0][1]%s))%s +  ((m[1][1]%s) * (n[1][1]%s))%s)%s;

        m[0][0] = a;
        m[0][1] = b;
        m[1][0] = c;
        m[1][1] = d;
    }


    public static void main(String[] args) throws Exception {
       Scanner sc=new Scanner(System.in);
 
       String x=sc.next();
       try {
       a=Long.parseLong(x);
       }catch(Exception e) {
         BigInteger w=new BigInteger(x);
         while(w.compareTo(BigInteger.valueOf(Long.MAX_VALUE))==1) {
         if(w.mod(BigInteger.valueOf(2))==BigInteger.valueOf(0)) { w=w.divide(BigInteger.valueOf(2));
         long b=w.longValueExact();
         long q=getNthfibo(b)%s;
         long z=(2*(getNthfibo(b-1)%s));
         
         System.out.println((q*((z+q)%s))%s);
         return;
         }
         else {
           w=(w.add(BigInteger.valueOf(1))).divide(BigInteger.valueOf(2));
           long b=w.longValueExact();
           long q=((getNthfibo(b)%s)*(getNthfibo(b)%s))%s;
           long z=((getNthfibo(b-1)%s)*(getNthfibo(b-1)%s))%s;
           System.out.println((q+z)%s);
           return;
         }
       }
       }
      System.out.println(getNthfibo(a));
    }
}