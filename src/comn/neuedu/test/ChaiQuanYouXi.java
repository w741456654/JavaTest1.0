package comn.neuedu.test;
import java.util.Random;
import java.util.Scanner;

public class ChaiQuanYouXi {

	public static void main(String[] args) {

		 //要求用户输入0-2之间的整数
		 //如果用户输入0输出"你出的是石头"
		 //如果用户输入1就输出"你出的是剪刀"
		 //如果用户输入的是2就输出"你出的是布"
		 //然后再问是否要继续出拳
		 //如果回答“y”就重复以上过程，否则结束程序。
		boolean Xz=false;  //创建一个Xz变量判断用户的选择，初始值为假
		Random rand =new Random();//创建一个Random实例化
		Scanner s1=new Scanner(System.in);//创建一个Scanner实例化
		System.out.println("请输入一个0-2之间的整数：");//提示
		boolean t=false;//变量t判断是否重复输出提示
		System.out.println("Ps：0代表石头、1代表剪刀、2代表布");
		System.out.println("==================================");//提示
		do{//无论如何先执行一次
			if(t)//判断是否输出过提示
			{
				System.out.println("请输入一个0-2之间的整数：");//提示
			}
			t=true;//初始化变量
			int number=s1.nextInt();//接收Scanner的值
				if(number>=0 && number<=2)//判断输入数字是否合法
				{
					int Xt=rand.nextInt(3);//生成0-3随机数，不包括3
						switch(number)//判断用户输入、给出提示
						{
						case 0:System.out.println("您出的是：石头");
						break;
						case 1:System.out.println("您出的是：剪刀");
						break;
						case 2:System.out.println("您出的是：布");
						break;
						}
						if(number==Xt)//判断输赢，输出提示
						{	
							switch(Xt)
							{
							case 0:System.out.println("对方出的是：石头  平局！");
							break;
							case 1:System.out.println("对方出的是：剪刀  平局！");
							break;
							case 2:System.out.println("对方出的是：  布  平局！");
							break;
							}
						}
						else if (number>Xt)
						{
							switch(Xt)
							{
							case 0:System.out.println("对方出的是：石头  您赢了！！");
							break;
							case 1:System.out.println("对方出的是：剪刀  您赢了！！");
							break;
							case 2:System.out.println("对方出的是 ： 布  您赢了！！");
							break;
							}
						}
						else if (number<Xt)
						{
							switch(Xt)
							{
							case 0:System.out.println("对方出的是：石头  您输了...");
							break;
							case 1:System.out.println("对方出的是：剪刀  您输了...");
							break;
							case 2:System.out.println("对方出的是：  布  您输了...");
							break;
							}
						}
						System.out.println();
						System.out.println("您是否要继续出拳？输入Y/y继续！");
						System.out.println("==================================");
						String c=s1.next();//接收用户输入
						if(c.equals("y")||c.equals("Y"))//判断用户是否要继续操作
						{	
							Xz=true;
						}
						else
						{
							Xz=false;
						}
					}
				else//如果number不合法，提示，并初始化变量让循环能继续
				{
					System.out.println("数字有误！请您重新输入！");
					System.out.println("==================================");
					Xz=true;
				}
		}while(Xz);//判断用户的选择
		System.out.println("已退出！");//提示
	}
}