package randomProblems;
import java.io.*;
import java.lang.Math;
import java.util.Scanner;
 
public class primeFactorization
{

    public static void primeFactors(int n)
    {
        while (n%2==0)
        {
            System.out.print(2 + " ");
            n /= 2;
        }
 
        for (int i = 3; i <= Math.sqrt(n); i+= 2)
        {
            while (n%i == 0)
            {
                System.out.print(i + " ");
                n /= i;
            }
        }
 
        if (n > 2)
      System.out.print(n);
      System.out.println();
    }
 
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int[] a=new int[x];
        for(int i=0;i<x;i++) {
          a[i]=sc.nextInt();
          primeFactors(a[i]);
        }
       
    }
}
