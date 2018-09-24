package amazonrl.relatorio;

import java.util.ArrayList;
import java.util.List;

import amazonrl.model.Produto;
import relatorio.Relatorio;

public class TesteDoRelatorio {

	public static void main(String[] args) {
		
		Produto celular = new Produto("Sansung G0", 250.0);
		Produto tv = new Produto("LG HD", 300.0);
		Produto dvd = new Produto  ("Galinha Printadinha V.10", 400.0);
		
		List<Produto> produtos = new ArrayList();
		
		produtos.add(celular);
		produtos.add(tv);
		produtos.add(dvd);
		
		Double maiorPrecoEsperado = 400.0;
		Double menorPrecoEsperado = 250.0;
		
		Relatorio relatorio = new Relatorio();
		relatorio.gerarRelatorioDePreços(produtos);
		//imprimir 400.0
		System.out.println(maiorPrecoEsperado.equals(relatorio.getMaiorPreco()));
		//imprimir 250.0
		System.out.println(menorPrecoEsperado.equals(relatorio.getMenorPreco()));
	}
	

}
