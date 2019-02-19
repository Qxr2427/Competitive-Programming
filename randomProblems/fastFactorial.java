package randomProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class fastFactorial {

  static BufferedReader br;
  static StringTokenizer st;

  public static void main (String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
  
    int x = readInt();
    for (int j = 1; j <= x; j++) {
      String a = next();
      if (a.length() > 2) {
       System.out.println(0);
       }
      else {
        long n = Long.parseLong(a);
        long sum = 1;
        for (int i = 1; i <= n; i++) {
          sum = (sum*i)%(1l<<32);
          }
        System.out.println(sum);
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

  static char readCharacter () throws IOException {
    return next().charAt(0);
  }

  static String readLine () throws IOException {
    return br.readLine().trim();
  }
}