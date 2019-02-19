package randomProblems;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class saveNagato {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringTokenizer st;
  static ArrayList<Integer>[] graph;
  static boolean[] visited;
   int[] dist;
  static int d,key;
  int[] dist2;
  public static void main(String[]args) throws IOException {
    int n=readInt();
    int[] dist;
    int[] dist2;
    dist=new int[n+1];
    dist2=new int[n+1];          graph=new ArrayList[n+1];

    for (int i = 0; i < graph.length; i++) {
      graph[i] = new ArrayList<Integer>();
  }
  for (int k = 0; k < n-1; k++) {
    int x=readInt();
      int y=readInt();
      graph[(int) x].add(y);
      graph[(int) y].add(x);
  }
  visited=new boolean[n+1];

  bfs(1,dist);
  visited=new boolean[n+1];
  int p1 = key; bfs(p1,dist);
  visited=new boolean[n+1];

  int p2 =key; bfs(p2,dist2);

  for(int i = 1; i <= n; i++)
      System.out.println(Math.max(dist[i], dist2[i]) + 1);
  }
  public static void bfs(int s,int[] dist) {
    Queue<Integer> qu= new LinkedList<>();
    qu.add(s);
    visited[s]=true;
    int level=0;
    dist[s]=0;
    d=0;
    while(!qu.isEmpty()) {
      int size=qu.size();
      level++;
      for(int k=0;k<size;k++) {
        int cur=qu.poll();
        if(dist[cur]>d) {
            d=dist[cur];
            key=cur;
        }
        ArrayList<Integer> temp=graph[cur];
        if(temp==null)
       continue;
        for(int v:temp) {
          if(!visited[v]) {
            visited[v]=true;
            dist[v]=dist[cur]+1;
            qu.add(v);
          }
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
