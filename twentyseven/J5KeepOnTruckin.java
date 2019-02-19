package twentyseven;

import java.util.Arrays;
import java.util.Scanner;

public class J5KeepOnTruckin {
  public static void main(String[]args) {
    Scanner sc=new Scanner(System.in);
    
    int x=sc.nextInt();
    int y=sc.nextInt();
   
    int z=sc.nextInt();
    int[] temp={0, 990, 1010, 1970, 2030, 2940, 3060, 3930, 4060, 4970, 5030, 5990, 6010, 7000};
    int[] m=Arrays.copyOf(temp, z+14);
   
    for(int i=0;i<z;i++) {
      m[14+i]=sc.nextInt();
      
      
    }
    if(x>y) {
      System.out.println(0);
    }
    else {
    Arrays.sort(m);
    long[] count=new long[m.length];
    count[0]=1;
    for(int i=1;i<m.length;i++) {
      count[i]=0;
    }
    for(int i=0;i<m.length-1;i++) {
      for(int j=i+1;j<m.length;j++) {
         if((m[j]-m[i])>=x&&(m[j]-m[i])<=y) {   
           count[j]=count[j]+count[i];
         }
         
       
      }
     
    }
    System.out.println(count[m.length-1]);
    }
  }
}
