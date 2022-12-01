package module2.ajk.exceptions.coustomException;

import java.util.Scanner;

public class account {
	double balance;
	double amt;
	int oldPin = 9847;
	public account(double balance) {
		super();
		this.balance= balance;
	}
	public void withdraw(double amt)throws inSafficentBalance {
		System.out.print("Enter the pin = ");
		Scanner s = new Scanner(System.in); 
		int Epin = s.nextInt();
		if (oldPin == Epin) {
			if (amt>balance) {
				System.out.println("Shortage amount is "+(amt-balance)+" Rs");
				throw new inSafficentBalance();
			} else {
				this.amt = amt;
				balance -= amt;
				System.out.println("withdrow success "+amt);
			}
		} else {
			System.out.println("Incorrect Pin");
		}
		
	}
	public void getBalance() {
		System.out.println("Your Account balance is = "+ balance);
	}
	public void pinChange () {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your old pin = ");
		int enterPin = s.nextInt();
		if (enterPin == oldPin) {
			System.out.print("Enter new Pin = ");
			int newPin = s.nextInt();
			System.out.print("Conforme your new pin = ");
			int conf = s.nextInt();
			if (newPin == conf) {
				System.out.println("pin Change successfully ");
				oldPin = newPin;
			}else {
				System.out.println("new pin and conforme pin is dose not match ");
			} 
		} else {
			System.out.println("incorrect pin");
		}
	}
	

}
