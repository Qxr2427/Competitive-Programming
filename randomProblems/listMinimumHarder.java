package randomProblems;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class listMinimumHarder {
 
  public static void sort(long[] a) {
    int i, m = (int) a[0], exp = 1, n = a.length;
    long[] b = new long[n];
    for (i = 1; i < n; i++)
        if (a[i] > m)
            m = (int) a[i];
    while (m / exp > 0) {
        long[] bucket = new long[n];

        for (i = 0; i < n; i++)
            bucket[(int) ((a[i] / exp) % 10)]++;
        for (i = 1; i < n; i++)
            bucket[i] += bucket[i - 1];
        for (i = n - 1; i >= 0; i--)
            b[(int) --bucket[(int) ((a[i] / exp) % 10)]] = (int) a[i];
        for (i = 0; i < n; i++)
            a[i] = b[i];
        exp *= 10;
    }
}
  public static void main(String[]args) throws NumberFormatException, IOException {
    BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
    
    
    int x=Integer.parseInt(sc.readLine());
    long[] a=new long[x];
    for(int i=0;i<x;i++) {
      a[i]= Long.parseLong(sc.readLine());
      

    }
   sort(a);
    for(int i=0;i<x;i++) {
      System.out.println(a[i]);
    }
  }
}
