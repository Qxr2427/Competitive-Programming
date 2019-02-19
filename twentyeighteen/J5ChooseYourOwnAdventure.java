package twentyeighteen;


  import java.util.Arrays;
  import java.util.HashMap;
  import java.util.LinkedList;
  import java.util.Map;
  import java.util.Queue;
  import java.util.Scanner;


  public class J5ChooseYourOwnAdventure {
 //a sample that implements Breadth First Search
    //BFS can figure out the shortest path, just count the levels the target node first appears in in a tree
       static Map<Integer, LinkedList<Integer>> graph= new HashMap<>(); 
    static boolean[] visited;
    public static void main(String[]args) {
      Scanner sc=new Scanner(System.in);
      int nodes=sc.nextInt();
      graph= new HashMap<>();
      for(int x=1;x<=nodes;x++) {
         int n=sc.nextInt();
         for(int s=1;s<=n;s++) {
           
        
      int y=sc.nextInt();
      
        if(!graph.containsKey(x)) {
          LinkedList<Integer> temp=new LinkedList<>();
          graph.put(x, temp);
        }
        graph.get(x).add(y);
        
      }
      }
      visited=new boolean[nodes+1];
      Arrays.fill(visited, false);
      bfs(1);
    }

    
    public static void bfs(int s) {
      Queue<Integer> qu= new LinkedList<>();
      qu.add(s);
      visited[s]=true;
      int level=0;
      int min2=99999;
      while(!qu.isEmpty()) {
        int size=qu.size();
        level++;
        for(int k=0;k<size;k++) {
          int cur=qu.poll();
          LinkedList<Integer> temp=graph.get(cur);
          if(temp==null) {
              if(min2>level) {
              min2=level;
              }
            continue;
            
          }
          for(int v:temp) {
            if(!visited[v]) {
              visited[v]=true;
              qu.add(v);
            }
          }
        }
        
      }
      boolean yes=true;
      for(int i=1;i<visited.length;i++) {
        if(!visited[i]) {
          yes=false;
          break;
        }
      }
      
      if(yes==true) {
        System.out.println("Y");
      }
      else {
        System.out.println("N");
      }
 System.out.println(min2);
      
    }
  }   

   
