/*Trabalhando com encapsulamento (cobrindo as informaçoes)
public - todos tem acesso
private - acesso somente na mesma classe
protected - acesso familiar, classe do mesmo pacote

Getters e Setters - Os guardiões
Getters - permite ler os valores (get = pegar)
Setters - permite ALTERAR (set = definir)
Todo código deve ter setters e getters 
*/

public class Main_notas{
    public static void main(String[] args){
        alunos aluno1 = new alunos();

        aluno1.setNome("Alessio");

        System.out.println();

    }    
}