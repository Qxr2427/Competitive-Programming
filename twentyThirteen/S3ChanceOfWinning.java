package twentyThirteen;

import java.util.Arrays;
import java.util.Scanner;

public class S3ChanceOfWinning {
  static int[][] as= {{1,2},{1,3},{1,4},{2,3},{2,4},{3,4}};
  public static void main(String[]args) {
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    int[] score=new int[5];
    Arrays.fill(score, 0);
    boolean[][] visited=new boolean[5][5];
    for(int i=0;i<y;i++) {
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      int d=sc.nextInt();
      if(c>d) {
        score[a]+=3;
      }
      else if(c<d) {
        score[b]+=3;
      }
      else {
        ++score[a];
        ++score[b];
      }
      visited[a][b]=true;
      visited[b][a]=true;
    }
    search(score,visited,x, 0);
    System.out.println(count);
      }
  public static boolean checkwin(int x, int[] score) {
    int max=score[x];
    for(int k=1;k<5;k++) {
      if(max<=score[k]&&k!=x) {
        return false;
      }
    }
    return true;
  }
  static int count=0;
  public static void search(int[] score, boolean[][] visited, int x, int a) {
    if(a>5) {
      if(checkwin(x, score)) {
        count++;
       
      }
      return;
    }
    int i=as[a][0];
    int j=as[a][1];
    if(visited[i][j]) {
      search(score, visited,x,a+1);
      return;
    }

      
    score[i]++;
          score[j]++;
          visited[i][j]=true;
          visited[j][i]=true;
          search(score,visited,x,a+1);
          score[i]--;
          score[j]--;
          visited[i][j]=false;
          visited[j][i]=false;
          
          score[i]+=3;
          visited[i][j]=true;
          visited[j][i]=true;
          search(score,visited,x,a+1);
          score[i]-=3;
          visited[i][j]=false;
          visited[j][i]=false;
         
          score[j]+=3;
          visited[i][j]=true;
          visited[j][i]=true;
          search(score,visited,x,a+1);
          score[j]-=3;
          visited[i][j]=false;
          visited[j][i]=false;
          return;
        }
      
    
  
    
}


