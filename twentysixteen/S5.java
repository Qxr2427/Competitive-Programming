package twentysixteen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S5 {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringTokenizer st;
  static int x;
  static long T;
  static char[] S;
  static int[] o, p;

  static void step(int k) {
      int pos=(int) (((long)1<<k)%x);
      int pos2=(x-pos)%x;
      for(int i=0;i<=x;i++) {
        p[i]=o[(i+pos)%x]^o[(i+pos2)%x];
      }
      for(int i=0;i<=x;i++) {

          o[i] = p[i];}
      
  }

  public static void main(String[]args) throws IOException {
 x=readInt();
 T=readLong();
String a=next();
o=new int[100001];
p=new int[100001];
S=new char[100001];
for(int i=0;i<x;i++) {
  S[i]=a.charAt(i);
}
for(int i=0;i<=x;i++) {
o[i]=S[i]-'0';
}
      for(int i=60; i>=0; i--) {
          if(((T>>i)&1)==1) {
              step(i);}
      }
      for(int i=0;i<x;i++) {
         System.out.print(o[i]);
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
