
public class Bank {

	String name;
	String birth;
	String account;
	String num;
	
	public Bank() {

	}
	
	public Bank(String name, String birth) {
		this.name = name;
		this.birth = birth;
	}
	
	public Bank(String name, String birth, String account, String num) {
		this.name = name;
		this.birth = birth;
		this.account = account;
		this.num = num;
	}
	
	public void printInfo() {
		System.out.println("name : " + name);
		System.out.println("birth : " + birth);
		System.out.println("account : " + account);
		System.out.println("Phone Number : " + num);
	}
}
