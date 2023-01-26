package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
	
	public String mentor;
	private LocalDate data;
	
	public Mentoria(String mentor) {
		this.mentor = mentor;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public double calcularXP() {
		return XP_PADRAO + 20d;
	}
	
    @Override
    public String toString() {
    	return String.format("\n\n[Mentoria]\nTitulo: {%s}\nDescricao: {%s}\nData: [%s]\n\n", getTitulo(), getDescricao(), getData());
    }
}
