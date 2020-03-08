package com.jh.operation;

public class B_InDecrease {
 /*
  증감 연산자 ++ : 1 증가
   ++ 값 : 전위 연산자, 1을 더한 후 다음 연산 실행  
   값 ++ : 후위 연산자, 연산 실행 후 1 더함
   
   감소 연산자 -- : 1 씩 감소
   -- 값 : 전위 연산자, 1을 뺀 후 다음 연산 실행
   값 -- :후위 연산자, 연산을 한 후 1을 뻄
  */
	public void method1() {
		// 전위 증감 연산자 테스트
		int num1 = 10;
		System.out.println("전위증감연산자 적용전 : " + num1); // 10
		System.out.println("++num1 1회 수행 결과 : " + (++num1)); // 연산전 더해짐 11
		System.out.println("num1++ 1회 수행 결과 : " + (num1++)); // 출력은 11 / 이후 12되어있음
		System.out.println("++num1 2회 수행 결과 : " + (++num1)); // 연산전 더해짐 13

		int num2 = 10;
//		System.out.println("후위 증감 연산자 적용전 : " + num2); // 10
//		System.out.println("num2++ 1회 수행 결과 : " + num2++); // 10 다음 연산
//		System.out.println("num2++ 2회 수행 결과 : " + num2++);
//		System.out.println("num2++ 3회 수행 결과 : " + num2++);
//		System.out.println("num2++ 4회 수행 결과 : " + num2++);
//		System.out.println("num2++ 5회 수행 결과 : " + num2++);
//		System.out.println("후위 증감 연산 수행 후 num2 값 : " + num2);

//		int count = 1;
		System.out.println("후위 증감 연산자 적용전 : " + num2);
		for (int i = 1; i <= 5; i++) {
			System.out.println("num2++ " + i + "수행 결과 : " + (num2 + i));
//			count += 1;
		}
	}

	public void method2() {
		int age = 20;
		System.out.println("현재 나이 : " + age); // 20
		System.out.println("++age ? " + ++age); // 21 연산전 출력후 21
		System.out.println("age++ ? " + age++); // 21 연산후 출력후 22
		System.out.println("--age ? " + --age); // 21 연산후 출력후 21
		System.out.println("age-- ? " + age--); // 21 연산후 출력후 20
		System.out.println("age ? " + age); // 20 연산후 출력후 20
	}
	public void method3() {
		int num1 = 20;
		int result = num1++ * 3; // 60곱셈 먼저후 num1 = 21이 됨
		System.out.println("result : " + result);
		System.out.println("num1 : " + num1);
	}
}
