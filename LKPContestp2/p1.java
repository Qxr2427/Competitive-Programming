package LKPContestp2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p1 {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringTokenizer st;
  public static void main(String[]args) throws IOException {
    int x=readInt();
    int y=readInt();
    int[] arr=new int[x];
    for(int i=0;i<x;i++) {
      arr[i]=readInt();
      
    }
    Arrays.sort(arr);
   
      for(int i=0;i<y;i++) {
        System.out.println(arr[0]);
        arr[0]++;
        Arrays.sort(arr);
        
      
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
