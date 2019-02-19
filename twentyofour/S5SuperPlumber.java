package twentyofour;

import java.util.Scanner;

public class S5SuperPlumber {
  static int[][] grid;
  public static void main(String[]args) {
    Scanner sc=new Scanner(System.in);
    int x,y;x=sc.nextInt();
       y=sc.nextInt();
    do {
       
     grid=new int[x][y];
     
       getGrid(sc,x,y);
       x=sc.nextInt();
       y=sc.nextInt();
       
  }while(x!=0&&y!=0);
}
  public static void getGrid (Scanner sc,int x,int y)
  {
  String line;
  grid = new int [x] [y];
  for (int r = 0 ; r < x ; r++)
  {
      line = sc.next ();
      for (int c = 0 ; c < y ; c++)
      if (line.charAt (c) == '.')
          grid [r] [c] = 0;
      else if (line.charAt (c) == '*')
          grid [r] [c] = -1;
      else
          grid [r] [c] = line.charAt (c) - '0';
  }
  }
  public static int solve(int[][] grid, int x, int y) {
    int[][] points=new int[x][y];
  }


}