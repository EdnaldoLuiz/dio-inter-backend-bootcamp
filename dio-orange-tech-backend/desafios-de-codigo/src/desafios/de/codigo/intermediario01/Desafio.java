// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:  
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next"; 
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha. 
// - O método .contains() verificar se em uma determinada String tem um determinado caractere ou um conjunto deles
package desafios.de.codigo.intermediario01;

import java.util.Scanner; 
    
public class Desafio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String arquivoDoPc = leitor.next();
        
          if (arquivoDoPc.contains(".mp3")) {
          System.out.println("Salvar");
        } else {
          System.out.println("Deletar");
        }
        leitor.close();
    }
}