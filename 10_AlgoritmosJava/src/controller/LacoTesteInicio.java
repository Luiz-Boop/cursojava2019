package controller;

import util.Teclado;

public class LacoTesteInicio {
	public static void main(String[] args) {

		int r, x, i;
		i = 1;
		
		// Use i++ como substituto de i = i + 1;
		while (i <= 5) {
			x = Teclado.lerInt("Digite um número: ("+i+"");
			// System.out.println ("Valor de i: "+i);
			r = (x * 3) + i;
			System.out.println(r);
			i++;
			// System.out.println ("Valor de i: "+i);
		}
	}
}
