package com.jh.run;

import com.jh.operation.A_LogicalNagation;
import com.jh.operation.B_InDecrease;
import com.jh.operation.C_Arithmetic;
import com.jh.operation.D_Comparsion;
import com.jh.operation.E_Logical;
import com.jh.operation.F_Compound;
import com.jh.operation.G_Triple;

public class Run {

	public static void main(String[] args) {
		A_LogicalNagation al = new A_LogicalNagation();
		al.method1();
		al.method2();
		
		B_InDecrease bi = new B_InDecrease();
		bi.method1();
		bi.method2();
		bi.method3();
		
		C_Arithmetic ca = new C_Arithmetic();
		ca.method1();
		ca.method2();
		ca.method3();
		
		D_Comparsion dc = new D_Comparsion();
		dc.method();
		
		E_Logical el = new E_Logical();
		el.method1();
		el.method2();
		
		F_Compound fc = new F_Compound();
		fc.method();
		
		G_Triple gt = new G_Triple();
		gt.method1();
		gt.method2();
		gt.method3();
	}

}
