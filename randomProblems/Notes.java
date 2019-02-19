package randomProblems;

import java.util.Arrays;
import java.util.Scanner;

public class Notes {
  public static void main(String[]args) {
    Scanner sc=new Scanner(System.in);
    int[] x=new int[8];
    for(int i=0;i<8;i++) {
      x[i]=sc.nextInt();
    }
    boolean ascend=true;
    boolean descend=true;
    if(x[0]<x[1]) {
      descend=false;
    }
    if(x[0]>x[1]) {
     ascend=false;
    }
    for(int i=1;i<8;i++) {
      if(x[i-1]>x[i]&&!descend) {
        ascend=false;
        System.out.println("mixed");
        break;
      }
      if(x[i-1]<x[i]&&!ascend) {
        descend=false;
        System.out.println("mixed");
        break;
      }
    }
    if(ascend) {
      System.out.println("ascending");
    }
    if(descend) {
      System.out.println("descending");
    }
    
}
}