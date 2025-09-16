/*O programa irá determinar os status final do aluno com base nas notas
Status = (Aprovado, recuperação, reprovado)
Socilite o nome do aluno;
Duas notas (P1 e P2);
Porcentagem de frequência;
Faça o cálculo da média das notas;
 */
import java.util.Scanner;
import java.util.Locale;

public class analise_desem {
    public static void main(String[] args){
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    
    //Minhas variáveis
    String nome;
    double P1;
    double P2;
    double freq;

    System.out.printf("Informe seu nome:");
    nome = sc.next();
    System.out.printf("Digite sua primeira nota:");
    P1 = sc.nextDouble();
    System.out.printf("Digite sua segunda nota:");
    P2 = sc.nextDouble();
    System.out.printf("Digite sua frequência:");
    freq = sc.nextDouble();
    double media = (P1 + P2) / 2;

    if(freq < 75){
        System.out.println("Reprovado por frequência.");
    }
    else{
        if(media >= 7.0){
            System.out.println("Aluno aprovado.");
        }
        else if(media >= 5.0){
            System.out.println("Aluno em recuperação.");
        }
        else{
            System.out.println("Aluno reprovado por nota.");
        }
    System.out.printf(nome +", " +media+ ", "+ freq);
    }
    sc.close();    
    }
}
