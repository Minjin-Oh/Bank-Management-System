package Bank;

import java.util.Scanner;

public class KBbankAccount extends Bank {
	
	public void getUserInput(Scanner input) {
		System.out.print("Name : ");
		String name = input.next();
		this.setName(name);
		
		System.out.print("Birth : ");
		String birth = input.next();
		this.setBirth(birth);
		
		System.out.print("Account : ");
		String account = input.next();
		this.setAccount(account);
		
		System.out.print("Phone Number : ");
		String num = input.next();
		this.setNum(num);
	}
	
}
