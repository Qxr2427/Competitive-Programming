package mockCCC192;

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.*;
import java.math.*;
 
public class S1 {
  public static double round (double value, int precision) {
    int scale = (int) Math.pow(10, precision);
    return (double) Math.round(value * scale) / scale;
}
  public static void main(String[]args) {
    Scanner sc=new Scanner(System.in);
    long a=sc.nextLong();
    long b=sc.nextLong();
   double c= (a/2.0);
    BigDecimal ae=BigDecimal.valueOf(c).multiply(BigDecimal.valueOf(b));
    NumberFormat nf = NumberFormat.getInstance();
    nf.setGroupingUsed(false);
    nf.setMinimumFractionDigits(1);
    nf.setMaximumFractionDigits(1);
    System.out.println(nf.format(ae));
    
  }
}
