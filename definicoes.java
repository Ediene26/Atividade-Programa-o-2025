/* Definições:
Classe - modelo para criar objetos, definindo métodos e atributos
Objeto - Criado a partir da classe, ex.: meuCarro. 
    Classe = Carro
    Carro meuCarro = new Carro();

Método - São as funções dentro do java, bloco de código dentro de uma classe que executa algo. 
Ex.: acelerar
    void acelerar(){
        System.out.println("Acelerando...");
    }     
Instância - é o ato de criar um objeto a partir de uma classe
Exemplo: Carro carroazul = new Carro();

Atributos - Dentro da classe, fora dos métodos. Guardam valores, int, String, double
public class Carro{
    String cor;
    int ano;
    double velocidade;
}

Classe = molde
Objeto = coisa criada a partir do molde
Atributos = características do objeto 
Métodos = ações que o objeto pode realizar
 */