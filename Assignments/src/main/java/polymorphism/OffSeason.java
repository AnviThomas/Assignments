package polymorphism;

public class OffSeason extends OnSeason{
public void discount()
{
	super.discount();
	System.out.println("Discounted price for OffSeason " +price*0.15);
}
public static void main(String args[]) {
	OffSeason obj=new OffSeason();
	obj.discount();
	OnSeason obj1=new OnSeason();
	
}
}
