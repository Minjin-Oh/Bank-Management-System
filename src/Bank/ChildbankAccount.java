package Bank;

import java.util.Scanner;

public class ChildbankAccount extends ChildMember {
	
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
		setBankName(input);
		setBankBirth(input);
		setBankAccount(input);
		setBankNumwithYN(input);
		parentInfo(input);
	}
	
	public void parentInfo(Scanner input) {
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
		String b = getBank();
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
