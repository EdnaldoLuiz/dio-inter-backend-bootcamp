// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:  
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next"; 
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha. 
// - O método .split() quebra uma String em várias substrings a partir de um caracter definido por você e coloca em um array. 
package desafios.de.codigo.intermediario03;

import java.util.Scanner; 
    
public class Desafio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String frase = leitor.next();
        String array[] = new String[3];
        String rs = "R$";
        
        array = frase.split("/");
        System.out.print("Imovel:");
        for (String i: array) {
          System.out.print(" " + i);
          array[1] = rs.concat(array[1]);
        leitor.close();
    }
}
}
