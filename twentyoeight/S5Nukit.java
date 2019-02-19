  package twentyoeight;
  
  import java.io.BufferedReader;
  import java.io.BufferedWriter;
  import java.io.DataInputStream;
  import java.io.IOException;
  import java.io.InputStreamReader;
  import java.io.OutputStreamWriter;
  import java.io.PrintWriter;
  import java.util.StringTokenizer;
  
  public class S5Nukit {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    final private static int BufferS = 1 << 16;
    private static DataInputStream din = new DataInputStream(System.in);
    private static byte[] buffer = new byte[BufferS];
    private static int bufferPointer = 0, bytesRead = 0;
    static int a,b,c,d;
    static int[][][][][] mem=new int[31][31][31][31][3];
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    public static void main(String[]args) throws IOException {
      int x=readInt();
      for(int i=0;i<x;i++) {
       
           a=readInt();
           b=readInt();
           c=readInt();
           d=readInt();
        
          if(rec1(a,b,c,d,1)) {
          System.out.println("Patrick");
          }
          else {
            System.out.println("Roland");
          }
  
      }
    }
    public static boolean AABDD(int[] arr) {
      if(arr[0]>=2&&arr[1]>=1&&arr[3]>=2) {
        return true;    }
      else {     return false;}
   }
    public static boolean ABCD(int[] arr) {
      if(arr[0]>=1&&arr[1]>=1&&arr[3]>=1&&arr[2]>=1) {
        return true;    }
      else {     return false;}
   }
    public static boolean CCD(int[] arr) {
      if(arr[2]>=2&&arr[3]>=1) {
        return true;    }
      else {     return false;}
   }
    public static boolean BBB(int[] arr) {
      if(arr[1]>=3) {
        return true;    }
      else {     return false;}
   }
    public static boolean AD(int[] arr) {
      if(arr[0]>=1&&arr[3]>=1) {
        return true;    }
      else {     return false;}
   }
    static boolean rec1(int a, int b, int c, int d, int i) {
      
      if( mem[a][b][c][d][i]!=0) return mem[a][b][c][d][i]==1;
  
      if (i == 1) {
        int[] arr=new int[4];
        arr[0]=a;
        arr[1]=b;
        arr[2]=c;
        arr[3]=d;
          if (AABDD(arr)) {
  
              if (!rec1(a - 2, b - 1, c, d - 2, 2)){ 
                                      mem[a][b][c][d][i]=1;
                  return true;}
  
          }
          if (ABCD(arr)) {
              if (!rec1(a - 1, b - 1, c - 1, d - 1, 2)){ 
                                      mem[a][b][c][d][i]=1;
                  return true;}
          }
          if (CCD(arr)) {
              if (!rec1(a, b, c - 2, d - 1, 2)){ 
                                      mem[a][b][c][d][i]=1;
                  return true;}
          }
          if (BBB(arr)) {
              if (!rec1(a, b - 3, c, d, 2)){ mem[a][b][c][d][i]=1;
                  return true; }
          }
          if (AD(arr)) {
              if (!rec1(a - 1, b, c, d - 1, 2)){ mem[a][b][c][d][i]=1;
                  return true;}
          }
          mem[a][b][c][d][i]=-1;
          return false;
      } else {
        int[] arr=new int[4];
        arr[0]=a;
        arr[1]=b;
        arr[2]=c;
        arr[3]=d;
        if (AABDD(arr)) {
  
              if (!rec1(a - 2, b - 1, c, d - 2, 1)){ mem[a][b][c][d][i]=1;
                  return true;}
          }
        if (ABCD(arr)) {
              if (!rec1(a - 1, b - 1, c - 1, d - 1, 1)){ mem[a][b][c][d][i]=1;
                  return true;}
          }
        if (CCD(arr)) {
              if (!rec1(a, b, c - 2, d - 1, 1)){ mem[a][b][c][d][i]=1;
                  return true;}
          }
        if (BBB(arr)) {
              if (!rec1(a, b - 3, c, d, 1)){ mem[a][b][c][d][i]=1;
                  return true;}
              
          }
        if (AD(arr)) {
              if (!rec1(a - 1, b, c, d - 1, 1)){ mem[a][b][c][d][i]=1;
                  return true;}
              
          }
          mem[a][b][c][d][i]=-1;
          return false;
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
  static String readLine () throws IOException {
      return br.readLine().trim();
  }
  }
