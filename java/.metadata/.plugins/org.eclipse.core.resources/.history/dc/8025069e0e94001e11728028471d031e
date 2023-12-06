package 프로젝트2차ver2;

import java.util.Scanner;

public class 도서조회_class extends bookList{

    public static void 조회( ) {
    	도서정보 info = new 도서정보();
        Scanner sc = new Scanner(System.in);
        //비교했을때 일치하는 것 조회(카테고리 또는 번호)
        boolean found = false;

        loop : while(true){
            System.out.println(" ====================\n 찾고싶은 카테고리를 선택하세요.\n --------------------\n"
            		+ " 0. 이전\n 1. 문학\n 2. 외국어\n 3. 철학\n 4. 취미\n 5. 미성년\n 6. 전체조회 \n ====================\n");
            
            String input = sc.nextLine();
          //  int input = Integer.parseInt(inputTmp);
            switch (input) {
                  case "1": case "문학":
                      System.out.println("\r ====================\n 소분류를 선택해주세요.\n --------------------\n 1. 시집\n 2. 소설\n =====================");
                      String InputNumber = sc.nextLine();
                      int InputChange = Integer.parseInt(InputNumber);

                      if (InputChange == 1 || InputChange == 2) {
                          for (int i = (InputChange-1)*5; i < (InputChange-1)*5+5; i++) {
                             System.out.println(" 도서 번호 : " + booklist[i][3][0]);
                             System.out.println(" 도 서 명 : " + booklist[i][0][0]);
                             System.out.println(" 저   자 : " + booklist[i][1][0]);
                             System.out.println(" 출 판 사 : " + booklist[i][2][0]+"\n"); 
                              if( i < (InputChange-1)*5+4 ) 
		                    	   System.out.println(" --------------------\n");
                          }
                          found = true;
                      }
                      else {
                         System.out.println(" ====================\n 소분류가 존재하지않습니다. 재선택해주세요.\n ====================\n");
                      }
                      break;
                
                  case "2": case "외국어":
                      System.out.println("\r ====================\n 소분류를 선택해주세요.\n --------------------\n 1. 영어\n 2. 일본어\n ====================\n");
                      InputNumber = sc.nextLine();
                      InputChange = Integer.parseInt(InputNumber);      
                      if (InputChange == 1 || InputChange == 2) {
                          for (int i = (InputChange+1)*5; i < (InputChange+1)*5+5; i++) {
                             System.out.println(" 도서 번호 : " + booklist[i][3][0]);
                             System.out.println(" 도 서 명 : " + booklist[i][0][0]);
                             System.out.println(" 저   자 : " + booklist[i][1][0]);
                             System.out.println(" 출 판 사 : " + booklist[i][2][0] + "\n");  
                              if( i < (InputChange+1)*5+4 ) 
		                    	   System.out.println(" --------------------\n");
                          }
                          found = true;
                      }
                      else {
                         System.out.println(" 소분류가 존재하지않습니다. 재선택해주세요.\n");
                      }
                      break;

                  case "3":case "철학":
                      System.out.println("\r ====================\n 소분류를 선택해주세요.\n --------------------\n 1. 동양\n 2. 서양\n ====================\n");

                      InputNumber = sc.nextLine();
                      InputChange = Integer.parseInt(InputNumber);      
                      if (InputChange == 1 || InputChange == 2) {
                          for (int i = (InputChange+3)*5; i < (InputChange+3)*5+5; i++) {
                             System.out.println(" 도서 번호 : " + booklist[i][3][0]);
                             System.out.println(" 도 서 명 : " + booklist[i][0][0]);
                             System.out.println(" 저   자 : " + booklist[i][1][0]);
                             System.out.println(" 출 판 사 : " + booklist[i][2][0] + "\n"); 
                              if( i < (InputChange+3)*5+4 ) 
		                    	   System.out.println(" --------------------\n");
                          }
                          found = true;
                      }
                      else {
                         System.out.println(" 소분류가 존재하지않습니다. 재선택해주세요.\n");
                      }
                      break;

                  case "4":case "취미":
                      System.out.println("\r ====================\n 소분류를 선택해주세요.\n --------------------\n 1. 음식\n 2. 스포츠\n ====================\n");
                      InputNumber = sc.nextLine();
                      InputChange = Integer.parseInt(InputNumber);      
                      if (InputChange == 1 || InputChange == 2) {
                          for (int i = (InputChange+5)*5; i < (InputChange+5)*5+5; i++) {
                             System.out.println(" 도서 번호 : " + booklist[i][3][0]);
                             System.out.println(" 도 서 명 : " + booklist[i][0][0]);
                             System.out.println(" 저   자 : " + booklist[i][1][0]);
                             System.out.println(" 출 판 사 : " + booklist[i][2][0] + "\n");
                              if( i < (InputChange+5)*5+4 ) 
		                    	   System.out.println(" --------------------\n");
                          }
                          found = true;
                      }
                      else {
                         System.out.println(" 소분류가 존재하지않습니다. 재선택해주세요.\n");
                      }
                      break;

                  case "5": case "미성년":
                      System.out.println("\r ====================\n 소분류를 선택해주세요.\n --------------------\n 1. 아동\n 2. 청소년\n ====================\n");
                      InputNumber = sc.nextLine();
                      InputChange = Integer.parseInt(InputNumber);      
                      if (InputChange == 1 || InputChange == 2) {
                          for (int i = (InputChange+7)*5; i < (InputChange+7)*5+5; i++) {
                             System.out.println(" 도서 번호 : " + booklist[i][3][0]);
                             System.out.println(" 도 서 명 : " + booklist[i][0][0]);
                             System.out.println(" 저   자 : " + booklist[i][1][0]);
                             System.out.println(" 출 판 사 : " + booklist[i][2][0] + "\n");
                              if( i < (InputChange+7)*5+4 ) 
		                    	   System.out.println(" --------------------\n");
                          }
                          found = true;
                      }
                      
                      
                      else {
                         System.out.println("소분류가 존재하지않습니다. 재선택해주세요.\n");
                      }
                      break;
                  case "6": case "전체":
                      System.out.println("0~a~ㄱㄴㄷ 순으로 조회합니다\n");
                      info.sortabc();
                      
                  case "0": case "이전":
                     System.out.println(" 이전단계로 돌아갑니다.\n");
                       break loop;                      
                  default:
                      for (int i = 0; i < booklist.length; i++) {
                          if (booklist[i][3][0].equals(input)) {
                             System.out.println(" 도서 번호 : " + booklist[i][3][0]);
                             System.out.println(" 도 서 명 : " + booklist[i][0][0]);
                             System.out.println(" 저   자 : " + booklist[i][1][0]);
                             System.out.println(" 출 판 사 : " + booklist[i][2][0] + "\n");                    
                              found = true;
                          }                          
                          if (!found) {
                            System.out.println(" 해당 카테고리를 찾을 수 없습니다.\n");
                            break;
                      }
                 }
              }
        }
    }
}
