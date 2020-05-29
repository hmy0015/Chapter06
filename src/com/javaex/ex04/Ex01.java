package com.javaex.ex04;
import java.io.*;

public class Ex01 {
	public static void main(String[] args) throws IOException {
		InputStream in = new FileInputStream("C:\\javaStudy\\file\\PhoneDB.txt"); // 파일 불러오기
		InputStreamReader ir = new InputStreamReader(in, "UTF-8"); // 파일 형식에 맞춰 인코딩
		BufferedReader br = new BufferedReader(ir); // 인코딩 된 파일 버퍼에 담기
		String name, hp, company;
		
		while(true) {
			String str = br.readLine();
        	if(str == null) {
        		break;
        	}
        	
        	String[] sArray = str.split(",");
        	name = sArray[0];
        	hp = sArray[1];
        	company = sArray[2];
        	
    		System.out.println("이름 : " + name);
    		System.out.println("번호 : " + hp);
    		System.out.println("회사 : " + company);
    		System.out.println();
		}
		br.close();
	}
}
