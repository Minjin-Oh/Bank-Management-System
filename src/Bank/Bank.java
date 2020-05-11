package Bank;

import java.util.Scanner;

public abstract class Bank implements BankInput {

	protected BankKind kind = BankKind.KakaoBank;

	protected String name;
	protected String birth;
	protected String account;
	protected String num;
	
	public Bank() {

	}
	
	public Bank(BankKind kind) {
		this.kind = kind;
	}
	
	public Bank(String name, String account) {
		this.name = name;
		this.account = account;
	}
	
	public Bank(String name, String birth, String account, String num) {
		this.name = name;
		this.birth = birth;
		this.account = account;
		this.num = num;
	}
	
	public BankKind getKind() {
		return kind;
	}

	public void setKind(BankKind kind) {
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
	
	public abstract void printInfo();
	
	public void setBankName(Scanner input) {
		System.out.print("Name : ");
		String name = input.next();
		this.setName(name);
	}
	
	public void setBankBirth(Scanner input) {
		System.out.print("Birth : ");
		String birth = input.next();
		this.setBirth(birth);
	}
	
	public void setBankAccount(Scanner input) {
		System.out.print("Account : ");
		String account = input.next();
		this.setAccount(account);
	}
	
	public void setBankPhone(Scanner input) {
		System.out.print("Phone number : ");
		String nums = input.next();
		this.setNum(nums);
	}
	
	public String getBank() {
		String b = "none";
		switch(this.kind) {
		case KakaoBank:
			b = "Kakao";
			break;
		case NHBank:
			b = "NH";
			break;
		case ChildBank:
			b = "Child";
			break;
		default:
		}
		return b;
	}
	
}
