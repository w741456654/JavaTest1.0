package comn.neuedu.test;

public class FjZhiYinShu {

	public static void main(String[] args) {
		int a=120;
			for(int i=2;;)
			{
				  if(a%i==0)
				  {
				    a=a/i;
				    if(a==1)
				    {
				    	 System.out.print(i);
				    	 break;
				    }
				    else
				    {
				    	 System.out.print(i+"*");
				    }	   
				  }	
				  else
				  {
					i++;	
				  }
		    }
		/*int param = 120;
		for(int i= 2;i<=param;i++)
		{
			while(param!=i)
			{
				if(param%i==0){
					System.out.println(i+"*");
					param = param/i;
				}
				else
				{
					break;
				}
			}
		}*/

	}

}
