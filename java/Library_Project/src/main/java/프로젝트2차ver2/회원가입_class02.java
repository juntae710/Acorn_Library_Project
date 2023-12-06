package 프로젝트2차ver2;

import java.util.ArrayList;
import java.util.Scanner;

public class 회원가입_class02 {
	
    ArrayList<String> memberIds = new ArrayList<String>(); // 문자열을 담는 ArrayList memberIds 선언 및 초기화
    
    // 주어진 아이디가 이미 회원 목록에 존재하는지 검사하는 메서드
    public boolean joinId(String id) {
        for (String memberId : memberIds) { // memberIds ArrayList 내의 모든 요소에 대해 반복
            if (memberId.equals(id)) { // 주어진 아이디와 현재 요소가 같은지 비교
                return true; // 같은 아이디가 이미 존재하면 true 반환
            }
        }
        return false; // 같은 아이디가 존재하지 않으면 false 반환
    }
    
    // 회원 아이디를 회원 목록에 추가하는 메서드
    public void add(String id) {
        if (joinId(id)) { 
        	System.out.println(" ====================");
            System.out.println(" 중복된 아이디입니다.");
            System.out.println(" ====================\n");
        } else {
            memberIds.add(id); // 주어진 아이디를 회원 목록에 추가
            System.out.println(" ====================");
            System.out.println(" 회원 등록이 완료되었습니다.");
            System.out.println(" ====================\n");
        }
    }
}
