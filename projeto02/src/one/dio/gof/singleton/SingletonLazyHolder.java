package one.dio.gof.singleton;

/*
* Singleton "Lazy Holder, melhor threadsafe"
*
* @author Ednaldo Luiz
*/

public class SingletonLazyHolder {

private static class InstanceHolder {
  private static SingletonLazyHolder instancia = new SingletonLazyHolder();
}

private SingletonLazyHolder() {
  super();
}

public static SingletonLazyHolder getInstancia() {
  return InstanceHolder.instancia;
}

}