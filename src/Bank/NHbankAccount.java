package Bank;

import java.util.Scanner;

public class NHbankAccount extends ChildMember {
	
	public NHbankAccount(BankKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		setBankName(input);
		setBankBirth(input);
		setBankAccount(input);
		setBankNumwithYN(input);
	}
}
