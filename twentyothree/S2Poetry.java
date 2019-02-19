package twentyothree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class S2Poetry {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringTokenizer st;
  public static void main(String[]args) throws IOException {
    int x=readInt();
    Set<Character> arr=new HashSet<>();
    arr.add('a');
    arr.add('o');
    arr.add('i');
    arr.add('e');
    arr.add('u');
    arr.add('A');
    arr.add('O');
    arr.add('I');
    arr.add('E');
    arr.add('U');

    for(int i=0;i<x;i++) {
      String a=readLine();
      String b=readLine();
      String c=readLine();
      String d=readLine();
   
      String ar="";
      String br="";

      String cr="";

      String dr="";
      
      for(int j=a.length()-1;j>=0;j--) {
        if(arr.contains(a.charAt(j))) {
          ar=a.substring(j, a.length());
          break;
        }
        if(a.charAt(j)==' '||j==0) {
          ar=a.substring(j, a.length());

          break;
        }
      }
      for(int j=b.length()-1;j>=0;j--) {
        if(arr.contains(b.charAt(j))) {
          br=b.substring(j, b.length());
          break;
        }
        if(b.charAt(j)==' '||j==0) {
          br=b.substring(j, b.length());

          break;
        }
      }
      for(int j=c.length()-1;j>=0;j--) {
        if(arr.contains(c.charAt(j))) {
          cr=c.substring(j, c.length());
          break;
        }
        if(c.charAt(j)==' '||j==0) {
          cr=c.substring(j, c.length());

          break;
        }
      }
      for(int j=d.length()-1;j>=0;j--) {
        if(arr.contains(d.charAt(j))) {
          dr=d.substring(j, d.length());
          break;
        }
        if(d.charAt(j)==' '||j==0) {
          dr=d.substring(j, d.length());

          break;
        }
      }
      boolean sad=true;
   ar=ar.toLowerCase();
   br=br.toLowerCase();
   cr=cr.toLowerCase();
   dr=dr.toLowerCase();
    if(sad) {
    if(ar.equals(br)&&cr.equals(dr)&&!ar.equals(cr)) {
      System.out.println("even");
      sad=false;
    }
     if(ar.equals(dr)&&br.equals(cr)&&!ar.equals(cr)&&!br.equals(dr)) {
      System.out.println("shell");
      sad=false;

    }
     if(ar.equals(br)&&cr.equals(dr)&&ar.equals(cr)&&br.equals(dr)) {
      System.out.println("perfect");
      sad=false;

    }   
     if(ar.equals(cr)&&br.equals(dr)&&!ar.equals(br)&&!cr.equals(dr)) {
      System.out.println("cross");
      sad=false;

    }
    }
    
    if(sad) {
      System.out.println("free");
    }
    }
  }
  static String next () throws IOException {
    while (st == null || !st.hasMoreTokens())
        st = new StringTokenizer(br.readLine().trim());
    return st.nextToken();
}
static long readLong () throws IOException {
    return Long.parseLong(next());
}
static int readInt () throws IOException {
    return Integer.parseInt(next());
}
static double readDouble () throws IOException {
    return Double.parseDouble(next());
}
static String readLine () throws IOException {
    return br.readLine().trim();
}
}
