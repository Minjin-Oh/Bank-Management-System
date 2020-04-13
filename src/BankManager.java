
import java.util.ArrayList;
import java.util.Scanner;

public class BankManager {
	ArrayList<Bank> banks = new ArrayList<Bank>();
	Scanner input;
	BankManager(Scanner input){
		this.input = input;
	}
	
	public void addBank() {
		
		Bank bank = new Bank();
		
		System.out.print("Name : ");
		bank.name = input.next();
		System.out.print("Birth : ");
		bank.birth = input.next();
		System.out.print("Account : ");
		bank.account = input.next();
		System.out.print("Phone Number : ");
		bank.num = input.next();
		banks.add(bank);
		
	}
	
	public void deleteBank() {
		System.out.print("Account : ");
		String bankAccount = input.next();
		int index = -1;
		for (int i = 0; i < banks.size(); i++) {
			if (banks.get(i).account.equals(bankAccount)) {
				index = i;
				break;
			}
		}
		
		if (index >= 0) {
			banks.remove(index);
			System.out.println("the bank account " + bankAccount + " is deleted");
		}
		else {
			System.out.println("the bank account has not been registered");
			return;
		}
	}

	public void editBank() {

		System.out.print("Account : ");
		String bankAccount = input.next();		
		for (int i = 0;  i < banks.size(); i++) {
			Bank bank = banks.get(i);
			if (banks.get(i).account.equals(bankAccount)) {
					int num = -1;
					while(num != 5) {
						System.out.println(" ** Bank Info Edit Menu ** ");
						System.out.println(" 1. Edit Name");
						System.out.println(" 2. Edit Birth");
						System.out.println(" 3. Edit Account");
						System.out.println(" 4. Edit Phone");
						System.out.println(" 5. Exit");
						System.out.print("Select one number between 1 - 5 : ");
				
						num = input.nextInt();
				
						if (num == 1) {
							System.out.print("Name : ");
							bank.name = input.next();
						}
						else if (num == 2) {
							System.out.print("Birth : ");
							bank.birth = input.next();
						}
						else if (num == 3) {
							System.out.print("Account : ");
							bank.account = input.next();
						}
						else if (num == 4) {
							System.out.print("Phone Number : ");
							bank.num = input.next();
						}
						else {
							continue;
						} // if
					} // while
					break;
				} // if
			} // for
		}
	
	public void viewBanks() {
		for (int i = 0; i<banks.size(); i++) {
			banks.get(i).printInfo();
		}
	}
}
