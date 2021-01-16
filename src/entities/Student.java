package entities;

public class Student {
	public String name;
	public double n1, n2, n3;

	public void result() {
		double total = n1 + n2 + n3;
		System.out.printf("FINAL GRADE = %.2f\n", total);
		if (total >= 60.0) {
			System.out.println("PASS");
		}else {
			System.out.printf("FAILED\nMISSING %.2f POINTS", 60.00 - total);
		}
	}
}
