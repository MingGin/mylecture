package kr.java.chapter4;

public class IfStatementEx {

	public static void main(String[] args) {
		
		int age = 10;
		
		//���� 1
		if(age >= 8) 
		{
			System.out.println("8�� �̻��̳׿�.");	
		}
		else 
		{
			System.out.println("8�� ����!!!");
		}
		
		//���� ����;
		int age2 = 10;
		
		if(age >= 8 && age2 > 10)
		{
			System.out.println("8�� �̻��̳׿�.");
		}
		else
		{
			System.out.println("8�� ����!!!");
		}
		

	}

}
