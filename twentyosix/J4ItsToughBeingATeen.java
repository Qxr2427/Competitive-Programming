package twentyosix;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class J4ItsToughBeingATeen{

  static Map<Integer, TreeSet<Integer> > graph;
  static int[] indeg;
  public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int n=5;
     
    graph = new HashMap<>();
    indeg = new int[8];
    
    Arrays.fill(indeg, 0);
    graph.put(1, new TreeSet<Integer>() ); 
  graph.get(1).add(7);
  indeg[7]++;
 
 
  graph.get(1).add(4);
  indeg[4]++;

  graph.put(2, new TreeSet<Integer>() ); 
  graph.get(2).add(1);
  indeg[1]++;

  graph.put(3, new TreeSet<Integer>() ); 
  graph.get(3).add(4);
  indeg[4]++;

 
  graph.get(3).add(5);
  indeg[5]++;

    int x = sc.nextInt();
  
    int y = sc.nextInt();
    
    if(x!=0&&y!=0) {
    if( !graph.containsKey(x) ){ graph.put(x, new TreeSet<Integer>() ); }
    graph.get(x).add(y);
    indeg[y]++;
    n++;}
    while(x!=0&&y!=0) {
       x = sc.nextInt();
       
       y = sc.nextInt();
    
       if(x==0&&y==0) {
         break;
       }
      if( !graph.containsKey(x) ){ graph.put(x, new TreeSet<Integer>() ); }
      graph.get(x).add(y);
      indeg[y]++;
      n++;
    }
    Map<Integer, Integer> random=new TreeMap<Integer,Integer>();
    for(int i=1;i<8;i++) {
      random.put(i,indeg[i]);
    }
    
    TreeSet<Integer> qu = new TreeSet<>();
    for(int k=1; k<8; k++){ if(random.get(k)==0) qu.add(k);}
    int count = 0;
    String result="";
    while( !qu.isEmpty() ){

      int cur=qu.pollFirst();
      result += cur+" ";
      count++;
      TreeSet<Integer> temp = graph.get(cur);
      if( temp == null ) continue;
      for( int v : temp){
        indeg[v]--;
        random.put(v, indeg[v]);
        if(random.get(v)==0) qu.add(v);
      }
    }

    if( count < 7){ System.out.println("Cannot complete these tasks. Going to bed.");}
    else{ System.out.println(result);}
  }

}