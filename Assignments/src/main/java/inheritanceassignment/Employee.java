package inheritanceassignment;

public class Employee {
	protected double basicPay;
    protected double deduction;
    protected double bonus;

    public Employee(double basicPay, double deduction, double bonus) {
        this.basicPay = basicPay;
        this.deduction = deduction;
        this.bonus = bonus;
    }
}
