package comn.neuedu.test;

public class DiGui {

	public static void main(String[] args) {
		int[]arr={1,2,1,3,5,3,5};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]==arr[j])
					{
						arr[j]=0;
					}
				}
			}
		}
		for(int item:arr)
		{
			System.out.print(item+"  ");
		}
       
	}

}
