package controller;
import model.Carro;
public class Cadastro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro carro01 = new Carro ();
		carro01.modelo = "Prisma";
		carro01.fabricante = "Chevrolet";
		carro01.cor = "Branco";
		carro01.ano = 2019;
		
		Carro carro02 = new Carro ();
		carro02.modelo = "Onix";
		carro02.fabricante = "Chevrolet";
		carro02.cor = "Branco";
		carro02.ano = 2019;
		
		Carro carro03 = new Carro ();
		carro03.modelo = "Cobalt";
		carro03.fabricante = "Chevrolet";
		carro03.cor = "Preto";
		carro03.ano = 2019;
		
		System.out.println ("Modelo" +carro01. modelo);
		System.out.println ("Modelo" +carro02. modelo);
		System.out.println ("Modelo" +carro03. modelo);
		
	}

}
