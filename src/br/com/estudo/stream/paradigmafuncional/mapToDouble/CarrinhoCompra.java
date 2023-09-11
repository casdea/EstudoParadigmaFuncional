package br.com.estudo.stream.paradigmafuncional.mapToDouble;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.Iterator;
import java.util.List;
import java.util.Random;import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.stream.Stream;

public class CarrinhoCompra {

	private static final String[] ADJETIVOS = { "Delicioso", "Fresco", "Premium", "Saboroso", "Orgânico", "Exclusivo",
			"Natural", "Gourmet", "Artesanal" };
 
	private static final String[] SUBSTANTIVOS = { "Bolos", "Biscoitos", "Café", "Chocolates", "Frutas", "Pães",
			"Queijos", "Sorvetes", "Vinhos", "Cervejas" };
 
	public static String gerarNomeProdutoAleatorio() {
		Random random = new Random();
		String adjetivo = ADJETIVOS[random.nextInt(ADJETIVOS.length)];
		String substantivo = SUBSTANTIVOS[random.nextInt(SUBSTANTIVOS.length)];
		return adjetivo + " " + substantivo;
	}

	public static void main(String[] args) {
		List<ItemCarrinho> vItemCarrinho = new ArrayList<>();
		
		for (int i = 0; i < 30; i++) {
			Random random = new Random();			
			vItemCarrinho.add(new ItemCarrinho(1, gerarNomeProdutoAleatorio(), random.nextInt(100) , random.nextDouble(30)));
			System.out.println(vItemCarrinho.get(i));
		}
		
		//Stream<Double> mapToDouble = 
		double sum = vItemCarrinho.stream().mapToDouble(item -> item.getQuantidade() * item.getPrecoUnitario()).sum();
		DoubleSummaryStatistics summaryStatistics = vItemCarrinho.stream().mapToDouble(item -> item.getQuantidade() * item.getPrecoUnitario()).summaryStatistics();
		vItemCarrinho.stream().mapToDouble(item -> item.getQuantidade() * item.getPrecoUnitario()).forEachOrdered(new DoubleConsumer() {
			
			@Override
			public void accept(double value) {
				// TODO Auto-generated method stub
				System.out.println(value);
			}
		});
		
		System.out.println("Outra maneira");
		
		vItemCarrinho.stream().mapToDouble(item -> item.getQuantidade() * item.getPrecoUnitario()).forEach(System.out::println);
		
		System.out.println("Outra maneira 2");
		
		double av = vItemCarrinho.stream().peek(a -> System.out.println(a.getNomeProduto())).mapToDouble(item -> item.getPrecoUnitario() * item.getQuantidade()).sum();
		
		System.out.println(av);
		
		//mapToDouble.
		
		
	}

}
