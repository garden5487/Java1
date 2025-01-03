package sub3;
/* 날짜 : 2025/01/02
 * 이름 : 박정원
 * 내용 : Java 반복문 for 실습하기
 */
public class ForTest {
	
	public static void main(String[] args) {
		
		// for
		for(int i=0 ; i<10 ; i++) {
			
			System.out.println("i : " + i);
			
		}
		
		// 1부터 10까지 합
		int sum = 0;
		
		for(int k=1 ; k<=10 ; k++ ) {
			 sum += k;
			
			
		}
		
		System.out.println("1부터 10까지 합 : " + sum);
		
		// 1부터 10까지 짝수합
		int tot = 0;
		
		for(int k=1 ; k<=10 ; k++ ) {
			
			if(k % 2 == 0) {
				tot += k;
			}
		
			
			
		}
		
		System.out.println("1부터 10까지 짝수합 : " + tot);
		// for 중첩
		for(int a=1 ;  a<=3 ; a++) {
			
			System.out.println("a : " + a);
	
		  }for(int b=1 ; b<=5 ; b++) {
			 System.out.println("b : " + b);
			
		}
		
		// 구구단
		  for(int x=2 ; x<=9 ; x++ ) {
			  
			 System.out.println("x : " + x);
			  for(int y=1 ; y<=9 ; y++ ) {
				  
				  int z = x * y;
				  System.out.println(x + " x " + y + " = " + z);
				  
				  
				  
			  }
		  }
		  
		  
		 System.out.println("2 x 1 = 2");
		 System.out.println("2 x 2 = 4");
		 System.out.println("2 x 3 = 6");
		 System.out.println("2 x 4 = 8");
		 System.out.println("2 x 5 = 10");
		 System.out.println("2 x 6 = 12");
		 System.out.println("2 x 7 = 14");
		 System.out.println("2 x 8 = 16");
		 System.out.println("2 x 9 = 18");
		 System.out.println("3 x 1 = 3");
		 System.out.println("3 x 2 = 6");
		 System.out.println("3 x 3 = 9");
		 System.out.println("3 x 4 = 12");
		 System.out.println("3 x 5 = 15");
		 System.out.println("3 x 6 = 18");
		 System.out.println("3 x 7 = 21");
		 System.out.println("3 x 8 = 24");
		 System.out.println("3 x 9 = 27");
		
		// 별삼각형
		for(int start=10 ; start>=1 ; start--) {
			
			for(int end=1 ; end<=start; end++) {
				
				System.out.print("★");
				
			}

			System.out.print("\n"); // 개행(줄바꿈)
	
			
		}
		 
		 
	}

}
