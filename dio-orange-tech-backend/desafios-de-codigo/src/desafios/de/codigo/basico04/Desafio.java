// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:  
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next"; 
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.   
package desafios.de.codigo.basico04;

import java.util.Scanner; 
    
public class Desafio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int doce = leitor.nextInt();
        
        System.out.println("O cliente obteve " + doce * 2 + " doces");
        leitor.close();
    }
}