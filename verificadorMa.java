/*Verificador de maioridade
O programa irá solicitar o nome e a idade do usuário
Será exibido uma mensagem informando se a pessoa é de maior ou menor
Maioridade = 18 anos
*/
import java.util.Scanner;

public class verificadorMa {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in); //Cria um objeto 'sc', e abre
    //Solicita o nome do usuário
    System.out.print("Digite seu nome:");
    String name = sc.nextLine();
    //Solicita a idade do usuário
    System.out.print("Digite sua idade:");
    int age = sc.nextInt();

    //Condição da maioridade    
    if(age >= 18){
        System.out.println("Olá " +name+ "!"+"Você tem " +age+ " anos. " + "Então já atingiu a maioridade!");
    }
    else{
        System.out.print("Epa! "+"Você tem " + age + " anos, " + name + ". Ainda é de menor!");
    }

    sc.close(); //Fecha o scanner
    }
}
