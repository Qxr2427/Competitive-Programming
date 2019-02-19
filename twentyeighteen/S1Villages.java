package twentyeighteen;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class S1Villages {
    public static double[] sort(double[] b){
   
        for(int i=0;i<b.length;i++){
            for(int j=1;j<b.length-i;j++){
                if(b[j-1]>b[j]){
                    double temp=b[j-1];
                    b[j-1]=b[j];
                    b[j]=temp;
                    
                }
            }
        }
    return b;
        
    }
    public static double[] midPoint(double[] a){
       double[] b=new double[a.length-1];
       for(int i=0;i<=a.length-2;i++) {
         b[i]=(a[i+1]-a[i])/2.0;
       }
       return b;
    }
    public static double[] size(double[] a) {
      double[] b=new double[a.length-1];
      for(int i=0;i<=a.length-2;i++) {
        b[i]=a[i]+a[i+1];
      }
      return b;
    }
    public static double round (double value, int precision) {
      int scale = (int) Math.pow(10, precision);
      return (double) Math.round(value * scale) / scale;
  }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        double[] y=new double[x];
        for(int i=0;i<x;i++) {
          y[i]=sc.nextInt();
        }
        double[] b=sort(y);
    
        
       double[] c= midPoint(b);
       double[] d=size(c);
        
        double min=d[0];
        for(int i=1;i<d.length;i++) {
          if(d[i]<min) {
            min=d[i];
          }
        }
        double a=round(min,1);
       
       NumberFormat nf = NumberFormat.getInstance();
        nf.setGroupingUsed(false);
        nf.setMinimumFractionDigits(1);
        nf.setMaximumFractionDigits(1);
        System.out.println(nf.format(a));
 
        

    }
    
    
}
