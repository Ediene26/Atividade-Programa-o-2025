//Classe aluno
public class exemplo_Main{
    public static void main(String[] args){
        Aluno aluno1 = new Aluno(); //Objeto = Aluno1
        Aluno aluno2 = new Aluno();
        
        //Referenciando a classe "Aluno"
        aluno1.nome = "Ediene";
        aluno1.idade = 20;
        aluno1.matricula = 123456;
        aluno1.curso = "Engenharia da Computação";
        float media = aluno1.media(7,8);

        aluno2.nome = "Antônio";

        aluno1.exibirDados();
        aluno2.exibirDados();
        

        System.out.println("O nome do aluno é: " + aluno1.nome);
        System.out.println("A idade do aluno é: " + aluno1.idade);
        System.out.println("A matrículo da aluno é: " + aluno1.matricula);
        System.out.println("O curso do aluno é: " + aluno1.curso);
        System.out.println("A média do aluno é: " + media);
        System.out.println("A situação do aluno é: " + aluno1.situacaoAluno(media));
    }
}