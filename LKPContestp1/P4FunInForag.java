  package LKPContestp1;
  import java.io.BufferedReader;
  import java.io.IOException;
  import java.io.InputStreamReader;
  import java.util.*;
  
  public class P4FunInForag{
      public static class Pair implements Comparable<Pair>{
      long node;
      long du;
      long la;
      public Pair(long node, long du, long la){
          this.node = node;   
          this.du = du;   
          this.la=la;
      }
          public int compareTo(Pair other) {
               if (du >= other.du) { return 1; }
           else return -1;
           }
          
          }
  
      static ArrayList<Pair>[] graph;
      static int n, m;
      static int s, d;
      static long[] dist;
      static boolean[] visited;
      @SuppressWarnings("unchecked")
      public static void main(String[] args) throws NumberFormatException, IOException{
          boolean found=false;
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          String as=br.readLine();
         int n = Integer.parseInt(as.split(" ")[0]);
  
          int m = Integer.parseInt(as.split(" ")[1]);
          graph=new ArrayList[n+1];

          for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Pair>();
        }
        for (int k = 0; k < m; k++) {
            String ad = br.readLine();
            long x = Long.parseLong(ad.split(" ")[0]);
            long y = Long.parseLong(ad.split(" ")[1]);
            long w = Long.parseLong(ad.split(" ")[2]);
            graph[(int) x].add(new Pair(y, w, k + 1));
            graph[(int) y].add(new Pair(x, w, k + 1));
        }
          String sd=br.readLine();
         int  s =  Integer.parseInt(sd.split(" ")[0]);
         int  d = Integer.parseInt(sd.split(" ")[1]);
          long limit = Long.parseLong(sd.split(" ")[2]);
  
          int lo=1;
          int hi=m;
          long ans = Long.MAX_VALUE;

          while(lo<=hi) { 
            int mid= (lo+hi)/2; 
            
          
          //finish input
          //initialization
          dist = new long[n+1];
          visited = new boolean[n+1];
          PriorityQueue<Pair> pq = new PriorityQueue<>();
        Arrays.fill(dist, Long.MAX_VALUE);
          dist[s] = 0;
          pq.add( new Pair( s, 0, 0 ) );
          
          while( !pq.isEmpty() ){
              Pair cur = pq.poll();
              long curn = cur.node;
              
              if( curn == d ) break;
              if (dist[(int) curn] < cur.du) {
                continue;
            }
              visited[(int) curn] = true;
              for (Pair kid : graph[(int) curn]) {
                if (kid.la > mid) {
                    continue;
                }
                if (dist[(int) kid.node] > dist[(int) curn] + kid.du) {
                    dist[(int) kid.node] = dist[(int) curn] + kid.du;
                    pq.add(new Pair(kid.node, dist[(int) kid.node], 0));
                }
            }         
  
          }
          if(dist[d]<limit) {
            hi=mid-1;
            ans = Math.min(ans, mid);
          }
          else {
            lo=mid+1;
          }
          }
          
      if(ans!=Long.MAX_VALUE) {
         System.out.print(ans);
     }
      else {
        System.out.println(-1);
      }
           
      
        //Priorityqueue takes logn time to update and get min
    }             
  }