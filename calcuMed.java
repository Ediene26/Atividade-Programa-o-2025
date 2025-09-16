/* Calculadora de Média e Aprovação (Aprovado, reprovado, recupeação)
                                AULA 02
*/ 

import java.util.Scanner;
import java.util.Locale; //Para números com pontos

public class calcuMed {
    public static void main(String[] args){ 
    Scanner sc = new Scanner(System.in);
    sc.useLocale(Locale.US);
    
    System.out.printf("Digite sua primeita nota:");
    double notaA = sc.nextDouble();

    System.out.printf("Digite sua segunda nota:");
    double notaB = sc.nextDouble();

    double media = (notaA + notaB) / 2;

    if(media >= 7.0){
        System.out.printf("Sua média foi de "+media+ ". Você foi APROVADO!");
    }else if (media < 7.0){
        System.out.println("Sua média foi de "+media+ ". Você está de RECUPERAÇÃO!");
        //Nota da recuperação
        System.out.printf("Digite sua nota da final:");
        double notaR = sc.nextDouble();

        double mediaf = (media + notaR) / 2;

        if(mediaf >= 6.0){
            System.out.printf("Sua média final foi de " +mediaf+ ". Você foi APROVADO!");
        }else{
            System.out.printf("Sua média final foi de "+mediaf+ ". Você foi REPROVADO!");
        }
    }
    sc.close();
    }
}
