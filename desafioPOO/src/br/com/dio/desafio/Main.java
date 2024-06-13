package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		Curso cursoJava = new Curso("Java", "Descrição do Curso Java", 8);
		Curso cursoPython = new Curso("Python", "Descrição do Curso Python", 5);
		Curso cursoRuby = new Curso("Ruby", "Descrição do Curso Ruby", 30);
		
		Mentoria mentoriaJava = new Mentoria("Java", "Descrição da Mentoria Java", LocalDate.now());
		Mentoria mentoriaPython = new Mentoria("Python", "Descrição da Mentoria Python", LocalDate.now());
		Mentoria mentoriaJavascript = new Mentoria("Javascript", "Descrição da Mentoria Javascript", LocalDate.now());

		Bootcamp bootcamp = new Bootcamp("Backend", "Descrição do bootcamp de backend");
		bootcamp.getConteudos().add(cursoJava);
		bootcamp.getConteudos().add(cursoPython);
		bootcamp.getConteudos().add(mentoriaJava);
		bootcamp.getConteudos().add(mentoriaPython);
		
		Dev isabella = new Dev("Isabella");
		isabella.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos de Isabella: "+isabella.getConteudosInscritos());
		isabella.progredir();
		System.out.println("Conteúdos Inscritos de Isabella (após progressão): "+isabella.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos de Isabella: "+isabella.getConteudosConcluidos());
		System.out.println("XP: "+isabella.calcularTotalXP());
		isabella.progredir();
		System.out.println("Conteúdos Inscritos de Isabella (após progressão): "+isabella.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos de Isabella: "+isabella.getConteudosConcluidos());
		System.out.println("XP: "+isabella.calcularTotalXP());
		
		Dev guilherme = new Dev("Guilherme");
		guilherme.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos de Guilherme: "+guilherme.getConteudosInscritos());
		guilherme.progredir();
		System.out.println("Conteúdos Inscritos de Guilherme (após progressão): "+guilherme.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos de Guilherme: "+guilherme.getConteudosConcluidos());
		System.out.println("XP: "+guilherme.calcularTotalXP());
		guilherme.progredir();
		guilherme.progredir();
		guilherme.progredir();
		System.out.println("Conteúdos Inscritos de Guilherme (após progressão): "+guilherme.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos de Guilherme: "+guilherme.getConteudosConcluidos());
		System.out.println("XP: "+guilherme.calcularTotalXP());
		
		
		
	}

}
