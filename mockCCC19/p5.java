package mockCCC19;
import java.util.*;

public class p5 {
    static long[] fish;
    static long[][] res;
    static int mod=998244353;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int K = input.nextInt();
        fish = new long[N+1];
        int max=0;
        for(int i = 0; i < N; i++) {
            int tem = input.nextInt();
            fish[tem]++;
            if(tem>max) max=tem;
        }
        
        res = new long[max+1][K+1];
        
        System.out.println( f( max , K ));
     }
   public static long f(int i, int k){
       if( res[i][k] > 0 ) return res[i][k];
       if(k==1){ 
            int sum = 0;
            for(int d=i; d>=0; d--) sum += fish[d]; 
            res[i][k] = sum;
            return sum;
        }
        if( i < k ) return 0;
        res[i][k] = (fish[i]%998244353 * f(i-1 , k-1)%998244353 + f(i-1, k)%998244353 )%998244353;
        return res[i][k];
    }
}
