package day02_variable;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int age;
		String name;
		System.out.print("�̸� �Է� : ");
		name = input.next();	//���ڿ��� �Է¹޴� ���
		System.out.print("���� �Է� : ");
		age = input.nextInt();	//������ �Է¹޴� ���
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+age);
		
		input.close();
	}

}
