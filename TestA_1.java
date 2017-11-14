class A
{
	public void f()
	{
		System.out.printf("AAAAA\n");
	}
}

class B extends A
{
	public void f()
	{
		System.out.printf("BBBB\n");
	}
}

public class TestA_1
{
	public static void main(String[] args) {
		A aa = new A();
		B bb = new B();

		aa = bb;	//若注释掉该句则会报错.
		
		bb = (B)aa;	//语法上允许把一个类型强制转换成另一个类型,但真正运行时不符合实际含义
		bb.f();
		aa.f();

		int[] arr = new int[]{8, 2, 1, 0, 3};
		int[] index = new int[]{2, 0, 3, 2, 4, 0, 1, 3, 2, 3, 3};
		String tel = "";

		for (int i : index ) {
			tel += arr[i];
		}

		System.out.println("联系方式:" + tel);
	}
}