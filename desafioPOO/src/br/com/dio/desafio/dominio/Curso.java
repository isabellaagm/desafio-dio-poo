package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{
	private int cargaHoraria;
	
	public Curso(String titulo, String descricao, int cargaHoraria) {
		super.setTitulo(titulo);
		super.setDescricao(descricao);
		this.cargaHoraria = cargaHoraria;
	}


	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public String toString() {
		return "Curso: " + super.getTitulo() + ", descrição: " + super.getDescricao() + ", carga horária: " + cargaHoraria + "h";
	}


	@Override
	public double calcularXp() {
		return XP_PADRAO * this.cargaHoraria;
	}
	
	
}
