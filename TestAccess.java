class A{
	private int i;
	public int j;
	protected int m;

	private void f(){
		//i = 1;
		j = 2;
		m = 3;
		//g();
	}

	protected void k(){

	}

	public void g(){
		//f();
		m = 3;
	}
}

class TestAccess{
	public static void main(String[] args) {
		A aa = new A();
		//aa.i = 10;//错误,因为i为私有的.
		// aa.j = 20;	//OK 因为j是共有的.
		// aa.m = 100;	//OK 因为m是protected
		//f();
		// System.out.printf("%d\n", aa.i);
		// System.out.printf("%d\n", aa.j);
		//aa.f();//error f()函数为私有,不能通过 类对象名.私有成员名 的方式访问该对象中的私有成员!
		System.out.printf("%d\n", aa.m);
		
	}
}
/*
1.在一个类的内部, 所有的成员可以相互访问,访问控制符是透明的
2在一个类的外部: 通过
	类对象名.私有成员名
的方式是无法访问该对象的私有成员的,这样写编译时会出错!


 */