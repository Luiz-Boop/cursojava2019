package model;

public class ContaEspecial extends ContaCorrente {
	private double limite;

	public double getLimite () {
		return limite;
	}
	public void setlImite (double limite) {
		this.limite = limite;
	}
	public ContaEspecial () {
		super ();
	}
	public ContaEspecial (String titular, String ag�ncia, String numeroConta,
			 double saldo, double limite) {
		super (titular, ag�ncia, numeroConta, saldo);
		this.limite = limite;
	}
	
	@Override
	public double calcularSaldo () {
		double saldoFinal;
		
			saldoFinal = super.calcularSaldo () + limite;
			
			return saldoFinal;
	}
}

