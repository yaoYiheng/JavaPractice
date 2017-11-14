class A
{
	int i;
	int j;
}

class TestMemo1
{
	public static void main(String[] args) {
		A aa = new A();	//等价于(A*)malloc(sizeof(A));
						//new A();在堆中动态分配一款区域,被当做了A对象
						//aa本身的内存是在栈中分配的
						//堆中内存的地址赋给了aa
						//aa指向了堆中的内存,aa代表了堆中的内存
						//aa.i代表:aa这静态的指针变量所指向的动态内存中的A对象的i这个成员
						//aa.j代表:aa这静态的指针变量所指向的动态内存中的A对象的j这个成员
		aa.i = 100;
		aa.j = 200;
		System.out.printf("%d, %d\n", aa.i, aa.j);
	}
}