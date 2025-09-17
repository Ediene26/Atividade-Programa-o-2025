//Atividade: Ponto extra 
import java.util.Scanner;

public class Ingresso {
    private String tipoIngre;
    private double precoIngre = 30.0;
    private int quantIngre, idadeCli;

    Scanner sc = new Scanner(System.in);

    public double getPreco() {
        return precoIngre;
    }
    public int getQuantIngre() {
        return quantIngre;
    }
    public void setQuantIngre(int quantIngre) {
        this.quantIngre = quantIngre;
    }
    public int getIdadeCli() {
        return idadeCli;
    }
    public void setIdadeCli(int idadeCli) {
        this.idadeCli = idadeCli;
    }
    public String getTipoIngre() {
        return tipoIngre;
    }
    public void setTipoIngre(String tipoIngre) {
        this.tipoIngre = tipoIngre;
    }

    public void ingresso(){

        if (idadeCli < 5){
            precoIngre = 0.0;
            System.out.println("Tipo de ingresso: gratuito");
        }
        else{
            while(true){
                System.out.println("Informe o tipo de ingresso (Inteira, Meia, Promocional, Gratuito): ");
                tipoIngre = sc.nextLine();

                if(tipoIngre.equalsIgnoreCase("inteira")){
                    System.out.println("Tipo de ingresso: Inteiro" );
                    System.out.println("Valor do ingresso: " + precoIngre);
                    break;
                }
                else if(tipoIngre.equalsIgnoreCase("meia")){
                    precoIngre *= 0.5;
                    System.out.println("Tipo de ingresso: meia" );
                    System.out.println("Valor do ingresso: " + precoIngre);
                    break;
                }
                else if(tipoIngre.equalsIgnoreCase("promocional")){
                    precoIngre *= 0.7;
                    System.out.println("Tipo de ingresso: promocional");
                    System.out.println("Valor do ingresso: " + precoIngre);
                    break;
                }
                else{
                    System.out.println("Tipo de ingresso inválido! Informe novamente.");
                }
            }
        }
        System.out.println("Informe a quantidade de ingressos: ");
        quantIngre = sc.nextInt();
        sc.nextLine();

        System.out.println("\n--- RESUMO ---");
        System.out.println("Idade: " + idadeCli);
        System.out.println("Tipo de ingresso: " + tipoIngre);
        System.out.println("Preço unitário: R$ " + precoIngre);
        System.out.println("Quantidade: " + quantIngre);
        System.out.println("Valor total: R$ "+ (precoIngre*quantIngre));
    }
    public void realizarPagamento(double total) {
        while (true) {
            System.out.print("Escolha método de pagamento (Dinheiro/Cartão): ");
            String metodo = sc.nextLine();

            if (metodo.equalsIgnoreCase("dinheiro")) {
                while (true) {
                    System.out.print("Digite o valor pago: R$ ");
                    double valorPago = sc.nextDouble();
                    sc.nextLine();
                    if (valorPago >= total) {
                        double troco = valorPago - total;
                        System.out.printf("Pagamento aceito. Troco: R$ %.2f%n", troco);
                        break;
                    } else {
                        System.out.println("Valor insuficiente. Tente novamente.");
                    }
                }
                break;
                
            } else if (metodo.equalsIgnoreCase("cartão")) {
                System.out.println("Pagamento confirmado no cartão.");
                break;
            } else {
                System.out.println("Método inválido! Tente novamente.");
            }
        }
    }
}