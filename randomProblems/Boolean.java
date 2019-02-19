package randomProblems;

import java.util.Scanner;

public class Boolean {
  public static void main(String[]ars) {
    Scanner sc=new Scanner(System.in);
    String x=sc.nextLine();
    char[] a=x.toCharArray();
    int count=0;
    for(int i=0;i<x.length();i++) {
      if(a[i]=='n') {
        count++;
      }
    }
    if(a[a.length-2]=='u') {
      if(count%2==1) {
        System.out.println("False");
      }
      else {
        System.out.println("True");
      }
    }
    if(a[a.length-2]=='s') {
      if(count%2==1) {
        System.out.println("True");
      }
      else {
        System.out.println("False");
      }
    }
  }
}   
