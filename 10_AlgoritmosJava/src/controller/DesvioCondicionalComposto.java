package controller;

import util.Teclado;

public class DesvioCondicionalComposto {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		int a, b, x;
		a = Teclado.lerInt ("Informe o primeiro número:");
		b = Teclado.lerInt ("Informe o primeiro número:");
		x = a + b;
		if (x > 10) {
			System.out.println ("O resultado acrescido de 5 é " + (x + 5));
			System.out.println ("O resultado subtraído de 7 é " + (x - 7));
			System.out.println ("O resultado divido de 5 é " + (x + 10));
		} else {
		
		}
	}
}
