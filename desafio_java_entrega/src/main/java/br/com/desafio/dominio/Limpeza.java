package br.com.desafio.dominio;

public class Limpeza extends Servico{
	private String tamanho;
	
	public Limpeza(int cod, String nome, String descricao, float valor, String tamanho) {
		super(cod, nome, descricao, valor);
		// TODO Auto-generated constructor stub
		this.tamanho = tamanho;
	}

	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	@Override
	public float calculaValor() {
		// de acordo com o tamanho do c�modo o valor tem uma porcentagem de desconto 
		if(tamanho.equals("pequeno")) {
			return (float)(this.getValor()*0.98);
		} else if (tamanho.equals("m�dio")) {
			return (float)(this.getValor()*0.95);
		} else if (tamanho.equals("m�dio")){
			return (float)(this.getValor()*0.92);
		}
		return this.getValor(); // caso o tamanho esteja errado returna apenas o valor sem o desconto
	
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		String escrita = "Código: " + getCod() + ";" +
		           " Nome: " + getNome() + ";" +
		           " Descrição: " + getDescricao() + ";" +
		           " Valor: R$" + getValor() + ";" +
		           " Tamanho: " + getTamanho();
		return escrita;
	}

}
