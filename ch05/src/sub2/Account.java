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
		
		/* 도서관 관리 시스템의 일부로 BOOK 클래스를 정의하세요.
		 */
		Book book1 = new Book("삼국지","나관중","10001" ,10);
		book1.show();
		
		boolean isOk = book.borrowBook();
		
		if(isOK) {
			System.out.println("도서 대출 성공!");
		} else {
			System.out.println("도서 대출 실패!");
		
		}
		
		book1.show();
		
		Book book2 = new Book("이것이 자바다","신용권","10002", 0);
		book2.show();
		
		if(book2.borrowBook()) {
			System.out.println(book2.getTitle() + "도서 대출 성공!");
		} else {
			System.out.println(book2.getTitle() + "도서 대출 실패!");
		}
	}
	
}
