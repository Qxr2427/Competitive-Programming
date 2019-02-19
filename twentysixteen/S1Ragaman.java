package twentysixteen;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class S1Ragaman {
  public static char[] sort(char[] a) {
    for(int i=0;i<a.length;i++) {
      for(int j=1;j<a.length-i;j++) {
          if(a[j-1]<a[j]) {
              char temp=a[j-1];
              a[j-1]=a[j];
              a[j]=temp;
          }
      }
  }
    return a;
  }
  public static void main(String[]args) {
    Scanner sc=new Scanner(System.in);
    String x=sc.next();
    String y=sc.next();
    char[] a=x.toCharArray();
    char[] b=y.toCharArray();
    Map<Character, Integer> s=new HashMap <Character, Integer>();
    Map<Character, Integer> d=new HashMap <Character, Integer>();
    d.put('*', 0);
    for(int i=0;i<a.length;i++) {
      if(!s.containsKey(a[i])) {
        s.put(a[i], 0);
        d.put(a[i], 0);
      }
    
      if(s.containsKey(a[i])) {
        s.put(a[i], s.get(a[i])+1);
      }
    
      
        
      }
    for(int i=0;i<b.length;i++) {
    if(!d.containsKey(b[i])) {
      System.out.println("N");
      return;
    }
    if(d.containsKey(b[i])) {
      d.put(b[i], d.get(b[i])+1);
    }
    }
    int count=0;
    for(char key : s.keySet()){
      if(s.get(key)-d.get(key)<0){
        System.out.println("N");
        return;
      }
      else {
        count+=s.get(key)-d.get(key);
      }
  }
    
      
    
    if(d.get('*')==count) {
      System.out.println("A");
    }
   
    else {
      System.out.println("N");
    }
  
    }
  }

