package javaPrj.프로젝트;

import java.util.Scanner;

public class 희망도서_class01 {
    public static void hope() {
       
        loop:while(true){

            System.out.println("메뉴를 선택하세요>\n1.희망도서 신청 2.희망도서 조회 3.희망도서 취소 4.종료");
            Scanner select = new Scanner(System.in);
			String menuNum = select.nextLine();
            int menu = Integer.parseInt(menuNum);
            
            switch (menu){
                case 1: 
            		희망도서_class02.registerBook();	// 희망도서를 신청하는 메서드
                    break;
                case 2: 
                	희망도서_class02.scanBook();		// 신청한도서를 조회하는 메서드
                    break;
                case 3: 
                	희망도서_class02.delBook();		// 신청한도서를 취소하는 메서드
                    break;
                case 4: 
                    System.out.println("도서신청을 종료합니다");
                    break loop;
            }
        }
    }
    
    
}
