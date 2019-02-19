package randomProblems;

import java.util.Scanner;

public class listMinimum {
  public static void main(String[]args) {
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int[] a=new int[x];
    for(int i=0;i<x;i++) {
      a[i]=sc.nextInt();
    }
    for(int i=0;i<x;i++) {
      for(int j=1;j<x-i;j++) {
        if(a[j]<a[j-1]) {
        int temp=a[j];
        a[j]=a[j-1];
        a[j-1]=temp;
        }
      }
    }
    for(int i=0;i<x;i++) {
      System.out.println(a[i]);
    }
  }
}
