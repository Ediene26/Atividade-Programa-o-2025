package Gestao_Bancaria;

public class ContaInvestimento extends Conta{
    private double taxaAdministracao;

    public ContaInvestimento(){
    }

    public ContaInvestimento(String numero, String titular, double saldo, double taxaAdministracao){
     super(numero, titular, saldo);
     this.taxaAdministracao = taxaAdministracao;
    }

    public double getTaxaAdministracao() {
        return taxaAdministracao;
    }
    public void setTaxaAdministracao(double taxaAdministracao) {
        this.taxaAdministracao = taxaAdministracao;
    }

    @Override
    public void mostrarDados(){
        super.mostrarDados();
        System.out.println("Taxa de administração: %.2f" + getTaxaAdministracao() + "%");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    //Sobrecarga
    public void mostrarDados(boolean considerarTaxa){
        if(considerarTaxa){
            System.out.printf("Saldo com desconto da taxa ADM: R$ %.2f", (getSaldo() - getTaxaAdministracao()));
            System.out.println();
        } else{
            System.out.printf("Saldo sem desconto: R$ %.2f", getSaldo());
            System.out.println();
        }
    }
}
