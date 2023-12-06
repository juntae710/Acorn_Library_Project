package 프로젝트2차ver2;

import java.io.IOException;
import java.util.Scanner;

public class LibraryMain {

	public static void main(String[] args) throws IOException {

		회원가입_class01 sign = new 회원가입_class01();
		도서조회_class List = new 도서조회_class();
		로그인관련_class jt = new 로그인관련_class();
		독서실프로그램 독서실 = new 독서실프로그램();
		도서관정보 다른도서관 = new 도서관정보();

		loop01: while (true) {
			System.out.println(" ====================");
			System.out.println(
					" 메뉴를 선택하세요.\n --------------------\n 0. 종료\n 1. 도서리스트 조회\n 2. 회원가입\n 3. 로그인\n 4. 독서실 이용\n 5. 도서관 정보 ");
			System.out.println(" ====================\n");
			try {
				Scanner sc = new Scanner(System.in);
				String choice = sc.nextLine();
				int choiceNum = Integer.parseInt(choice);
				if (0 <= choiceNum && choiceNum < 7) {
					switch (choiceNum) {
					case 1:
						// 도서 리스트 구역
						List.조회();
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
						// 독서실 이용하기
						독서실.독서실이용하기();
						break;

					case 5:
						// 독서실 이용하기
						다른도서관.other();
						break;
					case 0:
						System.out.println(" ====================");
						System.out.println(" 안녕히 가세요.");
						System.out.println(" ====================\n");
						break loop01;
					}
				} else {
					throw new Exception();
				}
			} catch (Exception e) {
				System.out.println(" ====================");
				System.out.println(" 올바른 메뉴번호를 입력하세요.");
				System.out.println(" ====================\n");
			}
		}
	}
}
