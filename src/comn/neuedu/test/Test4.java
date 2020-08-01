package comn.neuedu.test;

public class Test4 {
public static void main(String [] args){
	int m=8;
	int n=12;
	int min=m<n? m:n;
	int time=1;
	for(int i=min;i>=1;i--)
	{
		if(m%i==0 && n%i==0)
		{
			time=i;
			break;
		}
	}
	System.out.println(m+"和"+ n +"的最大公约数"+"="+time);
	
	//水仙花数
	for(int i=100;i<1000;i++)
	{
		int a=i/100;
		int b=i/10%10;
		int c=i%10;
		if(a*a*a+b*b*b+c*c*c==i)
			System.out.println(i);
	}
}
}
