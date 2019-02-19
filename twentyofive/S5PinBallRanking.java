  package twentyofive;
  
  import java.io.*;
  import java.util.*;
  
  public class S5PinBallRanking {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static double sum=0;
   /* static TreeSet<Double> treeSetObj = new TreeSet<Double>(new Comparator<Double>()
    {
    public int compare(Double i1,Double i2)
          {
          return i2.compareTo(i1);
          }
    });*/
    public static class Node {
      int score;
      Node left, right;
      int rank;
       public Node(int input) {
      score=input;
      left=null;
      right=null;
      rank=0;
    }
       
    }
    public static class BST{
      Node root;
      public BST() {
        root=null;
      }
      public int addRank(int score) {
        int rank=0;
        if(root==null) {
          root=new Node(score);
        }
        else {
        Node n=root;
        while(true) {
        if(score<n.score) {
          rank+=n.rank+1;
          if(n.left==null) {
            n.left=new Node(score);
            return rank;
            
          }
          else {
            n=n.left;
          }
          
        }
        else {
          n.rank++;
  
          if(n.right==null) {
            n.right=new Node(score);
            return rank;
          }
          else {
            n=n.right;
          }
        }
        }
      }
        return rank;
      }
    }
   static void storeBSTNodes(Node root, Vector<Node> nodes)  
    { 
        // Base case 
        if (root == null) 
            return; 
  
        // Store nodes in Inorder (which is sorted 
        // order for BST) 
        storeBSTNodes(root.left, nodes); 
        nodes.add(root); 
        storeBSTNodes(root.right, nodes); 
    } 
  
    /* Recursive function to construct binary tree */
   static Node buildTreeUtil(Vector<Node> nodes, int start, 
            int end)  
    { 
        // base case 
        if (start > end) 
            return null; 
  
        /* Get the middle element and make it root */
        int mid = (start + end) / 2; 
        Node node = nodes.get(mid); 
  
        /* Using index in Inorder traversal, construct 
           left and right subtress */
        node.left = buildTreeUtil(nodes, start, mid - 1); 
        node.right = buildTreeUtil(nodes, mid + 1, end); 
  
        return node; 
    } 
  
    // This functions converts an unbalanced BST to 
    // a balanced BST 
   static Node buildTree(Node root)  
    { 
        // Store nodes of given BST in sorted order 
        Vector<Node> nodes = new Vector<Node>(); 
        storeBSTNodes(root, nodes); 
  
        // Constucts BST from nodes[] 
        int n = nodes.size(); 
        return buildTreeUtil(nodes, 0, n - 1); 
    } 
    public static void main(String[]args) throws IOException {
      int x=readInt();
      BST a=new BST();
      for(int i=0;i<=x-1;i++) {
        sum+=a.addRank(readInt())+1;
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
  }
