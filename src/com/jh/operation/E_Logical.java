package com.jh.operation;

import java.util.Scanner;

public class E_Logical {
	/*
	 	논리 연산자 : 논리 값 두개를 가지고 비교 하는 연산자
	 	and && 그리고, ~ 면서 
	 		: 값 1 && 값2
	 		: 둘다 값이 true 이어야, 결과값 true
	 	
	 	or || 또는, ~거
	 		: 값 1 || 값2
	 		: 둘중 하나라도 값이 true 이면 결과값 true 
	 */
	public void method1() {
		// 입력한 정수 값이 1 ~ 100 사이의 숫자인지 확인.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나를 입력 하세요. : ");
		int iNum = Integer.parseInt(sc.next());
		
		boolean result = iNum > 0 && iNum <= 100;
		System.out.println("result : " + result);
		System.out.println(1 <= iNum && iNum <= 100);
		sc.close();
	}
	
	public void method2() {
		// 입력한 문자 값이 대문자 인지 확인
//		System.out.print("문자를 입력 해주세요.(대소문자 구분) : ");
		Scanner sc = new Scanner(System.in);
//		char ch = sc.next().charAt(0);
//		boolean result = (ch >= 'A' && ch <= 'Z');
//		System.out.println("result : " + result);
//		System.out.println(ch >= 'A' && ch <= 'Z');
	
		// 입력값이 y 인지 Y 인지 구
		System.out.print("계속 하려면 y 또는 Y 를 입력하세요. : ");
		char ch2 = sc.next().charAt(0);
		boolean result2 = (ch2 == 'y' || ch2 == 'Y');
		System.out.println("reuslt2 : " + result2);
		sc.close();
	}
}
