package kr.java.chapter4;

public class ContunueEx2 {

	public static void main(String[] args) {
		
		int i;
		
		for(i = 0; i<=20; i++ )
		{
			if(i%2 == 0 || i%3 ==0)
				continue;
			System.out.println(i);
			
		}

	}

}
