package controller;

import util.Teclado;

public class BatalhaNaval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//First the index of line, and after the index of the column
		
		String arena [] [] = new String [10] [10];
		
		for (int i = 0; i < 4; i++) {
			for (int HP = 0; HP < 5; HP++) {
				arena [i] [HP] = "Água";
			}
		}
				
				arena [1] [2] = "Barco";
				arena [2] [3] = "Submarino";
				arena [3] [3] = "Porta-Aviões";
				arena [2] [2] = "Navio";
				arena [4] [1] = "Submarino amigo";
				
				int linha, coluna;
				
				linha = Teclado.lerInt("Digite a coordenada da linha: ");
				coluna = Teclado.lerInt("Digite a coordenada da coluna: ");
				
				System.out.println ("Você acertou: " +arena [linha] [coluna]);
			}
		}