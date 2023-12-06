package 프로젝트2차ver2;

import java.util.Scanner;

public class 독서실프로그램 {

    public static void 독서실이용하기() {
        독서실좌석선택2 c = new 독서실좌석선택2();
        System.out.println(" ====================\n" + " 입실 또는 퇴실을 선택해 주세요.\n");
        /*
         * 어레이구역
         *
         */
        Scanner sc = new Scanner(System.in);

        int menu1;
        int menu2;
        int menu3;

        // 좌석보여주기구역

        loop9 : while (true) {
            System.out.println(" ====================\n 0. 뒤로\n 1. 입실\n 2. 퇴실\n ====================\n");
            menu1 = sc.nextInt();
            switch (menu1) {
            	case 0: 
            		break loop9;

                case 1:
                    System.out.println(" ====================");
                    System.out.println(" 0. 뒤로\n 1. 좌석선택하기\n 2. 자리별 특이사항보기\n ====================\n");

                    menu2 = sc.nextInt();
                    switch (menu2) {

                        case 2:
                            System.out.println(" ====================");
                            System.out.println(" 1. 에어컨(1번,2번)");
                            System.out.println(" 2. 컴퓨터사용가능(21번~25번)");
                            System.out.println(" 3. 콘센트사용불가(11번~20번)");
                            System.out.println(" 4. 개방형 자리(11번~20번)");
                            System.out.println(" --------------------");
                            // System.out.println("0.이전\n");
                            break;

                        case 1:
                            System.out.println(" ====================\n 원하는 좌석 번호를 입력해 주세요.");
                            // c.seats();
                            독서실좌석선택2 seat = new 독서실좌석선택2();
                            seat.입실();
                            System.out.println(" 메뉴를 선택해 주세요.");
                            System.out.println(" --------------------");
                            break;
                    }
                    break;

                case 2:
                   
                     독서실좌석선택2 seat = new 독서실좌석선택2();
                     seat.퇴실();
                     System.out.println(" 메뉴를 선택해 주세요.");
                     System.out.println(" --------------------");
                    break;
                    
                    
            }
        }
    }
}