package a08.함수;

import java.util.Scanner;

public class MethodEx5 {

	public static int sum(int x, int y) {
		return x + y;
	}
	
	public static void main(String[] args) {
		/*
		 * 두 수를 입력받고 두수의 합을 구하는 메서르를 구현하다
		 * sum()
		 * return 두수의 합
		 * 
		 * 리턴된 수를 main 메서드에서 출력하라.
		 */
		
		Scanner scanner = new Scanner(System.in);
		int x = 0, y = 0;
		
		System.out.println("두 수를 입력하세요: ");
		x = scanner.nextInt();
		y = scanner.nextInt();
		
		System.out.println(sum(x, y));

	}

}
