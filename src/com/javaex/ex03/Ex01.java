package com.javaex.ex03;
import java.io.*;

public class Ex01 {
	public static void main(String[] args) throws IOException {
		InputStream in = new FileInputStream("C:\\javaStudy\\file\\MS949.txt"); // 파일 불러오기
		InputStreamReader ir = new InputStreamReader(in, "MS949"); // 파일 형식에 맞춰 인코딩
		BufferedReader br = new BufferedReader(ir); // 인코딩 된 파일 버퍼에 담기
		
		while(true) {
			String str = br.readLine();
			if(str == null) {
				break;
			}
			System.out.println(str);
		}
		br.close();
	}
}
