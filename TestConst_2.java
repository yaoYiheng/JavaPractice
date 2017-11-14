class A
{
	private int i, j;

	//构造函数,在定义的同时,完成对对象的初始化
	//名字必须与类名一样
	//不能有返回值
	public A(int a, int b)
	{
		i = a;
		j = b;
		System.out.printf("无参构造函数被调用了!\n");
	}

	public A()
	{

	}

	public void set(int a, int b)
	{
		i = a;
		j = b;
	}
	public void show()
	{
		System.out.printf("i = %d, j = %d\n", i, j);
	}
}

class TestConst_2
{
	public static void main(String[] args) {

		A aa = new A(22, 44);
		A bb = new A(111,222);
		aa.show();
		//bb.set(111,222);
		bb.show();
		//System.out.printf("%d, %d\n", aa.i, aa.j);
	}
}