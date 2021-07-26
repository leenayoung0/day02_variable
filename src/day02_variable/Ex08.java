package day02_variable;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String n2;
		System.out.print("첫번째 값 입력 : ");
		//n1 = input.nextLine();
		int n = input.nextInt();
		System.out.print("두번째 값 입력 : ");
		n2 = input.nextLine();
		System.out.println("첫번째 입력 값 : "+n);
		System.out.println("두번째 입력 값 : "+n2);
		
		input.close();
	}

}
