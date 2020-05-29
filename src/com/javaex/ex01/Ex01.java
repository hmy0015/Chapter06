package com.javaex.ex01;
import java.io.*;

public class Ex01 {
	public static void main(String[] args) throws IOException {
		InputStream in = new FileInputStream("C:\\javaStudy\\file\\img.jpg");
		OutputStream out = new FileOutputStream("C:\\javaStudy\\file\\buff.jpg");
		byte[] buff = new byte[1024];
		
		System.out.println("복사시작");
		while(true) {
			int data = in.read(buff);
			if(data == -1) {
				System.out.println("복사끝" + data);
				break;
			}
			out.write(buff);
		}

		/*
		int data = 0;
		while(data != -1) {
			data = in.read(buff);
			out.write(buff);
		}
		*/
		
		out.close();
		in.close();
	}
}
