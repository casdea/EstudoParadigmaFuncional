package br.com.estudo.stream.paradigmafuncional.mapToDouble;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AgruparPor {


	public static void main(String[] args) {
		List<Pessoa> pessoas = 
				Arrays.asList(
						new Pessoa("1","João", 30, 80), 
						new Pessoa("2","João", 31, 85), 
						new Pessoa("1","João", 31, 83), 
						new Pessoa("1","João", 31, 81), 
						new Pessoa("2","João", 30, 81), 
						new Pessoa("1","Antonio Costa", 25, 75), 
						new Pessoa("1","Marcos Paulo", 25, 60),
						new Pessoa("2","Gusmao", 25, 80),
						new Pessoa("1","Costa", 25, 81),
						new Pessoa("2","Manoela", 25, 55),
						new Pessoa("2","Ana Maria", 25, 61),
						new Pessoa("2","Ana Carla", 25, 63),
						new Pessoa("1","Maria de Souza", 25, 90),
						new Pessoa("2","Pedro", 30, 30),
						new Pessoa("1","Ana", 25, 120));

		// Agrupar pessoas por idade
		Map<Integer, List<Pessoa>> pessoasPorIdade = pessoas.stream().collect(Collectors.groupingBy(Pessoa::getIdade));

		// Imprimir o resultado
		pessoasPorIdade.forEach((idade, listaPessoas) -> {
			System.out.println("Pessoas com idade " + idade + ":");
			listaPessoas.forEach(pessoa -> System.out.println("- " + pessoa.getNome()));
		});
		
        // Agrupar pessoas por idade e somar os pesos
        Map<Integer, Integer> somaPesosPorIdade = pessoas.stream()
            .collect(Collectors.groupingBy(Pessoa::getIdade, Collectors.summingInt(Pessoa::getPeso)));

        // Imprimir o resultado
        somaPesosPorIdade.forEach((idade, somaPeso) -> {
            System.out.println("Idade: " + idade + ", Soma d os Pesos: " + somaPeso);
        });
		
        
        // Agrupar pessoas por idade e tipo de pessoa, e somar os pesos
        Map<String, Map<Integer, Integer>> resultado = pessoas.stream()
            .collect(Collectors.groupingBy(
                Pessoa::getTipoPessoa,
                Collectors.groupingBy(Pessoa::getIdade, Collectors.summingInt(Pessoa::getPeso))
            ));

        // Imprimir o resultado
        resultado.forEach((tipoPessoa, mapaIdadePeso) -> {
            System.out.println("Tipo de Pessoa: " + tipoPessoa);
            mapaIdadePeso.forEach((idade, somaPeso) -> {
                System.out.println("  Idade: " + idade + ", Soma dos Pesos: " + somaPeso);
            });
        });
        
		
	}
}
