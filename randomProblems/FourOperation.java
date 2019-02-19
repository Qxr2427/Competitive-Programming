package randomProblems;

import java.util.Scanner;

public class FourOperation {
  public static void main(String[]args) {
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    for(int i=0;i<x;i++) {
      String s=sc.next();
     
      if(s.contains("+")) {
        double a= Double.parseDouble(s.split("\\+")[0]);
        double b= Double.parseDouble(s.split("\\+")[1]);
        System.out.println(Math.round ((a+b) * 10000.0) / 10000.0  );
      }
      if(s.contains("-")) {
        String[] arr= s.split("\\-");
        double a=Double.parseDouble(arr[0]);
        double b=Double.parseDouble(arr[1]);
        System.out.println(Math.round ((a-b) * 10000.0) / 10000.0  );
      }
      if(s.contains("*")) {
        String[] arr= s.split("\\*");
        double a=Double.parseDouble(arr[0]);
        double b=Double.parseDouble(arr[1]);
        System.out.println(Math.round ((a*b) * 10000.0) / 10000.0  );
      }
      if(s.contains("/")) {
        String[] arr= s.split("\\/");
        double a=Double.parseDouble(arr[0]);
        double b=Double.parseDouble(arr[1]);
        System.out.println(Math.round ((a/b) * 10000.0) / 10000.0  );
      }
    }
  }
}
