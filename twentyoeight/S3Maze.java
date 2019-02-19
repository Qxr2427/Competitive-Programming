package twentyoeight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class S3Maze {
  static int x=0;
  static int y=0;
  static int[] path;
  static int[][] coord;
  public static void dfs() {
    int minsteps=Integer.MAX_VALUE;
   path=new int[r*c];
    coord=new int[r*c][2];
    
    int i = 1;

    path[i] = -1;
    //1 is up
    //2 is right
    //3 is donw
    //4 is left
    while (i >0) {
        if (++path[i] <=4) {
            if (isValid(path, i)) {
                if (x==c&&y==r) {
                   if(i<minsteps) {
                     minsteps=i;
                     i--;
                   }
                 
                } else {
                  if(i<minsteps||i<r*c-1) {
                    ++i;
                  }
                }
            }
        } else {
            --i;
            //restore x and y
        }
    }
  }
  public static boolean isValid(int[] path, int i) {
    return true;
  }
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
