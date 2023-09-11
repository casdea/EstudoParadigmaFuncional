	package br.com.estudo.stream.paradigmafuncional.mapToDouble;

import java.util.Arrays;
import java.util.List;

public class SomaNumerosPares {
	 
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(2, 3, 4, 1, 9, 11, 4);
		
		int soma = numeros.stream().filter(a -> a % 2 == 0).mapToInt(a -> a).sum();
		
		System.out.println("SOMA DOS NUMEROS PARES "+soma);
 
	}

}
