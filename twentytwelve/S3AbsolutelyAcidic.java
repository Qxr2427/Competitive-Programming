package twentytwelve;

import java.util.Arrays;
import java.util.Scanner;

public class S3AbsolutelyAcidic {
  public static void main(String[]args) {
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int[] b=new int[1000];
    int[] tiem=new int[1000];
    int[] sectiem=new int[1000];
    int y=sc.nextInt();
    int z=sc.nextInt();
    b[y-1]++;
    b[z-1]++;
    int most=b[y-1];
    int sec=b[z-1];
   
   int j=0;
   int k=0;
    for(int i=2;i<x;i++) {
      int a=sc.nextInt();
      b[a-1]++;
      if(b[a-1]>most) {
       
        most=b[a-1];
        Arrays.fill(tiem, 0);
        j=0;
        tiem[j]=a;
        j++;
      }
      if(b[a-1]>sec) {
        sec=b[a-1];
        Arrays.fill(sectiem, 0);
        k=0;
        tiem[k]=a;
        k++;
      }
      if(b[a-1]==most) {
       a=tiem[j];
       j++;
      }
      else if(b[a-1]==sec) {
        a=sectiem[k];
        k++;
      }
      
      
    }
     int q=0;
     int w=0;
     int max=Math.abs(tiem[q]-sectiem[q]);
     while(tiem[w]!=0) {
       while(sectiem[q]!=0) {
         if(Math.abs(tiem[w]-sectiem[q])>max) {
           max=Math.abs(tiem[w]-sectiem[q]);
           
         }
         if(sectiem[q]==0) {
           q=0;
           w=0;
         }
        q++;
       } w++;
       if(tiem[w]==0) {
         break;
       }
     }
    
    System.out.println(max);
  }
}
