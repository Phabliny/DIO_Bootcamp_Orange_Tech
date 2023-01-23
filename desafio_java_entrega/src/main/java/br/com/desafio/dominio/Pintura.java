package br.com.desafio.dominio;

public class Pintura extends Servico{
	private String cor;
	private float area;
	
	public Pintura(int cod, String nome, String descricao, float valor, String cor, float area) {
		super(cod, nome, descricao, valor);
		this.cor = cor;
		this.area = area;
		// TODO Auto-generated constructor stub
	}
	public Pintura() {
		
	}

	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getArea() {
		return area;
	}
	public void setArea(float area) {
		this.area = area;
	}
	
	@Override
	public float calculaValor() {
		return (area * this.getValor());	
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		String escrita = "Código: " + getCod() + ";" +
		           " Nome: " + getNome() + ";" +
		           " Descrição: " + getDescricao() + ";" +
		           " Valor: R$" + getValor() + ";" +
		           " Cor: " + getCor() + ";" +
		           " Área(m2): " + getArea();
		return escrita;
	}
}
