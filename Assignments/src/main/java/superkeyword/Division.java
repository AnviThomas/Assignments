package superkeyword;

public class Division extends Addition {
	public boolean Divisible(int a, int b) 
	{
        int sum = super.add(a, b);
        return sum % 10==0;
    }
	public static void main(String[] args) 
	{
        Division checker = new Division();
        int number1 = 25;
        int number2 = 15;
        boolean result = checker.Divisible(number1, number2);
        if (result) 
        {
            System.out.println("The addition result is divisible by 10.");
        } 
        else 
        {
            System.out.println("The addition result is not divisible by 10.");
        }
    }
}
