package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
	
	private int cargaHoraria;
	
	public Curso() {
		
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public double calcularXP() {
		return XP_PADRAO * cargaHoraria;
	}
	
	 @Override
	    public String toString() {
	    	return "\nMentoria: {" + 
	    			"titulo: " + getTitulo() + "}\"" +
	    			" \ndescricao: {" + getDescricao() + "}\"" +
	    			" \ndata: {" + cargaHoraria +" horas}";
	    }

}
