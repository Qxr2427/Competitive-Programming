package valentines2019;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.*;
import java.util.StringTokenizer;

public class S1Votings {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringTokenizer st;
  final private static int BufferS = 1 << 16;
  private static DataInputStream din = new DataInputStream(System.in);
  private static byte[] buffer = new byte[BufferS];
  private static int bufferPointer = 0, bytesRead = 0;
  static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
  public static void main(String[]args) throws IOException {
    int n=readInt();
    int m=readInt();
    String[][] s=new String[m][20];
    TreeMap<String,Integer> vote=new TreeMap<>();
    for(int i=0;i<n;i++) {
      
      String ns=readLine();
      
      vote.put(ns, 0);
    }
    for(int i=0;i<m;i++) {
      int a=readInt();
      String sq=next();
      s[i][0]=sq;

      vote.put(sq, vote.get(sq)+1);
      for(int j=1;j<a;j++) {
        s[i][j]=next();
      }
      
    }
    while(vote.size()>1) {
      String e=vote.firstKey();
      vote.remove(vote.firstKey());
      for(int i=0;i<m;i++) {
        int j=0;
        while(s[i][j].equals("-1")) {
          j++;
        }
          if(s[i][j].equals(null)) {
            break;
          }
        
          if(s[i][j].equals(e)) {
            s[i][j]="-1";
            if(s[i][j+1].equals(null)) {
                continue;
              }
              
            while(!vote.containsKey(s[i][j+1])&&j<19) {
              j++;
             
            }
            vote.put(s[i][j+1], vote.get(s[i][j+1])+1);
            
          }
        }
      }
    System.out.println(vote.firstEntry());
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
