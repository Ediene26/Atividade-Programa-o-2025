package Gestao_Bancaria;

public class ContaCorrente extends Conta{
    private double limChequeEspeci;

    public ContaCorrente(){
    }

    public ContaCorrente(String numero, String titular, double saldo, double limChequeEspeci){
        super(numero, titular, saldo);
        this.limChequeEspeci = limChequeEspeci;
    }

    public double getLimChequeEspeci() {
        return limChequeEspeci;
    }
    public void setLimChequeEspeci(double limChequeEspeci) {
        this.limChequeEspeci = limChequeEspeci;
    }
    
    @Override
    public void mostrarDados(){
        super.mostrarDados();
        System.out.printf("Limite do cheque especial: R$ %.2f", getLimChequeEspeci());
        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    //Sobrecarga
    public void mostrarDados(boolean detalharLimite){
        super.mostrarDados();
        if(detalharLimite){
            System.out.printf("Saldo com o limite do cheque: R$ %.2f", (getSaldo() + getLimChequeEspeci()));
            System.out.println();
        }else{
            System.out.printf("Saldo sem limite: R$ %.2f", getSaldo());
            System.out.println();
        }
    }
}