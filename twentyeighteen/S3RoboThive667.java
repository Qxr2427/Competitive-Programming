package twentyeighteen;

import java.io.*;
import java.util.*;
import java.util.StringTokenizer;
public class S3RoboThive667 {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringTokenizer st;static char[][] grid;
  static boolean[][] visited;
  static int steps[][]; 
  public static void main(String[] args) throws IOException {
      int x=readInt();
      int y=readInt();
      int q=0;
      grid=new char[x][y];
      steps=new int[x][y];
      String[] index=new String[x*y];
      for(int d=0;d<grid.length;d++) {
        Arrays.fill( steps[d], -1 ); }   
      visited=new boolean[x][y];
      String spawn="";
      for(int i=0;i<x;i++) {
        String a=next();
       /* a.replaceAll("W", "-1");
        a.replaceAll(".", "0");
        a.replaceAll("S", "10");
        a.replaceAll("L", "1");
        a.replaceAll("U", "2");
        a.replaceAll("R", "3");
        a.replaceAll("D", "4");
        a.replaceAll("C", "-2");*/
        grid[i]=a.toCharArray();
        if(a.contains("S")) {
          spawn=i+"#"+(a.indexOf("S"));
         // System.out.println(i+" "+(a.indexOf("S")+1));
        }
        if(a.contains("C")) {
          for(int j=0;j<a.length();j++) {
            if(a.charAt(j)=='C') {
              index[q]=i+"#"+j;
              q++;
            }
         
        }
        }
        

      }
      for(int i=0;i<x*y;i++) {
        if(index[i]==null) {
          break;
        }
        int e=Integer.parseInt(index[i].split("#")[0]);
        int r=Integer.parseInt(index[i].split("#")[1]);
        visited[e][r]=true;
        up(e,r);
        down(e,r);
        left(e,r);
        right(e,r);
      }
      if(visited[Integer.parseInt(spawn.split("#")[0])][Integer.parseInt(spawn.split("#")[1])]) {
        for(int i=0;i<x;i++) {
          for(int j=0;j<y;j++) {
            if(grid[i][j]=='.') {
              System.out.println(-1);
            }
          }
        }
      }
      else {
      bfs(Integer.parseInt(spawn.split("#")[0]),Integer.parseInt(spawn.split("#")[1]));
      for(int i=0;i<x;i++) {
        for(int j=0;j<y;j++) {
          if(grid[i][j]=='.') {
            System.out.println(steps[i][j]);
          }
        }
      }
  }
      }
  public static void up(int x, int y) {
    if(grid[x-1][y]!='W') {
      visited[x-1][y]=true;
      up(x-1,y);
    }
    return;

  }
  public static void left(int x, int y) {
    if(grid[x][y-1]!='W') {
      visited[x][y-1]=true;
      left(x,y-1);
    }
    return;

  }
  public static void right(int x, int y) {
    if(grid[x][y+1]!='W') {
      visited[x][y+1]=true;
      right(x,y+1);
    }
    return;
  }
  public static void down(int x, int y) {
    if(grid[x+1][y]!='W') {
      visited[x+1][y]=true;
      down(x+1,y);
    }
    return;

  }
  public static void bfs(int x, int y) {
    Queue<Integer> qu= new LinkedList<>();
    qu.add(x);
    qu.add(y);
    visited[x][y]=true;
    int level=-1;
    while(!qu.isEmpty()) {
      int size=qu.size()/2;
      level++;
      for(int k=0;k<size;k++) {
        int cur=qu.poll();
        int cur2=qu.poll();
        char temp=grid[cur][cur2];
        if(temp=='W') {
          continue;
        }
       if(temp=='.') {
          steps[cur][cur2]=level;
       }

       if(!visited[cur+1][cur2]&&grid[cur+1][cur2]!='W') {
           visited[cur+1][cur2]=true;
           qu.add(cur+1);
           qu.add(cur2);
         }
       if(!visited[cur][cur2+1]&&grid[cur][cur2+1]!='W') {
         visited[cur][cur2+1]=true;
         qu.add(cur);
         qu.add(cur2+1);
       }
       if(!visited[cur-1][cur2]&&grid[cur-1][cur2]!='W') {
         visited[cur-1][cur2]=true;
         qu.add(cur-1);
         qu.add(cur2);
       }
       if(!visited[cur][cur2-1]&&grid[cur][cur2-1]!='W') {
         visited[cur][cur2-1]=true;
         qu.add(cur);
         qu.add(cur2-1);
       }
       }
     /*  if(temp=='L') {
         while(temp!='W') {
           temp=grid[cur][cur2];
         }
       }
        if(temp=='R') {
         
       }
        if(temp=='U') {
         
       }
        if(temp=='D') {
         
       }*/
       
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