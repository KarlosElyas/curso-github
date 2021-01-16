package application;

import java.util.Scanner;

import entities.StudentRoom;

//import entities.Student;
//import util.CurrencyConverter;

//import entities.Employee;

//import entities.Rectangle;

public class ProgramRectangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StudentRoom[] vect = new StudentRoom[10];
		
		System.out.print("How many rooms wiil be rented? ");
		int n = input.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.printf("\nRent #%d:\nName: ", i + 1);
			input.nextLine();
			String name = input.nextLine();
			System.out.print("Email: ");
			String email = input.nextLine();
			System.out.print("Room: ");
			int roomNumber = input.nextInt();
			vect[roomNumber] = new StudentRoom(name, email);
		}
		System.out.println("\nBusy rooms:");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}			
		}
		
		/*double dollar, totalDollar;
		System.out.print("What is the dollar price? ");
		dollar = input.nextDouble();
		System.out.print("How many dollars will be bought? ");
		totalDollar = input.nextDouble();
		System.out.printf("Amount to be paid in reais = %.2f", 
				CurrencyConverter.reaisValue(dollar, totalDollar));*/
		
		
		/*Student student = new Student();
		student.name = input.nextLine();
		student.n1 = input.nextDouble();
		student.n2 = input.nextDouble();
		student.n3 = input.nextDouble();
		student.result();*/
		
		/*Employee employee = new Employee();
		System.out.print("Name: ");
		employee.name = input.nextLine();
		System.out.print("Gross salary: ");
		employee.grossSalary = input.nextDouble();
		System.out.print("Tax: ");
		employee.tax = input.nextDouble();
		
		System.out.printf("Employee: %s, $ %.2f\n", employee.name, employee.netSalary());
		System.out.print("Which percentage to increase salary? ");
		double percentage = input.nextDouble();
		employee.increaseSalary(percentage);*/
		
		/*Rectangle rectangle = new Rectangle();
		System.out.println("Enter rectangle width and height: ");
		rectangle.width = input.nextDouble();
		rectangle.height = input.nextDouble();

		System.out.printf("AREA = %.2f\nPERIMETER = %.2f\nDIAGONAL = %.2f", rectangle.area(), rectangle.perimeter(),
				rectangle.diagonal());*/

		input.close();
	}

}
