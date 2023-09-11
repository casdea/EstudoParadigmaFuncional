package br.com.estudo.stream.paradigmafuncional.mapToDouble;

import java.util.Arrays;
import java.util.List;

public class RemoverValoresImpares {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, -4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 23202, 22, 444);
		
		numeros.stream().filter(i -> i.intValue() % 2 == 0).forEach(System.out::println);
	}

}
