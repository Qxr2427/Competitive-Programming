package twentyonine;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.*;

public class S2LightsTurningOnAndOff {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringTokenizer st;
  final private static int BufferS = 1 << 16;
  private static DataInputStream din = new DataInputStream(System.in);
  private static byte[] buffer = new byte[BufferS];
  private static int bufferPointer = 0, bytesRead = 0;
  static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
  static char[][] light;
  public static void main(String[]args) throws IOException {
    int x=readInt();
    int y=readInt();
String[] light=new String[x];
LinkedHashSet<String> pos = new LinkedHashSet<String>();

    for(int i=0;i<x;i++) {
        light[i]=readLine().replaceAll(" ", "");
        }
    pos.add(light[0]);
    for(int i=1;i<x;i++) {
      LinkedHashSet<String> poss = new LinkedHashSet<String>();
      for(String a:pos) {
       poss.add(solve(light[i],a));
      }
      poss.add(light[i]);
      pos=new LinkedHashSet<String>(poss);
      }
    System.out.println(pos.size());
    }
  
  static String solve(String a, String b) {
    String s="";
    for(int i=0;i<a.length();i++) {
      if(a.charAt(i)==b.charAt(i)) {
        s+="0";
      }
      else {
        s+="1";
      }
}
    return s;
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
