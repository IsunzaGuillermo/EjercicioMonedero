package monedero;

import java.util.Scanner;

public class Monedero {

	// Objects
	Scanner sc = new Scanner(System.in);

	// Attributes
	public String firstName;
	public String lastName;
	public double balance;

	// Contructor

	public Monedero(String firstName, String lastName, double balance) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.balance = balance;
	}

	// Methods

	public void menuSystem() {

		int menuOption;

		do {
			System.out.println("1.- Deposit Money");
			System.out.println("2.- Withdraw Money");
			System.out.println("3.- Check Balance");
			System.out.println("Choose one:");
			menuOption = sc.nextInt();
			if (menuOption == 1) {
				addMoney();
			}else if (menuOption == 2) {
				withdrawMoney();
			} else if (menuOption == 3) {
				checkBalance();
			}
		} while (menuOption < 1 || menuOption > 3);

	}
	
	public void addMoney() {
		double sum = this.balance;
		System.out.println("Type the amount of money you want to deposit");
		double inputMoney = sc.nextDouble();
		double addMoney = sum + inputMoney;
	}

	public void withdrawMoney() {
		double subs = this.balance;
		System.out.println("Type the amount of money you want to withdraw");
		double withdrawedMoney = sc.nextDouble();
		if (withdrawedMoney <= subs) {
			double removeMoney = subs - withdrawedMoney;
		} else if (withdrawedMoney > subs) {
			System.out.println("You can't withdraw that amount of money, it's greater than your balance");
		}
	}

	public void checkBalance() {
		System.out.println("Your balance is : " + this.balance);
	}

	@Override
	public String toString() {
		return "Monedero [sc=" + sc + ", firstName=" + firstName + ", lastName=" + lastName + ", balance=" + balance
				+ "]";
	}

}// class
