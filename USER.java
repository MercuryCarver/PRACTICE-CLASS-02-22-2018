import java.util.Scanner;
public class USER {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SavingsAccount user = new SavingsAccount("Jay", 100034,100);
SavingsAccount user2 = new SavingsAccount("Ailean", 100190, 1000);
SavingsAccount user3 = new SavingsAccount("John", 100255, 3223);

SavingsAccount CurrentAccount = new SavingsAccount("jmj",67,556);
SavingsAccount OverdraftAccount = new SavingsAccount("jmj",67,556);
Scanner input = new Scanner(System.in);
System.out.println("Put in your pin");
int p = input.nextInt();
if(p==100034) {
	System.out.println("Welcome Jay, 1. For deposit or 2. For withdrawal");
	CurrentAccount=user;
}else if(p==100190) {
	System.out.println("Welcome Ailean, 1. For deposit or 2. For withdrawal");
	CurrentAccount=user2;
}else if(p==100255){
	System.out.println("Welcome John, 1. For deposit or 2. For withdrawal");	
}else {
	System.out.println("Wrong pin number");
}
int amount = input.nextInt();
if(amount==2) {
	System.out.println("How much would you like to withdraw");
	int withdraw = input.nextInt();
	double Current = (CurrentAccount.Withdraw(withdraw));
}else if(amount ==1) {
	System.out.println("How much would you like to deposit");
	int deposit = input.nextInt();
	double Account = (CurrentAccount.Deposit(deposit));
}

System.out.println("Your balance is " + CurrentAccount.balance);

	}}

