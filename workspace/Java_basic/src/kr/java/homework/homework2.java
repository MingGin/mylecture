package kr.java.homework;

import java.util.Scanner;

public class homework2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("계산식을 차례로 입력하세요.(피연산자->연산자->피연산자)");
		System.out.print("피연산자: ");
		int num1 = sc.nextInt();
		System.out.print("연산자: ");
		String math = sc.next();
		System.out.print("피연산자: ");
		int num2 = sc.nextInt();
		if(math.equals("+"))
		{
			System.out.println("결과 : "+ (num1 + num2));
		}
		else if(math.equals("-"))
		{
			System.out.println("결과 : "+ (num1 - num2));
		}
		else if(math.equals("/"))
		{
			System.out.println("결과 : "+ (num1 / num2));
		}
		else if(math.equals("*"))
		{
			System.out.println("결과 : "+ (num1 * num2));
		}
		

	}

}
