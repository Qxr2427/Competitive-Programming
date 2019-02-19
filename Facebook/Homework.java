package Facebook;

import java.util.ArrayList;
import java.util.Scanner;

public class Homework {
  static ArrayList <Integer> s=new ArrayList<Integer>();
  public static void prime(int x, int c) {
    s=new ArrayList<Integer>();
    s.add(2);
    while(x<c/2) {
      
    for(int i=2;i<=Math.sqrt(x);i++) {
      if(x%i==0) {
        x++;
        
        i=1;
        
    }
      else {
        continue;      
  }
}
    if(!s.contains(x)) {
    s.add(x);
    }
}
}
  public static void main(String[]agrs) {
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    for(int i=1;i<=x;i++) {
      int a=sc.nextInt();
      int b=sc.nextInt();
      int k=sc.nextInt();
      
      s=new ArrayList<Integer>();
      int count=0;
      int count2=0;
      for(int j=a;j<=b;j++) { 
        prime(2,a);
       for(int q=0;q<s.size();q++) {
        
         if(j%s.get(q)==0) {
           count++;
}
       }
        if(count==k) {
          count2++;
        }
        count=0;
       
    }
       System.out.println("Case #"+i+": "+count2);
    }
  }
}