package randomProblems;

import java.util.Scanner;

public class PrimeTime {
 

      public static int[] primeFactors(int n)
      {
        int[] a=new int[15];
        int s=0;
          while (n%2==0)
          {
              System.out.print(2 + " ");
              n /= 2;
          }
   
          for (int i = 3; i <= Math.sqrt(n); i+= 2)
          {
              while (n%i == 0)
              {
                  a[s]=i;
                  s++;
                  n /= i;
              }
          }
          return a;
         
      }
  public static void main(String[]args) {
    Scanner sc=new Scanner(System.in);
    int[] a=new int[5];
    Map<Integer, Integer>
    for(int i=0;i<5;i++) {
      a[i]=sc.nextInt();
    }
    for(int i=0;i<5;i++) {
    int[] numbers= new int[a[i]+1];
    for(int j=2;j<a[i]+1;j++) {
      numbers[j]=j;
}
    for(int j=2;j<a[i]+1;j++) {
      int[] s=primeFactors(a[i]);
      for(int q=0;q<s.length;q++) {
        primes
      }
}

    
  }
    
  }
}
