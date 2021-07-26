package day02_variable;

import java.io.IOException;

public class Ex06 {
	public static void main(String[] args) throws IOException {
		
		/*
		 * int val; 
		 * System.out.print("입력 : "); 
		 * val = System.in.read(); //이 명령어 사용하기 위해위에 throws~ 가 필요함 
		 * System.out.println("입력 data : "+(char)val);
		 * 
		 * System.out.print("2번째 입력 : "); 
		 * val = System.in.read();
		 * System.out.println("입력 data : "+(char)val);
		 */
		
		// 위는 입력이 한번밖에 안됨( 두번째껀 입력이 안됨)
		// 아래와 같이 다시 하심
		//
		
		int val;
		System.out.print("입력 : ");
		val = System.in.read();	
		System.out.println("입력 data : "+(char)val);
		
		System.in.read();
		System.in.read();
		
		System.out.print("2번째 입력 : ");
		char ch = (char)System.in.read();	
		System.out.println("입력 data : "+(char)val);
		
		//우리가 실질적으로 쓸건 scanner. 이건 그냥 이런게 있다고 한번 본거
	}

}
