  package mockCCC19;
  
  import java.io.BufferedReader;
  import java.io.BufferedWriter;
  import java.io.DataInputStream;
  import java.io.IOException;
  import java.io.InputStreamReader;
  import java.io.OutputStreamWriter;
  import java.io.PrintWriter;
  import java.util.Arrays;
  import java.util.*;
  
  public class p52 {
    static long[][] fish;
    static int arr[];
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    final private static int BufferS = 1 << 16;
    private static DataInputStream din = new DataInputStream(System.in);
    private static byte[] buffer = new byte[BufferS];
    private static int bufferPointer = 0, bytesRead = 0;
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static int count=0; 
    public static void main(String[]args) throws IOException {
      int x=readInt();
      int y=readInt();
       arr=new int[x+1];
      int max=-1;
      for(int i=1;i<=x;i++) {
        int a=readInt();
        if(a>max) {
          max=a;
        }
        arr[a]++;
        
      }
      fish=new long[max+1][y+1];
   
      
      fish[0][0]=1;
     
     pr.println(f(max,y));
     pr.close();
      
    }
    public static long f(int i, int k){
      if(fish[i][k]>0) return fish[i][k];
      if(k==1){ 
          int sum = 0;
          for(int d=i; d>=0; d--) sum += arr[d]; 
          fish[i][k]=sum;
          return sum;
      }
      if(i==0 || k==0) return 0;
      if( i < k ) return 0;
      if( i==1 && k==1 ) {  fish[i][k]=arr[i]; return arr[i];}
      //System.out.println(i + " and " + k);
      fish[i][k]=(arr[i] * f(i-1 , k-1)%998244353 + f(i-1, k)%998244353 )%998244353;
      return fish[i][k];
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
