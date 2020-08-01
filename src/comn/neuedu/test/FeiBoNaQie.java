package comn.neuedu.test;

public class FeiBoNaQie {

	public static void main(String[] args) {
		System.out.println(feibonaqie(30));

	}
	public static int feibonaqie(int n)
	{
		if(n==1 || n==2)
		{
			return 1;
		}
		else
		{
			return feibonaqie(n-1) + feibonaqie(n-2);
		}
	}


}
