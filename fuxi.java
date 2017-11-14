class A{
	public int i;
	public static int cnt;

	public A(){
		System.out.printf("无参构造函数被调用了!\n");
		cnt++;
	}

	public A(int j){
		System.out.printf("有参构造函数被调用了!\n");
		i = j;
		cnt++;
	}

	public static int getcnt()
	{
		return cnt;
	}
	// public int get(int j){
	// 	i = j;
	// }

	public void show()
	{
		System.out.printf("值为%d\n", i);
	}
}
public class fuxi{
	public static void main(String[] args) {
		
		A aa = new A(12);
		aa.show();
		aa.getcnt();
	}
}