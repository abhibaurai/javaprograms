import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {


	    char op;
	   int n1, n2, result;
	    Scanner input = new Scanner(System.in);
	    System.out.println("Choose option: +, -, *, /");
	    op = input.next().charAt(0);

	    
	    System.out.println("Enter first number");
	    n1 = input.nextInt();

	    System.out.println("Enter second number");
	    n2 = input.nextInt();

	    switch (op) {


	      case '+':
	        result = n1 + n2;
	        System.out.println(n1 + " + " + n2 + " = " + result);
	        break;

	      
	      case '-':
	        result = n1 - n2;
	        System.out.println(n1 + " - " + n2 + " = " + result);
	        break;

	     	      case '*':
	        result = n1 * n2;
	        System.out.println(n1 + " * " + n2 + " = " + result);
	        break;

	    
	      case '/':
	        result = n1 / n2;
	        System.out.println(n1 + " / " + n2 + " = " + result);
	        break;

	      default:
	        System.out.println("wrong option");
	        break;
	    }

	   
	  }
	

}
