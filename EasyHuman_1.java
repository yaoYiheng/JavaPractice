class Human
{
	public int age;
	public double heigh;
	public static int cnt = 0;

	public Human(){
		System.out.printf("一个人类诞生了!\n");
		cnt++;
	}

	public static int getcnt(){
		return cnt;
	}
	public void show()
	{
		System.out.printf("年龄为:%d, 身高为:%.2f \n",age, heigh);
	}
}

class Man extends Human
{
	public void hunter()
	{
		System.out.printf("我正在打猎!\n");
	}
}

class Women extends Human{

	public void bear()
	{
		System.out.printf("我正在生孩子!\n");
	}
}

public class EasyHuman_1{
	public static void main(String[] args) 
	{
		Women aa = new Women();
		aa.age = 22;
		aa.heigh = 1.65;
		aa.show();
		aa.bear();
		System.out.printf("人类个数为:%d\n",Human.getcnt());//如果新想要通过类名.静态成员名的方式使用getcnt(),
															//需要将getcnt()方法设置为static


	}
}