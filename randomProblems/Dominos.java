package randomProblems;

import java.util.Scanner;

public class Dominos {
  public static void main(String[]args) {
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt(); 
    int count=0;
    for(int i = 0; i <= x; i++) {
      for(int j=0;j<=i;j++) {
        count+=j;
        count+=i;
      }
    }
    System.out.println(count);
  }
 }
