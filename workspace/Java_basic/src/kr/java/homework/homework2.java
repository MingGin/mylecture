package kr.java.homework;

import java.util.Scanner;

public class homework2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���ʷ� �Է��ϼ���.(�ǿ�����->������->�ǿ�����)");
		System.out.print("�ǿ�����: ");
		int num1 = sc.nextInt();
		System.out.print("������: ");
		String math = sc.next();
		System.out.print("�ǿ�����: ");
		int num2 = sc.nextInt();
		if(math.equals("+"))
		{
			System.out.println("��� : "+ (num1 + num2));
		}
		else if(math.equals("-"))
		{
			System.out.println("��� : "+ (num1 - num2));
		}
		else if(math.equals("/"))
		{
			System.out.println("��� : "+ (num1 / num2));
		}
		else if(math.equals("*"))
		{
			System.out.println("��� : "+ (num1 * num2));
		}
		

	}

}