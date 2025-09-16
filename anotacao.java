/*
//Utiliza o código abaixo para abrir a minha pasta
public class anotacao {
    //Declarando variáveis: 
    //1° forma - tipo, nome da variável e valor
    int number = 20;
    String name = "Gomes";
    
    //2° forma: utilizando o 'var'
    var nomeVariavel = "Gomes"; //só pode ser usado dentro de um método
}

public class anotacao{
    //Tipos de variáveis: n° inteiros = n° reais, 1, 240, 33
    byte => 8 bits: -128 a 127
    short => 16 bits: -32.768 a 32.767
    int => 32 bits: -2.147.483.648 a 2.147.483.647 // mais usado
    long => 64 bits: -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807

    //Números decimais:
    float => 32 bits => precisão simples, poucos números após a vírgula
    double => 64 bits => precisão dupla, vários números ápos a vírgula

    //Strings:
    String => representa palavras e frases, utiliza aspas duplas: "xxx"
    char => representa um único caractere == a, b, c, d
    char meuChar = 'a' //utiliza aspas simples: 'xxx' 

    //Valores booleanos
    boolean => true ou false
    boolean bool = true;

    //Condicionais:
    if(b > 99){
        System.out.println("Verdadeiro");
    } else {
        System.out.println("Falso");
    }
    //Outra condicional: senão se
    if(str == "Gomes"){
        System.out.println("Verdadeiro");
    } else if (str == "Lima"){
        System.out.println("Fernanda");
    } 
    else {
        System.out.println("Falso");
    }
    //Pode verificar strings, se for vazia (str.isBlank())

    //Vetor: Coleção de valores (array)
    //Declarando um vetor
    int [] colecaoInteiros = {1, 2, 3, 4, 5}; //Lista limitada
    if(str.isBlank()){
        System.out.printl(colecaoInteiros[0]); //Posição do valor, no caso, número    
        System.out.print(colecaoInteiros.lenght); //Comprimento da lista
    }
    //lenght: comprimento do array (lista de valores, vetor)

    //ArrayList - classe do java, lista dinâmica de elementos
    ArrayList<String> nomes = new ArrayList<>();
    nomes.add("Gomes");
    nomes.add("Marcell");
    //Método 'get'
    System.out.println(nomes.get(0)); //o 'get' é usado para chamar a posição
    //Remove um elemento da lista pelo índice e pelo próprio nome
    nomes.remove(1); 
    nomes.remove("Marcell");

    //Loops: for e while

    //variável de interação, declarada antes: int i = 0
    //condição: i < nomes.size()
    //manipulação da variável, multiplicando, aumentando, diminuindo
    for (int i = 0; i < nomes.size(); i++){   //aumenta de 1 em 1
        System.out.println(nomes.get(i)); //mostra a posição que o interador está, todo o laço
    }

    //Declara o tipo de variável: String nome
    //Depois a variável que vai ser interada, usada mais para listas: nomes
    //Printa todos os nomes dentro da lista 'nomes'
    for (String nome: nomes){  //Executa com número determinado
        System.out.println(nome);
    }
    
    //While só para se a condição for atingida, muito usado com contador
    int contador = 0;
    while(contador < 10){
        System.out.println("Estou no while");
        contador++;
    }
    //Transformar um valor de variável em outro: casting

    double resultado = 0.0;
    int resultadoInt = (int) resultado;

    int meuInt = 10;
    double meuDouble = meuInt;
    //Passando a string para numero inteiro
    //Integer: classe dentro do java, com método 'parse' (parsear, passar)
    String minhaString = "10";
    int minhaString2 = Integer.parseInt(meuString);
    //Passando número para string
    String minhaString = String.valueof(minhaString2);
}

    /*POO: programação orientada a objetos
    Classes: Modelo que vai definir a estrutura dos objetos
    Define os atributos (variáveis), métodos (funções)
    Pode ser instanciada 
    */
    /*Construtor: método especial de uma classe
    Sempre é chamado quando o objeto da classe é criado
    */
    /*public class anotacao {

        public static void main(String[] args){ //main, método inicial, entrada da classe
            carro mycarro = new carro("BMW"); //Criou um objeto novo, método chamado
            carro mycarro2 = new carro("Fusca"); //'new' cria novos objetos

            mycarro.acelerar();
            mycarro2.acelerar();

        }
    }
    class carro{       //Classe carro
        String modelo; //Atributo
        public carro(String modelo){
            this.modelo = modelo; //'this' acessando a instância atual da classe
            //System.out.println("Carro criado"); //Mostra no terminal que o carro foi criado
       
        }
        public void acelerar(){ //método
             System.out.println("Acelerando o carro" + this.modelo);
        }
        /*Modificadores de acesso: controle de acesso, public, private, proteted, default
        package: pacote que chama a pasta criada
        public: acesso de todo o lugar
        defult: quando não tem modificador de acesso definido
        private: acessível somente dentro da classe definida
        protected: acessível por todo mundo no mesmo pacote
        */

        /*Interfaces: modelo de contrato entre classes
        Define um contrato que a classe vai seguir
        Define o comportamento da classe, o que ela deve parecer
        A interface não pode ser instânciada

        public interface carro{
            void acelerar();  --Método

            void freiar();    --Método
            
            void parar();     --Método
        }

        public class Sandero implements carro{

            public void acelerar(){
            
            }

            public void freiar(){
            
            }
            
            public void parar(){
            
            }
        }
    
        }

        Classes abstratas: Não pode ser instanciada

        public abstract class SerVivo {
        
            public abstratc void respirar();

            public void dormir(){
                System.out.println("respirado...")
            }
        }
        */

        /* Herança e polimoformismo:
        Uma classe herda o comportamento de outra classe

        public class Humano extends SerVivo{
            public Humano(){
                super(idade:42);  --Construtor da super classe (classe mãe)

            }
            public void respirar(){
                System.out.println("Inalando e exalando CO2 e oxigênio");
            }     
        }
         */

        /*Polimofismo: conceito que permite que o objeto pode ser tratado de várias formas
        Mesmo método pode ser usado em diferentes classes
        */

        /*Tratando exceções, erros:
        Exceções mais comuns:

        - NullPointerException exception
        - ArrayIndexOutOfBoundsException exception
        - RuntimeException exception
        - IOException exception
        - AritmeticException exception

        try {
            meuErroFurado.acelerar(); --Meu erro, o objeto não tem esse método    
        } catch (NullPointerException exception){  --'Null' - vazio
            Systema.out.println("vende carro furado");
        }
        */