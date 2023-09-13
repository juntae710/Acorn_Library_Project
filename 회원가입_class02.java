package javaPrj.프로젝트;
import java.util.ArrayList;
import java.util.Scanner;

public class 회원가입_class02 {
	
      ArrayList<String> memberIds = new ArrayList<String>();

    
    public boolean joinId(String id) {
        for (String memberId : memberIds) {
            if (memberId.equals(id)) {
                return true;
            }
        }
        return false;
    }
    
    public void add(String id) {
        if (joinId(id)) {
            System.out.println("중복된 아이디입니다. \n");
        } else {
            memberIds.add(id);
            System.out.println("회원 등록이 완료되었습니다. \n");
        }
        
    }
}
