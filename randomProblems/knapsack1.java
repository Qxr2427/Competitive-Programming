package randomProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class knapsack1 
{ 
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringTokenizer st;
    static long max(long l, long b) { return  ((l > b)? l : b); } 
       
    static long knapSack(long W, long wt[], long[] val, int n) 
    { 
         int i;
         long w; 
     long K[] = new long[(int) (W+1)]; 
       K[0] = 0; 
     for (i = 1; i <= n; i++) 
     { 
         for (w = W; w >= wt[i-1]; w--) 
         { 
                  
                   K[(int) w] = Math.max(val[i-1] + K[ (int) (w-wt[i-1])],  K[(int) w]); 
            
                  }
         }  
      
       
      return K[(int) W]; 
    } 
  
    
  public static void main(String args[]) throws IOException 
    { 
      int x=readInt();
      long y=readLong();
      long[] wt=new long[x];
      long[] val=new long[x];
      for(int i=0;i<x;i++) {
        wt[i]=readLong();
        val[i]=readLong();
        
      }
         int n = val.length; 
    System.out.println(knapSack(y, wt, val, n)); 
    } 
    static String next () throws IOException {
      while (st == null || !st.hasMoreTokens())
          st = new StringTokenizer(br.readLine().trim());
      return st.nextToken();
  }
  static long readLong () throws IOException {
      return Long.parseLong(next());
  }
  static int readInt () throws IOException {
      return Integer.parseInt(next());
  }
  static double readDouble () throws IOException {
      return Double.parseDouble(next());
  }
  static String readLine () throws IOException {
      return br.readLine().trim();
  }
}
