package kr.java.homework;

import java.util.Arrays;
import java.util.Scanner;

public class homework05211 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char [] alpabet = new char[26];
		int cnt = 0;
		for(int i = 0; i < alpabet.length; i++)
		{
			alpabet[i] = (char)(i+65);
		}
		while(true)
		{
			System.out.print("�ڿ����� �Է��Ͻÿ� : ");
			int n = sc.nextInt();
			
			if(3 <= n && n <= 10)
			{
				for(int i = n; i >= 0; i--) 
				{
					for(int j = 0; j < i; j++) 
					{	
						System.out.print(alpabet[cnt]); // ���ĺ� ��¹�
						cnt++; 
						if(cnt == 26) // �迭�� �Ѿ����� �ʱ�ȭ
							cnt = 0;
					}
					System.out.println();
				}
				break;
			}
			else
				System.out.println("3�̻� 10������ �ڿ����� �Է��Ͻÿ�.");
			System.out.println();
		}
	}

}
