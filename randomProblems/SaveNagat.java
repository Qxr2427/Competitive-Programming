package randomProblems;

import java.util.*;
import java.io.*;

public class SaveNagat {

    final private static int BufferS = 1 << 16;
    private static DataInputStream din = new DataInputStream(System.in);
    private static byte[] buffer = new byte[BufferS];
    private static int bufferPointer = 0, bytesRead = 0;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer str;
    static PrintWriter pr = new PrintWriter(new OutputStreamWriter(System.out));

    static int length;
    static int farnode;
    static int ans;
    static int N;
    static ArrayList<Integer> adj[];
    
    public static void main(String[] args) throws IOException{
        N = readInt();
        adj = new ArrayList[N+1];
        for(int i = 1; i <= N; i++)
            adj[i] = new ArrayList<Integer>();
        for(int i = 1; i < N; i++) {
            int u = readInt();
            int v = readInt();
            adj[u].add(v);
            adj[v].add(u);
        }
        int [] dist1 = new int[N+1];
        int [] dist2 = new int[N+1];
        
        bfs(1, dist1);
        
        int p1 = farnode;
        bfs(p1, dist1);
        
        int p2 = farnode;
        bfs(p2, dist2);
        
        for(int i = 1; i <= N; i++)
          pr.println(Math.max(dist1[i], dist2[i]) + 1);
        
        pr.close();
        
    }
    
    public static void bfs(int st, int[] dist) {
        boolean[] vist = new boolean[N+1];
        Queue<Integer> Q = new LinkedList<Integer>();
        Q.add(st);
        vist[st] = true;
        dist[st] = 0;
        length = 0;
        while(!Q.isEmpty()) {
            int u = Q.poll();
            if(dist[u] > length) {
                length = dist[u];
                farnode = u;
            }
            for(int v: adj[u]) {
                if(!vist[v]) {
                    Q.add(v);
                    vist[v]= true;
                    dist[v]= dist[u] + 1; 
                }
            }
        }
    }

    static String next() throws IOException {
      while (str == null || !str.hasMoreTokens())
          str = new StringTokenizer(br.readLine().trim());
      return str.nextToken();
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