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
          niceNumbers(left,right,digit) ; 
		 
	}
	
	public static void niceNumbers( int left , int right , int digit ) {
	    	boolean status= true; 

	    	    for(int n=left;n<=right;n++){
				n=n%10;
		
	    	        if(n==digit) {status=false;}
				n=n/10;	
			while(n!= 0){
					int x=n%10;
					if(x<=n||x== digit){  status=false;
							breack; }
					else  { n = n + x ;
						n = n / 10 ; 
								 }
					if(status==true){System.out.println(n);}	
							}
							}
							}
							 }
 

	    	         