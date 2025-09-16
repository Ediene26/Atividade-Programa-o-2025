//Desafio: Sistema de Gestão de Loja
//                           AULA 04
import java.util.Scanner;

public class produLoja {
    private String nome;
    private double preco;
    private int quantiEstoque; 

    //Construtor para iniciar todos os atributos
    public produLoja(String nome, double preco, int quantiEstoque){
        this.nome = nome;
        this.preco = preco;
        this.quantiEstoque = quantiEstoque;
    }
    //Adicionando os métodos de acesso (porteiros) para cada atributo
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(Scanner sc) {
            while (true){
                
                int entrada = sc.nextInt();
                sc.nextLine();
                if (entrada <= 0){
                    System.out.println("ERRO! O preço não pode ter valor negativo ou nulo");
                }else{
                    System.out.println("Valor atualizado com sucesso!");
                    break;
                }

        }

        /*if(preco <= 0){
            System.out.println("ERRO! O preço não pode ter valor negativo.");
        }else{
             System.out.println("Ótimo! O preço foi aceito, pode prosseguir.");
        }*/
    }

    public int getQuantiEstoque() {
        return quantiEstoque;
    }
    public void setQuantiEstoque(int quantiEstoque) {
        this.quantiEstoque = quantiEstoque;
        if(quantiEstoque <= 0){
             System.out.println("ERRO! A quantidade não pode ter valores abaixo de zero");
        }else{
             System.out.println("Ok! A quantidade de produtos foi aceita, prossiga.");
        }
    }
    //Adicionando um método para exibir os dados do produto
    public void exibirDetalhes(){
        System.out.println("NOME do produto: " + nome);
        System.out.println("PREÇO do produto: " + preco);
        System.out.println("QUANTIDADE EM ESTOQUE do produto: " + quantiEstoque);
    }

}
//Falta finalizar 15/09