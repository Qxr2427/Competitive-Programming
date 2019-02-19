package randomProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class mapDemp {
  public static void main(String[]args) {
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    int count=0;
    Map<Integer, Integer> counter =
        new HashMap<Integer, Integer>();
    for (int i = 1; i <= y; ++i) {
      int a=sc.nextInt();
      Integer c=a;
      counter.put(c,0);
      if(counter.containsKey(x-c)) {
        count++;
      }
    }
    System.out.println(count);
  }
}
