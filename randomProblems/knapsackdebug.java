package randomProblems;

import java.io.*;
import java.util.*;

public class knapsackdebug {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int N = readInt();
        long W = readLong();
        int[] v = new int[N];
        int[] w = new int[N];
        long[][] dp = new long[N+1][N*1000+1];
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= N*1000; j++) {
                dp[i][j] = Long.MAX_VALUE;
            }
        }
        for(int i = 0; i < N; i++) {
            w[i] = readInt();
            v[i] = readInt();
        }
        dp[0][0] = 0;
        for(int i = 0; i < N; i++){
            for(int j = 0; j <= N*1000; j++){
                if(j-v[i] < 0){
                    dp[i+1][j] = dp[i][j];
                }
                else if(j-v[i] >= 0 && dp[i][j-v[i]]+w[i] <= W){
                    dp[i+1][j] = Math.min(dp[i][j], dp[i][j-v[i]]+w[i]);
                }
                else{
                    dp[i+1][j]=dp[i][j];
                }
            }
        }
        
        long max = 0;
        for(int i = 0; i <= N*1000; i++){
            if(dp[N][i] <= W){
                max = i;
            }
        }
        System.out.println(max);
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
