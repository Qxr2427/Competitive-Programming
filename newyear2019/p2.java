package newyear2019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.*;
import java.util.StringTokenizer;

public class p2 {
  static int pollcount;
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringTokenizer st;
  public static void main(String[]args) throws IOException {
    long x=readLong();
    long y=readLong();
    boolean pattern=false;
    String[] a=new String[(int) x];
    for(int i=0;i<x;i++) {
      long q=readLong();
      long w=readLong();
      String qw=0+"#"+q+"#"+w;
      a[i]=qw;
    }
    char[] state=new char[(int)x];
    Arrays.fill(state, '0');
    Queue<String> as=new LinkedList<>();
    
    for(long i=0;i<y;i++) {
      int index=1;
      int track=1;
      while(track!=x+1) {
        String d=a[index-1];
        if(d.split("#")[0].equals("0")) {
          track=Integer.parseInt(d.split("#")[1]);
          a[index-1]=1+"#"+d.split("#")[1]+"#"+d.split("#")[2];
          if(state[index-1]=='0') {
            state[index-1]='1';

          }
          else {
            state[index-1]='0';

          }
          index=track;
        }
        else {
          track=Integer.parseInt(d.split("#")[2]);
          a[index-1]=0+"#"+d.split("#")[1]+"#"+d.split("#")[2];
          if(state[index-1]=='0') {
            state[index-1]='1';

          }
          else {
            state[index-1]='0';

          }
          index=track;
        }
        
      }
      String state1=new String(state);
    //  if(!as.contains(state1)) {
    //  as.add(state1);
    //  }
    //  else if(as.contains(state1)){
       // pattern=true;
      //  while(!as.peek().equals(state1)) {
      //    as.poll();
      //    pollcount++;
     //   }
     //   break;
     // }
      if(i==y-1) {
        System.out.println(state1);
      }
    }
    if(pattern){
    int size=as.size();
    long divide=(y-pollcount)/size;
    long pollmore=y-pollcount-divide*size;
    for(long i=0;i<pollmore-1;i++) {
      as.poll();
    }
    System.out.println(as.peek());
    }
    
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
