package perfectResonableQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


  
public class HeapSort
{
  public static void main(String[]args) throws NumberFormatException, IOException {
 BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
    
    
    int x=Integer.parseInt(sc.readLine());
    long[] b=new long[x];
    for(int i=0;i<x;i++) {
      b[i]= Long.parseLong(sc.readLine());
      

    }
    sort(b);
    for(int i=0;i<x;i++) {
      System.out.println(b[i]);
    }
  }



   public static void sort(long[] b)
   {
       int n = b.length;


       for (int i = n / 2 - 1; i >= 0; i--)
           heapify(b, n, i);

      
       for (int i=n-1; i>=0; i--)
       {
  
           long temp = b[0];
           b[0] = b[i];
           b[i] = temp;

   
           heapify(b, i, 0);
       }
   }


   static void heapify(long[] b, int n, int i)
   {
       int largest = i;  
       int l = 2*i + 1;  
       int r = 2*i + 2;  

       if (l < n && b[l] > b[largest])
           largest = l;

       if (r < n && b[r] > b[largest])
           largest = r;

       if (largest != i)
       {
           long swap = b[i];
           b[i] = b[largest];
           b[largest] = swap;

           heapify(b, n, largest);
       }
   }

   void printArray(int arr[])
   {
       int n = arr.length;
       for (int i=0; i<n; ++i)
           System.out.print(arr[i]+" ");
       System.out.println();
   }

  
}


