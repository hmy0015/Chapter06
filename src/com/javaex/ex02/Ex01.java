package com.javaex.ex02;
import java.io.*;

public class Ex01 {
	public static void main(String[] args) throws IOException {
		Writer fw = new FileWriter("C:\\javaStudy\\file\\song.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("학교 종이 땡땡땡"); // 데이터 입력
		bw.newLine(); // 줄바꿈
		bw.write("어서 모이자");
		bw.newLine();
		
		bw.close();
	}
}
