package kr.java.homework;

import java.util.Scanner;
//5. 18 과제
public class homework1 {

	public static void main(String[] args) {
//		123p 1번
		/*int num1 = 10;
		int num2 = 2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사칙연산 +,-,*,/를 입력해주세요");
		char operator = sc.nextLine().charAt(0);
		
		switch(operator)
		{
		case '+':
			operator = '+';
			break;
		case '-':
			operator = '-';
			break;
		case '*':
			operator = '*';
			break;
		case '/':
			operator = '/';
			break;
		}
		
		if(operator == '+')
		{
			System.out.println(num1 + num2);
		}
		else if(operator == '-')
		{
			System.out.println(num1 - num2);
		}
		else if(operator == '*')
		{
			System.out.println(num1 * num2);
		}
		else if(operator == '/')
		{
			System.out.println(num1 / num2);
		}
		else
			System.out.println("사칙연산이 아닙니다.");*/
		
//		123p 2번	
		/*for(int i = 1; i<10; i++ )
		{
			if(i%2 == 1)
				continue;
			for(int y = 1; y<10; y++)
			{
				System.out.println(i + " * " + y + "=" + i*y);
			}
			System.out.println("\t");
			
//		123p 3번
		}*/
		/*for(int i = 1; i<10; i++ )
		{
			for(int y = 1; y<10; y++)
			{
				if(i < y)
					break;
			
				System.out.println(i + " * " + y + "=" + i*y);
			}
			System.out.println("\t");
		}*/
		
//		p123 4번
		/*for(int i = 0; i <= 4; i++)
		{
			for(int j = 0; j < 4-i; j++)
			{
				System.out.print(" ");
			}
			for(int j = 0; j < i*2-1 ; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}*/
		
//		p123 5번
		/*for(int i = 0; i <= 4; i++)
		{
			for(int j = 0; j < 4-i; j++)
			{
				System.out.print(" ");
			}
			for(int j = 0; j < i*2-1 ; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 3; i >= 1; i--)
		{
			for(int j = 0; j < 4-i; j++)
			{
				System.out.print(" ");
			}
			for(int j = 0; j < i*2-1 ; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}*/
		
//		100p
		/*Scanner sc = new Scanner(System.in);
		int Score = sc.nextInt();
		char grade;
		
		if(Score>=90)
		{
			grade = 'A';
			System.out.println("성적은 "+grade+" 입니다.");
		}
		else if(Score>=80)
		{
			grade = 'B';
			System.out.println("성적은 "+grade+" 입니다.");
		}
		else if(Score>=70)
		{
			grade = 'C';
			System.out.println("성적은 "+grade+" 입니다.");
		}
		else if(Score>=60)
		{
			grade = 'D';
			System.out.println("성적은 "+grade+" 입니다.");
		}
		else
		{
			grade = 'F';
			System.out.println("성적은 "+grade+" 입니다.");
		}*/
		
//		106p
		/*Scanner sc = new Scanner(System.in);
		System.out.println("엘리베이터 층수를 누르세요.");
		int floor = sc.nextInt();
		String name;
		
		switch(floor)
		{
		case 1:
			name = "약국";
			System.out.println(floor+"층 "+name+" 입니다");
			break;
		case 2:
			name = "정형외과";
			System.out.println(floor+"층 "+name+" 입니다");
			break;
		case 3:
			name = "피부과";
			System.out.println(floor+"층 "+name+" 입니다");
			break;
		case 4:
			name = "치과";
			System.out.println(floor+"층 "+name+" 입니다");
			break;
		case 5:
			name = "헬스 클럽";
			System.out.println(floor+"층 "+name+" 입니다");
			break;
		}*/
		

	}

}
