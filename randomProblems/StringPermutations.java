package randomProblems;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class StringPermutations {

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
       String x=sc.next();
     char[] a=x.toCharArray();
     Arrays.sort(a);
   
       String y=new String(a);    permutation(y);
    }

   

   public static void permutation(String input){
          permutation("", input);
   }

   
   public static void permutation(String perm, String word) {
        if (word.isEmpty()) {
            System.out.println(perm + word);

        } else {
            for (int i = 0; i < word.length(); i++) {
                permutation(perm + word.charAt(i), word.substring(0, i) 
                                        + word.substring(i + 1, word.length()));
            }
        }

    }
}