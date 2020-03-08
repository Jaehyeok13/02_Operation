package com.jh.operation;

import java.util.Scanner;

public class A_LogicalNagation {
	// 논리 부정 연산자(값을 부정하여 반대 값으로 변경) : !
	// 제어문을 활용 할때 많이 쓰임 
	public void method1() {
		
		boolean bool1 = true;
		boolean bool2 = !bool1;
		System.out.println("True : " + bool1);
		System.out.println("True 의 부정 : " + bool2);
		
		// 또는 
		System.out.println("True 의 부정 : " + !true);
		System.out.println("false 의 부정 : " + !false);
		// 값이 반대로 나온다.
	}
	public void method2() {
		//	정수를 키보드로 입력 받아서 입력 받아서 입력 받은 값이 양수면 true 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = Integer.parseInt(sc.next());
		
		boolean bool = num > 0;
		boolean bool2 = num < 0;
		
		System.out.println("입력 숫자가 양수 인가? : " + bool);
		System.out.println("입력 숫자가 양수 인가? : " + !bool2);
		sc.close();
	}
}
