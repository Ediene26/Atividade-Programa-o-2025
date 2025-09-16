import java.util.Scanner;

public class Ingresso {
    private String tipoIngre;
    private double precoBase = 30.0;
    private double precoIngre;
    private int quantIngre;
    private int idadeCli;

    Scanner sc = new Scanner(System.in);

    // Getters e Setters
    public String getTipoIngre() { return tipoIngre; }
    public void setTipoIngre(String tipoIngre) { this.tipoIngre = tipoIngre; }

    public int getQuantIngre() { return quantIngre; }
    public void setQuantIngre(int quantIngre) { this.quantIngre = quantIngre; }

    public int getIdadeCli() { return idadeCli; }
    public void setIdadeCli(int idadeCli) { this.idadeCli = idadeCli; }

    // Calcula total e retorna valor
    public double calcularTotal() {
        if (idadeCli < 5) {
            precoIngre = 0.0;
            tipoIngre = "Gratuito";
            System.out.println("Tipo de ingresso: " + tipoIngre);
        } else {
            while (true) {
                System.out.print("Informe o tipo de ingresso (Inteira, Meia, Promocional, Gratuito): ");
                tipoIngre = sc.nextLine();

                if (tipoIngre.equalsIgnoreCase("inteira")) {
                    precoIngre = precoBase;
                    break;
                } else if (tipoIngre.equalsIgnoreCase("meia")) {
                    precoIngre = precoBase * 0.5;
                    break;
                } else if (tipoIngre.equalsIgnoreCase("promocional")) {
                    precoIngre = precoBase * 0.7;
                    break;
                } else if (tipoIngre.equalsIgnoreCase("gratuito")) {
                    precoIngre = 0.0;
                    break;
                } else {
                    System.out.println("Tipo inválido! Tente novamente.");
                }
            }
        }

        System.out.print("Informe a quantidade de ingressos: ");
        quantIngre = sc.nextInt();
        sc.nextLine();

        double total = precoIngre * quantIngre;

        System.out.println("\n--- RESUMO ---");
        System.out.println("Idade: " + idadeCli);
        System.out.println("Tipo de ingresso: " + tipoIngre);
        System.out.println("Preço unitário: R$ " + precoIngre);
        System.out.println("Quantidade: " + quantIngre);
        System.out.printf("Valor total: R$ %.2f%n", total);

        return total;
    }

    // Pagamento
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