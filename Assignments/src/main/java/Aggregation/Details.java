package Aggregation;

public class Details {
	String address;
	Student or;
	public Details(String address ,Student or) 
	{
		this.address=address;
		this.or=or;
	}
	public void show()
	{
		System.out.println("Name: " + or.name);
        System.out.println("Roll Number: " + or.rollNumber);
		 System.out.println("Address: " + address);
	}
	public static void main(String[] args) 
	{
        Student obj = new Student("Anvi", 24);
        Details obj1=new Details("Street wall,main road,DC55",obj);
        obj1.show();
       
    }
}
