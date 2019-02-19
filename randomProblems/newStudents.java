package randomProblems;

import java.util.Scanner;

public class newStudents {
  public static void main(String[]agrs) {
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    double[] a=new double[x];
    double sum=0;
    double ave=0;
    for(int i=0;i<x;i++) {
      a[i]=sc.nextDouble();
      sum+=a[i];
    }
    int y=sc.nextInt();
    double[] b=new double[y];
    for(int i=0;i<y;i++) {
      b[i]=sc.nextDouble();
    }
    for(int i=0;i<y;i++) {
      sum+=b[i];
      ave=sum/(x+i+1);
      System.out.println(ave);
    }
    
  }
}
