package randomProblems;

import java.io.*;
import java.util.*;
public class StringFinding {
    static int m = 10000007;
    static int b = 30;
    static int pwr;
    public static void computePower(int len) {
        pwr=1;
        for(int i=0; i<len-1; i++) {
            pwr = pwr*b%m;
        }
        //System.out.println(len);
        
        //System.out.println(pwr);
    }
    
  public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String S = reader.readLine();
    String T = reader.readLine();
    
    
    int sum = findSum(T);
    
    int slen = S.length();
    int tlen = T.length();
    computePower(tlen);
    
    int sum2 = findSum( S.substring(0,tlen));
    
    if( sum == sum2 ) { System.out.println(0); return; }
    for (int i=1; i<=slen-tlen+1; i++){
      /*if( sum == sum2 ){
        if (T.charAt(0)==S.substring(i,i+tlen).charAt(0)){
        if (T.equals(S.substring(i,i+tlen))){
          System.out.println(i); return;
        }
        }
      }*/
         
      if(i==slen-tlen+1) break;
      int chV = S.charAt(i-1) - 'a' + 1;
      //System.out.println( S.charAt(i-1));
      sum2 = ( sum2 - chV*pwr )%m;
      sum2 = (sum2 + m )%m;
      int chV2 = S.charAt(i+tlen-1)-'a'+1;
      //System.out.println( S.charAt(i+tlen-1));
      sum2 = (sum2*b + chV2)%m;
      //sum2 = sum2 - (S.charAt(i)-'a') + (S.charAt(i+tlen)-'a');
      //System.out.println(sum2 + " and " + sum);
      if( sum2 == sum) { System.out.println(i); return;}
    }
    System.out.println(-1);
  }

  public static int findSum(String T){
      int sum = 0;
      for(int i=0; i<T.length(); i++){
          //sum += T.charAt(i)-'a';
          int chV = T.charAt(i)-'a'+1;
          sum = ( sum*b + chV) % m;
      }
      //System.out.println(sum);
      return sum;
  }
  
}
