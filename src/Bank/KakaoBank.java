package Bank;

import java.util.Scanner;

public class KakaoBank extends ChildMember {
	
	public KakaoBank(BankKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setBankName(input);
		setBankBirth(input);
		setBankAccount(input);
		setBankPhone(input);
	}

}
