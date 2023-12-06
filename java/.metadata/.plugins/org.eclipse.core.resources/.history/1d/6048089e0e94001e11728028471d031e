package 프로젝트2차ver2;

import java.util.Scanner;

public class 희망도서_class02 {
	static String[] bookArr = new String[4];
	static int index = 0;
	static Scanner select = new Scanner(System.in);
	
	public static void registerBook() {
		String bookName;
		String authorName;
		String companyName;
		System.out.println(" ====================");
		System.out.println(" 희망도서 신청\n 도서명, 작가명, 출판사명을 입력하세요.(최대 3권)");
		System.out.println(" ====================\n");
		bookName = select.nextLine();
		authorName = select.nextLine();
		companyName = select.nextLine();
		bookArr[index] = "도서명:" + bookName + "\n작가명:" + authorName + "\n출판사:" + companyName;
		index++;
		System.out.println(" ====================");
		System.out.println(" 도서 신청이 완료되었습니다.");
		System.out.println(" ====================\n");
	}
    
    public static void scanBook() {
    	System.out.println(" ====================");
    	System.out.println(" 희망도서 조회\n 신청하신 도서를 조회합니다.");
    	System.out.println(" ====================\n");
		for (int i = 0; i < index; i++) {
        	if(bookArr[i]!=null)
            System.out.println((i+1)+":\n"+ bookArr[i]+"\n");
        }
    }
    
    public static void delBook() {
    	System.out.println(" =================");
    	System.out.println(" 희망도서 취소\n 도서 신청을 취소합니다.");
    	System.out.println(" =================\n");
        scanBook();
        System.out.println(" ====================");
        System.out.println(" 취소하고 싶은 도서를 선택하세요.");
        System.out.println(" ====================\n");
		String delete = select.nextLine();
		int deleteIndex = Integer.parseInt(delete);
		for(int i = deleteIndex-1; i < index; i++) {
			bookArr[i] = bookArr[i+1];
			index--;
		System.out.println(" ====================");
		System.out.println(" 취소되었습니다.");
		System.out.println(" ====================\n");
		}
	}
}
