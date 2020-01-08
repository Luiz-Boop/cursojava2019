package controller;

import util.Teclado;

public class ProgramaçãocomMúltiplaEscolha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int matr, numFinal;
		matr = Teclado.lerInt ("Informe matrícula: ");
		numFinal = matr%10;
		
		System.out.println ("Matrícula: " + matr);
		System.out.println ("Final da Matrícula: " + numFinal);
		
		// Switch no caso "Seleção" selecionar o(os) casos(0s)
		switch (numFinal) {
		
		case 0:	
			System.out.println ("Pagamento em janeiro");
			break;
		case 1:
			System.out.println ("Pagamento em Fevereiro");
			break;
		case 2:
			System.out.println ("Pagamento em Março");
			break;
		case 3:
			System.out.println ("Pagamento em Abril");
			break;
			default:
				System.out.println ("Pagamento em Maio");
		  }
				
		}
	}


