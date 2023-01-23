package br.com.desafio.dominio;

public class Area {
	
	public Area() {
		
	}

	public float calculaArea(float lado) {
		// area quadrado double
		float areaQuadrado = lado*lado;
		return areaQuadrado;
	}
	
	public float calculaArea(int lado) {
		// area quadrado int
		float areaQuadrado = lado*lado;
		return areaQuadrado;
	}
	
	public float calculaArea(float lado1, float lado2) {
		// area retangulo double
		float areaRetangulo = lado1*lado2;
		return areaRetangulo;
	}
	
	public float calculaArea(int lado1, int lado2) {
		// area retangulo double
		float areaRetangulo = lado1*lado2;
		return areaRetangulo;
	}
}
