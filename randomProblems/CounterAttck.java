package randomProblems;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class CounterAttck {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringTokenizer st;
  static ArrayList<Pair>[] graph;
  static int fir, sec;
  static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

  public static class Pair implements Comparable<Pair>{
    int node;
    long du;
    public Pair(int node, long du) {
      this.node=node;
      this.du=du;
}
    public int compareTo(Pair other) {
      return Long.compare(du, other.du);

    }
   
   
  } 
  public static void main(String[]args) throws IOException {
     int n=readInt();
     int m=readInt();
     graph=new ArrayList[n+1];du=new long[n+1][2];
     for(int i = 0; i <= n; i++) Arrays.fill(du[i], Long.MAX_VALUE);

     for (int i = 0; i < graph.length; i++) {
       graph[i] = new ArrayList<Pair>();
   }
   for (int k = 0; k < m; k++) {
     int x=readInt();
       int y=readInt();
       int w=readInt();
       graph[ x].add(new Pair(y,w));
   }


   runDij(1,n,n);
   if(du[n][1]<Long.MAX_VALUE) {
     pw.println(du[n][1]);
   }
   else {
     System.out.println(-1);
   }
     pw.close();
  
  }
  
  static long[][] du;
  static boolean[] visited;
  public static void runDij(int s,int n, int des) {

    
     PriorityQueue<Pair> qu=new PriorityQueue<>();
     qu.add(new Pair(s,0));
    // int count=0;
     //while(count<n) {
 
     while(!qu.isEmpty()) {
       Pair cur= qu.poll();

       int v=cur.node;
       long dv=cur.du;
     //  if(v==des) break;
     //  if(visited[v]) continue;        
       
       //count++;
       ArrayList<Pair> temp=graph[v];

       for(Pair t: temp) {
        /* if(!visited[t.node]) {
         int newdu=dv+t.du;
         qu.add(new Pair(t.node,newdu));
         }*/
         if(du[t.node][0]>dv+t.du) {
           du[t.node][1]=du[t.node][0];
           du[t.node][0]=dv+t.du;
           qu.add(new Pair(t.node,du[t.node][0]));
         }
         else if(du[t.node][1]>dv+t.du&&dv+t.du!=du[t.node][0]) {
           du[t.node][1]=dv+t.du;
           qu.add(new Pair(t.node,du[t.node][1]));
         }
       }
     }
   }

  final private static int BufferS = 1 << 16;
  private static DataInputStream din = new DataInputStream(System.in);
  private static byte[] buffer = new byte[BufferS];
  private static int bufferPointer = 0, bytesRead = 0;
  static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

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
