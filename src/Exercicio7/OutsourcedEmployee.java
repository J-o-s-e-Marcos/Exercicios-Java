package Exercicio7;

public class OutsourcedEmployee extends Employee {

	private double additionalCharger;

	
	public OutsourcedEmployee() {
		super();
	}
	
	public OutsourcedEmployee(String name, double valuePerHour, Integer hours, double additionalCharger) {
		super(name, valuePerHour, hours);
		this.additionalCharger = additionalCharger;
	}

	public double getAdditionalCharger() {
		return additionalCharger;
	}

	public void setAdditionalCharger(double additionalCharger) {
		this.additionalCharger = additionalCharger;
	}
	
	@Override
	public double payment() {
		return super.payment() + additionalCharger * 1.1;
	}
	
}
