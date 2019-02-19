package valentines2019;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.*;

public class J4 {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringTokenizer st;
  final private static int BufferS = 1 << 16;
  private static DataInputStream din = new DataInputStream(System.in);
  private static byte[] buffer = new byte[BufferS];
  private static int bufferPointer = 0, bytesRead = 0;
  static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
  public static void main(String[]args) throws IOException {
    int x=readInt();
    int y=readInt();
    int[] beauty=new int[x];
    int[] bouquet=new int[x];
    boolean[][] duplicate=new boolean[x][x];
    for(int i=0;i<x;i++) {
    
        bouquet[i]=readInt();
        beauty[i]=readInt();
     
    }
    long max=0;
    for(int i=0;i<y;i++) {
     int a=readInt();
     int b=readInt();
     duplicate[a-1][b-1]=true;
     duplicate[b-1][a-1]=true;
    }
    if(x==1) {
      System.out.println(beauty[0]);
    }
    else if(x==2) {
      if(y==0) {
      System.out.println(Math.max(beauty[0]*bouquet[1]+beauty[1], beauty[1]*bouquet[0]+beauty[0]));
      }
      else {
        System.out.println(0);
      }
    
     
    }
    else {
      for(int i=0;i<x;i++) {
        if(beauty[i]>max) {
          max=beauty[i];
        }
      }
      for(int j=0;j<x;j++) {
        for(int h=0;h<x;h++) {            
          if(h==j) {
            continue;
          }
        if(duplicate[j][h]||duplicate[h][j]) continue;          
           max=Math.max(beauty[j]*bouquet[h]+beauty[h],max);
           max=Math.max(beauty[h]*bouquet[j]+beauty[j], max);

          }
          
        }
      for(int j=0;j<x;j++) {
        for(int h=j+1;h<x;h++) {            
        if(duplicate[j][h]||duplicate[h][j]) continue;          
        int ma=-1;

            for(int i=0;i<x;i++) {
              
              if(beauty[i]>ma&&i!=j&&i!=h&&(!duplicate[j][i]&&!duplicate[h][i]&&!duplicate[i][h]&&!duplicate[i][j])) {
                ma=beauty[i];
                
              }
            }
           max=Math.max(ma*bouquet[j]*bouquet[h]+beauty[j]*bouquet[h]+beauty[h],max);
           max=Math.max( ma*bouquet[j]*bouquet[h]+beauty[h]*bouquet[j]+beauty[j], max);

          }
          
        }
      System.out.println(max);
    }
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
