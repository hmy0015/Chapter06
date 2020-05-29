package com.javaex.ex04;
import java.io.*;
import java.util.*;

public class Ex02 {
	public static void main(String[] args) throws IOException {
		InputStream in = new FileInputStream("C:\\javaStudy\\file\\PhoneDB.txt"); // 파일 불러오기
		InputStreamReader ir = new InputStreamReader(in, "UTF-8"); // 파일 형식에 맞춰 인코딩
		BufferedReader br = new BufferedReader(ir); // 인코딩 된 파일 버퍼에 담기
		List<Person> pList = new ArrayList<Person>(); // 친구 목록 리스트로 관리
		
		while(true) {
			String str = br.readLine();
			if(str == null) {
				break;
			}
			String[] sArray = str.split(",");
			Person person = new Person(sArray[0], sArray[1], sArray[2]);
			pList.add(person);
		}
		
        for(int i = 0; i < pList.size(); i++) {
        	pList.get(i).showInfo();
        }
        br.close();
	}
}
