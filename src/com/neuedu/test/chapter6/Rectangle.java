package com.neuedu.test.chapter6;

public class Rectangle {
	
/*定义一个矩形类Rectangle： 
a) 定义三个方法：getArea()求面积、getPer()求周长，showAll()分别在控制台输出长、宽、面积、周长。 
b) 有2个属性：长length、宽width 
c) 通过构造方法Rectangle(int width, int length)，分别给两个属性赋值 
d) 创建一个Rectangle对象，并输出相关信息*/
	
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
		System.out.println("长："+this.length+",宽："+this.width+",面积为："+this.getArss()+",周长："+this.getPer());
	}

	public static void main(String[] args) {

		Rectangle r1=new Rectangle(200,100);
		r1.showAll();
		

	}

}
