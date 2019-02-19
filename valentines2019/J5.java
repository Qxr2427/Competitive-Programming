package valentines2019;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.*;

public class J5 {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringTokenizer st;
  final private static int BufferS = 1 << 16;
  private static DataInputStream din = new DataInputStream(System.in);
  private static byte[] buffer = new byte[BufferS];
  private static int bufferPointer = 0, bytesRead = 0;
  static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
  public static void main(String[]args) throws IOException {
     long a=readLong();
     HashMap<Long, Long> slope=new HashMap<>();
     HashMap<String,Long> ma=new HashMap<>();
     long count=0;
     long count2=0;
     long com=0;
     if(a==2) {
       com=1;
     }
     if(a==3) {
       com=3;
     }
     else {
      com=a*(a-1)/2;
     }
     for(int i=0;i<a;i++) {
       long x=readLong();
       long y=readLong();
       String s=x+"#"+y;
       if(!ma.containsKey(s)) {
          ma.put(s, 1L);
       }
       else {
         ma.put(s, ma.get(s)+1);
     //    e=true;
       }
      //if(!e) {
       if(!slope.containsKey(x)) {
         slope.put(x, 1L);
         
       }
       else {
         slope.put(x, slope.get(x)+1);
       }
 //    }
    }
     for (Map.Entry<Long, Long> entry : slope.entrySet()) {
       if(entry.getValue()==2) {
         count2=count2+1;
         
} 
       else if(entry.getValue()==3) {
         count2+=3;
       }
       else {
         count2+=(entry.getValue()*(entry.getValue()-1)/2);
       }
       }
     for (Map.Entry<String, Long> entry : ma.entrySet()) {
       if(entry.getValue()==2) {
         count=count+1;
         
} 
       else if(entry.getValue()==3) {
         count+=3;
       }
       else {
         count+=(entry.getValue()*(entry.getValue()-1)/2);
       }
       }
       
     long s=com-count2+count;
     if(s==4294967298L) {
       System.out.println(a+" "+com+" "+count2+" "+count);
     }
     System.out.println(s);
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
