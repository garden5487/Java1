package sub3;


/* 날짜 : 2025/01/08
 * 이름 : 박정원
 * 내용 : Java 클래스 변수, 클래스 메서드 실습
 */

public class StaticTest {
	
	public static void main(String[] args) {
		
		// 정적 변수, 정적 메서드
		Car sonata = new Car("소나타", "흰색", 10);
		Car avante = new Car("아반테", "검정", 20);
		Car grande = new Car("그렌져", "은색", 30);
		
		sonata.show();
	    avante.show();
		grande.show();
		
		// 전체 차량 수 클래스 변수
		System.out.println("전체 차량 수 : " + Car.count);
		
		// 전체 차량 수 클래스 메서드
		System.out.println("전체 차량 수 : " + Car.getCount);
		
		
		// Increment 실습
		Increment int1 = new Increment();
		Increment int2 = new Increment();
		Increment int3 = new Increment();
	}

}
