package javaPrj.프로젝트;

import java.util.Scanner;

public class 도서조회_class extends bookList{

    public static void aaa( ) {

        Scanner sc = new Scanner(System.in);
        //비교했을때 일치하는 것 조회(카테고리 또는 번호)
        boolean found = false;

        loop : while(true){
            System.out.println("찾고싶은 도서의 카테고리 또는 도서번호를 입력하세요(1. 문학, 2. 외국어, 3.철학, 4.취미, 5.미성년) \n이전단계로 돌아가길 원하시면 '0. 이전' 을 입력해주세요");
            String input = sc.nextLine();
          //  int input = Integer.parseInt(inputTmp);
            switch (input) {
		            case "1": case "문학":
		                System.out.println("\r소분류를 선택해주세요.\n 1.시집\n 2.소설");
		                String InputNumber = sc.nextLine();
		                int InputChange = Integer.parseInt(InputNumber);

		                if (InputChange == 1 || InputChange == 2) {
		                    for (int i = (InputChange-1)*5; i < (InputChange-1)*5+5; i++) {
		                    	System.out.println("도서 번호 : " + booklist[i][3][0]);
		                    	System.out.println("도 서 명 : " + booklist[i][0][0]);
		                        System.out.println("저   자 : " + booklist[i][1][0]);
		                        System.out.println("출 판 사 : " + booklist[i][2][0] + "\n");		                        
		                    }
		                    found = true;
		                }
		                else {
		                	System.out.println("소분류가 존재하지않습니다. 재선택해주세요.\n");
		                }
		                break;
                
		            case "2": case "외국어":
		                System.out.println("\r소분류를 선택해주세요.\n 1.영어\n 2.일본어");
		                InputNumber = sc.nextLine();
		                InputChange = Integer.parseInt(InputNumber);		
		                if (InputChange == 1 || InputChange == 2) {
		                    for (int i = (InputChange+1)*5; i < (InputChange+1)*5+5; i++) {
		                    	System.out.println("도서 번호 : " + booklist[i][3][0]);
		                    	System.out.println("도 서 명 : " + booklist[i][0][0]);
		                        System.out.println("저   자 : " + booklist[i][1][0]);
		                        System.out.println("출 판 사 : " + booklist[i][2][0] + "\n");		                        
		                    }
		                    found = true;
		                }
		                else {
		                	System.out.println("소분류가 존재하지않습니다. 재선택해주세요.\n");
		                }
		                break;

		            case "3":case "철학":
		                System.out.println("\r소분류를 선택해주세요.\n 1.동양\n 2.서양");
		                InputNumber = sc.nextLine();
		                InputChange = Integer.parseInt(InputNumber);		
		                if (InputChange == 1 || InputChange == 2) {
		                    for (int i = (InputChange+3)*5; i < (InputChange+3)*5+5; i++) {
		                    	System.out.println("도서 번호 : " + booklist[i][3][0]);
		                    	System.out.println("도 서 명 : " + booklist[i][0][0]);
		                        System.out.println("저   자 : " + booklist[i][1][0]);
		                        System.out.println("출 판 사 : " + booklist[i][2][0] + "\n");		                        
		                    }
		                    found = true;
		                }
		                else {
		                	System.out.println("소분류가 존재하지않습니다. 재선택해주세요.\n");
		                }
		                break;

		            case "4":case "취미":
		                System.out.println("\r소분류를 선택해주세요.\n 1.음식\n 2.스포츠");
		                InputNumber = sc.nextLine();
		                InputChange = Integer.parseInt(InputNumber);		
		                if (InputChange == 1 || InputChange == 2) {
		                    for (int i = (InputChange+5)*5; i < (InputChange+5)*5+5; i++) {
		                    	System.out.println("도서 번호 : " + booklist[i][3][0]);
		                    	System.out.println("도 서 명 : " + booklist[i][0][0]);
		                        System.out.println("저   자 : " + booklist[i][1][0]);
		                        System.out.println("출 판 사 : " + booklist[i][2][0] + "\n");		                        
		                    }
		                    found = true;
		                }
		                else {
		                	System.out.println("소분류가 존재하지않습니다. 재선택해주세요.\n");
		                }
		                break;

		            case "5": case "미성년":
		                System.out.println("\r소분류를 선택해주세요.\n 1.아동\n 2.청소년");
		                InputNumber = sc.nextLine();
		                InputChange = Integer.parseInt(InputNumber);		
		                if (InputChange == 1 || InputChange == 2) {
		                    for (int i = (InputChange+7)*5; i < (InputChange+7)*5+5; i++) {
		                    	System.out.println("도서 번호 : " + booklist[i][3][0]);
		                    	System.out.println("도 서 명 : " + booklist[i][0][0]);
		                        System.out.println("저   자 : " + booklist[i][1][0]);
		                        System.out.println("출 판 사 : " + booklist[i][2][0] + "\n");		                        
		                    }
		                    found = true;
		                }
		                else {
		                	System.out.println("소분류가 존재하지않습니다. 재선택해주세요.\n");
		                }
		                break;
		                
		            case "0": case "이전":
		            	System.out.println("이전단계로 돌아갑니다\n");
        	            break loop;		                
		            default:
		                for (int i = 0; i < booklist.length; i++) {
		                    if (booklist[i][3][0].equals(input)) {
		                    	System.out.println("도서 번호 : " + booklist[i][3][0]);
		                    	System.out.println("도 서 명 : " + booklist[i][0][0]);
		                        System.out.println("저   자 : " + booklist[i][1][0]);
		                        System.out.println("출 판 사 : " + booklist[i][2][0] + "\n");                    
		                        found = true;
		                    }		                    
		                    if (!found) {
		    		            System.out.println("해당 카테고리 또는 도서 번호의 도서를 찾을 수 없습니다.");
		    		            break;
		                }
		        	}
		        }
        }
    }
}

