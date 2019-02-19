package twentyofive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NumInv {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringTokenizer st;
  public static void main(String[]args) throws IOException {
      int x=readInt();
      long[] arr=new long[x];
      double sum=0;
      int[] inv=new int[x];
      for(int i=0;i<x;i++) {
        arr[i]=readLong();
        sum+=mergeSort(arr,i+1)+1;
      }
      double roundOff = Math.round((sum/x)* 100.0) / 100.0;

      System.out.println(roundOff);
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
static long mergeSort(long arr[], int array_size) 
{ 
    long temp[] = new long[array_size]; 
    return _mergeSort(arr, temp, 0, array_size - 1); 
} 
static long _mergeSort(long arr[], long temp[], int left, int right) 
{ 
    int mid, inv_count = 0; 
    if (right > left) { 
        mid = (right + left) / 2; 
        inv_count = (int) _mergeSort(arr, temp, left, mid); 
        inv_count += _mergeSort(arr, temp, mid + 1, right); 

        inv_count += merge(arr, temp, left, mid + 1, right); 
    } 
    return inv_count; 
} 


static long merge(long arr[], long temp[], int left, int mid, int right) 
{ 
    int i, j, k; 
    long inv_count = 0; 

    i = left; 
    j = mid; 
    k = left; 
    while ((i <= mid - 1) && (j <= right)) { 
        if (arr[i] <= arr[j]) { 
            temp[k++] = arr[i++]; 
        } 
        else { 
            temp[k++] = arr[j++]; 
            inv_count = inv_count + (mid - i); 
        } 
    } 

    
    while (i <= mid - 1) 
        temp[k++] = arr[i++]; 

   
    while (j <= right) 
        temp[k++] = arr[j++]; 

    
    for (i = left; i <= right; i++) 
        arr[i] = temp[i]; 

    return inv_count; 
} 
}
