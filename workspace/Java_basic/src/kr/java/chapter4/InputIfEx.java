package kr.java.chapter4;

import java.util.Scanner;

public class InputIfEx {

	public static void main(String[] args) {
		
		//�ǽ�:
		//Scanner, if statement ���:
		// ���ڰ� 0, ��ȣ -�� �ƴϸ� ���ڸ� ���!
		// 0, ��ȣ -�� ��� �޽��� "����� �Է��ϼ���!" ���!
		Scanner scanner = new Scanner(System.in);

		System.out.println("���ڸ� �Է��� �ּ���.");
		int num1 = scanner.nextInt();
		int max = num1 + 100;
		if(num1 > 0 && num1 == max)
		{
			System.out.println("���ڸ� �Է��� �ּ���.");
			num1 = scanner.nextInt();
		}
		else 
		{
			System.out.println("�ȳ�~ ���� ������");
			num1 = 0;
		}
		

	}

}