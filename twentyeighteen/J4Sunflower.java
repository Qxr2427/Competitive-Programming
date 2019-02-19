package twentyeighteen;

import java.util.Scanner;
	
public class J4Sunflower  {
  public static boolean nothing(int[][] grid,int x) {
    boolean a=false;
    for(int i=0;i<x;i++) {
      if(grid[i][0]<grid[i][x-1]&&grid[0][i]<=grid[x-1][i]) {
        a=true;
      }
      else {
        a=false;
        break;
      }
    }
    return a;
  }
  public static boolean ninty(int[][] grid,int x) {
    boolean a=false;
    for(int i=0;i<x;i++) {
      if(grid[i][0]>=grid[i][x-1]&&grid[0][i]<=grid[x-1][i]) {
        a=true;
      }
      else {
        a=false;
        break;
      }
    }
    return a;
  }
  public static boolean twoseventy(int[][] grid,int x) {
    boolean a=false;
    for(int i=0;i<x;i++) {
      if(grid[i][0]<=grid[i][x-1]&&grid[0][i]>=grid[x-1][i]) {
        a=true;
      }
      else {
        a=false;
        break;
      }
    }
    return a;
  }
  public static boolean oneeighty(int[][] grid,int x) {
    boolean a=false;
    for(int i=0;i<x;i++) {
      if(grid[i][0]>=grid[i][x-1]&&grid[0][i]>=grid[x-1][i]) {
        a=true;
      }
      else {
        a=false;
        break;
      }
    }
    return a;
  }
  
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		int[][] ret=new int[x][x];
		int[][] grid =new int[x][x];
		for(int row=0;row<x;row++) {
			for(int col=0;col<x;col++) {
				grid[row][col]=sc.nextInt();
				ret[row][col]=grid[row][col];
			}
		}

	

		 
		 
		 
		  

		    
		  if(ninty(grid,x)==true) {
		 
		        for(int row=0;row<x;row++) {
              for(int col=0;col<x;col++) {
            ret[row][col] = grid[col][x-row-1];
          
            }
		  }
		    
		        for(int row=0;row<x;row++) {
	                for(int col=0;col<x;col++) {
	                    System.out.print(ret[row][col]+" ");
	                }
	            
	                System.out.println();
	            }
		       
		  
		    
		   
		    
		  		  }
		  else if(oneeighty(grid,x)==true) {
           
                for(int row=0;row<x;row++) {
              for(int col=0;col<x;col++) {
            ret[row][col] = grid[x-1-row][x-col-1];
          
            
          }
            }
                
               
            
                for(int row=0;row<x;row++) {
                  for(int col=0;col<x;col++) {
                      System.out.print(ret[row][col]+" ");
                  }
              
                  System.out.println();
              }
            
                  }
		  else if(twoseventy(grid,x)==true) {
            
                for(int row=0;row<x;row++) {
              for(int col=0;col<x;col++) {
            ret[row][col] = grid[x-1-col][row];
          
            }
          
            }
              
              
                for(int row=0;row<x;row++) {
                  for(int col=0;col<x;col++) {
                      System.out.print(ret[row][col]+" ");
                  }
              
                  System.out.println();
              }
            
           
            
                  }
		  
		
		  else {
		    
		  
		    for(int row=0;row<x;row++) {
	            for(int col=0;col<x;col++) {
	                System.out.print(ret[row][col]+" ");
	            }
		    
	            System.out.println();
	        }
		  }
		  }
		    
		  }
		
		  
	
	

