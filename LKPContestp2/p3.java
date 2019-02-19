package LKPContestp2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p3 {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringTokenizer st;
  public static void main(String[]args) throws IOException {
    int n=readInt();
    int m=readInt();
    double[] arr=new double[n];
    double[] brr=new double[n];
    
    for(int i=0;i<n;i++){
      arr[i]=readDouble();
      brr[i]=readDouble();
      
    }
    double[] x1=new double[m];
    double[] y1=new double[m];
    double[] x2=new double[m];
    double[] y2=new double[m];
    double[] x3=new double[m];
    double[] y3=new double[m];
     for(int i=0;i<m;i++) {
      
       x1[i]=readDouble();
       y1[i]=readDouble();
       x2[i]=readDouble();
       y2[i]=readDouble();
       x3[i]=readDouble();
       y3[i]=readDouble();
     }
     for(int i=0;i<m;i++) {
       int count=0;
       for(int i1=0;i1<n;i1=i1+1) {
        
         if(isInside(x1[i],y1[i],x2[i],y2[i],x3[i],y3[i],arr[i1],brr[i1])) {
           count++;
         }
       }
       System.out.println(count);
     }
  }
  public static double area(double x1,double y1,double x2,double y2,double x3,double y3) {
    return Math.abs((x1*(y2-y3) + x2*(y3-y1)+ 
        x3*(y1-y2))/2.0); 
  }
  public static boolean isInside(double x1, double y1, double x2, 
      double y2, double x3, double y3, double x, double y) 
{     
double A = area (x1, y1, x2, y2, x3, y3); 

double A1 = area (x, y, x2, y2, x3, y3); 

double A2 = area (x1, y1, x, y, x3, y3); 

double A3 = area (x1, y1, x2, y2, x, y); 

return (A == A1 + A2 + A3); 
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
