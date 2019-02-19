  package LKPContestp2;
  
  import java.io.BufferedReader;
  import java.io.IOException;
  import java.io.InputStreamReader;
  import java.util.StringTokenizer;
  
  public class p2 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[]args) throws IOException {
      int x=readInt();
      int y=readInt();
      int[] arr=new int[x];
      
      for(int i=0;i<x;i++) {
        arr[i]=readInt();
      }
      int count=0;
      int[] sum=new int[x];
      sum[0]=arr[0];
      if(sum[0]%y==0) {
        count++;
      }
      for(int j=1;j<x;j++) {
        sum[j]=sum[j-1]+arr[j];
        if(sum[j]%y==0) {
          count++;
        }
  }
      for(int j=x-1;j>=0;j--) {
      for(int i=0;i<=j;i++) {
        
        if(sum[j]-sum[i]!=0&&(sum[j]-sum[i])%y==0) {
          count++;
        }
      }
      }
      System.out.println(count);
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
