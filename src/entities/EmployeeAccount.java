package entities;

public class EmployeeAccount {
	private int ID;
	private String name;
	private double salary;
		
	public EmployeeAccount(int ID, String name, double salary) {
		this.ID = ID;
		this.name = name;
		this.salary = salary;
	}
	public int getID() {
		return ID;
	}
	public void increase(double percentage) {
		salary *= (percentage / 100.00) + 1.00;
	}
	public String toString() {
		return ID + ", " + name + ", " + String.format("%.2f", salary);
	}
}
