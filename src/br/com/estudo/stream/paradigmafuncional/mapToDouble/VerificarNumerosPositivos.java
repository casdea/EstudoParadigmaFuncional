package br.com.estudo.stream.paradigmafuncional.mapToDouble;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class VerificarNumerosPositivos {
	public static void main(String[] args) {
		 
		List<Integer> numeros = Arrays.asList(1, 2, 3, -4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 23202, 22, 444);
		 
		if (numeros.stream().filter(new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				// TODO Auto-generated method stub
				return t.intValue()>0;
			}
		}).count() == numeros.size()) {
			System.out.println("TODOS POSITIVOS");
		}
		else 
		{
			System.out.println("NEM TODOS");
		}

		
		System.out.println(numeros.stream().filter(i -> i.intValue() >0).count() == numeros.size() ? "TODOS" : "NEM");
	}

}
