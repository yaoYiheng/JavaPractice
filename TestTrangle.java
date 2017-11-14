class Trangle
{
	int a;
	int b;
	int c;

	int zhouchang()
	{
		return a + b + c;
	}

	void set (int i, int j, int k)
	{
		a = i;
		b = j;
		c = k;
	}
	double area()
	{
		double p = 1.0 * (a + b + c) / 2;
		return Math.sqrt(p * (p - a) * (p -b) * (p -c));
	}
}

class TestTrangle
{
	public static void main(String[] args) {
		int i;
		Trangle s = new Trangle();

		// s.a = 3;
		// s.b = 4;
		// s.c = 5;
		s.set(5, 8,10);

		System.out.printf("%d  %f \n", s.zhouchang(), s.area());
	}
}