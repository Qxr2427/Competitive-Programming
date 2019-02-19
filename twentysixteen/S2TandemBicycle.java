package twentysixteen;

import java.util.Arrays;
import java.util.Scanner;

public class S2TandemBicycle {
  public static void main(String[]args) {
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    int[] a=new int[y];
    int[] b=new int[y];
    for(int i=0;i<y;i++) {
      a[i]=sc.nextInt();
      
    }   
    for(int i=0;i<y;i++) {
      b[i]=sc.nextInt();
      
    }    

    if(x==1) {
    Arrays.sort(a);
    Arrays.sort(b);
    int sp=0;
    for(int j=0;j<y;j++) {
      sp+=Math.max(a[j], b[j]);
    }
    System.out.println(sp);
  }
    else if(x==2) {
      Arrays.sort(a);

      bubbleSort(b);
      int spe=0;
      for(int i=0;i<y;i++) {
       spe+=Math.max(a[i], b[i]) ;
      
      } System.out.println(spe);
    }
    
    
}
  public static void bubbleSort(int[] num) {
    boolean swap = true;
    
    do {
        swap = false;
        for (int i = 0; i < num.length - 1; ++i) {
            if (num[i] < num[i + 1]) {
                swap = true;
                swap(num, i, i+1);
            }
        }
    } while (swap);
}
  public static void swap(int[] num, int i, int j) {
    int t = num[i];
    num[i] = num[j];
    num[j] = t;
}
}
