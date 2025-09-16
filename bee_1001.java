//Exercício: Ler dois valores e printar o resultado da soma
import java.util.Scanner;

public class bee_1001 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int soma = a + b;

        entrada.close();
        System.out.println("X = " + soma);
    }
}
