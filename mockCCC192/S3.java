package mockCCC192;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.*;
import java.util.StringTokenizer;

public class S3 {

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringTokenizer st;
  final private static int BufferS = 1 << 16;
  private static DataInputStream din = new DataInputStream(System.in);
  private static byte[] buffer = new byte[BufferS];
  private static int bufferPointer = 0, bytesRead = 0;
  static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
  public static long GCD(long a, long b) { return b==0 ? a : GCD(b, a%b); }
  public static void main(String[]args) throws IOException {
    int n=readInt();
    long[] x=new long[n];
   long[] y=new long[n];
    for(int i=0;i<n;i++) {
      x[i]=readLong();
      y[i]=readLong();
    }
    int a=1; 
    if(n==4) {
      a=4;
    }
    else {
       for(int i=n;i>=n-2;i--) { //combination, nC3, including impossible triangles (e.g. 3 points on the same line)
      a*=i; 
    }
    a=a/6;
    }
   
   HashMap<String,HashSet<String>> mem=new HashMap<>(); 
   HashMap<Long,HashSet<String>> ver=new HashMap<>();
    for(int i=0;i<n;i++) {  

      for(int j=i+1;j<n;j++) {
             

        if(x[j]-x[i]!=0) {
        long dx=(x[j]-x[i]);
        long dy=(y[j]-y[i]);
        long gcd=GCD(Math.abs(dx),Math.abs(dy));
        dx=dx/gcd;
        dy=dy/gcd;
        double bv=(y[j]-dy/dx*x[j]);
        String s= dy+"/"+dx+"#"+bv;  // equation in the form of y=ratio*x+bv ;

        if(!mem.containsKey(s)){
          mem.put(s,new HashSet<String>());                  
          String d=x[i]+"#"+y[i];
          mem.get(s).add(d);
          d=x[j]+"#"+y[j];
          mem.get(s).add(d);//if hashmap does not contain such equation, add both points in
        }
        else {
          mem.get(s).add(x[j]+"#"+y[j]);//if it does, add the point in
        }
        }
        else {  
          if(!ver.containsKey(x[j])) { //same case handling for vertical line 
            ver.put(x[j], new HashSet<String>());
            ver.get(x[j]).add(x[i]+"#"+y[i]);
            ver.get(x[j]).add(x[j]+"#"+y[j]);
          }
          else {
            ver.get(x[j]).add(x[j]+"#"+y[j]);
          }
        }
        
        }
      }
    int count=0; //count how many impossible triangles
    for (Map.Entry<String, HashSet<String>> entry : mem.entrySet()) {
      int b=1;
      if(entry.getValue().size()>=3) { //if more than 3 points on the same line, do SizeC3
        for(int q=entry.getValue().size();q>=entry.getValue().size()-2;q--) {
          b*=q;
        }
        b/=6;//combination  
        count+=b;//add it to count
      }
    }
    for (Map.Entry<Long, HashSet<String>> entry : ver.entrySet()) { //same thing for vertical line case
      int b=1;
      if(entry.getValue().size()>=3) {
        for(int q=entry.getValue().size();q>=entry.getValue().size()-2;q--) {
          b*=q;
        }
        b/=6;   
        count+=b;
         }

      }
    if(a-count>0) {
      System.out.println(a-count);
      //output
    }
    else {
      System.out.println(0);
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
