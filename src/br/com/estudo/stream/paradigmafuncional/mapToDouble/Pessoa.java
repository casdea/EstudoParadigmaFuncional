package br.com.estudo.stream.paradigmafuncional.mapToDouble;

import java.util.*;
import java.util.stream.Collectors;

public class Pessoa {
	private String tipoPessoa;
	private String nome;
	private int idade;
	private int peso;

	public Pessoa(String tipoPessoa, String nome, int idade, int peso) {
		this.tipoPessoa = tipoPessoa;
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
	}
	
	public String getTipoPessoa() {
		return tipoPessoa;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public int getPeso() {
		return peso;
	}

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
		
		
	}
}
