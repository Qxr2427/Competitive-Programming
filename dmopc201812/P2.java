package dmopc201812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P2
{static StringTokenizer st;
static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
static Map<String, Integer> z = new HashMap<>();
    public static int solve(int[] S, int n, int S1, int S2)
    {
        
        if (n < 0) {
            return Math.abs(S1 - S2);
        }
        String y =n+"#"+S1;
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


    public static void main(String[] args) throws IOException 
    {

        Scanner sc=new Scanner(System.in);
        int x=readInt();
        int[] S=new int[x]
           ;
        for(int i=0;i<x;i++) {
          S[i]=readInt();
          
        }

        System.out.println
               (solve(S, S.length - 1, 0, 0));
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


