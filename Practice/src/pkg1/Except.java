package pkg1;

public class Except { 
		   public static void main(String args[]) { 
		      try { 
		         int a[] = new int[5];
		         a[5] = 30/0;  
		      }  
		      catch(ArithmeticException e){System.out.println("ArithmeticException e");}  
		      catch(ArrayIndexOutOfBoundsException e){System.out.println("ArrayIndexOutOfBoundsException e");}  
		      catch(Exception e){System.out.println("Exception e");}
		      System.out.println("rest of the code...");  
		   }  
		} 


