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
	
	//�ҵ�10��200���ϵ���С������
	int sum=0;//����
	for(int i=200;i<=999;i++)
	{
		boolean f=true;//�Ƿ���������������
		for(int j=2;j<=i/2;j++)
		{
			if(i%j==0)
			{   
				f=false;//����ָ��
				break;//����������Breakѭ��
			}
		}
		if(f)//break:��������if
		{
			sum+=1;//��һ������,�������ۼ�
     		System.out.println(i);	
     		if(sum==10)
     			return;//��ʮ��������������
		}
	}
  }
}
