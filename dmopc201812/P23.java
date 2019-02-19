package dmopc201812;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P23
{static StringTokenizer st;
static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
static Map<String, Integer> z = new HashMap<>();
static boolean[][] T;
    public static int solve(int[] S, int n, int S1, int S2)
    {
        
        if (n < 0) {
            return Math.abs(S1 - S2);
        }
        String y=n+"#"+S1;
        String q=n+"#"+S2;
        if(!z.containsKey(y)) {
        int inc=solve(S, n - 1, S1 + S[n], S2);

      
        int exc =solve(S, n - 1, S1, S2 + S[n]);
 
        z.put(y, Integer.min(inc, exc));
    }
        
        if(!z.containsKey(q)) {
        int inc=solve(S, n - 1, S1 + S[n], S2);

      
        int exc =solve(S, n - 1, S1, S2 + S[n]);
 
        z.put(q, Integer.min(inc, exc));
    }
        
        return z.get(y);
    }
    public static boolean subsetSum(int[] A, int sum)
    {
        int n = A.length;

        // T[i][j] stores true if subset with sum j can be attained
        // with using items up to first i items
        T = new boolean[n + 1][sum/2+1];

        // if sum is zero
        for (int i = 0; i <= n; i++) {
            T[i][0] = true;
        }

        // do for ith item
        for (int i = 1; i <= n; i++)
        {
            // consider all sum from 1 to sum
            for (int j = 1; j <= sum; j++)
            {
                // don't include ith element if j-A[i-1] is negative
                if (A[i - 1] > j) {
                    T[i][j] = T[i - 1][j];
                }
                else {
                    // find subset with sum j by excluding or including
                    // the ith item
                    T[i][j] = T[i - 1][j] || T[i - 1][j - A[i - 1]];
                }
            }
        }

        // return maximum value
        return T[n][sum];
    }

    public static void main(String[] args) throws IOException 
    {

        Scanner sc=new Scanner(System.in);
        int x=readInt();
        int[] S=new int[x]
           ;
        for(int i=0;i<x;i++) {
          S[i]=readInt();
          
        }
        int sum=0;
        for(int i=0;i<x;i++) {
          sum+=S[i];
        }
        subsetSum(S,sum);
     for(int k=sum/2;k>=0;k--) {
       if(T[x][k]==true) {
System.out.println(k);
}
     }
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


