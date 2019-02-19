package twentyoeight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class S3MazeBFS {
  static char[][] maze;
  static int[][] state; //Boolean mask
  static int t,r,c;
  public static void main(String[]args) throws NumberFormatException, IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     t=Integer.parseInt(br.readLine());
    for(int i=0;i<t;i++) {
       r=Integer.parseInt(br.readLine());
       c=Integer.parseInt(br.readLine()); 
    } state=new int[r][c];maze=new char[r][c];
   
    for(int y=0;y<r;y++) {
      maze[y]=br.readLine().toCharArray();
      Arrays.fill(state[y], -1);
    }
   
  }
  
}
