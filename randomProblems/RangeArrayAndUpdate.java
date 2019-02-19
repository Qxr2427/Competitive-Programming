package randomProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class RangeArrayAndUpdate {
  static int [] A = {1,3,5,7,9,11};
  static int[] tree;
  static int n;
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringTokenizer st;
  public static void main(String[]args) throws IOException {
     int n=readInt();
     int q=readInt();
     A=new int[n+1];
     Arrays.fill(A, 0);
     tree=new int[2*(n-1)+2];
     build(1,0,n-1);
  }
  static void build (int node, int start, int end) {
    if(start==end) { tree[node]=A[start];}
    else {
      int mid=(start+end)/2;
      build(2*node, start, mid);
      build(2*node+1,mid+1,end);
      tree[node]=tree[2*node]+tree[2*node+1];
    }
  }
  static void update(int node, int start, int end, int idx, int val) {
    if(start==end) {
      A[idx]+=val; tree[node]+=val;return;
    }
    int mid=(start+end)/2;
    if(start<=idx && idx<=mid) {
      update(2*node,start,mid,idx,val);
    }
    else {
      update(2*node+1, mid+1, end,idx,val);}
    tree[node]=tree[2*node]+tree[2*node+1];
    }
  int query(int node, int start, int end, int l, int r)
  {
      if(r < start||end < l)
      {
          return 0;
      }
      if(l <= start&& end <= r)
      {
          // range represented by a node is completely inside the given range
          return tree[node];
      }
      // range represented by a node is partially inside and partially outside the given range
      int mid = (start + end) / 2;
      int p1 = query(2*node, start, mid, l, r);
      int p2 = query(2*node+1, mid+1, end, l, r);
      return (p1 + p2);
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
}}
