package randomProblems;
import java.util.*;

public class MiracleSort {

    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        long[] num = new long[x];
        for (int i = 0; i < num.length; ++i) {
            num[i] = sc.nextLong();
    
        }
        System.out.println();
        
        //bubbleSort(num);
        //selectionSort(num);
        insertionSort(num, 1);
        //shellSort(num, 4);
        //quickSort(num, 0, num.length-1);
        //mergeSort(num, 0, num.length-1);
        
        for (int i = 0; i < num.length; ++i) {
            System.out.print(num[i] + " ");
        }
        
    }
    
    public static void swap(long[] num, int i, int j) {
        long t = num[i];
        num[i] = num[j];
        num[j] = t;
    }
    

    
    public static void insertionSort(long[] num, int inv) {
        for (int i = 0; i < num.length; i += inv) {
            
            for (int j = i; j > 0; j -= inv) {
                if (num[j] < num[j - 1]) {
                    swap(num, j, j-1);
                } else 
                    break;
            }
        }
    }
    
    

  

    
    
        
      
}
