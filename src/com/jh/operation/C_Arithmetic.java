package com.jh.operation;

public class C_Arithmetic {
	// 산술 연산자 : 우리가 흔히 계산할 떄 쓰이는 연산자들
	public void method1() {
		int num1 = 10;
		int num2 = 3;

		System.out.println("============ method1 =============");

		System.out.println("num1 + num2 = " + num1 + num2);
		// 이럴 경우 num1 과 num2 을 이어 붙여서 값이 나온다. 그렇기 때문에 괄호로 감싸줘야 한다.
		System.out.println("num1 + num2 = " + (num1 + num2));
		System.out.println("num1 - num2 = " + (num1 - num2));
		System.out.println("num1 * num2 = " + (num1 * num2));
		System.out.println("num1 / num2 = " + (num1 / num2)); // 나누는 몫 값을 구해 온다.
		System.out.println("num1 % num2 = " + (num1 % num2)); // 나머지 값을 가지고 온다.
		// 짝수인가요? ==> 값%2 == 0 or 값%2 != 1
		// 홀수인가요? ==> 값%2 == 1 or 값%2 != 0
		// 5의 배수인가요? ==> 값%5 == 0
	}

	public void method2() {
		double a = 35;
		double b = 10;

		System.out.println("============ method2 =============");
		double add = a + b; // 출력 할때 일일이 괄호를 사용하지 않고 값을 담을 변수 하나를 만들고 초기화 방법 이용
		System.out.println("a + b = " + add);

		double sub = a - b;
		System.out.println("a - b = " + sub);

		double mul = a * b;
		System.out.println("a * b = " + mul);

		double div = a / b;
		System.out.println("a / b = " + div);

		double mod = a % b;
		System.out.println("a % b = " + mod);

		int c = 27;
		double result = a + a * b % c - a / b;
		// 연산 우선 순위 부터 생각하고 값을 생각 해보라
		// 1 : 35 + 350 / 27 - 35 / 10
		// 2 : 35 + 26 - 35 / 10
		// 3 : 35 + 26 - 3.5
		// 4 : 61 - 3.5
		// 5 : 57.5

		System.out.println("result :( a + a * b % c - a / b ) =  " + result);
	}

	public void method3() {

		// 증감 연산자 + 산술 연산자
		int a = 5;
		int b = 10;
		int c = ++a + b;
		// c = 16 / a = 6 /  b = 10

		int d = c / a;
		// d = 2 / c = 16 / a = 6

		int e = c % a;
		// e = 4 / c = 16 / a = 6

		int f = e++;
		// f = 4 / e = 5

		int g = --b + d--;
		// g = 11 / b = 9 / d = 1

		int h = 2;

		int i = a++ + b / (--c / f) * (g-- - d) % ++e +h;
		//	1 : 6(++) +  9 / (15 / 4) * (11(--) - 1) % 6 + 2  먼저 전위계산자 값 변경한다. 후위는 계산다 끝나고 값을 올린다.
		//	2 : 6(++) + 9 / (3) * (10) % 6 + 2
		//	3 : 6(++) + 3 * 10 % 6 + 2
		//	4 : 6(++) + 30 % 6 + 2
		//	5 : 6(++) + 0 + 2
		//	6 : 6 + 2
		//	7 : 8
		
		System.out.println("============ method3 =============");

		System.out.println("a : " + a); // 7
		System.out.println("b : " + b); // 9 
		System.out.println("c : " + c); // 15
		System.out.println("d : " + d); // 1
		System.out.println("e : " + e); // 6
		System.out.println("e : " + f); // 4
		System.out.println("g : " + g); // 10
		System.out.println("h : " + h); // 2
		System.out.println("i : " + i); // 8
	}
	
}
