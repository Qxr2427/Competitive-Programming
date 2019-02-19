package twentyofive;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class J5Bananas {
static boolean isMonkeyWord(String word) {
  boolean check=false;
  if(isAword(word)==true) {
    check=true;
  }
  else {
    
  int index=word.indexOf('N');
  while(index>=0) {
  if(isAword(word.substring(0, index))==true&&isMonkeyWord(word.substring(index+1))==true){
    check=true;
    break;
     
  }
  index=word.indexOf('N',index+1);
  }
  }
  return check;
}
public static void main(String[] args) throws Exception {
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  
  while (true) {
      String word = br.readLine();    //read a word
      if (word.equals("X"))   //exit if the word is 'X'
          break;
      
      //test if the word is a monkey word
      if (isMonkeyWord(word))
          System.out.println("YES");
      else
          System.out.println("NO");;
  }
  
  br.close();
}
    static boolean isAword(String word) {
   
        if (word.equals("A"))   
            return true;
        //An A-word is either only the single letter A, 
        //or the letter B followed by a monkey language word followed by the letter S
        if (word.length() >= 3 && word.charAt(0) == 'B' && word.charAt(word.length()-1) == 'S' && 
                isMonkeyWord(word.substring(1, word.length()-1)))
            return true;
        return false;
    
  }
}
