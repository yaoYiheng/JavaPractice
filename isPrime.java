public static boolean isPrime(int N){
	if (N < 2) {
		return false;
	}
	for (int i = 2; i*i <= N; i++) {
		if ( N % i == 0) {
			return false;
		}
		return true;
	}
}
public static void main(String[] args) {
	if (isPrime(3)) {
		System.out.println("是质数");
	}else{
		System.out.println("不是");
	}
}