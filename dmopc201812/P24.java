package dmopc201812;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P24
{static StringTokenizer st;
static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
static boolean[] T;
   
    public static int subsetSum(int[] A, int sum)
    {
        int n = A.length;

        T =new boolean[sum+1];
      
        T[0]=true;
 
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= sum;j++)
            {   
               if(A[i-1]<=j) {
                  T[j]|=T[j-A[i-1]];
                  
}
            }
        }
        int diff = Integer.MAX_VALUE; 
        
       
        for (int j = sum / 2; j >= 0; j--) 
        { 
            if (T[j]) 
            { 
                diff = sum - 2 * j; 
                break; 
            } 
        } 
        return diff; 
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
        System.out.println(subsetSum(S,sum));
 
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


