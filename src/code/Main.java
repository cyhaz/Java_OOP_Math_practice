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
		
		
//		< 응용문제. 좌표간의 직선거리 구하기 >
//		* (x1, y1)과 (x2, y2)의 직선거리 = 루트((x2-x1)^2 + (y2-y1)^2) *
//		문제. (1, 10)과 (13, 22)의 직선거리는?
		
		// 내 풀이
		int x1 = 1;
		int y1 = 10;
		int x2 = 13;
		int y2 = 22;
		double distance1 = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
		System.out.println(String.format("두 좌표간의 직선거리는 %.2f입니다.", distance1));
		// 출력 : 두 좌표간의 직선거리는 16.97입니다.
		
		// 강사님 풀이
		int xInterval = 13-1;
		int yInterval = 22-10;
		double distance2 = Math.sqrt((xInterval*xInterval) + (yInterval*yInterval));
		System.out.println(String.format("두 좌표간의 직선거리는 %.2f입니다.", distance2));
		// 출력 : 두 좌표간의 직선거리는 16.97입니다.		
		
	}

}
