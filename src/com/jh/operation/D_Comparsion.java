package com.jh.operation;

public class D_Comparsion {
	/*
	 	비교 연산자
	 	== / !=
	 	데이터가 가은지, 다른지 비교할 떄 사용
	 	비교 결과 값으로 항상 논리 값(true, false)이 나옴
	 	피연산자로 모든 자료형(기본형,참조형) 사용 가능
	 	
	 	1) == 같다 / != 같지 않다.
	 	2) 크다 : > , 작다 : <, 크거나 같다 : >= , 작거나 가다 : <=
	 	
	 	연산자 예시
	 	Ex) 
	 	if(a == b){} a 랑 b 가 같냐? 맞으면 true 아니면 false 반환
	 	
	 	a < b : a가 b보다 작은가 ?
	            b가 a보다 큰가 ?
	            
	  	a > b : a가 b보다 큰가 ?
	            b가 a보다 작은가?
	             
	  	a <= b : a가 b보다 작거나 같은가 ?
	             b가 a보다 크거나 같은가 ?
	             
	  	a >= b : a가 b보다 크거나 같은가 ?
	             b가 a보다 작거나 같은가 ?
	             
	  	a == b : a와 b가 같은가 ?
	  	a != b : a와 b가 다른가 ?
	 	
	 */
	public void method() {
		int a = 10, b = 25;
		// 같은 자료형이기 떄문에 한 번에 선언 및 초기화 가능
		
		boolean result1, result2, result3;
		// 위와 동문 초기화만 안함
		
		result1 = a == b;
		
		result2 = a <= b;
		
		result3 = a >= b;
		
		System.out.println("=============== method =============");
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		
		System.out.println("b가 짝수인가 ? : " + (b%2 == 0));
		System.out.println("a가 홀수인가 ? : " + (a%2 != 0));
	}
}
