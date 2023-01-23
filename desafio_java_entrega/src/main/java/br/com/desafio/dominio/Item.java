package br.com.desafio.dominio;

public class Item {
	private Servico servico;
	private int quantidadeComodosIguais;
	
	public Item(Servico servico, int quantidade) {
		this.servico = servico;
		this.quantidadeComodosIguais = quantidade;
	}
	
	public Servico getServico() {
		return servico;
	}
	public void setServico(Servico servico) {
		this.servico = servico;
	}
	public int getQuantidadeComodosIguais() {
		return quantidadeComodosIguais;
	}
	public void setQuantidadeComodosIguais(int quantidadeComodosIguais) {
		this.quantidadeComodosIguais = quantidadeComodosIguais;
	}
	public float calculaValor() {
		return servico.calculaValor() * quantidadeComodosIguais;
	}
	
	public String toString() {
		String escrita = "Código: " + servico.getCod() + ";" +
        " Nome: " + servico.getNome() + ";" +
        " Quantidade: " +getQuantidadeComodosIguais() + ";" +
        " Valor unitario: R$" + servico.getValor() + ";" +
        " Valor(alguns valores já vem com desconto da promoção): R$" + calculaValor();
return escrita;
	}

}
