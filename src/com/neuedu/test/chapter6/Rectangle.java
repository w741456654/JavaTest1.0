package com.neuedu.test.chapter6;

public class Rectangle {
	
/*����һ��������Rectangle�� 
a) ��������������getArea()�������getPer()���ܳ���showAll()�ֱ��ڿ���̨���������������ܳ��� 
b) ��2�����ԣ���length����width 
c) ͨ�����췽��Rectangle(int width, int length)���ֱ���������Ը�ֵ 
d) ����һ��Rectangle���󣬲���������Ϣ*/
	
	int length;
	int width;
	public Rectangle()
	{
		
	}

	public Rectangle(int length,int width)
	{
		this.length=length;
		this.width=length;
	}
	
	public int getArss()
	{
		return this.length *this.width;
		
	}
	
	public int getPer()
	{
		return (this.length+this.width)*2;
	}
	
	public void showAll()
	{
		System.out.println("����"+this.length+",��"+this.width+",���Ϊ��"+this.getArss()+",�ܳ���"+this.getPer());
	}

	public static void main(String[] args) {

		Rectangle r1=new Rectangle(200,100);
		r1.showAll();
		

	}

}
