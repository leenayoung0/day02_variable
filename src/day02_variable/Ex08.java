package day02_variable;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String n2;
		System.out.print("ù��° �� �Է� : ");
		//n1 = input.nextLine();
		int n = input.nextInt();
		System.out.print("�ι�° �� �Է� : ");
		n2 = input.nextLine();
		System.out.println("ù��° �Է� �� : "+n);
		System.out.println("�ι�° �Է� �� : "+n2);
		
		input.close();
	}

}
