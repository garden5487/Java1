package sub2;

// Account 클래스 정의(설계)
public class Account {

	// 속성(필드, 멤버변수)
	private String bank;
	private String id;
	private String name;
	private int balance;
	
	
	
	
	
	// 기능

	public void deposit(int money) {
		this.balance += money;

	}
	
	public void withdraw(int money) {
		this.balance -= money;
		
		
	}
	
	public void show() {
		System.out.println("------------------------");
		System.out.println("은핸명 : " + this.bank);
		System.out.println("계좌번호 : " + this.id);
		System.out.println("입금주 : " + this.name);
		System.out.println("현재잔액 : " + this.balance);
		System.out.println("------------------------");
	
		
		/*
		 * <출력>
		 * 은행명 : 우리은행
		 * 계좌번호 : 110-11-1211
		 * 입금주 : 김춘추
		 * 현재잔액 : 10000
		 */
		
		
	}
	
}
