package inheritanceassignment;

public class Salary extends Employee {
	    private double HRA;
	    private double PF;

	    public Salary(double basicPay, double deduction, double bonus) 
	    {
	        //this.basicPay = basicPay;
	        //this.deduction = deduction;
	        //this.bonus = bonus;
	    	super(basicPay,deduction,bonus);
	    }
	    public void calculateSalary() 
	    {
	        HRA = 0.05 * basicPay;
	        PF = 0.20 * basicPay;
	    }

	    public double TotalSalary() 
	    {
	        return basicPay + HRA - PF - deduction + bonus;
	    }

	    public void printSalarySlip() 
	    {
	        System.out.println("\nSalary Slip:");
	        System.out.println("Basic Pay " + basicPay);
	        System.out.println("Deduction " + deduction);
	        System.out.println("HRA " + HRA);
	        System.out.println("PF " + PF);
	        System.out.println("Bonus " + bonus);
	        System.out.println("Total Salary: " + TotalSalary());
	    }
	    public static void main(String[] args) {
	        
	        double basicPay = 50000;
	        double deduction = 5000;
	        double bonus = 2000;

	        Salary employee = new Salary(basicPay, deduction, bonus);
	        employee.calculateSalary();
	        employee.printSalarySlip();
	    }
}
