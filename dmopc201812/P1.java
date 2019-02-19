package dmopc201812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.StringTokenizer;

public class P1 {
  static StringTokenizer st;
  static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  public static void main(String[]args) throws IOException {

int x=readInt();
    double[] xs=new double[x];
    double X=readDouble();
    double sum2=0;
    for(int i=0;i<x;i++) {
      
      int q=readInt();
      double[] a=new double[q];
      double ax=X;
      for(int j=0;j<q;j++) {
        
        
      a[j]=readDouble();
      ax=ax+a[j];
      
      }
      sum2+=ax;
      
      
      
    }
    
  
    System.out.println(sum2/x);
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
