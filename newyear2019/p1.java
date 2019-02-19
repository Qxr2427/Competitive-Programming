package newyear2019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p1 {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringTokenizer st;
  public static void main(String[]args) throws IOException {
    int x2=readInt();
    int x1=readInt();
    int y2=readInt();
    int y1=readInt();
    if(x1*(y2-1)>(x2-1)*y1) {
      System.out.println(2);

    }
    else if(x1*(y2-1)<(x2-1)*y1) {
      System.out.println(1);

    }
    else {
      System.out.println(-1);
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
