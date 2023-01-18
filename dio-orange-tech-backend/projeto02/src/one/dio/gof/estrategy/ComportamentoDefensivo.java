package one.dio.gof.estrategy;

public class ComportamentoDefensivo implements Comportamento {

	@Override
	public void mover() {
		System.out.println("movimentando-se defensivamente...");
	}
}