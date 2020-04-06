
import java.util.Scanner;

public class BankManager {
	
	Bank bank = new Bank();
	Scanner input;
	
	BankManager(Scanner input){
		this.input = input;
	}
	public void addBank() {
		
		System.out.print("Name : ");
		bank.name = input.next();
		
		System.out.print("Birth : ");
		bank.birth = input.next();
		
		System.out.print("Account : ");
		bank.account = input.next();
		
		System.out.print("Phone Number : ");
		bank.num = input.next();
		
	}

	public void deleteBank() {
		
		System.out.print("Account : ");
		String account = input.next();
		if (account == null) {
			System.out.println("the bank account has not been registered");
			return;
		}
		if (bank.account.equals(account)) {
			bank = null;
			System.out.println("the bank account is deleted");
		}
	}
	
	public void editBank() {

		System.out.print("Account : ");
		String account = input.next();
		if (bank.account.equals(account)) {
			System.out.println("the bank account to be edited is " + account);
		}
		
	}
	
	public void viewBank() {

		System.out.print("Account : ");
		String account = input.next();
		if (bank.account.equals(account)) {
			bank.printInfo();
		}
	}
}
