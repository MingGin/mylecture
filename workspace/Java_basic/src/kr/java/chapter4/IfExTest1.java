package kr.java.chapter4;

import java.util.Scanner;

public class IfExTest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ���.");
		int num = sc.nextInt();
		
		if(num>0)
		{
			System.out.println("����Դϴ�.");
		}
		else if(num == 0)
		{
			System.out.println("0�Դϴ�.");
		}
		else
		{
			System.out.println("�����Դϴ�.");
		}

	}

}
