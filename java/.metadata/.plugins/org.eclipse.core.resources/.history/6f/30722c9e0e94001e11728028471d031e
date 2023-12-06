package 프로젝트2차ver2;

public class 정보 implements InfoCompare{

	private String 도서명;
	private String 저자명;
	private String 출판사;
	
	// 생성자
	public 정보() {}	// 기본생성자
	
	public 정보(String 도서명, String 저자명, String 출판사) {
		this.도서명 = 도서명;
		this.저자명 = 저자명;
		this.출판사 = 출판사;
	}
	
	// getter setter
	public String get도서명() {
		return 도서명;
	}
	public void set도서명(String 도서명) {
		this.도서명 = 도서명;
	}
	public String get저자명() {
		return 저자명;
	}
	public void set저자명(String 저자명) {
		this.저자명 = 저자명;
	}
	public String get출판사() {
		return 출판사;
	}
	public void set출판사(String 출판사) {
		this.출판사 = 출판사;
	}
	
	@Override
	public String toString() {
		return  "도서명 : " + 도서명 + "\n저자명 : " + 저자명 + "\n출판사 : " + 출판사 + "\n------------------------------";
	}

	@Override
	public int compareTo(Object obj) {
		정보 s = (정보)obj;
	return this.도서명.compareTo(s.get도서명());
	}
	}
