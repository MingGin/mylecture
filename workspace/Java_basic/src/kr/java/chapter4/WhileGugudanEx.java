package kr.java.chapter4;

import java.util.Scanner;

public class WhileGugudanEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dan;
		int i = 1;
		System.out.println("���� �Է����ּ���.");
		dan = sc.nextInt();
		
		if(dan > 0)
		{
			while(i < 10)
				{
					System.out.println(dan + " * " + i + " = " + (dan*i));
					i++;
					
				}
		}
		else
		{
			System.out.println("~��~");
		}

	}

}