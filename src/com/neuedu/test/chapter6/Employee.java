package com.neuedu.test.chapter6;

public class Employee {
	//����->��Ĭ��ֵ
	String name;
	int age;
	double salary;
	
	//Ĭ�ϵĹ��췽��(������)
	/*���췽�����ص�
	 * 1�����������������һ��
	 * 2�������з���ֵ*/
	public Employee()
	{
		//��һ�����췽������ñ�������һ�����췽��
		this("JONE DOE",18,22.6);
	}
	//�вεĹ��췽��
	//���췽��Ҳ��������
	//�ر�ע�⣡����Լ������˹��췽����JDK�Ͳ�������Ĭ�ϵġ��޲εĹ��췽����
	//          ����Լ�д���вεĹ��췽����һ��Ҫ���޲εĹ��췽��д����
	//�������󲢳�ʼ��
	public Employee(String name,int age,double salary)
	{
		//this()������ڹ��췽������ұ����ǹ��췽���ĵ�һ�仰��
		this.name=name;//this����ǰ����
		this.age=age;
		this.salary=salary;
	}
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void updateName(String name)
	{
		this.name=name;
	}
	
	public double getSalary()
	{
		return salary;
	}
public static void main(String [] args){
	//����һ��Ա������
/*	Employee e1 =new Employee();
	e1.name="����";
	e1.age=25;
	e1.salary=1888.8;
	
	System.out.println(e1.getName());
	System.out.println(e1.getAge());
	System.out.println(e1.getSalary());
	*/
	/*����һ��Ա������
	Employee e1 =new Employee();//Employee e1 =new Employee()�����ڵ���Employee��Ĺ��췽��
	e1.name="����";
	e1.updateName("james");//����updateName����
	System.out.println(e1.name);
	System.out.println(e1.getName());//����getName����
*/	
	//ʹ���вεĹ��췽������һ��Ա��
	Employee e2 = new Employee("����",6,22.33);
	System.out.println(e2.name);
	System.out.println(e2.age);
	System.out.println(e2.salary);
	}
}
