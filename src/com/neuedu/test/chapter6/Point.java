package com.neuedu.test.chapter6;

public class Point {
/*	����һ������Point��
	����2����Ա����x��y�ֱ��ʾx��y���꣬
	2�����췽��Point()��Point(int x0,y0),
	�Լ�һ��movePoint��int dx,int dy������ʵ�ֵ��λ���ƶ���
	��������Point����p1��p2���ֱ����movePoint�����󣬴�ӡp1��p2�����ꡣ*/

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
