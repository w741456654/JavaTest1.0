package comn.neuedu.test;
import java.util.Random;
import java.util.Scanner;

public class ChaiQuanYouXi {

	public static void main(String[] args) {

		 //Ҫ���û�����0-2֮�������
		 //����û�����0���"�������ʯͷ"
		 //����û�����1�����"������Ǽ���"
		 //����û��������2�����"������ǲ�"
		 //Ȼ�������Ƿ�Ҫ������ȭ
		 //����ش�y�����ظ����Ϲ��̣������������
		boolean Xz=false;  //����һ��Xz�����ж��û���ѡ�񣬳�ʼֵΪ��
		Random rand =new Random();//����һ��Randomʵ����
		Scanner s1=new Scanner(System.in);//����һ��Scannerʵ����
		System.out.println("������һ��0-2֮���������");//��ʾ
		boolean t=false;//����t�ж��Ƿ��ظ������ʾ
		System.out.println("Ps��0����ʯͷ��1���������2����");
		System.out.println("==================================");//��ʾ
		do{//���������ִ��һ��
			if(t)//�ж��Ƿ��������ʾ
			{
				System.out.println("������һ��0-2֮���������");//��ʾ
			}
			t=true;//��ʼ������
			int number=s1.nextInt();//����Scanner��ֵ
				if(number>=0 && number<=2)//�ж����������Ƿ�Ϸ�
				{
					int Xt=rand.nextInt(3);//����0-3�������������3
						switch(number)//�ж��û����롢������ʾ
						{
						case 0:System.out.println("�������ǣ�ʯͷ");
						break;
						case 1:System.out.println("�������ǣ�����");
						break;
						case 2:System.out.println("�������ǣ���");
						break;
						}
						if(number==Xt)//�ж���Ӯ�������ʾ
						{	
							switch(Xt)
							{
							case 0:System.out.println("�Է������ǣ�ʯͷ  ƽ�֣�");
							break;
							case 1:System.out.println("�Է������ǣ�����  ƽ�֣�");
							break;
							case 2:System.out.println("�Է������ǣ�  ��  ƽ�֣�");
							break;
							}
						}
						else if (number>Xt)
						{
							switch(Xt)
							{
							case 0:System.out.println("�Է������ǣ�ʯͷ  ��Ӯ�ˣ���");
							break;
							case 1:System.out.println("�Է������ǣ�����  ��Ӯ�ˣ���");
							break;
							case 2:System.out.println("�Է������� �� ��  ��Ӯ�ˣ���");
							break;
							}
						}
						else if (number<Xt)
						{
							switch(Xt)
							{
							case 0:System.out.println("�Է������ǣ�ʯͷ  ������...");
							break;
							case 1:System.out.println("�Է������ǣ�����  ������...");
							break;
							case 2:System.out.println("�Է������ǣ�  ��  ������...");
							break;
							}
						}
						System.out.println();
						System.out.println("���Ƿ�Ҫ������ȭ������Y/y������");
						System.out.println("==================================");
						String c=s1.next();//�����û�����
						if(c.equals("y")||c.equals("Y"))//�ж��û��Ƿ�Ҫ��������
						{	
							Xz=true;
						}
						else
						{
							Xz=false;
						}
					}
				else//���number���Ϸ�����ʾ������ʼ��������ѭ���ܼ���
				{
					System.out.println("�������������������룡");
					System.out.println("==================================");
					Xz=true;
				}
		}while(Xz);//�ж��û���ѡ��
		System.out.println("���˳���");//��ʾ
	}
}