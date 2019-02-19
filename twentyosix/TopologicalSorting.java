package twentyosix;

import java.util.*;

public class TopologicalSorting{

  static Map<Integer, LinkedList<Integer> > graph;
  static int[] indeg;
  public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
    
    int n=5;

    graph = new HashMap<>();
    indeg = new int[7+1];
    Arrays.fill(indeg, 0);

    int x = sc.nextInt();
    
    int y = sc.nextInt();
    
    if(x!=0&&y!=0) {
    if( !graph.containsKey(x) ){ graph.put(x, new LinkedList<Integer>() ); }
    graph.get(x).add(y);
    indeg[y]++;
    n++;}
    while(x!=0&&y!=0) {
       x = sc.nextInt();
       
       y = sc.nextInt();
    
       if(x==0&&y==0) {
         break;
       }
      if( !graph.containsKey(x) ){ graph.put(x, new LinkedList<Integer>() ); }
      graph.get(x).add(y);
      indeg[y]++;
      n++;
    }
    Queue<Integer> qu = new LinkedList<>();
    for(int k=1; k<=7; k++){ if(indeg[k]==0) qu.add(k);}
    int count = 0;
    String result="";
    while( !qu.isEmpty() ){
      int cur = qu.poll();
      result += cur+" ";
      count++;
      LinkedList<Integer> temp = graph.get(cur);
      if( temp == null ) continue;
      for( int v : temp){
        indeg[v]--;
        if(indeg[v]==0) qu.add(v);
      }
    }

    if( count < 7){ System.out.println("Cycle found!");}
    else{ System.out.println(result);}
  }

}