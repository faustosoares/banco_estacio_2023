package br.com.estacio.banco.model;

public class ContaPoupanca extends Conta {

	private int variacao;
	private int aniversario;

	public ContaPoupanca(String agencia, String numero, int variacao, int aniversario) {
		super(agencia, numero);
		this.variacao = variacao;
		this.aniversario = aniversario;
	}

	public int getVariacao() {
		return variacao;
	}

	public void setVariacao(int variacao) {
		this.variacao = variacao;
	}

	public int getAniversario() {
		return aniversario;
	}

	public void setAniversario(int aniversario) {
		this.aniversario = aniversario;
	}

}
