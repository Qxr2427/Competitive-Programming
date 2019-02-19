package randomProblems;
import java.util.Scanner;

public class TombRobbing {

  public static  int x, y;
  public static int sum=0;
  public static void main(String[]agrs) {
    Scanner sc=new Scanner(System.in);
     x=sc.nextInt();
     y=sc.nextInt();
  char[][] grid=new char[x][y];
    for(int i=0;i<x;i++) {
      
        String x=sc.next();
        for(int j=0;j<y;j++) {
        grid[i][j]=x.charAt(j);
 
      }
    }
    
  
    for(int i=0;i<x;i++) {
      for(int j=0;j<y;j++) {
       floodfill(i,j,grid);
      }
  
      
} 
    
   /* for(int i=0;i<x;i++) {
      for(int j=0;j<y;j++) {
       System.out.print(grid[i][j]);
      }
      System.out.println();
    }*/
    System.out.println(sum);
    }
  
  
    public static void floodfill(int row,int col, char[][] grid) {
        if(row<0||col<0||row>=x||col>=y) {
          return;
}
         if(grid[row][col]=='X') {
          return;
    }
        
         if(grid[row][col]=='.'){
        sum=sum+1;
        grid[row][col]='X';
       
        floodfill2(row+1,col,grid);
        floodfill2(row,col+1,grid);
        floodfill2(row-1,col,grid);
        floodfill2(row,col-1,grid); 
        }
        
    }
    public static void floodfill2(int row,int col, char[][] grid) {
      if(row<0||col<0||row>=x||col>=y) {
        return;
}
      if(grid[row][col]=='X') {
        return;
     }
      
      if(grid[row][col]=='.'){
      grid[row][col]='X';
      floodfill2(row+1,col,grid);
      floodfill2(row,col+1,grid);
      floodfill2(row-1,col,grid);
      floodfill2(row,col-1,grid);
      }
  }
}



