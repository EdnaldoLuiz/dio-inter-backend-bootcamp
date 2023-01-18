// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:  
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next"; 
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha. 
package desafios.de.codigo.intermediario05;

import java.util.Scanner; 
    
public class Desafio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanhoDaFila = leitor.nextInt();
        
        if (tamanhoDaFila % 2 == 0) {
        System.out.println(tamanhoDaFila / 2 + " pessoas no camarote");
        } else {
          tamanhoDaFila++;
          System.out.println(tamanhoDaFila / 2 + " pessoas no camarote");
        }
        leitor.close();
    }
}