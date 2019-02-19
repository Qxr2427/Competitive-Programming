package randomProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class Fourever {
  static Map<Integer, Integer> a = new HashMap<Integer, Integer>();
  static int length;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    //Map<Integer, Integer> a = new HashMap<Integer, Integer>();
    a.put(1, 3);
    a.put(2, 3);
    a.put(3, 5);
    a.put(4, 4);
    a.put(5, 4);
    a.put(6, 3);
    a.put(7, 5);
    a.put(8, 5);
    a.put(9, 4);
    a.put(10, 3);
    a.put(11, 6);
    a.put(12, 6);
    a.put(13, 8);
    a.put(14, 8);
    a.put(15, 7);
    a.put(16, 7);
    a.put(17, 9);
    a.put(18, 8);
    a.put(19, 8);
    a.put(20, 6);
    a.put(30, 6);
    a.put(40, 5);
    a.put(50, 5);
    a.put(60, 5);
    a.put(70, 7);
    a.put(80, 6);
    a.put(90, 6);
    a.put(100, 7);
    a.put(1000, 8);
    a.put(10000, 11);
    a.put(100000, 15);
    a.put(1000000, 7);
    a.put(10000000, 10);
    a.put(100000000, 14);
    a.put(1000000000, 7);

    int x = sc.nextInt();
    length = String.valueOf(x).length();
    //System.out.println(length);
    solve(x);

  }



  public static void solve(int x) {
    int e;
    boolean checkZero=false;
    boolean special=false;

    int sum = 0;
    if (x < 20) {
      System.out.println(a.get(x));
      if(a.get(x) != 4) {
        solve(a.get(x));
      }
    }
    else {
      for (int i = 0; i < length; i++) {
        if(   checkZero==true) {
          e = (int)(Math.pow(10,i));
          checkZero=false;
          special=true;
        }
        else {
        if(i>3&&i<6) {
           e = (int)(Math.pow(10,i-3));
        }
        else if(i>6&&i<9) {
          e = (int)(Math.pow(10,i-6));
          
        }
        else {
         e = (int)(Math.pow(10,i));
        }
        }
        int t = x % 10;
        if(t == 0) {
          x /= 10;
          checkZero=true;
          continue;
        }
        
        else if(e==10){
        sum += a.get(t*10);  
    
        }
        else if(special==true&&t!=0) {
          if(i>9) {
            if(i==10) {
            sum+=a.get(t*10);
            }
            else if(i==11) {
              sum+=a.get(t);
              sum+=a.get(100);
            }
            
            sum+=a.get((int)Math.pow(10, 9));
          }
          else if(i>6) {
            if(i==7) {
            sum+=a.get(t*10);
            }
            else if(i==8) {
              sum+=a.get(t);
              sum+=a.get(100);
            }
            
            sum+=a.get((int)Math.pow(10, 6));
          }
          else if(i>3) {
            if(i==4) {
            sum+=a.get(t*10);
            }
            else if(i==5) {
              sum+=a.get(t);
              sum+=a.get(100);
            }
            
            sum+=a.get((int)Math.pow(10, 3));
          }
          else if(i<=3) {
            if(i==1) {
            sum+=a.get(t*10);
            }
            else if(i==2) {
              sum+=a.get(t);
              sum+=a.get(100);
            }
            else if(i==3) {
              sum+=a.get(t);
              sum+=a.get(1000);
            }
            
            //sum+=a.get((int)Math.pow(10, 3));
          }
        }
        else {
          sum+=a.get(t);
        }
     
      if(i>1&&e!=10&&special==false) {sum += a.get(e);}
        x /= 10;

      }
     
      System.out.println(sum); 
      length = String.valueOf(sum).length();
      if(sum != 4) {
        solve(sum);
      }
    }
   
  }
  
}


