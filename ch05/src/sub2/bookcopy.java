package sub2;

public class bookcopy {
	public class Book {
	    // 속성
	    private String title;
	    private String author;
	    private String isbn;
	    private int availableCopies;

	    // 생성자: 모든 인스턴스 변수를 초기화
	    public Book(String title, String author, String isbn, int availableCopies) {
	        this.title = title;
	        this.author = author;
	        this.isbn = isbn;
	        this.availableCopies = availableCopies;
	    }

	    // 메서드: 책을 대출
	    public boolean borrowBook() {
	        if (availableCopies > 0) {
	            availableCopies--;
	            return true;
	        } else {
	            return false;
	        }
	    }

	    // 메서드: 책을 반납
	    public void returnBook() {
	        availableCopies++;
	    }

	    // 메서드: 모든 멤버 변수 값을 출력
	    public void show() {
	        System.out.println("Title: " + title);
	        System.out.println("Author: " + author);
	        System.out.println("ISBN: " + isbn);
	        System.out.println("Available Copies: " + availableCopies);
	        book.show();

	    }

	    // 메인 메서드 예제 (테스트 용도)
	    public static void main(String[] args) {
	        Book book = new Book("Java Programming", "John Doe", "1234567890", 3);
	        
	        book.show();
	        System.out.println("\nBorrowing a book...");
	        boolean borrowed = book.borrowBook();
	        System.out.println("Borrowed: " + borrowed);
	        
	        book.show();
	        System.out.println("\nReturning a book...");
	        book.returnBook();
	        book.show();
	    }
	}
}
