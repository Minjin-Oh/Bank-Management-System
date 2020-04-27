import java.util.Scanner;

public class MenuManager {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		BankManager bankmanager = new BankManager(input);
		
		int num = -1;
		
		while(num != 5) {
			System.out.println("--- Bank Management System ---");
			System.out.println(" 1. Add Bank");
			System.out.println(" 2. Delete Bank");
			System.out.println(" 3. Edit Bank");
			System.out.println(" 4. View Bank");
			System.out.println(" 5. Exit");
			System.out.print("Select one number between 1 - 5 : ");
		
			num = input.nextInt();
		
			if (num == 1) {
				bankmanager.addBank();
			}
			else if (num == 2) {
				bankmanager.deleteBank();
			}
			else if (num == 3) {
				bankmanager.editBank();;
			}
			else if (num == 4) {
				bankmanager.viewBanks();;
			}
			else {
				continue;
			}
		}
	}
	
}