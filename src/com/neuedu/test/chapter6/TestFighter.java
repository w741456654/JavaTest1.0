package com.neuedu.test.chapter6;

import java.util.Random;

public class TestFighter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//��������սʿ
		Fighter f1=new Fighter("����");
		Fighter f2=new Fighter("����");
		Random r=new Random(0);
		while(true)
		{
			//f1����һ��
			int num=r.nextInt(10);
			f1.takeDamage(num);
			if(f1.blood<=0)
			{
				break;
			}
			//f2����һ��
			int num1=r.nextInt(10);
			f2.takeDamage(num1);
			if(f2.blood<=0)
			{
				break;
			}
		}
	}

}
class Fighter
{
	//Ĭ��100
	int blood;
	String name;
	public Fighter(String name)
	{
		this.name=name;
		//this.blood=100;
	}
	
	public void takeDamage(int num)
	{
		this.blood-=num;
		if(this.blood<=0)
		{
			System.out.println(name+"����");
		}
		else
		{
			System.out.println(name+"����һ��Ѫ��="+this.blood);
		}
	}
}
