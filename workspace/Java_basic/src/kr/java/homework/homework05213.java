package kr.java.homework;

import java.util.Scanner;

public class homework05213 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("�ڿ����� �Է��Ͻÿ� : ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++)
		{
			for(int j = n; j > i+1; j--) // ���� ���
			{
				System.out.print("\t");
			}
			for(int j = 0; j <= i; j++) // ���� ���
			{
				System.out.print(j+1);
				System.out.print("\t");
			}
			System.out.println();
		}
	}

}