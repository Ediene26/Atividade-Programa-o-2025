//Sistema de controle de livros, página dos livros
/*Passos:
1° - definir os atributos
2° - criar os métodos para controlar o status do book
Nota: usar encapsulamento, 'private' e o 'get', 'set'
                            AULA 04
*/                               
public class sistemBook {
    private String titulo, autor;
    private boolean emprestado;

    //Métodos especiais: get (pega) e set(defini)
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public boolean isEmprestado() {
        return emprestado;
    }
    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    //Criando método: emprestímo e devolução
    public void emprestar(String resposta){
        if(resposta.equalsIgnoreCase("sim")|| resposta.equalsIgnoreCase("s")){
            if (!emprestado){
                emprestado = true;
                System.out.println("O livro foi emprestado!");
            }else{
                System.out.println("O livro já está emprestado.");
            }
        }else{
            if(resposta.equalsIgnoreCase("nao")||resposta.equalsIgnoreCase("não")||resposta.equalsIgnoreCase("n")){
                System.out.println("Resposta recebida. O livro não será emprestado");
            }else{
            System.out.println("Operação cancelada. O livro não foi emprestado.");
            }
        }
    }
    //Método de devolução, oposto ao emprestar
    public void devolver(){
        if (emprestado){
            emprestado = false; //livro disponível
            System.out.println("O livro foi devolvido!");
        }else{
            System.out.println("Livro disponível na biblioteca.");
        }
    }
    public String status(){
        if (emprestado){
            return "Emprestado";
        }else{
            return "Disponível para empréstimo";
        }
    }
    //Método de status do book
    public void dadosBook(){
        System.out.println("Título do livro: " + titulo);
        System.out.println("Autor do livro: " + autor);
        System.out.println("Status do livro: " + status());
    }
}
