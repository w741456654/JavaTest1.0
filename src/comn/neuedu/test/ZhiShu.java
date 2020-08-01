package comn.neuedu.test;

public class ZhiShu {
public static void main(String[] args){
	
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			System.out.print("*");
		}
		System.out.print("\n");
	}
	
	for(int i=1;i<=9;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(i+"*"+j+"="+i*j+"\t");
		}
		System.out.println();
	}
	
	//找到10个200以上的最小的质数
	int sum=0;//计数
	for(int i=200;i<=999;i++)
	{
		boolean f=true;//是否质数，数据重置
		for(int j=2;j<=i/2;j++)
		{
			if(i%j==0)
			{   
				f=false;//不是指数
				break;//不是质数，Break循环
			}
		}
		if(f)//break:是质数进if
		{
			sum+=1;//第一个质数,计数器累加
     		System.out.println(i);	
     		if(sum==10)
     			return;//够十个质数结束方法
		}
	}
  }
}
