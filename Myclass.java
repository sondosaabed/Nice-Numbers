
import java.util.Scanner;
	public class Myclass { 
		public static void main(String [] args){
			Scanner scan = new Scanner(System.in);
			  int left, right,digit  ; 
			  System.out.print ("Enter Left bound:");
			  left = scan.nextInt(); 
			  
			  System.out.print ("Enter Right bound:");
			  right = scan.nextInt(); 
			  
			  if(left<right) {
				  System.out.print ("Enter digit to exclude it:");
				  digit = scan.nextInt(); 
			      scan.close();  
			  }
			  else {
				  System.out.println("The left bound must be less than the right one");
				  System.out.print ("renter the right bound :");
				  right = scan.nextInt();
				  
				  System.out.print ("Enter digit to exclude it:");
				  digit = scan.nextInt(); 
			      scan.close();
			  }
			  
			  System.out.println("Nice Numbers in Range Left="+left +" Right=" +right+"with exclude digit m=" + digit+"are:");
		        print(left, right, digit);
			 
		}

		public static boolean isNice(int n, int d){
		        int digit = n%10;
		        int sum = digit;
		 
		        if (digit == d)
		        	return false;
		 
		        	n /= 10;
		        while (n>0){
		            digit = n%10;
		     
		            if (digit == d || digit <= sum)
		                return false;
		 
		            else{
	                    sum += digit;
	                    n /= 10;
		            }
		        }
		        return true;
		}
		    
	  	
		public static void print(int L, int R, int d){
			for(int i=L;i<=R;i++){
			    if(isNice(i, d))
				System.out.print(i+" ");
			}
	    	}
 }
