package com.javaex.ex03;
import java.io.*;

public class Ex02 {
	public static void main(String[] args) throws IOException {
		// System.in - 키보드 입력
		InputStreamReader ir = new InputStreamReader(System.in, "UTF-8"); // 파일 형식에 맞춰 인코딩
		BufferedReader br = new BufferedReader(ir); // 인코딩 된 파일 버퍼에 담기
		
		String str = br.readLine();		
		br.close();
		
		// System.out - 모니터 출력
		OutputStreamWriter ow = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(ow);
		
		bw.write(str);
		bw.close();
	}
}
