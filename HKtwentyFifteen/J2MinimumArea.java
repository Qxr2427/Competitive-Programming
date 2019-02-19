package HKtwentyFifteen;
import java.util.Arrays;
import java.util.Scanner;
public class J2MinimumArea {
  public static void main(String[]args) {
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int[] a=new int[x];
    int[] b=new int[x];
    for(int i=0;i<x;i++) {
      a[i]=sc.nextInt();
      b[i]=sc.nextInt();
      
    }
    int[] min=new int[x];
    Arrays.fill(min, 20001);
    for(int i=0;i<x-1;i++) {
       for(int j=i+1;j<x;j++) {
         int q=Math.max(Math.abs(a[i]-a[j]),Math.abs(b[i]-b[j])); //Find the max length of between either x or y coordinates
         if(q<min[i]) {
           min[i]=q; //update minimum array
         }
       }
}
    Arrays.sort(min); 
    System.out.println(min[0]*min[0]);
  }
}
