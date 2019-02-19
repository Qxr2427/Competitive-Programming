package twentyotwo;

import java.util.Arrays;
import java.util.Scanner;

public class S4BridgeCrossing {
  public static void main(String[]args) {
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    
    String[] names=new String[y];
    int[] time=new int[y];
 
    for(int i=0;i<y;i++) {
      names[i]=sc.next();
      time[i]=sc.nextInt();
      
      
    }
    int[] best=new int[y];
    
   
   /* for(int j=2;j<x+1;j++) {
      for(int i=0;i<y-j+1;i++) {
       for(int z=i,q=1;q<=j;z++,q++) {
        if(time[1][z]> time[j][i]) {
          time[j][i]=time[1][z];
        }
       }
}
    }*/
  }
}
