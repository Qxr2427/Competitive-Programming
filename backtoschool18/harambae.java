package backtoschool18;

import java.util.Scanner;

public class harambae {
  public static void main(String[]args) {
    Scanner sc=new Scanner(System.in);
    String x=sc.nextLine();
    String y=sc.nextLine();
    int a=sc.nextInt();
 
    int count=0;
    for(int i=0;i<x.length();i++) {
      if(x.charAt(i)!=y.charAt(i)) {
        count++;
      }
    }
    if(count<=a) {
      System.out.println("Plagiarized");
    }
    else {
      System.out.println("No plagiarism");
    }
    
  }
}
