package Bank;

import java.util.Scanner;

import exceptions.BirthFormatException;

public interface BankInput {
	
	public String getAccount();
	
	public void setAccount(String account);
	
	public void setName(String name);
	
	public void setBirth(String birth) throws BirthFormatException;
	
	public void setNum(String num);
	
	public void getUserInput(Scanner input);
	
	public void printInfo();
	
	public void setBankName(Scanner input);
	
	public void setBankBirth(Scanner input);
	
	public void setBankAccount(Scanner input);
	
	public void setBankPhone(Scanner input);

}
