package com.javaex.ex04;
import java.io.*;
import java.util.*;

public class Ex03 {
	public static void main(String[] args) throws IOException {
		OutputStream out= new FileOutputStream("C:\\javaStudy\\file\\PhoneDB.txt", true); // 파일 불러오기
		OutputStreamWriter ow = new OutputStreamWriter(out, "UTF-8"); // 파일 형식에 맞춰 인코딩
		BufferedWriter bw = new BufferedWriter(ow); // 인코딩 된 파일 버퍼에 담기
		
		bw.write("황민영,010-1111-1111,02-1234-1234");
		bw.newLine();

		bw.close();
	}
}
