package a07_반복.Quiz;

import java.util.Scanner;

public class Quiz6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		
		System.out.print("반복 횟수 입력: " );
		n = sc.nextInt();
		
			/*
			 * for(int j = 0; j < n; j++) {
			 *     if(j < n-i-1) {
			 *        system.out.print(" ");
			 *     }else {
			 *        system.out.print("*');
			 *     }
			 * }       
			 */

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < i; j++) {
		    System.out.println(" ");
		}
		for(int j = 0; j < n - i; j++) {	     
			System.out.print("*");
		}
		System.out.println();
	}	

	}

}
