package application;

import java.util.Scanner;

import entities.Account;

public class ProgramBank {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter account number: ");
		int accountNumber = input.nextInt();
		input.nextLine();
		System.out.print("Enter account holder: ");
		String name = input.nextLine();
		System.out.print("Is there an initial deposit (y/n)?");
		char initialDeposit = input.next().charAt(0);
		
		if (initialDeposit == 'y') {
			System.out.print("Enter initial deposit value: ");
			double deposit = input.nextDouble();
			account = new Account(accountNumber, name, deposit);
		} else {
		account = new Account(accountNumber, name);
		}
		System.out.printf("\nAccount data:\n" + account);
		
		System.out.print("\nEnter a deposit value: ");
		Double alterValue = input.nextDouble();
		account.deposit(alterValue);
		System.out.println("Updated account data:\n" + account);
		
		System.out.print("Enter a withdraw value: ");
		alterValue =  input.nextDouble();
		account.withdraw(alterValue);
		System.out.println("Updated account data:\n" + account);

		input.close();
	}

}
