package com.neuedu.test.chapter6;

public class TestLaptop {
/*	����һ���ʼǱ��࣬��������ɫ��char����cpu�ͺţ�int���������ԡ�
	a) �޲κ��вε��������췽�����вι��췽�������ڴ��������ͬʱΪÿ�����Ը�ֵ�� 
    b) ����ʼǱ���Ϣ�ķ��� 
    c) Ȼ���дһ�������࣬���ԱʼǱ���ĸ���������*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Laptop t1 =new Laptop();
		Laptop t2 =new Laptop('r',10);
		
		t1.showInfo();
		t2.showInfo();
	}

}
class Laptop
{
	char color;
	int brand;
	
	public Laptop()
	{
		
	}
	
	public Laptop(char color,int brand)
	{
		this.color=color;
		this.brand=brand;
	}
	public void showInfo()
	{
		System.out.println("��ɫ"+this.color+",�ͺ�"+this.brand);
	}
}