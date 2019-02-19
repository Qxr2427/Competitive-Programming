package twentyseven;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class J2TXMG {
  public static void main(String[]args) {
    Scanner sc=new Scanner(System.in);
    Map<String, String> a =
        new HashMap<String, String>();
    a.put("CU", "see you");
    a.put(":-)" , "I'm happy");
    a.put(":-(",   "I'm unhappy");
    a.put(";-)" , "wink" );
    a.put(":-P",  "stick out my tongue");
    a.put("(~.~)" ,"sleepy");
    a.put("TA",   "totally awesome");
    a.put("CCC",  "Canadian Computing Competition");
    a.put("CUZ","because");
    a.put("TY","thank-you");
    a.put("YW",   "you're welcome");
    a.put("TTYL", "talk to you later");
    
    String x="";
    while(!x.equalsIgnoreCase("TTYL")){
      x=sc.nextLine();
      if(a.containsKey(x)) {
      System.out.println(a.get(x));}
      else {
        System.out.println(x);
      }
    }
  }
}
