class A
{
	int i;
	int j;
	String s;
}
class TestMemo
{
	public static void main(String[] args) {
		A aa = new A();
				//new A();在堆中动态分配一块区域,被当做了A对象
				//aa本身的内存是在栈中分配的
				//堆中内存的地址赋给了aa
				//aa指向队中的内存,aa代表了堆中的内存
				//aa.i 代表:aa这个静态指针变量所指向的动态内存中的A对象的i这个成员
				//aa.j 代表:aa这个静指针变量所指向的动态内存中的A对象的j这个成员
		aa.i = 10;
		aa.j = 20;
		aa.s = "我就试试!";
		System.out.printf("%d %d %s\n", aa.i, aa.j, aa.s);	
		String s = "我就试试!";
        System.out.printf(s);	
		//System.out.printf
		System.out
	}
}