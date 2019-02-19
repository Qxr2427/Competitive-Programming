package randomProblems;

import java.util.Scanner;

public class DMOPC18P1SortingT2 {
  static void replace(int[] arr, int find, int replace) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == find) {
            arr[i] = replace;
         
        }
    }
}
  public static void main(String[]args) {
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int[] s=new int[x];
    for(int i=0;i<x;i++) {
     s[i]=sc.nextInt();
    }
    int start=1;
    int count=0;
    int start2=2;
    for(int i=1;i<x;i++) {
      if(count==0&&s[i-1]!=0&&s[i]==0) {
        start=i;
        count++;
}
      else if(count==1&&s[i-1]!=0&&s[i]==0) {
        start2=i;
        count++;
      }
      else if(count==2&&s[i-1]!=0&&s[i]==0) {
        count++;
        break;
      }
    } 
    if(count==2) {
    replace(s,0,s[start2-1]); 
    }
    else {
      replace(s,0,s[start-1]); 
    }
    boolean fin=true;
    for(int i=1;i<x;i++) {
      if(s[i]<s[i-1]) {
        System.out.println("NO");
        fin=false;
        break;
      }
    }
      if(fin) {
      System.out.println("YES");}
    }
   }

