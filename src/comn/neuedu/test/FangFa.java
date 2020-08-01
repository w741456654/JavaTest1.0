package comn.neuedu.test;

public class FangFa {

	public static void main(String[] args) {
		printStar(5,6);
		System.out.println("=============");
		printStar(4,5);

	}
	public static void printStar(int m,int n){
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}


}