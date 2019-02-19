package randomProblems;

import java.io.*;
public class oddNumber {
  public static void main(String[]args) throws NumberFormatException, IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int res=0;
    int x=Integer.parseInt(br.readLine());
    for(int i=1;i<=x;i++) {
      int a=Integer.parseInt(br.readLine());
      res^=a;
    }
    System.out.println(res);
  }
}
