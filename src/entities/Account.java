package entities;

public class Account {
	private int number;
	private String holder;
	private double balance;
	
	public Account(int number, String holder) { // Construtor - exige que o objeto seja iniciado para ser usado.
		this.number = number;
		this.holder = holder;
	}

	public Account(int number, String holder, double initialDeposit) { // SOBRECARGA de construtores
		super();
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public void deposit(double amount) { // Instânciar uma variavel.
		balance += amount;
		
	}
	public void withdraw(double amount) {
		balance -= amount + 5.00;
	}
	public String toString() { // Retorna uma String.
		return "Account " + number + ", Holder: " + holder + ", Balance: $ " + String.format("%.2f", balance);
	}
}
