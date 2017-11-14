interface It
{
	void f();
}

class A implements It
{
	public void f()
	{
		System.out.printf("哈哈哈哈!\n");
	}

	public void g()
	{

	}
}

public class TestImplements_1
{
	public static void main(String[] args)
	 {
		It it;
		it = new A();
		it.f();
		//it.g();	//错误!不能调用子类所特有的方法.
		//It it2 = new It();	//错误: It是抽象的; 无法实例化
		It it1 = new A();

	}
}