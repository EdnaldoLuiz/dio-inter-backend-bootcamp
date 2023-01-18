package one.dio.gof.estrategy;

public class ComportamentoNormal implements Comportamento {

	@Override
	public void mover() {
		System.out.println("movimentando-se normalmente...");
	}
}