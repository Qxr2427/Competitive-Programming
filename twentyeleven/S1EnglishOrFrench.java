package twentyeleven;

import java.util.Scanner;

public class S1EnglishOrFrench {
  public static void main(String[]args) {
    Scanner sc=new Scanner(System.in);
    
    int x=sc.nextInt();
    int counts=0;
    int countt=0;
    for(int i=1;i<=x;i++) {
      String s=sc.nextLine();
    
      for(int j=0;j<s.length();j++) {
        if(s.charAt(j)=='t'||s.charAt(j)=='T') {
          countt++;
        }
        else if(s.charAt(j)=='s'||s.charAt(j)=='S') {
          counts++;
        }
      }
    }
    if(countt==0&&counts==0) {
      System.out.println("English");
    }
    else if(countt>counts) {
      System.out.println("English");
    }
    else {
     System.out.println("French");
    }

    
  }
}
