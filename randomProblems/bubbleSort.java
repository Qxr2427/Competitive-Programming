package randomProblems;

import java.util.Scanner;

public class bubbleSort {
  public static void main(String[]args) {
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int[] a=new int[x];
    for(int s=0;s<a.length;s++) {
     a[s]=sc.nextInt();
    }
    for(int s=0;s<a.length;s++) {
      System.out.print(a[s]+" ");
    }
    System.out.println();
    for(int i=0;i<a.length;i++) {
      for(int j=1;j<a.length-i;j++) {
          if(a[j-1]>a[j]) {
              int temp=a[j-1];
              a[j-1]=a[j];
              a[j]=temp;
              for(int s=0;s<a.length;s++) {
                System.out.print(a[s]+" ");
              }
              System.out.println();
          }
         
      } 
      
  }
  }
}
