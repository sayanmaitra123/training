
public class Accounts {
	private double balance;

	public Accounts(double balance) {
		// TODO Auto-generated constructor stub
		this.balance = balance;
	}

	public double deposit(double amount) {
		// TODO Auto-generated method stub
		if (amount < 0)
			throw new NumberFormatException("Negative Amount !!");
		balance += amount;
		return balance;
	}

	public double withdraw(double amount) throws BalanceException {
		// TODO Auto-generated method stub
		if (amount < 0)
			throw new NumberFormatException("Negative Amount !!");
		if (amount > balance)
			throw new BalanceException("Insufficient Funds !!");

		balance -= amount;
		return balance;

	}

}
