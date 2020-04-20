package Bank;

import java.util.Scanner;

public class NHbankAccount extends Bank {
	
	public void getUserInput(Scanner input) {
		System.out.print("Name : ");
		String name = input.next();
		this.setName(name);
		
		char answer = 'x';
		
		System.out.println("Do you have an Birth? (Y/N)");
		answer = input.next().charAt(0);
		while (answer != 'Y' && answer == 'y' && answer =='N' && answer == 'n') {
			if (answer == 'Y' || answer == 'y') {
				System.out.print("Birth : ");
				String birth = input.next();
				this.setBirth(birth);
				break;
			}
			else if (answer =='N' || answer == 'n') {
				this.setBirth("");
				break;
			}
			else {
			}
		}
		
		System.out.print("Account : ");
		String account = input.next();
		this.setAccount(account);
		
		System.out.print("Phone Number : ");
		String num = input.next();
		this.setNum(num);
	}
	
}
