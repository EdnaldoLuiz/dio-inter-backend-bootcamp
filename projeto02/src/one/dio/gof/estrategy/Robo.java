package one.dio.gof.estrategy;

public class Robo {

private Comportamento comportamento;

public void setComportamento(Comportamento comportamento) {
  this.comportamento = comportamento;
}

public void moverSe() {
  comportamento.mover();
}

}
