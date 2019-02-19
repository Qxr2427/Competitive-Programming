package twentyseven;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class another {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringTokenizer st;
  final private static int BufferS = 1 << 16;
  private static DataInputStream din = new DataInputStream(System.in);
  private static byte[] buffer = new byte[BufferS];
  private static int bufferPointer = 0, bytesRead = 0;
  static int[] pins;
  static int sum[];
  static int dp[][];
  static int n,k,w;
  static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
  public static void main(String[]args) throws IOException {
    int x=readInt();
    for(int j=0;j<x;j++) {
      n=readInt();
      k=readInt();
      w=readInt();
      dp = new int[501][10101];
      sum = new int[10101];
      pins = new int[10101];
      for (int i=1;i<=n;i++)
        pins[i] = readInt();
      for (int i=1;i<=n+w;i++) {
        sum[i]=pins[i]+sum[i-1];
      }
      for(int a=0;a<k+1;a++) {
        Arrays.fill(dp[a], -1);
      }
      int a=solve(k,n+w);
      System.out.println(a);
    }

  }    
  //static int Math.max(int l, int b) { return  ((l > b)? l : b); } 

  public static int solve(int k, int s) {
    if(k<=0||s<0) {
      return 0;
    }
    if(dp[k][s]!=-1) {
      return dp[k][s];
    }
    int pos=Math.max(0,s-w);
    int score=sum[s]-sum[pos];
    int end=Math.max(solve(k,s-1), solve(k-1,pos)+score);
    if(k>1) {
      int sum=0;
      for(int i=pos;(i>pos-w+1&&i>0);i--) {
        sum=sum+pins[i];
        end=Math.max(end,solve(k-2,i-1)+score+sum);
      }
    }dp[k][s]=end;
    return dp[k][s];
  }
/*  static String next () throws IOException {
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
}*/


  static String next() throws IOException {
      while (st == null || !st.hasMoreTokens())
          st = new StringTokenizer(br.readLine().trim());
      return st.nextToken();
  }

  public static String readLine() throws IOException {
      byte[] buf = new byte[64];
      int cnt = 0, c;
      while ((c = Read()) != -1) {
          if (c == '\n')
              break;
          buf[cnt++] = (byte) c;
      }
      return new String(buf, 0, cnt);
  }

  public static String read() throws IOException {
      byte[] ret = new byte[1024];
      int idx = 0;
      byte c = Read();
      while (c <= ' ') {
          c = Read();
      }
      do {
          ret[idx++] = c;
          c = Read();
      }
      while (c != -1 && c != ' ' && c != '\n' && c != '\r');
      return new String(ret, 0, idx);
  }

  public static int readInt() throws IOException {
      int ret = 0;
      byte c = Read();
      while (c <= ' ')
          c = Read();
      boolean neg = (c == '-');
      if (neg)
          c = Read();
      do {
          ret = ret * 10 + c - '0';
      }
      while ((c = Read()) >= '0' && c <= '9');

      if (neg)
          return -ret;
      return ret;
  }

  public static long readLong() throws IOException {
      long ret = 0;
      byte c = Read();
      while (c <= ' ')
          c = Read();
      boolean neg = (c == '-');
      if (neg)
          c = Read();
      do {
          ret = ret * 10 + c - '0';
      }
      while ((c = Read()) >= '0' && c <= '9');
      if (neg)
          return -ret;
      return ret;
  }

  public static double readDouble() throws IOException {
      double ret = 0, div = 1;
      byte c = Read();
      while (c <= ' ')
          c = Read();
      boolean neg = (c == '-');
      if (neg)
          c = Read();

      do {
          ret = ret * 10 + c - '0';
      }
      while ((c = Read()) >= '0' && c <= '9');

      if (c == '.') {
          while ((c = Read()) >= '0' && c <= '9') {
              ret += (c - '0') / (div *= 10);
          }
      }

      if (neg)
          return -ret;
      return ret;
  }

  static char readChar() throws IOException {
      return next().charAt(0);
  }

  static float readFloat() throws IOException {
      return Float.parseFloat(next());
  }



  static short readShort() throws IOException {
      return Short.parseShort(next());
  }

  static byte readByte() throws IOException {
      return Byte.parseByte(next());
  }

  private static void fillBuffer() throws IOException {
      bytesRead = din.read(buffer, bufferPointer = 0, BufferS);
      if (bytesRead == -1)
          buffer[0] = -1;
  }

  private static byte Read() throws IOException {
      if (bufferPointer == bytesRead)
          fillBuffer();
      return buffer[bufferPointer++];
  }

  public void close() throws IOException {
      if (din == null)
          return;
      din.close();
  }

  static void print(Object o) {
      pr.print(o);
  }

  static void println(Object o) {
      pr.println(o);
  }

  static void flush() {
      pr.flush();
  }

  static void println() {
      pr.println();
  }

  static void exit() throws IOException {
      din.close();
      pr.close();
      System.exit(0);
  }
}
