//Exércicio: Área do Círculo, area = n * raio²
/* Valores:
entrada: valor de fora
n = 3.14159
4 casas após o ponto decimal.
saída: A = valor

 */



import java.util.Scanner;
import java.util.Locale; //Importação para o programa aceitar pontos

public class bee_1002{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); //Força o programa a aceitar pontos na entrada

        double raio = sc.nextDouble(); //Valor de entrada
        double n = 3.14159;
        double area = n*(raio*raio);
        System.out.printf("A=%.4f%n", area);         
        //Para casas decimais printf('%.4f$')
        sc.close();
    }
}