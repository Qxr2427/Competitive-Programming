package twentyofive;

import java.util.Scanner;

public class J2RSAnumbers {
  public static void main(String[]args) {
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    int count;
    int count2=0;
    for(int i=x;i<=y;i++) {
      count=0;
      for(int j=1;j<=i;j++) {
        
        if(i%j==0) {
          count++;
        }
      }
      if(count==4) {
        count2++;
      }
    }
    System.out.println("The number of RSA numbers between "+x+" and "+y+" is "+count2);
  }
}
