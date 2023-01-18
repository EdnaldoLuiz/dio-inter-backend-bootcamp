// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:  
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next"; 
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.   
package desafios.de.codigo.intermediario02;

import java.util.Scanner; 
    
public class Desafio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int velocidade = leitor.nextInt();
        int multas = leitor.nextInt();

        if (velocidade > 80) {
        multas++;
        } 
        
        if (multas >= 3) {
        System.out.print(multas + " multas.");
          System.out.print(" Levou pontos na carteira");
        } else {
        System.out.print(multas + " multas.");
          System.out.print(" Nao levou pontos na carteira");
        }
        leitor.close();
    }
}