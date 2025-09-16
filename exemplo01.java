//Exemplo: leitura do nome e idade de uma pessoa
import java.util.Scanner;

public class exemplo01{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in); //Cria um objeto 'sc', e abre
    
    String name;
    int age;

    System.out.print("Digite seu nome:");
    name = sc.nextLine();
    System.out.print("Digite sua idade:");
    age = sc.nextInt();
    System.out.println("Olá, " + name +"! Você tem " + age + " anos.");

    sc.close(); //Fecha o scanner
    }
}
