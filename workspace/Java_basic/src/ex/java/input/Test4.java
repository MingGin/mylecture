package ex.java.input;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է��Ͻÿ� : ");
		String num = sc.nextLine();
		String[] op = num.split("");
		
		int num1 = Integer.parseInt(op[0]);
		int num2 = Integer.parseInt(op[2]);
		
		
		if(op[1].equals("+"))
			System.out.println("��� : " + (num1 + num2) );
		else if(op[1].equals("-"))
			System.out.println("��� : " + (num1 - num2) );
		else if(op[1].equals("/"))
			System.out.println("��� : " + (num1 / num2) );
		else if(op[1].equals("*"))
			System.out.println("��� : " + (num1 * num2) );
		

	}

}