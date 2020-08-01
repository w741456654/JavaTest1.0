package comn.neuedu.test;

import java.util.Random;

public class SuiJiShu {

	public static void main(String[] args) {

		Random rand =new Random();
		for(int i=0;i<10;i++)
		{
			
			int Xt=rand.nextInt(3);
	        System.out.println(Xt);
		}

		
	}

}
