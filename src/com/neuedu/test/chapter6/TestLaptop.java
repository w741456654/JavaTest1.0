package com.neuedu.test.chapter6;

public class TestLaptop {
/*	定义一个笔记本类，该类有颜色（char）和cpu型号（int）两个属性。
	a) 无参和有参的两个构造方法；有参构造方法可以在创建对象的同时为每个属性赋值； 
    b) 输出笔记本信息的方法 
    c) 然后编写一个测试类，测试笔记本类的各个方法。*/
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
		System.out.println("颜色"+this.color+",型号"+this.brand);
	}
}