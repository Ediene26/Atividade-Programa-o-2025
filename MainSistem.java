//Sistema de controle de livros, página principal
//                            AULA 04
import java.util.Scanner;

public class MainSistem {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    sistemBook book = new sistemBook();

    book.setTitulo("A história de Gargamel");
    book.setAutor("Pedro Carmel");
    
    //Cria uma variável para o usuário responder
    System.out.println("Deseja pegar o livro emprestado? (sim/não)");
    String resposta = sc.nextLine();

    book.emprestar(resposta);
    
    book.dadosBook();

    sc.close();
    }
}
/*String resposta = '';
while (!resposta.equalsIgnoreCase("sim")) && (!resposta.equalsIgnoreCase("não")){
    System.out.println("Deseja pegar o livro emprestado? (sim/não)");
    resposta = sc.nextLine();
    if (!resposta.equalsIgnoreCase("sim")) && (!resposta.equalIgnoreCase("não")){
        System.out.println("Resposta inválida!. Digite somente 'sim' ou 'não'.");
    }
}

 */