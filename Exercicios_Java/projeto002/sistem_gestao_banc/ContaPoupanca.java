package sistem_gestao_banc;

public class ContaPoupanca extends Conta{
    private double taxaRendimentoMensal;

    public ContaPoupanca(){
    }

    public ContaPoupanca(String numero, String titular, double saldo, double taxaRendimentoMensal){
        super(numero, titular, saldo); //atributos que vem da superClasse
        this.taxaRendimentoMensal = taxaRendimentoMensal; //atributo dessa subClasse
    }

    public double getTaxaRendimentoMensal() {
        return taxaRendimentoMensal;
    }
    public void setTaxaRendimentoMensal(double taxaRendimentoMensal) {
        this.taxaRendimentoMensal = taxaRendimentoMensal;
    }
    
    @Override
    public void mostrarDados(){
        super.mostrarDados();
        System.out.println("Taxa de rendimento mensal: %.2f" + getTaxaRendimentoMensal() + "%");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    public void mostrarDados(boolean taxaAnual){
        super.mostrarDados();
        if(taxaAnual){
            System.out.printf("Taxa de rendimento anual aproximada: %.2f%%" , (getTaxaRendimentoMensal() * 12));
            System.out.println();
        }else{
            System.out.println("Taxa de rendimento mensal: %.2f" + getTaxaRendimentoMensal() + "%");
            System.out.println();
        }
    }
}
