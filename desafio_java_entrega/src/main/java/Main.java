import br.com.desafio.dominio.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

	static List<Servico> criaServico(){
			List<Servico> servicos = new ArrayList<>();
			
			Area area = new Area();
			servicos.add(new Limpeza(1, "Limpeza 1", "Limpeza quarto pequeno", (float)50.0, "pequeno"));
			servicos.add(new Limpeza(2, "Limpeza 2", "Limpeza quarto medio", (float)100.0, "médio"));
			servicos.add(new Limpeza(3, "Limpeza 3", "Limpeza quarto grande", (float)150.0, "grande"));
			servicos.add(new Pintura(4, "Pintura 1", "pintura area quadrada com int", (float)10.0, "Azul", area.calculaArea(5)));
			servicos.add(new Pintura(5, "Pintura 2", "pintura area quadrada com float", (float)10.0, "Azul", area.calculaArea((float)5.5)));
			servicos.add(new Pintura(6, "Pintura 3", "pintura area retangular com int", (float)10.0, "Azul", area.calculaArea(5, 4)));
			servicos.add(new Pintura(7, "Pintura 4", "pintura area retangular com float", (float)10.0, "Azul", area.calculaArea((float)5.5, (float)4.5)));
			return servicos;
		}
	
	static void listaPartes( String titulo, List<Servico> servicos){
		System.out.println(titulo);
		
		for(int i=0; i< servicos.size(); i++) {
			System.out.println(servicos.get(i).toString());
		}
		
	}
	
	static List<Item> criaItens(List<Servico> servicos){
		List<Item> itens = new ArrayList<>();
		itens.add(new Item(servicos.get(0), 2));
		itens.add(new Item(servicos.get(2), 3));
		itens.add(new Item(servicos.get(3), 5));
		itens.add(new Item(servicos.get(5), 2));
		itens.add(new Item(servicos.get(6), 3));
		return itens;		
	}

	static void listaItens( String titulo, List<Item> itens){
		System.out.println(titulo);
		
		float valorTotal = 0;
		
		for(int i=0; i< itens.size(); i++) {
			System.out.println(itens.get(i).toString());
			valorTotal += itens.get(i).calculaValor();
		}
		System.out.println("Valor total: R$" + valorTotal);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Servico> servicos = criaServico( );
		List<Item> itens = criaItens(servicos);
		listaPartes( "*** Servicos cadastrados ****", servicos );
		System.out.println();
		listaItens( "*** Itens solicitados ***", itens );
	}

}
