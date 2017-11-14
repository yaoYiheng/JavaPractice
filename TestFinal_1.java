class A
{
	final public int i ;//如果一个变量被final修饰,则将该变量视为常变量
//final修饰类中的若干属性, 表示该属性必须被赋值且只能被赋值一次(注意默认值不算正在的赋值)
//初始化方式有两种:(只能选择其中的一种)
//1. 在定义成员变量的同时初始化
//2. 在类中所有的构造函数中初始化
//注意: 一个类的所有普通方法内部都不可以修改final秀是个的成员变量的值
	public A()
	{
		i  = 22;
	}

	public int get()
	{
		return i;
	}

	public void f()
	{
		//i = 22;	//错误: 无法为最终变量i分配值
	}

}
class B extends A
{

}

class TestFinal_1
{
	public static void main(String[] args) {

		A aa = new A();
		System.out.printf("%d\n", aa.get());

	}
}
