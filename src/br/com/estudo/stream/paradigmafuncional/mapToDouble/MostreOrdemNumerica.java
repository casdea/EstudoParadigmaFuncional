package br.com.estudo.stream.paradigmafuncional.mapToDouble;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MostreOrdemNumerica {
 
	public static void main(String[] args) {
		//Desafio 1 - Mostre a lista na ordem numérica:
		 
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 23202, 22, 444);

		System.out.println("Ordem crescente");
		
		//ordem crescente
		numeros.stream().sorted(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1.intValue() - o2.intValue();
			}
		}).forEach(n -> System.out.println(n));
		
		System.out.println("Ordem descrescente");

		//ordem descrescente
		numeros.stream().sorted(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2.intValue() - o1.intValue();
			}
		}).forEach(n -> System.out.println(n));
	}

}
