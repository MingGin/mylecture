package kr.java.chapter4;

public class IfStatementEx {

	public static void main(String[] args) {
		
		int age = 10;
		
		//조건 1
		if(age >= 8) 
		{
			System.out.println("8살 이상이네요.");	
		}
		else 
		{
			System.out.println("8살 이하!!!");
		}
		
		//복합 조건;
		int age2 = 10;
		
		if(age >= 8 && age2 > 10)
		{
			System.out.println("8살 이상이네요.");
		}
		else
		{
			System.out.println("8살 이하!!!");
		}
		

	}

}
