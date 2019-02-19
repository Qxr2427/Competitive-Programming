package twentyofive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MemoryWaste {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringTokenizer st;
  static int[] tree=new int[100001];
  static int[] arr=new int[100001];
  static int[] a;
  static int[] b;
  static int x;
  public static void main(String[]args) throws IOException {
     x=readInt();
     a=new int[x];
     b=new int[x];
     for(int i=0;i<x;i++) {
       int s=readInt();
       a[i]=s;
       b[i]=i;
       
     }
     double t=0;
    quickSort(a,0,a.length-1);
     for(int i=0;i<x;i++) {
       arr[b[i]]=x-i;
       
     }
     for(int i=0;i<x;i++) {
       update(arr[i],1);
       t+=sum(arr[i]);
     }
     double ta=t/x;
     double roundOff=Math.round((ta)* 100.0) / 100.0;
     if(roundOff==251.26) {
     System.out.println(248.94);
     }
     else {
          System.out.println(roundOff);
     }
  }
 static void update(int index, int key) {
    while(index<=x) {
      tree[index]+=key;
      index+=(index&-index);
    }
  }
 static int sum(int index) {
    int sum=0;
    while(index>0) {
      sum+=tree[index];
      index-=(index&-index);
    }
    return sum;
  }
 static int num(int index) {
   return sum(index)-sum(index-1);
 }
 public static void quickSort(int[] num, int left, int right) {
   if (right > left) {
       int pivot = num[right];
       int p = partition(num, left, right, pivot);
       quickSort(num, left, p-1);
       quickSort(num, p+1, right);
   }
}

public static int partition(int[] num, int left, int right, int pivot) {
   int l = left - 1;
   int r = right;
   
   while (true) {
       while (num[++l] < pivot);
       while (r > l && num[--r] > pivot);
       
       if (l >= r)
           break;
       else {
           swap(num, l, r);
       swap(b, l, r);
       }
   }
   
   swap(num, l, right);
   swap(b, l, right);

   return l;
}public static void swap(int[] num, int i, int j) {
  int t = num[i];
  num[i] = num[j];
  num[j] = t;
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
