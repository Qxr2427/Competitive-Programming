package twentysixteen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S5CircleOfLife {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringTokenizer st;
  static int x;
  static int[] p=new int[100001]; 
  static int[] o=new int[100001];
  static char[] s=new char[100001];
  
  public static void main(String[]args) throws IOException {
     x=readInt();
    long y=readLong();
    String q=next();
    for(int i=0;i<q.length();i++) {
      s[i]=q.charAt(i);
    }
    for(int i=0;i<x;i++) {
      p[i]=s[i]-'0';
    }
    for(int i=60;i>=0;i--) {
      if(((y>>i)&1)==1) {
        pos(i);
      }
      
    }
    for(int i=0;i<x;i++) {
      System.out.print(p[i]);
      

}
  }
  static void pos(int a) {
    int position=(1<<a)%x;
    int positions=(x-position)%x;
    for(int i=0;i<x;i++) {
     // o[i]=(p[ (i+position)%x]^p[(i+positions)%x])%x;
      o[i]=(p[ (i+position)]^p[(i+positions)])%x;

    }
    for(int i=0;i<x;i++) {
      p[i]=o[i];
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
