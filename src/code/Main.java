package code;

public class Main {

	public static void main(String[] args) {
		
//		Math
		
//		< Math.pow(밑, 지수) - 제곱값 구하기 >
		int num = 5;
		// 3의 num제곱 값을 result변수에 대입
		// Math.pow값을 int로 casting
		int result = (int) Math.pow(3, num);
		// String.format()으로 출력
		System.out.println(String.format("3의 %d제곱은 %d입니다.", num, result));
		// 출력 : 3의 5제곱은 243입니다.
		
		
//		< Math.sqrt(수) - 루트값 구하기>
		int sqrtNum = 7;
		double sqrtResult = Math.sqrt(sqrtNum);
		// 루트7의 값을 소수점 2자리까지 출력
		System.out.println(String.format("루트%d 값은 %.2f입니다.", sqrtNum, sqrtResult));
		// 출력 : 루트7 값은 2.65입니다.
	}

}
