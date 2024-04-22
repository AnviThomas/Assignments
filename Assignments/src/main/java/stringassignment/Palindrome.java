package stringassignment;

public class Palindrome {
	    public static boolean Palindrome(String str) 
	    {
	        int left=0;
	        int right=str.length() -1;
	        
	        while (left<right) 
	        {
	            if (str.charAt(left) !=str.charAt(right)) 
	            {
	                return false;
	            }
	            left++;
	            right--;
	        }
	        return true;
	    }
	    public static void main(String[] args) 
	    {
	        String str1="Java";
	        String str2="Malayalam";
	        
	        System.out.println(str1 + " is a palindrome: " + Palindrome(str1));
	        System.out.println(str2 + " is a palindrome: " + Palindrome(str2));
	    }
	}

