package entities;

public class Employee {
	public String name;
	public double grossSalary, tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	public void increaseSalary(double percentage) {
		System.out.printf("Updated data: %s, $ %.2f", name, netSalary() + (grossSalary * (percentage / 100.0)));
	}
}
