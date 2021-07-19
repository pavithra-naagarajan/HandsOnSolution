package exceptiondemo;

public class BankAccount {

	public void withdraw (int amount) throws InvalidAmountException,DailyLimitExceedException{
		if(amount<0)
			throw new InvalidAmountException("you cannot withdraw negative amount");
		else if(amount>5000)
			throw new InvalidAmountException("you cannot withdraw more than 5000 in a day");
		System.out.println("successfully withdrawn");

}
	
	
	public void deposit(int amount) throws InvalidAmountException,DailyLimitExceedException{
		if(amount<0)
			throw new InvalidAmountException("you cannot deposit negative amount");
		else if(amount>5000)
			throw new InvalidAmountException("you cannot deposit more than 5000 in a day");
		
		System.out.println("successfully deposited");


	}
	
	public static void main(String[] args)  {
		BankAccount bankcustomer=new BankAccount();
		try {
			bankcustomer.withdraw(1000);
		} catch (InvalidAmountException | DailyLimitExceedException e) {
			System.out.println(e.getMessage());
		}
		try {
			bankcustomer.deposit(-2000);
		}
		catch (InvalidAmountException | DailyLimitExceedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Thanks for using the application");
	}
	
}
