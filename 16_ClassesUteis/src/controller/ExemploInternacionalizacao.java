package controller;

import java.text.NumberFormat;
import java.util.Locale;

public class ExemploInternacionalizacao {

	public static void main(String[] args) {
	
	System.out.println(Locale.getDefault());
	System.out.println("======================");
	
	double valor = 55008.537;

	Locale.setDefault(Locale.FRANCE);
	NumberFormat f = NumberFormat.getCurrencyInstance();
	System.out.println("Sem formatacao: " + valor);
	System.out.println("Com formatacao: " + f.format(valor));		
	System.out.println("======================");
	
	Locale.setDefault(Locale.UK);
	NumberFormat g = NumberFormat.getCurrencyInstance() ;
	System.out.println("Sem formatacao: " + valor);
	System.out.println("Com formatacao: " + g.format(valor));
	System.out.println("======================");
	
	Locale local = new Locale("pt", "BR");
	NumberFormat nf = NumberFormat.getCurrencyInstance(local) ;
	System.out.println("Sem formatacao: " + valor);
	System.out.println("Com formatacao: " + nf.format(valor));

}
}
