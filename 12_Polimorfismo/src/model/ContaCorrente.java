package model;

public class ContaCorrente {
	
	private String titular;
	private String agência;
	private String numeroConta;
	private double saldo;
	
	public String getTitular () {
		return titular;
	}
	public void setTitular (String titular) {
		this.titular = titular;
	}
	public String getAgência () {
		return agência;
	}
	public void setAgência (String agência) {
		this.agência = agência;
	}
	public String getNumeroConta () {
		return numeroConta;
	}
	public void setNumeroConta (String numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldo () {
		return saldo;
	}
	public void setSaldo (double saldo) {
		this.saldo = saldo;
	}
	
	
	public ContaCorrente () {
		super ();
	}
	public ContaCorrente (String titular, String agência, String numeroConta, double saldo) {
		super ();
		this.titular = titular;
		this.agência = agência;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}
	
	public double calcularSaldo () {
		return this.saldo;
	
	}
	
}
