package kr.java.Stream;

import java.util.Scanner;

public class ScannerHomework {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ù��° ���� �Է��Ͻÿ�.");
		int num1 = scanner.nextInt();
		System.out.println("�ι�° ���� �Է��Ͻÿ�.");
		int num2 = scanner.nextInt();
		System.out.println("����° ���� �Է��Ͻÿ�.");
		int num3 = scanner.nextInt();
		
		int sum = num1 + num2 + num3;
		int avg = sum/3;
		
		
		System.out.println("sum : " + sum +"\n" + "avg : " + avg);
	}

}
