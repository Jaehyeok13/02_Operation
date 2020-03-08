package com.jh.operation;

import java.util.Scanner;

public class G_Triple {
	/*
		삼항 연산자 조건식 ? 식1 : 식2  ------------ > 반드시 결과 true : false
		조건식의 결과 값에 따라 연산을 처리 하는 방식
		결과 값이 참일 경우 식1 번이 아닐 경우 식2 수헹
		
		삼항 연산자 안에서 조건이 중첩으로 사용 되기 도 한다.
		
	 */
	public void method1() {
		// 입력한 정수가 양수인지 아닌지 판별하는 메소드
		System.out.print("정수 입력 : ");
		Scanner sc = new Scanner(System.in);
		int iNum = Integer.parseInt(sc.next());
		
		// 이제 조건식을 만들면 된다. 양수 인지 아닌지 말로 표출할거니간
		String result = iNum >= 1 ? "양수" : "양수 아님";
		boolean result2 = iNum > 0 ? true : false;
		
		System.out.println("결과값 : " + result);
		System.out.println("결과값 : " + result2);
		sc.close();
		
	}
	
	public void method2() {
		// 홀짝 판별
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int iNum = Integer.parseInt(sc.next());
		
		String result = iNum % 2 == 0 ? "짝수" : "홀수";
		System.out.println("result : " + result);
		sc.close();
	}
	
	public void method3() {
		int a = 10;
		int b = 11;
		
		int result = a > b ? a++ : (b == 0 ? a-- : b++);
		System.out.println("result : " + result);
		System.out.println("result : " + a);
		System.out.println("result : " + b);
	}
	
}
