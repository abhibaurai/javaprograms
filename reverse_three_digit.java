
public class reverse_three_digit {

	
	public static void main(String[] args)   
	{  
	int n = 132, r = 0;  
	while(n != 0)   
	{  
	int remainder = n % 10;  
	r = r * 10 + remainder;  
	n = n/10;  
	}  
	System.out.println(r);  
	}  
}
