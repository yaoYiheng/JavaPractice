class D{
	public void f(){
		System.out.println("类对象D中的f()方法被调用");
	}
}
class E{
	public int i;
	D aa = new D();	//aa为是一个对象同时也可以作为E的属性
	public void g(){	//定义了一个名为g()的方法,通过该方法调用作为类对象E中的属性aa
		
		aa.f();		
	}
}
public class TestStatic_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E aa = new E();
		aa.g();	//g()函数属于E对象的属性.
	}

}
