package thisKeyword;

public class ReverseNumber {
	    int number;
	    public ReverseNumber(int number) 
	    {
	        this.number = number;
	    }
	    public ReverseNumber() 
	    {
	       
	    }
	    public int calculateReverse() 
	    {
	        int reversed=0;
	        int temp=number;
	        while (temp!=0) 
	        {
	            int digit = temp % 10;
	            reversed = reversed * 10 + digit;
	            temp = temp/10;
	        }
	        return reversed;
	    }
	    public void displayReverse() 
	    {
	        int reversed = calculateReverse();
	        System.out.println("Reverse of " + number + " is: " + reversed);
	    }
	    public static void main(String[] args) 
	    {
	        ReverseNumber obj = new ReverseNumber(1234); 
	        obj.displayReverse();
	    }
}

