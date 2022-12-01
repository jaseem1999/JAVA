package module2.ajk.exceptions.coustomException;

import java.util.Scanner;

public class testerMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			account m = new account(5000);
			int cont;
			do {
				System.out.println("Choise your services ");
				System.out.println("1 ----> Check balance  ");
				System.out.println("2 ----> withdrow money  ");
				System.out.println("3 ----> change your pin ");
				int choise = sc.nextInt();
				switch (choise) {
				case 1: 
					m.getBalance();
					break;
				case 2:
					System.out.print("Enter the amount = ");
					double amt = sc.nextDouble();
					try {
						m.withdraw(amt);
					} catch (Exception e) {
						System.out.println("Sorry no sufficent balance");
					}
					break;
				case 3:
					m.pinChange();
					break;
				default:
					System.out.println("default value ");
					break;
				}
				System.out.println("Do you want continue  ");
				System.out.println("0 ----> Yes");
				System.out.println("1 ----> No");
				cont = sc.nextInt();
			} while (cont == 0);
			System.out.println(" Succefully complited ");
		}
}


