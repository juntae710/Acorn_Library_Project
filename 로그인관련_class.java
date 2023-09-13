package javaPrj.프로젝트;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 로그인관련_class {

	public static int 로그인() {
		int sum = 0;
		System.out.println("아이디를 입력해 주세요.");
		Scanner sc = new Scanner(System.in);
		String 아이디 = sc.nextLine();
		try {
			File aText = new File("res/aaa.txt");
			FileReader aReader = new FileReader(aText);
			BufferedReader aBufReader = new BufferedReader(aReader);
			List<String> aLines = new ArrayList<String>();
			String aLine = "";
			while ((aLine = aBufReader.readLine()) != null) {
				aLines.add(aLine);
			}
			aBufReader.close();

			// 비교
			int 카운팅 = 0;
			for (int i = 0; i < aLines.size(); i++) {
				if (aLines.get(i).equals(아이디)) {
					System.out.println("로그인완료");
					
					
				} else {
					카운팅++;
				}
			}
			if (카운팅 == aLines.size()) {
				System.out.println("잘못된입력입니다.");
				sum=1;
			}
		} catch (Exception e) {
		}
		return sum;
	}

	public static void 대여() {

		Scanner sc = new Scanner(System.in);
		System.out.println("대여할 책번호를 입력해 주세요.");
		String 책번호 = sc.nextLine();
		String menu2;
		try {
			File aText = new File("res/책정보.txt");
			FileReader aReader = new FileReader(aText);
			BufferedReader aBufReader = new BufferedReader(aReader);
			List<String> aLines = new ArrayList<String>();
			String aLine = "";
			while ((aLine = aBufReader.readLine()) != null) {
				aLines.add(aLine);
			}
			aBufReader.close();
			int 카운팅 = 0;
			for (int i = 0; i < aLines.size(); i++) {
				if (aLines.get(i).equals(책번호)) {
					System.out.println("대여하시겠습니까?");
					System.out.println("1.네 2.아니요");
					menu2 = sc.nextLine();
					switch (menu2) {
					case "1":
					case "네":
						String filePath = "res/책정보.txt";
						String textToDelete = 책번호;
						try {
							File inputFile = new File(filePath);
							File tempFile = new File("temp.txt");
							BufferedReader reader = new BufferedReader(new FileReader(inputFile));
							BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
							String currentLine;
							while ((currentLine = reader.readLine()) != null) {
								if (!currentLine.contains(textToDelete)) {
									writer.write(currentLine);
									writer.newLine();
								}
							}
							writer.close();
							reader.close();
							if (inputFile.delete()) {
								if (tempFile.renameTo(inputFile)) {
									System.out.println("대여완료.(대여기간 : 금일부터 2주)");
								} else {
									System.err.println("임시파일 이름 바꾸기 오류");
								}
							} else {
								System.err.println("원본파일 삭제오류");
							}
						} catch (IOException e) {
							e.printStackTrace();
						}
						break;
					case "2":
					case "아니요":
						break;
					}
				} else {
					카운팅++;
				}
			}
			if (카운팅 == aLines.size()) {
				System.out.println("현제 도서관에 없는 책입니다.");
			}
		} catch (Exception e) {
		}

	}

	public static void 반납() {

		System.out.println("반납\n책번호를 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		String 책번호 = sc.nextLine();

		String filePath = "res/책정보.txt";
		String content = 책번호;

		try {
			FileWriter fileWriter = new FileWriter(filePath, true);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write(content);
			bufferedWriter.newLine();
			bufferedWriter.close();
			fileWriter.close();
			System.out.println("반납 되었습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void 도서신청() {

		loop: while (true) {

			System.out.println("메뉴를 선택하세요>\n1.희망도서 신청 2.희망도서 조회 3.도서신청 취소 4.종료");
			Scanner select = new Scanner(System.in);
			String menuNum = select.nextLine();
			int menu = Integer.parseInt(menuNum);

			switch (menu) {
			case 1:
				희망도서_class02.registerBook(); // 희망도서를 신청하는 메서드
				break;
			case 2:
				희망도서_class02.scanBook(); // 신청한 도서를 조회하는 메서드
				break;
			case 3:
				희망도서_class02.delBook(); // 신청한 도서를 취소하는 메서드
				break;
			case 4:
				System.out.println("도서신청을 종료합니다");
				break loop;
			}
		}
	}

	public static void 로그인스위치() {
		Scanner sc = new Scanner(System.in);
		if(로그인()==0) {
			loop02: while (true) {
				System.out.println("메뉴를 선택하세요\n1.대여 2.반납 3.도서신청 4.로그아웃");
				int loginNum = sc.nextInt();
				switch (loginNum) {
				case 1:
					대여();
					break;
				case 2:
					반납();
					break;
				case 3:
					도서신청();
					break;
				case 4:
					break loop02;

				default:
					break;
				}

			}
		}
	}

}
