import java.util.ArrayList;
import java.util.Scanner;

import Bank.Bank;
import Bank.BankKind;
import Bank.ChildbankAccount;
import Bank.NHbankAccount;

public class BankManager {
	ArrayList<Bank> banks = new ArrayList<Bank>();
	Scanner input;
	BankManager(Scanner input){
		this.input = input;
	}
	
	public void addBank() {
		
		int kind = 0;
		Bank bank;
		while (kind != 1 && kind != 2 && kind != 3) {
			System.out.println(" 1. Kakao Bank");
			System.out.println(" 2. NH Bank");
			System.out.println(" 3. ChildBank");
			System.out.print("Select num for Bank Kind between 1-3 : ");
			kind = input.nextInt();
		
			if (kind == 1) {
				bank = new Bank(BankKind.KakaoBank);
				bank.getUserInput(input);
				banks.add(bank);
				break;
			}
			else if (kind == 2) {
				bank = new NHbankAccount(BankKind.NHBank);
				bank.getUserInput(input);
				banks.add(bank);
				break;
			}
			else if (kind == 3) {
				bank = new ChildbankAccount(BankKind.ChildBank);
				bank.getUserInput(input);
				banks.add(bank);
				break;
			}
			else {
				System.out.print("Select num for Bank Kind between 1-3 : ");
			}
		}
		
	}
	
	public void deleteBank() {
		System.out.print("Account : ");
		String bankAccount = input.next();
		int index = -1;
		for (int i = 0; i < banks.size(); i++) {
			if (banks.get(i).getAccount().equals(bankAccount)) {
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
			if (bank.getAccount().equals(bankAccount)) {
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
							String name = input.next();
							bank.setName(name);
						}
						else if (num == 2) {
							System.out.print("Birth : ");
							String birth = input.next();
							bank.setBirth(birth);
						}
						else if (num == 3) {
							System.out.print("Account : ");
							String account = input.next();
							bank.setAccount(account);
						}
						else if (num == 4) {
							System.out.print("Phone Number : ");
							String nums = input.next();
							bank.setNum(nums);
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
		System.out.println("# of registered accounts : " + banks.size());
		for (int i = 0; i<banks.size(); i++) {
			banks.get(i).printInfo();
		}
	}
}