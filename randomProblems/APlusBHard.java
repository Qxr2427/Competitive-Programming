package randomProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class APlusBHard
{
    private static BufferedReader in;
    private static StringTokenizer st;
    
    public static void main(String[]args) throws IOException
    {
        in = new BufferedReader(new InputStreamReader(System.in));
        
        int cases = nextInt();
        for(int loop = 0; loop < cases; loop++){
            
            String num1 = next();
            String num2 = next();
            
            String[] order = larger(num1, num2);
            
            String[] oldset1 = order[0].split("");
            String[] oldset2 = order[1].split("");
                        if(order[0].equals("0") && order[1].equals("0"))
                System.out.println(0);
            
            else if(operation(num1, num2).equals("add")){//add
                //put the numbers into an integer arraylist in reverse order for set 1
                ArrayList <Integer> set1 = new ArrayList<Integer>();
                for(int x = oldset1.length - 1; x >= 0; x--)
                    set1.add(Integer.parseInt(oldset1[x]));
                
                //put the numbers into an integer arraylist in reverse order for set 2
                ArrayList <Integer> set2 = new ArrayList<Integer>();
                for(int x = oldset2.length - 1; x >= 0; x--)
                    set2.add(Integer.parseInt(oldset2[x]));
                
                //get the max size that the number could possible be 
                int max = Math.max(set1.size(), set2.size()) + 5;
                
                //make both arrayLists the same size with the addition of 5 more zeros for leeway
                while(set1.size()<max)set1.add(0);
                while(set2.size()<max)set2.add(0);
                
                //new big number adder, my logic in the old one was right but it worked half the time so idk. had to do everything more carefully this time to get it to work
                int carry = 0;
                for(int x = 0; x < max; x++) {
                    
                    int added = set1.get(x) + set2.get(x) + carry;
                    
                    if(added >= 10) {
                        carry = (int)Math.floor(added / 10);
                        set2.set(x, added % 10);
                        
                    }else {
                        set2.set(x, added);
                        carry = 0;
                    }
                    
                }
                
                Collections.reverse(set2);
                
                while(true) {//remove leading zeros
                    if(set2.get(0) == 0)
                        set2.remove(0);
                    else
                        break;
                }
                
                if(sign(num1, num2).equals("negative")) System.out.print("-");
                System.out.println(set2.toString().replaceAll("[\\[\\], ]",""));
            }
            else{//subtract
                
                //adds the split numbers into their respective arrayLists
                ArrayList <Integer> set1 = new ArrayList<Integer>();
                for(int x = oldset1.length-1; x >= 0; x--)
                    set1.add(Integer.parseInt(oldset1[x]));
                
                //put the numbers into an integer arraylist in reverse order for set 2
                ArrayList <Integer> set2 = new ArrayList<Integer>();
                for(int x = oldset2.length-1; x >= 0; x--)
                    set2.add(Integer.parseInt(oldset2[x]));
                
                while(set2.size() != set1.size())
                    set2.add(0);
                
                int carry = 0;
                for(int x = 0; x < set1.size(); x++) {
                    int subtracted = set1.get(x) - set2.get(x) - carry;
                    set2.set(x, (subtracted < 0) ? subtracted + 10 : subtracted);//adds correctly depending on if there is a carry over
                    carry = (subtracted < 0) ? 1 : 0;
                }
                
                Collections.reverse(set2);
                
                while(true){//remove leading zeros
                    if(set2.get(0) == 0)
                        set2.remove(0);
                    else
                        break;
                }
                
                if(sign(num1, num2).equals("negative")) System.out.print("-");
                System.out.println(set2.toString().replaceAll("[\\[\\], ]",""));
            }
        }
        in.close();
    }
    
    //method finds the correct operation needed to be done
    public static String operation(String num1, String num2){
        if(num1.charAt(0) == '-' && num2.charAt(0) == '-')
            return "add";
        else if(num1.charAt(0) != '-' && num2.charAt(0) != '-')
            return "add";
        else
            return "subtract";
    }
    
    //method to find the larger and smaller of the two numbers and put them in order of the larger being first, smaller being second
    public static String[] larger(String num1, String num2){
        String[] bigSmall = {"0", "0"};
        
        if(num1.equals(num2)){//if both the numbers are the same then return it as is without negative sign
            bigSmall[0] = num1.replace("-", "");
            bigSmall[1] = num2.replace("-", "");
            return bigSmall;
        }
        
        num1 = num1.replace("-", "");
        num2 = num2.replace("-", "");
        
        if(num1.length() > num2.length()){
            bigSmall[0] = num1;
            bigSmall[1] = num2;
            return bigSmall;
        }
        else if(num1.length() < num2.length()){
            bigSmall[0] = num2;
            bigSmall[1] = num1;
            return bigSmall;
        }
        else{
            String[] num1Split = num1.split("");
            String[] num2Split = num2.split("");
            
            for(int x = 0; x < num1Split.length; x++){
                if(Integer.parseInt(num1Split[x]) > Integer.parseInt(num2Split[x])){
                    bigSmall[0] = num1;
                    bigSmall[1] = num2;
                    return bigSmall;
                }
                else if(Integer.parseInt(num1Split[x]) < Integer.parseInt(num2Split[x])){
                    bigSmall[0] = num2;
                    bigSmall[1] = num1;
                    return bigSmall;
                }
            }
        }
        return bigSmall;
    }
    
    //method finds the final answer's sign 
    public static String sign(String num1, String num2){
        String[] order = larger(num1, num2);
        
        if(num1.charAt(0) == '-' && num2.charAt(0) == '-')//both negative
            return "negative";
        else if(num1.charAt(0) != '-' && num2.charAt(0) != '-')//both positive
            return "positive";
        else if(num1.charAt(0) == '-' && num2.charAt(0) != '-'){//first negative, second positive
            if(num1.replace("-", "").equals(order[0]))
                return "negative";
            else
                return "positive";
        }
        else if(num1.charAt(0) != '-' && num2.charAt(0) == '-'){//first negative, second positive
            if(num1.replace("-", "").equals(order[0]))
                return "positive";
            else
                return "negative";
        }
        return "positive";
    }
    
    //methods for fast scanner
    private static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(in.readLine().trim());
        return st.nextToken();
    }
    private static int nextInt() throws IOException{return Integer.parseInt(next());}
    private static double nextDouble() throws IOException{return Double.parseDouble(next());}
    private static char nextCharacter() throws IOException{return next().charAt(0);}
    private static long nextLong() throws IOException{return Long.parseLong(next());}
    private static String nextLine() throws IOException{return in.readLine().trim();}
}