package com.jh.operation;

public class F_Compound {
	/*
		복합 연산자
		다른 연산자 (+, -, *, /, %) 와 대입 연산자(=) 를 함께 사용 하는 연산자 연산 처리 속도가 훨씬 빠르므로 사용 권장
		
		+= , -= , *= , /= , %= 
		
		ex) 
			a += 10 =================  a = a + 10
			a -= 10 =================  a = a - 10
			a *= 10 =================  a = a * 10
			a /= 10 =================  a = a / 10
			a %= 10 =================  a = a % 10
		이렇게 보면 증감 연산자 와 비슷해 보이지만 증감 연산자는 (++, --) 1씩 증가, 감소 지만
		대입 연산자는 원하는 값을 증가시키고 그 변수에 저장이 가능 하다에서 차이가 있다.
		 
	 */
	public void method() {
		int num = 12;
		num += 3;
		System.out.println("num += 3 ? : " + num);	// 15
		
		num -= 5;
		System.out.println("num -= 5 ? : " + num); // 10
		
		num *= 6;
		System.out.println("num *= 6 ? : " + num); // 60
		
		num /= 2;
		System.out.println("num /= 2 ? : " + num); // 30
		
		num %= 8;
		System.out.println("num %= 8 ? : " + num); // 6
		
	}
}
