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

}
