package kr.java.chapter8;

import java.util.Arrays;
import java.util.Scanner;

public class MatchingTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] animal = {"??????", "??????", "??????", "???ұ?", "???"};
		String[] engName = {"Bear", "Gift", "White", "Sesami", "Balck"};
		System.out.println("?ֿϰ? ?̸??? ?Է??Ͻÿ?.");
		String name = sc.nextLine();
		int cnt = 0;
		
		for(int i = 0; i < animal.length; i++)
		{
			if(name.equals(animal[i]))
				System.out.println(engName[i]);
			cnt++;
			if(cnt == 5 && !name.equals(animal[i]))
			{
				System.out.println("???ϵ? ?̸??? ?ƴմϴ?.");
			}
		}
		
	}

}
