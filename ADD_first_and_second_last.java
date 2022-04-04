
public class ADD_first_and_second_last {
	 public static int first(int n)
	    {

	        while (n >= 10)
	            n /= 10;
	     
	        
	        return n;
	    }
	  
	    public static int last(int n)
	    {

	        n=n/10;
	        return(n%10);
	    }
	     
	    public static void main(String args[])
	    {
	        int n = 12345;
	        System.out.println(first(n) + last(n));
	    }
	}


