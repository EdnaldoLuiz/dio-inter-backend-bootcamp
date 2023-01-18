package one.dio.gof.estrategy;

public class ComportamentoAgressivo implements Comportamento {

	@Override
	public void mover() {
		System.out.println("movimentando-se agressivamente...");
	}
}