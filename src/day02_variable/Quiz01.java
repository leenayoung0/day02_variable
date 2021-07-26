package day02_variable;

public class Quiz01 {
	public static void main(String[] args) {
		// 형변환을 이용하여 애러를 해결하세요
		// 크기를 확인하고 왜 그런지도 생각해 보세요
		byte b = 97;
		short s = 20;
		char c = 'A';
		float f;
		
		s = b;
		c = (char)b;
		s = (short)c;
		c = (char)s;
		f = (float)5.11;
		f = 5.11f;
		
	}

}
