package randomProblems;
import java.util.*;

public class ShahirEVENGetThere{

  static Map<Integer, LinkedList<Integer> > graph;
  static int[] indeg;
  public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int m = sc.nextInt();

    graph = new HashMap<>();
    indeg = new int[n+1];
    Arrays.fill(indeg, 0);

    for(int k=0; k<m; k++){
      int x = sc.nextInt();
      int y = sc.nextInt();
      if( !graph.containsKey(x) ){ graph.put(x, new LinkedList<Integer>() ); }
      graph.get(x).add(y);
      indeg[y]++;
    }

    Queue<Integer> qu = new LinkedList<>();
    for(int k=1; k<=n; k++){ if(indeg[k]==0) qu.add(k);}
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

    if( count < n){ System.out.println("Cycle found!");}
    else{ System.out.println(result);}
  }

}