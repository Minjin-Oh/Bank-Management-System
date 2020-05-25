import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;
import log.Eventlogger;

public class MenuManager {
	static Eventlogger logger = new Eventlogger("log.txt");
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		BankManager bankmanager = getObject("bankmanager.ser");
		if(bankmanager == null) {
			bankmanager = new BankManager(input);
		}
		else {
			bankmanager.setScanner(input);
		}
		
		selectMenu(input, bankmanager);
		putObject(bankmanager, "bankmanager.ser");
	}
	
	public static void selectMenu(Scanner input, BankManager bankmanager) {
		int num = -1;
		while(num != 5) {
			try {
				showMenu();
				num = input.nextInt();
				
				switch(num) {
				case 1:
					bankmanager.addBank();
					logger.log("add a Bank Account");
					break;
				case 2:
					bankmanager.deleteBank();
					logger.log("delete a Bank Account");
					break;
				case 3:
					bankmanager.editBank();
					logger.log("edit a Bank Account");
					break;
				case 4:
					bankmanager.viewBanks();
					logger.log("view a list of Bank Account");
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}
	
	public static void showMenu() {
		System.out.println("--- Bank Management System ---");
		System.out.println(" 1. Add Bank");
		System.out.println(" 2. Delete Bank");
		System.out.println(" 3. Edit Bank");
		System.out.println(" 4. View Bank");
		System.out.println(" 5. Exit");
		System.out.print("Select one number between 1 - 5 : ");
	}
	
	public static BankManager getObject(String fileName) {
		BankManager bankmanager = null;
		
		try {
			FileInputStream file = new FileInputStream(fileName);
			ObjectInputStream in = new ObjectInputStream(file);
			
			bankmanager = (BankManager) in.readObject();
			
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return bankmanager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return bankmanager;
		
	}
	
	public static void putObject(BankManager bankmanager, String fileName) {
		try {
			FileOutputStream file = new FileOutputStream(fileName);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(bankmanager);
			
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}