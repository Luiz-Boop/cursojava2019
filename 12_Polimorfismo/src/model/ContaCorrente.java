package model;

public class ContaCorrente {
	
	private String titular;
	private String ag�ncia;
	private String numeroConta;
	private double saldo;
	
	public String getTitular () {
		return titular;
	}
	public void setTitular (String titular) {
		this.titular = titular;
	}
	public String getAg�ncia () {
		return ag�ncia;
	}
	public void setAg�ncia (String ag�ncia) {
		this.ag�ncia = ag�ncia;
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
	public ContaCorrente (String titular, String ag�ncia, String numeroConta, double saldo) {
		super ();
		this.titular = titular;
		this.ag�ncia = ag�ncia;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}
	
	public double calcularSaldo () {
		return this.saldo;
	
	}
	
}
