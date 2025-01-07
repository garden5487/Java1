package sub1;
/*
 *날짜 : 2025/01/07
 *이름 : 박정원
 * 
 * 
 * 
 */
public class ClassTest {
	
	public static void main(String[] args) {
	
		// Car 객체 생성
		
	 car sonata = new car(); 
	 
	 
	 // 객체 초기화
	 sonata.name = "소나타";
	 sonata.color = "흰색";
	 sonata.speed = 0;
	 
	 //객체 상호작용
	 sonata.speedUp(100);
	 sonata.speedDown(20);
	 sonata.show();
	 
	 
	 // 객체 선언
	 car avante;
	 
	 // 객체 생성
	 avante = new car();
	 
	 // 객체 초기화
	 
	 avante.name ="아반테";
	 avante.color = "흰색";
	 avante.speed = 10;
	
	 // 객체 상호작용
	 avante.speedUp(70);
	 avante.speedDown(20);
	 avante.show();
	 
	 
	 // Account 객체 생성
	 Account kb = new Account();
	 kb.bank = "국민은행";
	 kb.id = "110-12-1101";
	 kb.name = "김유신";
	 kb.balance = 10000;
	 
	 
	 kb.deposit(100000);
	 kb.withdraw(50000);
	 kb.show();
	 
	 /*
	  * <출력>
	  * 은행명 : 우리은행
	  * 계좌번호 : 110-11-1021
	  * 입금주 : 김춘추
	  * 현재잔액 : 15000
	  */
	
	 Account ur = new Account();
	 ur.bank = "우리은행";
	 ur.id = "110-11-1021";
	 ur.name = "김춘추";
	 ur.balance = 10000;
	 
	 
	 ur.deposit(50000);
	 ur.withdraw(45000);
	 ur.show();
	 
	 
	}

}
