package twothousand;

import java.util.Scanner;

public class S4Golf {
  public static void main(String[]args) {
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    int[] a=new int[y];
    for(int i=0;i<y;i++) {
      a[i]=sc.nextInt();
    }
    int q=solve2(x,a,y);
   if(q==-1) {
     System.out.println("Roberta acknowledges defeat.");
   }
   else {
     System.out.println("Roberta wins in "+q+ " strokes.");
   }
  }

  public static int solve2 (int distance, int [] club, int n)
  {
  int [] f;
  int min, t;

  f = new int [distance + 1];

  f [0] = 0;

  for (int x = 1 ; x <= distance ; x++)
  {
      min = 999999999;
      for (int j = 0 ; j < n ; j++)
      {
      t = x - club [j];
      if (t >= 0 && f [t] >= 0 && f [t] < min)
          min = f [t];
      }
      if (min < 999999999)
      f [x] = min + 1;
      else
      f [x] = -1;
  }
  return f [distance];
  }
}