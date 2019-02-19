package randomProblems;

import java.util.Scanner;
 public class SAOJ1C{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        long ans = 0;
        for(int i=1;i<=N;i++){
            long pow = 1;
            for(int j=1;j<=6;j++) {
                pow = (pow * i) % 1000000000;
                }
            ans = (ans + pow) % 1000000000;
        }
        System.out.println(ans);
    }
}
 