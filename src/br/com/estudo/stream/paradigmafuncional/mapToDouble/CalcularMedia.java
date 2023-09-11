package br.com.estudo.stream.paradigmafuncional.mapToDouble;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class CalcularMedia {

	
	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, -4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 11, 12, 15);
		
		System.out.println(numeros.stream().filter(i -> i.intValue()>5).peek(System.out::println).mapToInt(a -> a).average());
	}
	
}
