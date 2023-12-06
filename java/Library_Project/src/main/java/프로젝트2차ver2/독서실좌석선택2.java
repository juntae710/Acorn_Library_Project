package 프로젝트2차ver2;

import java.util.ArrayList;
import java.util.Scanner;


public class 독서실좌석선택2 extends 독서실좌석배치도{

   public static void 입실 () {

      

      System.out.println(" 좌석을 선택해주세요\n 사용중 : ■\n 빈좌석 : □");

      for (int i = 0; i < seat.length; i++) {

         for (int j = 0; j < seat[i].length; j++) {
            System.out.print(seat[i][j]);
         }
         System.out.print("\n");
      }

      Scanner sc = new Scanner(System.in);
      int no = sc.nextInt();

      int 열 = 0;
      int 행 = 0;

      if (no == 1) {
         열 = 2;
         행 = 2;
      } else if (no == 2) {
         열 = 2;
         행 = 4;
      } else if (no == 3) {
         열 = 2;
         행 = 6;
      } else if (no == 4) {
         열 = 2;
         행 = 8;
      } else if (no == 5) {
         열 = 2;
         행 = 10;
      } else if (no == 6) {
         열 = 3;
         행 = 2;
      } else if (no == 7) {
         열 = 3;
         행 = 4;
      } else if (no == 8) {
         열 = 3;
         행 = 6;
      } else if (no == 9) {
         열 = 3;
         행 = 8;
      } else if (no == 10) {
         열 = 3;
         행 = 10;
      } else if (no == 11) {
         열 = 6;
         행 = 2;
      } else if (no == 12) {
         열 = 6;
         행 = 4;
      } else if (no == 13) {
         열 = 6;
         행 = 6;
      } else if (no == 14) {
         열 = 6;
         행 = 8;
      } else if (no == 15) {
         열 = 6;
         행 = 10;
      } else if (no == 16) {
         열 = 7;
         행 = 2;
      } else if (no == 17) {
         열 = 7;
         행 = 4;
      } else if (no == 18) {
         열 = 7;
         행 = 6;
      } else if (no == 19) {
         열 = 7;
         행 = 8;
      } else if (no == 20) {
         열 = 7;
         행 = 10;
      }
      else if (no == 21) {
          열 = 10;
          행 = 2;
       }
      else if (no == 22) {
          열 = 10;
          행 = 4;
       }
      else if (no == 23) {
          열 = 10;
          행 = 6;
       }
      else if (no == 24) {
          열 = 10;
          행 = 8;
       }
      else if (no == 25) {
          열 = 10;
          행 = 10;
       }
      
      ArrayList<독서실클래스2> 좌석정보 = new ArrayList<>();
      // 좌석번호,조명,콘센트,칸막이,컴퓨터,주의사항
      좌석정보.add(new 독서실클래스2(1, "O", "O", "O", "X", "강냉방"));
      좌석정보.add(new 독서실클래스2(2, "O", "O", "O", "X", "강냉방"));
      좌석정보.add(new 독서실클래스2(3, "O", "O", "O", "X", "강냉방"));
      좌석정보.add(new 독서실클래스2(4, "O", "O", "O", "X", "없음"));
      좌석정보.add(new 독서실클래스2(5, "O", "O", "O", "X", "복도쪽"));
      좌석정보.add(new 독서실클래스2(6, "O", "O", "O", "X", "없음"));
      좌석정보.add(new 독서실클래스2(7, "O", "O", "O", "X", "없음"));
      좌석정보.add(new 독서실클래스2(8, "O", "O", "O", "X", "없음"));
      좌석정보.add(new 독서실클래스2(9, "O", "O", "O", "X", "없음"));
      좌석정보.add(new 독서실클래스2(10, "O", "O", "O", "X", "복도쪽"));
      좌석정보.add(new 독서실클래스2(11, "X", "X", "X", "X", "없음"));
      좌석정보.add(new 독서실클래스2(12, "X", "X", "X", "X", "없음"));
      좌석정보.add(new 독서실클래스2(13, "X", "X", "X", "X", "없음"));
      좌석정보.add(new 독서실클래스2(14, "X", "X", "X", "X", "없음"));
      좌석정보.add(new 독서실클래스2(15, "X", "X", "X", "X", "복도쪽"));
      좌석정보.add(new 독서실클래스2(16, "X", "X", "X", "X", "없음"));
      좌석정보.add(new 독서실클래스2(17, "X", "X", "X", "X", "없음"));
      좌석정보.add(new 독서실클래스2(18, "X", "X", "X", "X", "없음"));
      좌석정보.add(new 독서실클래스2(19, "X", "X", "X", "X", "없음"));
      좌석정보.add(new 독서실클래스2(20, "X", "X", "X", "X", "복도쪽, 출입구근처"));
      좌석정보.add(new 독서실클래스2(21, "X", "o", "o", "o", "창문"));
      좌석정보.add(new 독서실클래스2(22, "X", "o", "o", "o", "창문"));
      좌석정보.add(new 독서실클래스2(23, "X", "o", "o", "o", "창문"));
      좌석정보.add(new 독서실클래스2(24, "X", "o", "o", "o", "창문"));
      좌석정보.add(new 독서실클래스2(25, "X", "o", "o", "o", "창문, 출입구근처"));


      System.out.println(좌석정보.get(no - 1));

      if (seat[열][행].equals("□")) {
         seat[열][행] = "■";
         System.out.println(" 좌석이 선택되었습니다.\n");
      } else {
         System.out.println(" 이미 선택된 좌석입니다.\n");
      }

      System.out.println(" 현재 좌석 상태");

      for (int i = 0; i < seat.length; i++) {

         for (int j = 0; j < seat[i].length; j++) {
            System.out.print(seat[i][j]);
         }
         System.out.print("\n");
      }
   }
   public static void 퇴실 () {

         

      System.out.println(" 퇴실할 번호를 입력해주세요.");

      for (int i = 0; i < seat.length; i++) {

         for (int j = 0; j < seat[i].length; j++) {
            System.out.print(seat[i][j]);
         }
         System.out.print("\n");
      }

      Scanner sc = new Scanner(System.in);
      int no = sc.nextInt();

      int 열 = 0;
      int 행 = 0;

      if (no == 1) {
         열 = 2;
         행 = 2;
      } else if (no == 2) {
         열 = 2;
         행 = 4;
      } else if (no == 3) {
         열 = 2;
         행 = 6;
      } else if (no == 4) {
         열 = 2;
         행 = 8;
      } else if (no == 5) {
         열 = 2;
         행 = 10;
      } else if (no == 6) {
         열 = 3;
         행 = 2;
      } else if (no == 7) {
         열 = 3;
         행 = 4;
      } else if (no == 8) {
         열 = 3;
         행 = 6;
      } else if (no == 9) {
         열 = 3;
         행 = 8;
      } else if (no == 10) {
         열 = 3;
         행 = 10;
      } else if (no == 11) {
         열 = 6;
         행 = 2;
      } else if (no == 12) {
         열 = 6;
         행 = 4;
      } else if (no == 13) {
         열 = 6;
         행 = 6;
      } else if (no == 14) {
         열 = 6;
         행 = 8;
      } else if (no == 15) {
         열 = 6;
         행 = 10;
      } else if (no == 16) {
         열 = 7;
         행 = 2;
      } else if (no == 17) {
         열 = 7;
         행 = 4;
      } else if (no == 18) {
         열 = 7;
         행 = 6;
      } else if (no == 19) {
         열 = 7;
         행 = 8;
      } else if (no == 20) {
         열 = 7;
         행 = 10;
      }
      else if (no == 21) {
          열 = 10;
          행 = 2;
       }
      else if (no == 22) {
          열 = 10;
          행 = 4;
       }
      else if (no == 23) {
          열 = 10;
          행 = 6;
       }
      else if (no == 24) {
          열 = 10;
          행 = 8;
       }
      else if (no == 25) {
          열 = 10;
          행 = 10;
       }
      ArrayList<독서실클래스2> 좌석정보 = new ArrayList<>();
      // 좌석번호,조명,콘센트,칸막이,컴퓨터,주의사항
      좌석정보.add(new 독서실클래스2(1, "O", "O", "O", "X", "강냉방"));
      좌석정보.add(new 독서실클래스2(2, "O", "O", "O", "X", "강냉방"));
      좌석정보.add(new 독서실클래스2(3, "O", "O", "O", "X", "강냉방"));
      좌석정보.add(new 독서실클래스2(4, "O", "O", "O", "X", "없음"));
      좌석정보.add(new 독서실클래스2(5, "O", "O", "O", "X", "복도쪽"));
      좌석정보.add(new 독서실클래스2(6, "O", "O", "O", "X", "없음"));
      좌석정보.add(new 독서실클래스2(7, "O", "O", "O", "X", "없음"));
      좌석정보.add(new 독서실클래스2(8, "O", "O", "O", "X", "없음"));
      좌석정보.add(new 독서실클래스2(9, "O", "O", "O", "X", "없음"));
      좌석정보.add(new 독서실클래스2(10, "O", "O", "O", "X", "복도쪽"));
      좌석정보.add(new 독서실클래스2(11, "X", "X", "X", "X", "없음"));
      좌석정보.add(new 독서실클래스2(12, "X", "X", "X", "X", "없음"));
      좌석정보.add(new 독서실클래스2(13, "X", "X", "X", "X", "없음"));
      좌석정보.add(new 독서실클래스2(14, "X", "X", "X", "X", "없음"));
      좌석정보.add(new 독서실클래스2(15, "X", "X", "X", "X", "복도쪽"));
      좌석정보.add(new 독서실클래스2(16, "X", "X", "X", "X", "없음"));
      좌석정보.add(new 독서실클래스2(17, "X", "X", "X", "X", "없음"));
      좌석정보.add(new 독서실클래스2(18, "X", "X", "X", "X", "없음"));
      좌석정보.add(new 독서실클래스2(19, "X", "X", "X", "X", "없음"));
      좌석정보.add(new 독서실클래스2(20, "X", "X", "X", "X", "복도쪽, 출입구근처"));
      좌석정보.add(new 독서실클래스2(21, "X", "o", "o", "o", "창문"));
      좌석정보.add(new 독서실클래스2(22, "X", "o", "o", "o", "창문"));
      좌석정보.add(new 독서실클래스2(23, "X", "o", "o", "o", "창문"));
      좌석정보.add(new 독서실클래스2(24, "X", "o", "o", "o", "창문"));
      좌석정보.add(new 독서실클래스2(25, "X", "o", "o", "o", "창문, 출입구근처"));


      System.out.println(좌석정보.get(no - 1));

      if (seat[열][행].equals("■")) {
         seat[열][행] = "□";
         System.out.println(" 퇴실 되었습니다.\n");
      } else {
         System.out.println("잘못된 입력입니다.\n");
      }

      System.out.println(" 현재 좌석 상태");

      for (int i = 0; i < seat.length; i++) {

         for (int j = 0; j < seat[i].length; j++) {
            System.out.print(seat[i][j]);
         }
         System.out.print("\n");
      }
   }

}