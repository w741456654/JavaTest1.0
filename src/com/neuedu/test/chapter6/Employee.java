package com.neuedu.test.chapter6;

public class Employee {
	//属性->有默认值
	String name;
	int age;
	double salary;
	
	//默认的构造方法(构造器)
	/*构造方法的特点
	 * 1、方法名必须和类名一样
	 * 2、不能有返回值*/
	public Employee()
	{
		//在一个构造方法里调用本类里另一个构造方法
		this("JONE DOE",18,22.6);
	}
	//有参的构造方法
	//构造方法也可以重载
	//特别注意！如果自己定义了构造方法，JDK就不会生成默认的、无参的构造方法了
	//          如果自己写了有参的构造方法，一定要把无参的构造方法写出来
	//创建对象并初始化
	public Employee(String name,int age,double salary)
	{
		//this()必须放在构造方法里，并且必须是构造方法的第一句话上
		this.name=name;//this代表当前对象
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
	//创建一个员工对象
/*	Employee e1 =new Employee();
	e1.name="张三";
	e1.age=25;
	e1.salary=1888.8;
	
	System.out.println(e1.getName());
	System.out.println(e1.getAge());
	System.out.println(e1.getSalary());
	*/
	/*创建一个员工对象
	Employee e1 =new Employee();//Employee e1 =new Employee()就是在调用Employee类的构造方法
	e1.name="李四";
	e1.updateName("james");//调用updateName方法
	System.out.println(e1.name);
	System.out.println(e1.getName());//调用getName方法
*/	
	//使用有参的构造方法创建一个员工
	Employee e2 = new Employee("王五",6,22.33);
	System.out.println(e2.name);
	System.out.println(e2.age);
	System.out.println(e2.salary);
	}
}
