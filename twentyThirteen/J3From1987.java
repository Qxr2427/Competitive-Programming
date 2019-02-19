package twentyThirteen;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class J3From1987 {
  static int[] check(int n)

  {

  int j = 0;

  int len = Integer.toString(n).length();

  int[] arr = new int[len];

  while(n!=0)

  {

  arr[len-j-1]=n%10;

  n=n/10;

  j++;

  }

  return arr;

  }
  public static void main(String[]args) {
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    x++;
    int[] a=check(x);
    Set<Integer> as=new HashSet<Integer>();
    while(true) {
    for(int i=0;i<a.length;i++) {
      as.add(a[i]);
      
    }
    if(as.size()!=a.length) {
      x=x+1;
      a=check(x);
      as.clear();
    }
    else {
      break;
    }
    }
    System.out.println(x);
  }
}
