package com.neuedu.test.chapter6;

public class Point {
/*	定义一个点类Point，
	包含2个成员变量x、y分别表示x和y坐标，
	2个构造方法Point()和Point(int x0,y0),
	以及一个movePoint（int dx,int dy）方法实现点的位置移动，
	创建两个Point对象p1、p2，分别调用movePoint方法后，打印p1和p2的坐标。*/

	int x;
	int y;
	public Point()
	{
		this(10,10);
	}
	public Point(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	
	public void movePoint(int dx,int dy)
	{
		this.x=dx;
		this.y=dy;
	}

	public static void main(String[] args) {
		
		Point p1=new Point();
		p1.movePoint(10,10);
		
		Point p2=new Point(100,100);
		p2.movePoint(200, 200);
		
		System.out.println(p1.x +"," + p1.y);
		System.out.println(p2.x +"," + p2.y);

	}

}
