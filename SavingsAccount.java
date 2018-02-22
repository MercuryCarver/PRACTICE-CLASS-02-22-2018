import java.util.Scanner;
public class SavingsAccount {

	String UserName;
	int pin;
	double balance;
	
	public SavingsAccount(String UserName2, int pin2, double balance2) {
		UserName=UserName2;
		pin = pin2;
		balance = balance2;
	}
	public double Withdraw(double with) {
		balance = balance-with;
		double takeout = with - balance;
		return takeout;
	}
	public double Deposit(double dep) {
		balance = balance + dep;
		double putin = dep + balance;
		return putin;
	}
	}

