package twentyeleven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class J4BoringBusiness {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringTokenizer st;
  static int cx=0;
  static int cy=200;
  static boolean danger=false;
  static boolean plan[][];
  public static void main(String[]args) throws IOException {
    plan =new boolean[2010][4010];
    mark('d',2);
    mark('r',3);
    mark('d',2);
    mark('r',2);
    mark('u',2);
    mark('r',2);
    mark('d',4);
    mark('l',8);
    mark('u',2);
    char xll = 0;
    int a;
    while(xll!='q') {
      xll=next().charAt(0);
      if(xll=='q') {
        break;
      }
      a=readInt();
      mark(xll,a);
      if(!danger) {
         System.out.println((cy-200)+" "+(cx-1+2)*-1+" "+"safe");
      }
      else {
        System.out.println((cy-200)+" "+(cx-1+2)*-1+" "+"DANGER");
        break;
      }
      
      
    }
  }
  public static void mark(char x, int y) {
    if(x=='u') {
      
      for(int i=1;i<=y;i++) {if(plan[cx-1][cy]) {
        danger=true;
      }
        plan[cx-1][cy]=true;
cx--;        
        

      }
    }
    if(x=='d') {
      
      for(int i=1;i<=y;i++) {if(plan[cx+1][cy]) {
        danger=true;
      }
        plan[cx+1][cy]=true;
                cx++;

        

              
      }
    }
    if(x=='l') {
     
      for(int i=1;i<=y;i++) { if(plan[cx][cy-1]) {
        danger=true;
      }
        plan[cx][cy-1]=true;cy--;
       
      }
    }
    if(x=='r') {
     
      for(int i=1;i<=y;i++) {
        if(plan[cx][cy+1]) {
          danger=true;
        }
        plan[cx][cy+1]=true;cy++;
       
      }
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
