package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
	private String nome;
	private Set<Conteudo> conteudosInscritos;
	private Set<Conteudo> conteudosConcluidos;
	
	
	public Dev(String nome) {
		this.nome = nome;
		this.conteudosInscritos = new LinkedHashSet<>();
		this.conteudosConcluidos = new LinkedHashSet<>();
	}
	
	public String getNome() {
		return nome;
	}

	public Set<Conteudo> getConteudosInscritos() {
		return conteudosInscritos;
	}

	public Set<Conteudo> getConteudosConcluidos() {
		return conteudosConcluidos;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(conteudosConcluidos, conteudosInscritos, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(conteudosConcluidos, other.conteudosConcluidos)
				&& Objects.equals(conteudosInscritos, other.conteudosInscritos) && Objects.equals(nome, other.nome);
	}

	public void inscreverBootcamp(Bootcamp bootcamp) {
		this.conteudosInscritos.addAll(bootcamp.getConteudos());
		bootcamp.getDevsInscritos().add(this);
	}
	
	public void progredir() {
		Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
		if(conteudo.isPresent()) {
			this.conteudosConcluidos.add(conteudo.get());
			this.conteudosInscritos.remove(conteudo.get());
		}else {
			System.err.println("Você não está matriculado em nenhum conteúdo");
		}
		
	}
	
	public double calcularTotalXP() {
		return this.conteudosConcluidos.stream().mapToDouble((c) -> c.calcularXp()).sum();
	}
	
}
