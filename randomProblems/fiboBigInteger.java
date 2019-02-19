package randomProblems;

import java.util.Scanner;

public  class fiboBigInteger {
    public static final long s=1000000007;
   
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


    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       long x=sc.nextLong();
       System.out.println(getNthfibo(x));
    }
}