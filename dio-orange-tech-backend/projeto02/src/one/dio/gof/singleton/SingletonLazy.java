package one.dio.gof.singleton;

/*
* Singleton "apressado"
*
* @author Ednaldo Luiz
*/

public class SingletonLazy {

private static SingletonLazy instancia;

private SingletonLazy() {
  super();
}

public static SingletonLazy getInstancia() {
  if(instancia == null) {
    instancia = new SingletonLazy();
  }
  return instancia;
}

}
