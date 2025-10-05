package Gestao_Bancaria;

public class Conta {
    protected String numero, titular;
    protected double saldo;

    public Conta(){
    }
    
    //Construtor
    public Conta(String numero, String titular, double saldo){
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    //Métodos get e set
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void mostrarDados(){
        System.out.println("----DADOS BANCÁRIOS----");
        System.out.println("Número da conta: " + getNumero());
        System.out.println("Títular da conta: " + getTitular());
        System.out.printf("Saldo da conta: R$ %.2f", getSaldo());
        System.out.println();
    }

}
