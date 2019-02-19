package twentyonine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class S4ShopAndShip {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringTokenizer st;
  public static class Pair implements Comparable<Pair>{
    int node;
    long du;
    public Pair(int x, long du) {
      this.node=x;
      this.du=du;
}
    public int compareTo(Pair other) {
      if(du>=other.du) {
        return 1;}
      else {
        return -1;
      }
    }
   
   
  } 

 // static ArrayList<Pair>[] graph;
    static int[][] grid;
     static int[] du;
   static boolean[] visited;
   static int[] dist;
   static int minDistance(long dist[], boolean[] visited2,int n) 
   { 
       // Initialize min value 
       long min = Long.MAX_VALUE;
           int min_index=-1; 
 
       for (int v = 0; v < n; v++) 
           if (visited2[v] == false && dist[v] <= min) 
           { 
               min = dist[v]; 
               min_index = v; 
           } 
 
       return min_index; 
   } 
   public static void Djikstras(int d, int n) {
  
     int cur = 0;
     int s = 0;
     int count = 0;
     du = new int[n+1];
     for (int i = 0; i < du.length; i++) {
         du[i] = Integer.MAX_VALUE;
     }
     du[d] = 0;
     while (count < n) {
         s = Integer.MAX_VALUE;
         cur = 1;
         for (int i = 1; i <= n; i++) {
             if (!visited[i] && du[i] < s) {
                 s = du[i];
                 cur = i;
             }
         }
         visited[cur] = true;
         count++;
         for (int i = 1; i <= n; i++) {
             if (grid[cur][i]!=0 && !visited[i]) {
                 if (du[i] > du[cur] + grid[cur][i]) {
                     du[i] = (int) (du[cur] + grid[cur][i]);
                 }
             }
         }
     }
 }
   
  public static void main(String[]args) throws IOException {
     
     int n=readInt();
     int m=readInt();
    // int source=sc.nextInt();
    // int dest=sc.nextInt();
     du=new int[n+1];
     visited=new boolean[n+1];
    // graph=new ArrayList[n+1];
grid=new int[n+1][n+1];
    
       for (int k = 0; k < m; k++) {
        int x=readInt();
        int y=readInt();
        int w=readInt();
         grid[x][y]=w;
         grid[y][x]=w;
     
     }
     int q=readInt();
     dist=new int[q];
     Arrays.fill(dist,-1);
     int[] mark=new int[q];
     for(int i=0;i<q;i++) {
       mark[i]=readInt(); 
       dist[i]=readInt();
      
     }
     int des=readInt();
     Djikstras(des,n);
     long min=Long.MAX_VALUE;
    for(int a=0;a<q;a++) {
      if(du[mark[a]]+dist[a]<min) {
        min=du[mark[a]]+dist[a];
      }
     //the distance from source to node a;
     } System.out.print(min); 
    
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
