package twentyeleven;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class J5Unfriend {   

   public static void main(String[]args) {
     Scanner sc=new Scanner(System.in);
     int x=sc.nextInt();
     int[] dp=new int[x+1];
     Arrays.fill(dp, 1);
     for(int i=1;i<x;i++) {
       int y=sc.nextInt();
       
       dp[y]=dp[y]*(dp[i]+1);
     }
     System.out.println(dp[x]);

   }
}