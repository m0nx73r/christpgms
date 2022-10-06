package prac11;

interface MyAccount{
	void deposit_of_money(int money);
	void withdrawal_of_money(int money);
	void get_balance();
}


class BankAccount implements MyAccount{
	
	int totalMoney = 0;
	
	@Override
	public void deposit_of_money(int money) {
		totalMoney += money;
		
	}

	@Override
	public void withdrawal_of_money(int money) {
		totalMoney -= money;
	}

	@Override
	public void get_balance() {
		System.out.println("Account Balance : " + totalMoney);
	}
	
}

public class pgm1 {

	public static void main(String[] args) {
		BankAccount bk = new BankAccount();
		bk.deposit_of_money(500);
		bk.withdrawal_of_money(300);
		bk.get_balance();
	}
}
