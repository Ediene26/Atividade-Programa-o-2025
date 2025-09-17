//Atividade: Ponto extra
//Main - raiz
import java.util.Scanner;
//import java.util.Locale;

public class MainBilhete{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Ingresso bilhete = new Ingresso(); 
    RealatoIngre relatorio = new RealatoIngre();

        while (true) {
        System.out.print("\nDigite a idade do cliente: ");
        bilhete.setIdadeCli(sc.nextInt());
        sc.nextLine(); // limpar buffer

        double precoTotal = bilhete.getPreco() * bilhete.getQuantIngre();
        bilhete.realizarPagamento(precoTotal);

        relatorio.atualizar(bilhete, precoTotal);

        System.out.print("\nAtender próximo cliente? (S/N): ");
        String resposta = sc.nextLine();
        if (resposta.equalsIgnoreCase("N")) break;
    }
    
    sc.close();
    relatorio.imprimir();
    }
}