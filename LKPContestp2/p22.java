package LKPContestp2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class p22 {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringTokenizer st;
  public static void main(String[]args) throws IOException {
    int x=readInt();
    int y=readInt();
    int[] arr=new int[x];
    
    for(int i=0;i<x;i++) {
      arr[i]=readInt();
    }
    System.out.println(subCount(arr,x,y));
  }
  public static int subCount(int arr[], int n, int k)  { 
      long mod[] = new long[k]; 
      Arrays.fill(mod, 0); 
      long idk = 0; 
      for (int i=0; i<n;i++) { 
          idk += arr[i]; 

          mod[(int) (((idk % k) + k) % k)]++; 
      } 
      int result=0; 

      for (int i=0;i<k;i++)     

          if (mod[i] > 1) 
              result += (mod[i]*(mod[i]-1))/2; 

      result+=mod[0]; 

      return result; 
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
