package Bank;

import java.util.Scanner;

public class Bank {

	protected AccountKind kind = AccountKind.KakaoBank;

	protected String name;
	protected String birth;
	protected String account;
	protected String num;
	
	public Bank() {

	}
	
	public Bank(String name, String birth, String account, String num) {
		this.name = name;
		this.birth = birth;
		this.account = account;
		this.num = num;
	}
	
	public AccountKind getKind() {
		return kind;
	}

	public void setKind(AccountKind kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}
	
	public void printInfo() {
		System.out.println("name : " + name);
		System.out.println("birth : " + birth);
		System.out.println("account : " + account);
		System.out.println("Phone Number : " + num);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Name : ");
		String name = input.next();
		this.setName(name);
		
		System.out.print("Birth : ");
		String birth = input.next();
		this.setBirth(birth);
		
		System.out.print("Account : ");
		String account = input.next();
		this.setAccount(account);
		
		System.out.print("Phone Number : ");
		String num = input.next();
		this.setNum(num);
		
	}
}
