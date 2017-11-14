abstract class A
{
	abstract public void f();
}

class B extends A
{
	public void f()
	{
		System.out.printf("BBBB\n");
	}
}

public class TestAbsPoly_1
{
	public static void main(String[] args) {

		//A aa = new A();//error 错误: A是抽象的; 无法实例化
		B bb = new B();
		bb.f();

		A aa;	//OK 可以定义一个抽象类的音乐, 但是不可以定义一个对象, 
				//所以18行错误, 23行正确.
		aa = bb;
		aa.f();	//通过抽象类实现多态


	}
}