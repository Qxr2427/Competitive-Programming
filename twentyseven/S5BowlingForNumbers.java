  package twentyseven;
  
  import java.util.Arrays;
  import java.util.Scanner;
  
  public class S5BowlingForNumbers {
    public static void main(String[]args) {
      Scanner sc=new Scanner(System.in);
      int x=sc.nextInt();
      for(int i=0;i<x;i++) {
        int n=sc.nextInt();
        int k=sc.nextInt();
        int w=sc.nextInt();
        int[] pins=new int[n];
        for(int j=0;j<n;j++) {
          pins[j]=sc.nextInt();
        }
        int[] sum=new int[n];
        for(int h=0;h<sum.length;h++) {
          if(n-h>w) {
          for(int a=h;a<h+w;a++) {
            sum[h]+=pins[a];
          }
          }
          else {
            for(int a=h;a<n;a++) {
              sum[h]+=pins[a];
            }
          }
        }
        for(int h=n-w;h<sum.length-w;h++) {
          for(int a=h;a<h+w;a++) {
            sum[h]+=pins[a];
          }
          
        }
        
        int[][] dp=new int[k+1][n];
        Arrays.fill(dp[0], 0);
        for(int q=1;q<=k;q++) {
          for(int r=n-w;r<n;r++) {
            dp[q][r]=sum[r];
          }
        }
        for(int q=1;q<=k;q++) {
          for(int r=n-1;r>=0;r--) {
            if( sum[r]+dp[q-1][r+w]>(dp[q][r+1])&&r<n-1) {
            dp[q][r]=
                sum[r]+dp[q-1][r+w];}
            else {
              dp[q][r]=dp[q][r+1];
            }
          }
        }
        Arrays.sort(dp[k]);
        System.out.println(dp[k][n-1]);
        //s1=sum[i]+dp[k-1][i+w]
        //s2=dp[k][i+1]
      }
    }
  }
