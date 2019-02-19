package randomProblems;

import java.util.Scanner;

public class LOL {
  public static void main(String[]args) {
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int[] a=new int[x];
    int[] b=new int[x];
    for(int i=0;i<x;i++) {
      a[i]=sc.nextInt();
      b[i]=sc.nextInt();
    }
    int max1=a[0];
    int max2=b[0];
    int min1=a[0];
    int min2=b[0];
    for(int i=0;i<x;i++) {
      if(a[i]>max1) {
        max1=a[i];
      }
      if(b[i]>max2) {
        max2=b[i];
      }
      if(a[i]<min1) {
        min1=a[i];
      }
      if(b[i]<min2) {
        min2=b[i];
      }
    }
    int area=((a[0]-min1)+(max1-a[0]))*((b[0]-min2)+(max2-b[0]));
    System.out.println(area);
  }
}
