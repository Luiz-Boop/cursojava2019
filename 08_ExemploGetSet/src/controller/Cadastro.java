package controller;

import model.Pessoa;

public class Cadastro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa pessoa = new Pessoa ();

		pessoa.setNome ("Jordam Smith");
		pessoa.setIdade (28);
		pessoa.setSexo ("Masculino");
		pessoa.setProfissao ("Bombeiro");
		pessoa.setCor ("Calcasiano");
		
		Pessoa pessoa1 = new Pessoa();
		
		pessoa1.setNome ("Ellen Catarina");
		pessoa1.setIdade (45);
		pessoa1.setSexo ("Feminino");
		pessoa1.setProfissao ("Enfermeira");
		pessoa1.setCor ("Parda");
		
		System.out.println ("Nome: " + pessoa.getNome ());
		System.out.println ("Idade: " + pessoa.getIdade ());
		System.out.println ("Sexo: " + pessoa.getSexo ());
		System.out.println ("Profissao: " + pessoa.getProfissao ());
		System.out.println ("Cor: " + pessoa.getCor ());
		
		System.out.println ("_______________________");
		
		System.out.println ("Nome: " + pessoa1.getNome ());
		System.out.println ("Idade: " + pessoa1.getIdade ());
		System.out.println ("Sexo: " + pessoa1.getSexo ());
		System.out.println ("Profissao: " + pessoa1.getProfissao ());
		System.out.println ("Cor: " + pessoa1.getCor ());
	}

}