package entities;

public class ContaBanco {

	private int numero;
	private String agencia;
	private String nomeCliente;
	private double saldo;
	
	public ContaBanco() {
		
	}

	public ContaBanco(int numero, String agencia, String nomeCliente, double saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.nomeCliente = nomeCliente;
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " ja esta disponivel para saque";
	}
	
}
