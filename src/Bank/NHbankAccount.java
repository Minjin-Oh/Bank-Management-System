package Bank;

import java.util.Scanner;

public class NHbankAccount extends Bank {
	
	public NHbankAccount(BankKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Name : ");
		String name = input.next();
		this.setName(name);
		
		System.out.println("Birth : ");
		String Birth = input.next();
		this.setBirth(Birth);
		
		System.out.print("Account : ");
		String account = input.next();
		this.setAccount(account);
		
		char answer = 'x';		
		while (answer != 'Y' && answer != 'y' && answer !='N' && answer != 'n') {
			System.out.println("Do you have a Phone Number? (Y/N)");
			answer = input.next().charAt(0);
			if (answer == 'Y' || answer == 'y') {
				System.out.print("Phone Number : ");
				String num = input.next();
				this.setNum(num);
				break;
			}
			else if(answer == 'N' || answer == 'n') {
				this.setNum(null);
				break;
			}
			else {
			}
		}
	}
	
}
