//Criando um programa que verifique se um número é ímpar ou par

import java.util.Scanner;

public class par_impar {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.printf("Digite um número inteiro: ");
    int number = sc.nextInt();
    //Condição para ser par
    if(number % 2 == 0){
        System.out.printf("O número "+ number + " é par.");
    }
    else{
        System.out.printf("O número " + number + " é ímpar.");
    }
    sc.close();
    }
}
