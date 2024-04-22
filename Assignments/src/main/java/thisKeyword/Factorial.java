package thisKeyword;

public class Factorial {
	   int number;

	    public Factorial(int number) 
	    {
	        this.number = number;
	    }
	    public int calculateFactorial() 
	    {
	        if (number==0||number==1) 
	        {
	            return 1;
	        } 
	        else 
	        {
	            return number * this.calculateFactorialRecursive(number -1);
	        }
	    }
	    private int calculateFactorialRecursive(int n) 
	    {
	        if (n==0||n==1) 
	        {
	            return 1;
	        } 
	        else 
	        {
	            return n * this.calculateFactorialRecursive(n -1);
	        }
	    }
	    public void printFactorial() 
	    {
	        int factorial = this.calculateFactorial();
	        System.out.println("Factorial of " + number + " is" + factorial);
	    }

	    public static void main(String[] args) 
	    {
	        Factorial obj = new Factorial(5); 
	        obj.printFactorial();

	    }
}
