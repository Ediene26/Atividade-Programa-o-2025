/*Por partes: 
1 - criar duas classes, uma 'Main' (central), e uma com os atributos que serão utilizados
2 - implementar os get e set nos atributos para acesso controlado
3 - Criar os métodos (funções) e colocar os parâmetros dentro dos métodos: depositar e sacar
*/
public class contaBD {
    private String titular;
    private int NumCon;
    private double saldo;    
    //get e set implementados
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public int getNumCon() {
        return NumCon;
    }
    public void setNumCon(int numCon) {
        NumCon = numCon;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //Métodos: depositar(), sacar()
    public void depositar(double valor){
        if(valor > 0){
            this.saldo += valor; //atualiza o valor
            System.out.println("Depósito de R$ " + valor + ", realizado com sucesso!");
        }
    }
    public void sacar(double valor){
        if (valor <= 0){
            System.out.println("Valor inválido para saque!");
        }else if (valor > saldo){
            System.out.println("Saque indispónivel, saldo insuficiente.");
        }else{
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + ", realizado com sucesso!");
        }
    }
}
