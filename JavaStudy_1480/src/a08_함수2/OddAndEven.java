package a08_함수2;

import java.util.Scanner;

public class OddAndEven {

		/*
		 * 수를 3개를 입력받는다.
		 * 10 11 12
		 * 
		 * oddAndEven(정수)
		 * 받은 정수가 홀수인지 짝수인지 구분해서
		 * 
		 * 홀수면 true
		 * 짝수면 false
		 * return
		 * 
		 * 10 = 짝
		 * 11 = 홀
		 * 12 = 짝
		 * 
		 */
		public static void printResult(int num) {
				System.out.println(num + " = " + (oddAndEven(num) == true ? "홀" : "짝"));
		}
		
		public static boolean oddAndEven(int num) {
				boolean result = false;
		
				if(num % 2 != 0) {
						result = true;
				}else {
						result = false;
				}
				return result;
				
		}		
		
		public static void main(String[] args) {
				Scanner scanner = new Scanner(System.in);
		
				int a = 0, b = 0, c = 0, d = 0, e = 0;
				
				System.out.println("3개의 수를 입력하세요; ");
				a = scanner.nextInt();
				b = scanner.nextInt();
				c = scanner.nextInt();
				d = scanner.nextInt();
				c = scanner.nextInt();
				
				printResult(a);
				printResult(b);
				printResult(c);
				printResult(d);
				printResult(e);
	}

}
