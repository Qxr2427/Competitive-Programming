package randomProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ExamDelay {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringTokenizer st;
  public static class Pair implements Comparable<Pair>{
    int node;
    double du;
    public Pair(int node, double du) {
      this.node=node;
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

   static ArrayList<Pair>[] graph;
    static int[] pa;
     static double[] du;
   static boolean[] visited;
   static int min=Integer.MAX_VALUE;

   public static void runDij(int s,int n, int des) {
      Arrays.fill(du, (1<<31)-1);
      Arrays.fill(edge, 0);
      du[s]=0;
      edge[s]=0;
      int alt=0;
      PriorityQueue<Pair> qu=new PriorityQueue<>();
      qu.add(new Pair(s,du[s]));
     // int count=0;
      //while(count<n) {
      while(!qu.isEmpty()) {
        Pair cur= qu.poll();
        int v=cur.node;
        if(v==des) break;
        if(visited[v]) continue;        
        visited[v]=true;

        //count++;
        ArrayList<Pair> temp=graph[v];
        if(temp==null) continue;
        for(Pair t: temp) {
         /* if(!visited[t.node]) {
          int newdu=dv+t.du;
          qu.add(new Pair(t.node,newdu));
          }*/
          alt=edge[v]+1;
          if(!visited[t.node]&&du[t.node]>=du[v]+t.du) {
            if(alt<edge [v]&&du[t.node]==du[v]+t.du) {
              edge[t.node]=alt;
              pa[v]=t.node;
              } 
            else {
            du[t.node]=du[v]+t.du;
            edge[t.node]=alt;
            }
            qu.add(new Pair(t.node,du[t.node]));
          }
        
        }
      }
    }
   @SuppressWarnings("unchecked")
   static int[] edge;
  public static void main(String[]args) throws IOException {
     int n=readInt();
     int m=readInt();
    // int source=sc.nextInt();
    // int dest=sc.nextInt();
     du=new double[n+1];
     visited=new boolean[n+1];
     graph=new ArrayList[n+1];
     edge=new int[n+1];     
     pa=new int[n+1];
     for (int i = 0; i < graph.length; i++) {
       graph[i] = new ArrayList<Pair>();
   }
     for(int k=0;k<m;k++) {
       int x=readInt();
       int y=readInt();
       double w=readDouble();
       double a=readDouble();
       graph[ x].add(new Pair(y, w/a*60));
       graph[ y].add(new Pair(x, w/a*60));
       //Directed graph
       /*  if(!graph.containsKey(y)) {
           graph.put(y, new LinkedList<Pair>());
         }  
           graph.get(y).add(new Pair(x,w));//undirected graph
           */
     }
    
     runDij(1,n,n);
     System.out.println(edge[n]);
    System.out.println(Math.round(du[n]/0.75-du[n]));

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
