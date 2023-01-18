package one.dio.gof.singleton;

/*
* Singleton "apressado"
*
* @author Ednaldo Luiz
*/

public class SingletonEager {

private static SingletonEager instancia = new SingletonEager();

private SingletonEager() {
  super();
}

public static SingletonEager getInstancia() {
  return instancia;
}

}
