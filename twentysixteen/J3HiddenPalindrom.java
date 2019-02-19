package twentysixteen;

import java.util.Scanner;

public class J3HiddenPalindrom {
	
	  static int count=0;
	  public static void main(String args[])
	  {
	    Scanner sc=new Scanner(System.in);
	    String s1=sc.next();
	    String array[]=s1.split("");
	    for(int i=0;i<=array.length;i++)
	    {
	        for(int j=0;j<i;j++)
	        {
	            String B=s1.substring(j,i);
	            verify(B);System.out.println(Math.max(B.length(), j));
	        }
	    }
	    
	    sc.close();
	  }
	  public static void verify(String s1)
	  {
	    StringBuilder sb=new StringBuilder(s1);
	    String s2=sb.reverse().toString();
	    if(s1.equals(s2))
	    {
	        System.out.print(s1+" ");
	    }
	  }
	}
	
	
