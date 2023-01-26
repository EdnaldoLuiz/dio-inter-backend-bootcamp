package br.com.dio.desafio;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
	public static void main(String[] args) {
		
		Curso cursoJava = new Curso();
		cursoJava.setTitulo("Curso de Java");
		cursoJava.setDescricao("neste curso de Java voce aprendera POO");
		cursoJava.setCargaHoraria(8);
		
		Curso cursoJs = new Curso();
		cursoJs.setTitulo("curso de Javascript");
		cursoJs.setDescricao("neste curso de Js voce aprendera Js para Front-End");
		cursoJs.setCargaHoraria(12);
		
		Mentoria mentoriaSpring = new Mentoria("Falvojr");
		mentoriaSpring.setTitulo("mentoria de Spring");
		mentoriaSpring.setDescricao("nesta mentoria de Java será visto boas práticas de código");
		mentoriaSpring.setData(LocalDate.now());
		
		Mentoria mentoriaJs= new Mentoria("Camila");
		mentoriaJs.setTitulo("mentoria de Javascript");
		mentoriaJs.setDescricao("nesta mentoria será visto frameworks Js");
		mentoriaJs.setData(LocalDate.of(2023, 02, 06));
		
		Bootcamp bootcampJava = new Bootcamp("Java");
		bootcampJava.setNome("Java e orientacao a objeto");
		bootcampJava.setDescricao("Nesse bootcamp sera visto boas praticas de Java e orientacao a objeto");
		bootcampJava.getConteudos().add(cursoJava);
		bootcampJava.getConteudos().add(mentoriaSpring);
		
		Bootcamp bootcampJs = new Bootcamp("Javascript");
		bootcampJs.setNome("Javascript para paginas web");
		bootcampJs.setDescricao("Nesse bootcamp voce aprendera a fazer paginas dinamicas");
		bootcampJs.getConteudos().add(cursoJs);
		bootcampJs.getConteudos().add(mentoriaJs);
		
		List<Dev> devsJava = Arrays.asList(
				new Dev("Ednaldo"));
		
		List<Dev> devsJs = Arrays.asList(
				new Dev("Luiz"));
		
		devsJava.forEach(dev -> dev.inscreverBootcamp(bootcampJava));
		
		devsJs.forEach(dev -> dev.inscreverBootcamp(bootcampJs));
		
		devsJava.forEach(dev -> dev.progredir());
		devsJava.forEach(dev -> dev.progredir());
		devsJava.forEach(dev -> dev.progredir());
		
		System.out.println(bootcampJava);
		
		System.out.println(bootcampJs);
		
		devsJs.forEach(dev -> dev.calculaTotalXP());
	}
}