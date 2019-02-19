package twentytwelve;
import java.util.*;

public class S3AbsoluteAcid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        int[] reading = new int[1000];
        
        for (int i = 0; i < n; ++i) {
            int r = sc.nextInt();
            ++reading[r-1];
            if (r > max)
                max = r;
        }
        
        sc.close();
        
        int mostRd = 0;
        int mostFreq = 0;
        int scndRd = 0;
        int scndFreq = 0;
        
        for (int i = 0; i < max; ++i) {
            if (reading[i] > 0 && reading[i] >= mostFreq) {
                if (mostFreq > scndFreq) {
                    scndFreq = mostFreq;
                    scndRd = mostRd;
                }
                mostFreq = reading[i];
                mostRd = i+1;
            }
        }
        
        if (scndFreq != mostFreq) {
            for (int i = 0 ; i < max; ++i) {
                if (reading[i] > 0 && reading[i] < mostFreq) {
                    if (reading[i] > scndFreq || 
                            (reading[i] == scndFreq && Math.abs(mostRd-(i+1)) > Math.abs(mostRd-scndRd))) {
                        scndFreq = reading[i];
                        scndRd = i+1;
                    }   
                }
            }
        }
        
        System.out.println(Math.abs(mostRd-scndRd));
    }
}
