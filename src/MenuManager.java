import java.util.Scanner;

public class MenuManager {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num = 5;
		
		while(num != 6) {
			System.out.println("--- Bank Management System ---");
			System.out.println(" 1. Add Bank");
			System.out.println(" 2. Delete Bank");
			System.out.println(" 3. Edit Bank");
			System.out.println(" 4. View Bank");
			System.out.println(" 5. Show a Menu");
			System.out.println(" 6. Exit");
			System.out.print("Select one number between 1 - 6 : ");
		
			num = input.nextInt();
		
			if (num == 1) {
				addBank();
			}
			else if (num == 2) {
				deleteBank();
			}
			else if (num == 3) {
				editBank();
			}
			else if (num == 4) {
				viewBank();
			}
			else {
				continue;
			}
		}
	}
	
	public static void addBank() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Name : ");
		String name = input.next();
		
		System.out.print("Birth : ");
		String birth = input.next();
		
		System.out.print("Account : ");
		int account = input.nextInt();
		
		System.out.print("Phone Number : ");
		String num = input.next();
		
	}

	public static void deleteBank() {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Account : ");
		String name = input.next();
		
	}
	
	public static void editBank() {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Account : ");
		String name = input.next();
		
	}
	
	public static void viewBank() {
	
		Scanner input = new Scanner(System.in);
		System.out.print("Account : ");
		String name = input.next();
		
	}
}
