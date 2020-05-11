import java.util.ArrayList;
import java.util.Scanner;

import Bank.Bank;
import Bank.BankInput;
import Bank.BankKind;
import Bank.ChildbankAccount;
import Bank.KakaoBank;
import Bank.NHbankAccount;

public class BankManager {
	ArrayList<BankInput> banks = new ArrayList<BankInput>();
	Scanner input;
	BankManager(Scanner input){
		this.input = input;
	}
	
	public void addBank() {
		
		int kind = 0;
		BankInput bank = null;
		while (kind != 1 && kind != 2 && kind != 3) {
			showAddMenu();
			kind = input.nextInt();
			switch(kind) {
			case 1:
				setKakao(bank, input);
				break;
			case 2:
				setNH(bank, input);
				break;
			case 3:
				setChild(bank, input);
				break;
			default:
				System.out.print("Select num for Bank Kind between 1-3 : ");
			}
		}
	}
	
	public void setKakao (BankInput bank, Scanner input) {
		bank = new KakaoBank(BankKind.KakaoBank);
		bank.getUserInput(input);
		banks.add(bank);
	}
	
	public void setNH (BankInput bank, Scanner input) {
		bank = new NHbankAccount(BankKind.NHBank);
		bank.getUserInput(input);
		banks.add(bank);
	}
	
	public void setChild (BankInput bank, Scanner input) {
		bank = new ChildbankAccount(BankKind.ChildBank);
		bank.getUserInput(input);
		banks.add(bank);
	}
	
	public void showAddMenu() {
		System.out.println(" 1. Kakao Bank");
		System.out.println(" 2. NH Bank");
		System.out.println(" 3. ChildBank");
		System.out.print("Select num for Bank Kind between 1-3 : ");
		
	}
	
	public void deleteBank() {
		System.out.print("Account : ");
		String bankAccount = input.next();
		int index = findIndex(bankAccount);
		removefromBanks(index, bankAccount);
	}
	
	public int removefromBanks(int index, String bankAccount) {
		if (index >= 0) {
			banks.remove(index);
			System.out.println("the bank account " + bankAccount + " is deleted");
			return 1;
		}
		else {
			System.out.println("the bank account has not been registered");
			return -1;
		}
	}
	
	public int findIndex(String bankAccount) {
		int index = -1;
		for (int i = 0; i < banks.size(); i++) {
			if (banks.get(i).getAccount().equals(bankAccount)) {
				index = i;
				break;
			}
		}
		return index;
	}

	public void editBank() {

		System.out.print("Account : ");
		String bankAccount = input.next();		
		for (int i = 0;  i < banks.size(); i++) {
			BankInput bank = banks.get(i);
			if (bank.getAccount().equals(bankAccount)) {
					int num = -1;
					while(num != 5) {
						showEditMenu();
						num = input.nextInt();
						switch(num) {
						case 1:
							bank.setBankName(input);
							break;
						case 2:
							bank.setBankBirth(input);
							break;
						case 3:
							bank.setBankAccount(input);
							break;
						case 4:
							bank.setBankPhone(input);
							break;
						default:
							continue;
						}
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
	
	public void showEditMenu() {
		System.out.println(" ** Bank Info Edit Menu ** ");
		System.out.println(" 1. Edit Name");
		System.out.println(" 2. Edit Birth");
		System.out.println(" 3. Edit Account");
		System.out.println(" 4. Edit Phone");
		System.out.println(" 5. Exit");
		System.out.print("Select one number between 1 - 5 : ");
	}
}