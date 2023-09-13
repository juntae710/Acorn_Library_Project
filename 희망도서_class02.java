package javaPrj.프로젝트;

import java.util.Scanner;

public class 희망도서_class02 {
	static String[] bookArr = new String[4];
	static int index = 0;
	static Scanner select = new Scanner(System.in);
	
	public static void registerBook() {
		String bookName;
		String authorName;
		String companyName;
		System.out.println("희망도서 신청\n도서명, 작가명, 출판사명을 입력하세요(최대 3권)");
		bookName = select.nextLine();
		authorName = select.nextLine();
		companyName = select.nextLine();
		bookArr[index] = "도서명:" + bookName + "\n작가명:" + authorName + "\n출판사:" + companyName;
		index++;
	}
    
    public static void scanBook() {
    	System.out.println("희망도서 조회\n신청하신 도서를 조회합니다");
		for (int i = 0; i < index; i++) {
        	if(bookArr[i]!=null)
            System.out.println((i+1)+":\n"+ bookArr[i]);
        }
    }
    
    public static void delBook() {
    	System.out.println("희망도서 취소\n도서 신청을 취소합니다");
        scanBook();
        System.out.println("취소하고 싶은 도서를 선택하세요");
		String delete = select.nextLine();
		int deleteIndex = Integer.parseInt(delete);
		for(int i = deleteIndex-1; i < index; i++) {
			bookArr[i] = bookArr[i+1];
			index--;
		}
	}
}
