package twentyothree;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.*;

public class S3FloorPlan {
  static char[][] grid;
  static boolean[][] visited;
  static ArrayList<Integer> area=new ArrayList<>();
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringTokenizer st;
  final private static int BufferS = 1 << 16;
  static int sx,sy;
  private static DataInputStream din = new DataInputStream(System.in);
  private static byte[] buffer = new byte[BufferS];
  private static int bufferPointer = 0, bytesRead = 0;
  static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
  public static void main(String[]args) throws IOException {
    int a=readInt();
     sx=readInt();
     sy=readInt();
    grid=new char[sx][sy];
    visited=new boolean[sx][sy];
    for(int i=0;i<sx;i++) {
      String s=next();
     /* a.replaceAll("W", "-1");
      a.replaceAll(".", "0");
      a.replaceAll("S", "10");
      a.replaceAll("L", "1");
      a.replaceAll("U", "2");
      a.replaceAll("R", "3");
      a.replaceAll("D", "4");
      a.replaceAll("C", "-2");*/
      grid[i]=s.toCharArray();
    }  
    for(int i=0;i<sx;i++) {
      for(int j=0;j<sy;j++) {
        if(!visited[i][j]&&grid[i][j]=='.') {
         area.add( bfs(i,j));
        }
      }
    }
    Collections.sort(area);
  int room=area.size()-1;
    int count=0;
    while(true) {
      if(area.size()==0) {
        break;
      }
     if(a-area.get(room)>=0) {
      a=a-area.get(room);
      count++;
      area.remove(area.get(room));
      room--;
    }
    
    else {
      break;
    }
    }
    if(count==1) {
      System.out.println(count+" room, "+a+" square metre(s) left over");
    }
    else {
      System.out.println(count+" rooms, "+a+" square metre(s) left over");

    }

  }
  public static int bfs(int x,int y) {
    int area=0;
    Queue<Integer> qu= new LinkedList<>();
    qu.add(x);
    qu.add(y);
    visited[x][y]=true;
    while(!qu.isEmpty()) {
      int size=qu.size()/2;
      for(int k=0;k<size;k++) {
        int cur=qu.poll();
        int cur2=qu.poll();
        char temp=grid[cur][cur2];
        if(temp=='I')
       continue;
        if(temp=='.')
          area++;
        if(cur<sx-1) {
        if(!visited[cur+1][cur2]&&cur<sx&&grid[cur+1][cur2]!='I') {
          visited[cur+1][cur2]=true;
          qu.add(cur+1);
          qu.add(cur2);
        }
        }
        if(cur2<sy-1) {
      if(!visited[cur][cur2+1]&&cur2<sy&&grid[cur][cur2+1]!='I') {
        visited[cur][cur2+1]=true;
        qu.add(cur);
        qu.add(cur2+1);
      }
        }
        if(cur>0) {
      if(!visited[cur-1][cur2]&&cur>0&&grid[cur-1][cur2]!='I') {
        visited[cur-1][cur2]=true;
        qu.add(cur-1);
        qu.add(cur2);
      }
        }
        if(cur2>0) {
      if(!visited[cur][cur2-1]&&cur2>0&&grid[cur][cur2-1]!='I') {
        visited[cur][cur2-1]=true;
        qu.add(cur);
        qu.add(cur2-1);
      }  
        }
      }
    }
   return area;
    
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
