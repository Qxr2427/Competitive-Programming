package twentysixteen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class S3Pho {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringTokenizer st;
  static ArrayList<Integer>[] graph;
  static boolean[] visited;
  static HashSet arr;
  static int random; static int count=0;
  static boolean[] marked;
  static boolean[] isPho;
  @SuppressWarnings("unchecked")
  public static void main(String[]args) throws IOException {
     int x=readInt();
     int y=readInt();       visited=new boolean[x];  
     marked=new boolean[x];    isPho = new boolean[x];

     arr=new HashSet<Integer>();
     for(int i=0;i<y;i++) {
       int a=readInt();
       random=a;
       marked[a]=true;
       arr.add(a);
     }
     graph=new ArrayList[x];
     for (int i = 0; i < graph.length; i++) {
       graph[i] = new ArrayList<Integer>();             
   }
     for(int i=0;i<x-1;i++) {
       int a=readInt();
       int b=readInt();
       graph[a].add(b);
       graph[b].add(a);
     }
     mark(random,-1);
     visited=new boolean[x];
     for(int i=0;i<x;i++) {
      if(marked[i]) {
      //   System.out.print(i+ " ");
       }
     }
   for(int i=0;i<x;i++) {
     if(!marked[i]) {
       graph[i]=null;
       visited[i]=true;
     }
   }
    // dfs2(random);
    // int d=diameter(graph, x);
     bfs(random);   
     visited=new boolean[x];
     for(int i=0;i<x;i++) {
       if(!marked[i]) {
         graph[i]=null;
         visited[i]=true;
       }
     }
     bfs(key);
     System.out.println(d-1);
    System.out.println(count/2);
     System.out.println(count-d+1);
  }
  static void mark (int u, int prev) {
    

    for (int v : graph[u]) {
      if (v == prev)
        continue;
      mark(v, u);
      if (marked[v]) {
        count += 2;
        marked[u] = true;
      }
    }
  }
  static int d=0;
  static int key=-1;
  public static void bfs(int s) {
    Queue<Integer> qu= new LinkedList<>();
    qu.add(s);
    visited[s]=true;
    int level=0;
    while(!qu.isEmpty()) {
      int size=qu.size();
      level++;
      for(int k=0;k<size;k++) {
        int cur=qu.poll();
        if(arr.contains(cur)&&level>d) {
            d=level;
            key=cur;
        }
        ArrayList<Integer> temp=graph[cur];
        if(temp==null)
       continue;
        for(int v:temp) {
          if(!visited[v]) {
            visited[v]=true;
            qu.add(v);
          }
        }
      }
    }
   
    
  }
 
  static int x; 
  static int maxCount; 
    
  static void dfsUtil(int node, int count,  
                     List<Integer> adj[]) 
  { 
      visited[node] = true; 
      count++; 
        
      List<Integer> l = adj[node]; 
      for(Integer i: l) 
      { 
          if(!visited[i]){ 
              if (count >= maxCount) { 
                  maxCount = count; 
                  x = i; 
              } 
              dfsUtil(i, count,  adj); 
          } 
      } 
  } 
     
  static void dfs(int node, int n, List<Integer> 
                                     adj[]) 
  { 
      int count = 0;
      dfsUtil(node, count + 1,  adj); 
        
  } 
     
  static int diameter(List<Integer> adj[], int n) 
  { 
      maxCount = -1; 
     
      
      dfs(random, n, adj); 
      dfs(x, n, adj); 
     
      return maxCount; 
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
