package Bank;

import java.util.Scanner;

public class ChildbankAccount extends Bank {
	
	protected String parentName;
	protected String parentBirth;
	protected String parentNum;
	protected String relation;
	
	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public String getParentBirth() {
		return parentBirth;
	}

	public void setParentBirth(String parentBirth) {
		this.parentBirth = parentBirth;
	}

	public String getParentNum() {
		return parentNum;
	}

	public void setParentNum(String parentNum) {
		this.parentNum = parentNum;
	}

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}
	
	public ChildbankAccount(BankKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Name : ");
		String name = input.next();
		this.setName(name);
		
		System.out.print("Birth : ");
		String Birth = input.next();
		this.setBirth(Birth);
		
		System.out.print("Account : ");
		String account = input.next();
		this.setAccount(account);
		
		char answer = 'x';
		while (answer != 'Y' && answer != 'y' && answer !='N' && answer != 'n') {
			System.out.println("Do you have a Phone Number? (Y/N)");
			answer = input.next().charAt(0);
			if (answer == 'Y' || answer == 'y') {
				System.out.print("Phone Number : ");
				String num = input.next();
				this.setNum(num);
				break;
			}
			else if(answer == 'N' || answer == 'n') {
				this.setNum(null);
				break;
			}
			else {
			}
		}
		
		System.out.println(" -- Parent's Information(Guardian) -- ");
		System.out.print("Parent's Name : ");
		String parentName = input.next();
		this.setParentName(parentName);
		System.out.print("Parent's Birth : ");
		String parentBirth = input.next();
		this.setParentBirth(parentBirth);
		System.out.print("Parent's Phone Number : ");
		String parentNum = input.next();
		this.setParentNum(parentNum);
		System.out.print("Relationship : ");
		String relation = input.next();
		this.setRelation(relation);
		
	}
	
	public void printInfo() {
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
		
		System.out.println("Bank : " + b);
		System.out.println("name : " + name);
		System.out.println("birth : " + birth);
		System.out.println("account : " + account);
		System.out.println("Phone Number : " + num);
		System.out.println(" -- Parent's Information(Guardian) -- ");
		System.out.println("Parent's name : " + parentName);
		System.out.println("Parent's birth : " + parentBirth);
		System.out.println("Parent's Phone Number : " + parentNum);
		System.out.println("Relationship : " + relation);
	}
}
