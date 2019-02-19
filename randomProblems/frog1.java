  package randomProblems;
  
  import java.io.BufferedReader;
  import java.io.IOException;
  import java.io.InputStreamReader;
  import java.util.Arrays;
  import java.util.StringTokenizer;
  
  public class frog1 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[]args) throws IOException {
        int x=readInt();
        int[] arr=new int[x+1];
        for(int i=1;i<=x;i++) {
          arr[i]=readInt();
        }
        int[] d=new int[x+1];
        Arrays.fill(d, 999999999);
        d[1]=0;
        
        for(int i=1;i<=x;i++) {
          if(i<x) {
          d[i+1]=Math.min(d[i+1], d[i]+Math.abs(arr[i]-arr[i+1]));}
          if(i<x-1) {
          d[i+2]=Math.min(d[i+2], d[i]+Math.abs(arr[i]-arr[i+2]));}

        }
  
        System.out.println(d[x]);
            
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
