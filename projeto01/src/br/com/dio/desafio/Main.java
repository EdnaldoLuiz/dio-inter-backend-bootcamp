package br.com.dio.desafio;
import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("curso de Java");
		curso1.setDescricao("neste curso de Java você aprendera POO");
		curso1.setCargaHoraria(8);
		
		Curso curso2= new Curso();
		curso2.setTitulo("curso de Js");
		curso2.setDescricao("neste curso de Js você aprendera Js para Front-End");
		curso2.setCargaHoraria(4);
		
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria de Java");
		mentoria.setDescricao("nesta mentoria de Java será visto boas práticas de código");
		mentoria.setData(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Bootcamp Java Developer, do básico ao avançado");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev luiz = new Dev();
		luiz.setNome("Luiz");
		luiz.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos do Luiz: " + luiz.getConteudosInscritos());
		
		System.out.println("\nSeu XP atual: " + luiz.calculaTotalXP() + "XP");
		luiz.progredir();
		luiz.progredir();
		System.out.println("________________________________________________________________________");
		System.out.println("Conteudos concluidos do Luiz: " + luiz.getConteudosConcluidos());
		System.out.println("\nSeu XP atual: " + luiz.calculaTotalXP() + "XP");
		
		System.out.println("\n#######################################################################\n");
		
		Dev ednaldo = new Dev();
		ednaldo.setNome("Ednaldo");
		ednaldo.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos do Ednaldo: " + ednaldo.getConteudosInscritos());
		
		System.out.println("\nSeu XP atual: " + ednaldo.calculaTotalXP() + "XP");
		ednaldo.progredir();
		System.out.println("________________________________________________________________________");
		System.out.println("Conteudos concluidos do Ednaldo: " + ednaldo.getConteudosConcluidos());
		System.out.println("\nSeu XP atual: " + ednaldo.calculaTotalXP() + "XP");
		
	}
}