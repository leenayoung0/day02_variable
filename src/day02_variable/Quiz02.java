package day02_variable;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int kor, eng, mat, sum;
		
		System.out.print("����� �̸��� �����Դϱ�? ");
		name = sc.next();
		System.out.print(name + " ���� ���� ���� : ");
		kor = sc.nextInt();
		System.out.print(name + " ���� ���� ���� : ");
		eng = sc.nextInt();
		System.out.print(name + " ���� ���� ���� : ");
		mat = sc.nextInt();
		System.out.println();
		
		System.out.println("============");
		System.out.println("�� �� : " + name);
		System.out.println("============");
		System.out.println("�� �� : " + kor);
		System.out.println("�� �� : " + eng);
		System.out.println("�� �� : " + mat);
		System.out.println("============");
		System.out.println("�� �� : " + (kor + eng+ mat));
		System.out.println("===========");
		sum = kor + eng + mat;
		System.out.println("�� �� : " + sum);
		
		sc.close();
	}

}
