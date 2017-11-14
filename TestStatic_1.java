class C{
	int i ;
	//静态成员属于类本身的, 而不是属于对象, 被类的所有对象所共有
	private static int cnt = 0;
	
	public C(){
		++cnt;
	}
	
	public C(int j){
		i = j;
		++cnt;
	}
	public static int getCnt(){
		return cnt;
	}
	
	public void show(){
		System.out.printf("%d\n", i);
	}
}
public class TestStatic_1 {

	public static void main(String[] args) {
		//即使不创建对象, 也可以使用类本身的静态成员
		System.out.printf("当前C对象的个数为%d个\n", C.getCnt());
		
		C aa = new C(11);			//使用静态成员的两种方法
		aa.show();					// 1.类对象名.静态成员名
									// 2.类名.静态成员名
		System.out.printf("当前C对象的个数为%d个\n", aa.getCnt());
		C bb = new C(22);
		bb.show();
		C.getCnt();
		System.out.printf("当前C对象的个数为%d个\n", C.getCnt());
	}

}
