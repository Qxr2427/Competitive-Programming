package randomProblems;

import java.util.*;
public class DMOPC18P1Sorting {

  public static void main(String[]args) {
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    
    ArrayList<Integer> a=new ArrayList<Integer>();
    
    ArrayList<Integer> start=new ArrayList<Integer>();
    ArrayList<Integer> end=new ArrayList<Integer>();
    int s=sc.nextInt();
    if(s==0) {
      start.add(s);
    }
    a.add(s);
    boolean fin=true;
    boolean idk=true;

    for(int i=1;i<x;i++) {
      int n=sc.nextInt();
      a.add(n);
      if(a.get(i)==0&&a.get(i-1)!=0) {
        start.add(i);
        
      }
      if(a.get(i-1)==0&&a.get(i)!=0) {
     
        end.add(i-1);
      }
    
    
    }  if(a.get(x-1)==0) {
        end.add(x-1);
      }

    
    
        for(int j=0;j<start.size();j++) {
          if(j!=0&&a.get(start.get(j))>a.get(start.get(j-1))) {
            System.out.println("NO");
            break;
          }
        for(int i=start.get(j);i<=end.get(j);i++) {
          if(start.get(j)==0) {
            
          }
          else {
          a.set(i, a.get(start.get(j)-1));
          
          }
        }
        }
       for(int i=1;i<x;i++) {
          if(a.get(i)<a.get(i-1)) {
            System.out.println("NO");
            fin=false;
            break;
          }
        }
        if(fin==true) {
          System.out.println("YES");
        }
      }
      
    
    
    

    
    
    
    
    }


