package kr.java.chapter4;

import java.util.Scanner;

public class InputIfEx {

	public static void main(String[] args) {
		
		//실습:
		//Scanner, if statement 사용:
		// 숫자가 0, 부호 -가 아니면 숫자를 출력!
		// 0, 부호 -면 경고 메시지 "양수를 입력하세요!" 출력!
		Scanner scanner = new Scanner(System.in);

		System.out.println("숫자를 입력해 주세요.");
		int num1 = scanner.nextInt();
		int max = num1 + 100;
		if(num1 > 0 && num1 == max)
		{
			System.out.println("숫자를 입력해 주세요.");
			num1 = scanner.nextInt();
		}
		else 
		{
			System.out.println("안녕~ 이제 끝났어");
			num1 = 0;
		}
		

	}

}
