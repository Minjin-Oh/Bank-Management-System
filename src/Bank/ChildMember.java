package Bank;

import java.util.Scanner;

public abstract class ChildMember extends Bank {

	public ChildMember(BankKind kind) {
		super(kind);
	}
	
	@Override
	public abstract void getUserInput(Scanner input);

	@Override
	public void printInfo() {
		String b = getBank();
		System.out.println("Bank : " + b);
		System.out.println("name : " + name);
		System.out.println("birth : " + birth);
		System.out.println("account : " + account);
		System.out.println("Phone Number : " + num);
	}
	
	public void setBankNumwithYN(Scanner input) {
		char answer = 'x';		
		while (answer != 'Y' && answer != 'y' && answer !='N' && answer != 'n') {
			System.out.println("Do you have a Phone Number? (Y/N)");
			answer = input.next().charAt(0);
			if (answer == 'Y' || answer == 'y') {
				setBankPhone(input);
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
