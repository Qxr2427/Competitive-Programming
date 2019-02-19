package randomProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class KMPalgorithm {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringTokenizer st;

    private String substring;
    private int[] next;
    public KMPalgorithm(String substring) {
        this.substring = substring;
        int m = substring.length();
        next = new int[m];
        int j = -1;
        for (int i = 0; i < m; i++) {
            if (i == 0) next[i] = -1;
            else if (substring.charAt(i) != substring.charAt(j)) next[i] = j;
            else next[i] = next[j];
            while (j >= 0 && substring.charAt(i) != substring.charAt(j)) {
                j = next[j];
            }
            j++;
        }

      
    }
    public int search(String string) {
        int m = substring.length();
        int n = string.length();
        int i, j;
        for (i = 0, j = 0; i < n && j < m; i++) {
            while (j >= 0 && string.charAt(i) != substring.charAt(j))
                j = next[j];
            j++;
        }
        if (j == m) return i - m;
        return -1;
    }


    public static void main(String[] args) throws IOException {
         String string    = next();
         String substring = next();
        KMPalgorithm kmp = new KMPalgorithm(substring);
        int distance = kmp.search(string);

        if(distance==-1) {
          System.out.println(-1);
        }
        else {
          System.out.println(distance);
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