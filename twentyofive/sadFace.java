package twentyofive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class sadFace {
  static ArrayList<Integer> arr=new ArrayList<>();
  public static class Node {
    int score;
    Node left, right;
    int rank;
    int height;
     public Node(int input) {
    score=input;
    
    rank=0;
    height=1;
  }
     
  }

 public static class AVLTree { 
    
    Node root; 
    Node n=root;
    public AVLTree() {
      root=null;
    }
    // A utility function to get the height of the tree 
    int height(Node N) { 
        if (N == null) 
            return 0; 
  
        return N.height; 
    } 
  
    // A utility function to get maximum of two integers 
    int max(int a, int b) { 
        return (a > b) ? a : b; 
    } 
  
    // A utility function to right rotate subtree rooted with y 
    // See the diagram given above. 
    Node rightRotate(Node y) { 
        Node x = y.left; 
        Node T2 = x.right; 
  
        // Perform rotation 
        x.right = y; 
        y.left = T2; 
  
        // Update heights 
        y.height = max(height(y.left), height(y.right)) + 1; 
        x.height = max(height(x.left), height(x.right)) + 1; 
  
        // Return new root 
        return x; 
    } 
  
    // A utility function to left rotate subtree rooted with x 
    // See the diagram given above. 
    Node leftRotate(Node x) { 
        Node y = x.right; 
        Node T2 = y.left; 
  
        // Perform rotation 
        y.left = x; 
        x.right = T2; 
  
        //  Update heights 
        x.height = max(height(x.left), height(x.right)) + 1; 
        y.height = max(height(y.left), height(y.right)) + 1; 
  
        // Return new root 
        return y; 
    } 
  
    // Get Balance factor of node N 
    int getBalance(Node N) { 
        if (N == null) 
            return 0; 
  
        return height(N.left) - height(N.right); 
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
        rank+=n.rank+1; System.out.println("Left "+score+" "+ rank+" "+ n.score+ " "+ n.rank );
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
        System.out.println("Right "+score+" "+ rank+" "+ n.score+ " "+ n.rank );
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
  
    Node insert(Node node, int score) {
       
        /* 2. Update height of this ancestor node */
        node.height = 1 + max(height(node.left), 
                              height(node.right)); 
  
        /* 3. Get the balance factor of this ancestor 
              node to check whether this node became 
              unbalanced */
        int balance = getBalance(node); 
  
        // If this node becomes unbalanced, then there 
        // are 4 cases Left Left Case 
        if (balance > 1 && score < node.left.score) 
            return rightRotate(node); 
  
        // Right Right Case 
        if (balance < -1 && score > node.right.score) 
            return leftRotate(node); 
  
        // Left Right Case 
        if (balance > 1 && score > node.left.score) { 
            node.left = leftRotate(node.left); 
            return rightRotate(node); 
        } 
  
        // Right Left Case 
        if (balance < -1 && score < node.right.score) { 
            node.right = rightRotate(node.right); 
            return leftRotate(node); 
        } 
  
        /* return the (unchanged) node pointer */
        return node; 
    }  void preOrder(Node node) { 
   if (node != null) { 
       System.out.print(node.score + " "); 
       preOrder(node.left); 
       preOrder(node.right); 
   } 
} 
}

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringTokenizer st;
  public static void main(String[]args) throws IOException {
    int x=readInt();
    double sum=0;
    AVLTree tree=new AVLTree();
    for(int i=0;i<=x-1;i++) {
      int n=readInt();
      sum+=tree.addRank(n)+1;
      tree.root=tree.insert(tree.root, n ); 
    }

      
    double roundOff = Math.round((sum/x)* 100.0) / 100.0;
    System.out.println(roundOff);
    tree.preOrder(tree.root); 
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