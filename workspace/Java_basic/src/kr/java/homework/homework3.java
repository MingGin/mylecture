package kr.java.homework;

import java.util.Scanner;

public class homework3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int heg = 0,weh = 0;
		String exit = null;
		
		while(true) 
		{
			System.out.println("Ű�� �Է����ּ���.");
			heg = sc.nextInt();
			System.out.println("�����Ը� �Է����ּ���.");
			weh = sc.nextInt();
			int pig = weh+100-heg;
			if(pig > 0)
			{
				
				System.out.println("�񸸼�ġ �� �Դϴ�.");
				continue;
			}
			else
				System.out.println("���� �ƴմϴ�.");
			
			System.out.println("�����Ͻðڽ��ϱ�?");
			exit = sc.next();
			if(exit.equals("q"))
				break;
		}

	}

}