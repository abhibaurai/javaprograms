
public class sum_of_three_digits {
	static int sum(int n)
    {
        int sum = 0;
  
        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
  
        return sum;
    }
  

    public static void main(String[] args)
    {
        int n = 132;
  
        System.out.println(sum(n));
    }
}

