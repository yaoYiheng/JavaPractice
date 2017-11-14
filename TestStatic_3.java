class A 		//该类只能造出一个对象
{
	public int i = 20;
	private static int cnt = 0;
	private static A aa = new A();	

	private A()
	{
		cnt++;
	}
	public static A getA(){	 //satatic 不能省略!
							//静态方法只能访问类的静态成员,
							//但非静态方法却可以访问类中所有成员,包括静态成员
		
		return aa;
	}

	public static int getCnt(){
		return cnt;
	}
}
public class TestStatic_3
{
	public static void main(String[] args) {
		A aa = A.getA();
		A bb = A.getA();
		aa.getCnt();
		aa.i = 99;
		if (aa.i == bb.i) {
			System.out.printf("aa和bb相等!\n");
		}
		else
			System.out.printf("aa和bb不相等!\n");

		System.out.printf("%d\n", bb.i);
		//A bb = new A();//如果A类的构造方法是private的,则new A()就会报错!
	}
}