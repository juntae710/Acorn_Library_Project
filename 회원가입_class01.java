package javaPrj.프로젝트;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class 회원가입_class01 {
	   public static void Join() throws IOException {
		   
		  System.out.println("새로운 아이디를 적어주세요\r\n");
		  Scanner sc = new Scanner(System.in);
	      String newId = sc.nextLine();
			  
	        String filePath = "res/aaa.txt";

	        //1.회원확인( 회원정보 - 파일 aaa.txt)
	        
	        FileReader fileReader = new FileReader(filePath ); // true는 append 모드를 나타냅니다.
            BufferedReader bufferedReader = new BufferedReader(fileReader);
	        
            회원가입_class02  users = new 회원가입_class02();
            
            //파일을 읽어서   arrayList   담기
            while(true) {
            	String userid = bufferedReader.readLine();  
            	if( userid== null) break;   
            	users.memberIds.add(userid);
            } 	        
            
            // 파일에서 읽어온 정보 확이나기
//            for( String s: users.memberIds) {
//            	System.out.println( s);
//            }	
            
            //중복아이디 확인 
            
            
	        //2.기존회원 아니면 파일에 등록
	        
	        
	        try {
	            // 파일에 문자열을 추가하기 위해 FileWriter와 BufferedWriter를 사용합니다.
	            FileWriter fileWriter = new FileWriter(filePath, true); // true는 append 모드를 나타냅니다.
	            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

	            // 새로운 문자열을 파일에 추가합니다.	            
	            if(  !users.joinId(newId)) {
			            bufferedWriter.write(newId);
			            bufferedWriter.newLine(); // 새로운 줄로 이동합니다.
			            System.out.println("회원가입 되었습니다.");
	            } else {
	            	System.out.println("중복된 아이디입니다");
	            }

	            // 리소스를 정리합니다.
	            bufferedWriter.close();
	            fileWriter.close();

	           
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}