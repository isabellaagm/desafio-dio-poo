package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
	private String nome;
	private String descricao;
	private final LocalDate dataInicio;
	private final LocalDate dataFinal;
	private Set<Dev> devsInscritos;
	private Set<Conteudo> conteudos;
	
	public Bootcamp(String nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;
		this.dataInicio = LocalDate.now();
		this.dataFinal = dataInicio.plusDays(45);
		this.devsInscritos = new HashSet<>();
		this.conteudos = new LinkedHashSet<>();
	}

	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public LocalDate getDataFinal() {
		return dataFinal;
	}

	public Set<Dev> getDevsInscritos() {
		return devsInscritos;
	}

	public Set<Conteudo> getConteudos() {
		return conteudos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(conteudos, dataFinal, dataInicio, descricao, devsInscritos, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bootcamp other = (Bootcamp) obj;
		return Objects.equals(conteudos, other.conteudos) && Objects.equals(dataFinal, other.dataFinal)
				&& Objects.equals(dataInicio, other.dataInicio) && Objects.equals(descricao, other.descricao)
				&& Objects.equals(devsInscritos, other.devsInscritos) && Objects.equals(nome, other.nome);
	}
	
	
	
	
}
