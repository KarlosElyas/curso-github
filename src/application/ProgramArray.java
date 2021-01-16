package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.EmployeeAccount;

public class ProgramArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<EmployeeAccount> employee = new ArrayList<>();
		
		System.out.print("How many employees will be registred? ");
		int n = input.nextInt();
	
		for (int i = 0; i < n; i++) {
			System.out.printf("\nEmployee #%d:\nID: ", i + 1);
			int id = input.nextInt();
			System.out.print("Name: ");
			input.nextLine();
			String name = input.nextLine();
			System.out.print("Salary: ");
			double salary = input.nextDouble();
			employee.add(new EmployeeAccount(id, name, salary));
		}
		System.out.print("\nEnter the employee id that will have salary increase: ");
		int id = input.nextInt();
		
		boolean exist = false;
		for (EmployeeAccount x : employee) {
			if (x.getID() == id) {
				System.out.print("Enter the percentage: ");
				double salaryIncrease = input.nextDouble();
				x.increase(salaryIncrease);
				exist = true;
			}
		}
		if (exist == false) {
			System.out.println("this ID doens't exist!");		
		}
		System.out.println("\nList of employees:");
		for (EmployeeAccount x : employee) {
			System.out.println(x);
		}
				
		input.close();
	}

}
