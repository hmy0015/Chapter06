package com.javaex.ex01;
import java.io.*;

public class Ex02 {
	public static void main(String[] args) throws IOException {
		// 인풋 스트림 (이미지 인풋)
		InputStream in = new FileInputStream("C:\\javaStudy\\file\\img.jpg"); // 주스트림
		BufferedInputStream bIn = new BufferedInputStream(in); // 보조스트림

		// 아웃풋 스트림 (이미지 아웃풋)
		OutputStream out = new FileOutputStream("C:\\javaStudy\\file\\bytebuff.jpg"); // 주스트림
		BufferedOutputStream bOut = new BufferedOutputStream(out); // 보조스트림
		
		// 이미지 데이터를 받을 배열 선언
		byte[] buff = new byte[1024];
		
		System.out.println("복사시작");
		while(true) {
			int data = bIn.read(buff); // 읽어들인 이미지데이터를 배열에 저장 => 배열을 변수 data에 대입
			if(data == -1) {
				System.out.println("복사끝" + data);
				break;
			}
			bOut.write(buff);
		}

		/*
		int data = 0;
		while(data != -1) {
			data = bIn.read(buff);
			bOut.write(buff);
		}
		*/
		
		bOut.close();
		bIn.close();
		out.close();
		in.close();
	}
}
