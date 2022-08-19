package Exercicio7;

public class Employee {

	private String name;
	private double valuePerHour;
	private Integer	hours;
	
	public Employee() {
		
	}

	public Employee(String name, double valuePerHour, Integer hours) {
		this.name = name;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	
	public double payment() {
		return hours * valuePerHour;
	}
	
}
