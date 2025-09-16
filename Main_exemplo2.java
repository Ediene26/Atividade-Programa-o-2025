import java.util.Scanner;
/* equals - método que compara duas strings
equalsIgnoreCase("s") - vai ignorar os casos e pegar somente a inicial
tudo é aceito independente de como o usuário digite
|| - 'ou' no java
! - operador de negação, inverte o valor
*/
public class Main_exemplo2 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Livro_exemplo2 livro1 = new Livro_exemplo2();

    System.out.println("Digite o título do livro: ");
    livro1.titulo = sc.nextLine();

    System.out.println("Digite o nome do autor: ");    
    livro1.autor = sc.nextLine();

    System.out.println("Digite a quantidade de páginas do livro: ");
    livro1.quantPag = sc.nextInt();
    sc.nextLine(); //Pula para a próxima linha para efetuar o restante do código 

    System.out.println("Você deseja pegar o livro emprestado?(s/n)");
    String escolha = sc.nextLine();
    //'equal' - método utilizado para comparar Strings
    if(escolha.equalsIgnoreCase("s") || (escolha.equalsIgnoreCase("sim"))){
        livro1.emprestimo();
    }

    System.out.println("Você deseja devolver o livro?(s/n)");
    escolha = sc.nextLine();
   if(escolha.equalsIgnoreCase("s") || (escolha.equalsIgnoreCase("sim"))){
      livro1.devolucao();

   }
   
    livro1.exibirDados();
    sc.close();
    }
}
