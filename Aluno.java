//Criando uma classe chamada 'aluno'
public class Aluno {
    String nome, curso;
    int matricula, idade;

    public float media (float nota1, float nota2){ //Aqui vai retornar um valor float, precisa dos parâmetros
        return (nota1 + nota2) / 2;
    }
    //Situação do aluno
    public String situacaoAluno (float media){
        if(media>=7){
            return "Aprovado";
        }else if(media <= 3){
            return "Reprovado";
        }else{
            return "Recuperação";
        }
    }
    //Exibir dados
    public void exibirDados(){ //void não retorna nada
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Idade de aluno: " + idade);
        System.out.println("Curso do aluno: " + curso);
    }
}
