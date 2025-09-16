//Criando uma classe chamada 'livro'

public class Livro_exemplo2 {
    String titulo, autor;
    int quantPag;
    boolean emprestado;

//Métodos: emprestar, devolver, exibir informações 
    public void emprestimo(){
        if (!emprestado){ //Nega o valor booleano
            emprestado = true;
            System.out.println("Livro emprestado");
        }else{
            System.out.println("Livro disponível");
        }
    }
    public void devolucao(){ //Livro disponivel ou não
        if(emprestado){ 
            emprestado = false;
            System.out.println("Livro devolvido, disponível");
        }else{
            System.out.println("Livro indisponível");
        }
    }
    public void exibirDados(){
        System.out.println("Título do livro: " + titulo);
        System.out.println("Autor do livro: " + autor);
        System.out.println("Páginas do livro: " + quantPag);
    }
}
