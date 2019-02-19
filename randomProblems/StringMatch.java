package randomProblems;

import java.util.Scanner;

public class StringMatch 
{
    static int temp,i=0,j=0; static boolean flag=true,matcher=false;
     static int k=0;
    static String str=null,mstr=null;static char astr[],amstr[];

    static void getter(){
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
       
        astr=str.toCharArray();
         mstr = sc.nextLine();
         amstr=mstr.toCharArray();
    }

    static void stringMatch(){
      if(mstr.length()>astr.length) {
        System.out.println(-1);
      }
      else {
      while(i<astr.length){
            if(astr[i]==amstr[j]){
              k=i;
            while((j!=amstr.length)&&flag){temp=i;
                if(astr[i]!=amstr[j]) {flag=false;matcher=false;}
                else{matcher=true;}
                i++;j++;
              
            }if(matcher==true)break;i=temp;}i++;j=0;flag=true;

        }
        if(matcher==true) {System.out.println(k);}
        else    {System.out.println(-1);}
    }}

    public static void main(String[] args) {

    StringMatch.getter();
    StringMatch.stringMatch();

    }
}