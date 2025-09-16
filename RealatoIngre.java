/*Relatório acumulado: consta tudo.
Total de ingressos;
Quantidade por tipo (inteira, meia, promocional, gratuitos)
Valor total arrecadado (somente ingressos pagos)
Definir o método dinheiro e cartão
*/
public class RealatoIngre {
    private int totalIngressos = 0;
    private int totalInteira = 0;
    private int totalMeia = 0;
    private int totalPromocional = 0;
    private int totalGratuito = 0;
    private double valorTotal = 0.0;

    public void atualizar(Ingresso ingresso, double totalVenda) {
        totalIngressos += ingresso.getQuantIngre();
        String tipo = ingresso.getTipoIngre().toLowerCase();

        if (tipo.equals("inteira")) totalInteira += ingresso.getQuantIngre();
        else if (tipo.equals("meia")) totalMeia += ingresso.getQuantIngre();
        else if (tipo.equals("promocional")) totalPromocional += ingresso.getQuantIngre();
        else if (tipo.equals("gratuito")) totalGratuito += ingresso.getQuantIngre();

        valorTotal += totalVenda;
    }
    public void imprimir() {
    System.out.println("\n=== RELATÓRIO FINAL ===");
    System.out.println("Total de ingressos vendidos: " + totalIngressos);
    System.out.println("Inteira: " + totalInteira);
    System.out.println("Meia: " + totalMeia);
    System.out.println("Promocional: " + totalPromocional);
    System.out.println("Gratuitos: " + totalGratuito);
    System.out.printf("Total arrecadado: R$ %.2f%n", valorTotal);
    }
}
