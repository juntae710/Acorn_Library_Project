package javaPrj.프로젝트;

import java.io.IOException;
import java.util.Scanner;

public class LibraryMain {

	public static void main(String[] args) throws IOException {

		회원가입_class01 sign = new 회원가입_class01();
		도서조회_class bookList = new 도서조회_class();
		로그인관련_class jt = new 로그인관련_class();

		loop01: while (true) {
			System.out.println("1. 도서리스트");
			System.out.println("2. 회원가입");
			System.out.println("3. 로그인");
			System.out.println("4. 책 안읽고 나가기");

			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				// 도서 리스트 구역
				bookList.aaa();
				break;
			case 2:
				// 회원가입 구역
				sign.Join();
				break;
			case 3:
				// 로그인 구역
				jt.로그인스위치();
				break;
			case 4:
				System.out.println("책을 안읽고 나갑니다.\n책도 안읽고 ㅉㅉ");
				break loop01;
			default:
				System.out.println("잘못된 선택입니다. 다시 선택하세요.");
				break;
			}
		}
	}
}
