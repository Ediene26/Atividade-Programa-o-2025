package Gestao_Veiculo;

public class Moto extends Veiculo{
    private int cilindradas;

    //Construtor vazio: iniciei assim pro usuário cadastrar a moto no maain
    public Moto(){
    }
    //Construtor com parâmetros
    public Moto (String placa, String marca, double preco, int cilindradas){
        super(placa, marca, preco);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }
    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
    
    @Override
    public void mostrarDados(){
        System.out.println("Dados da moto:");
        super.mostrarDados();
        System.out.println("Cilindradas da moto: " + getCilindradas() + "cc");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    //Sobrecarga - visualização de cilindradas em cavalo de potencia ou cilindradas
    //Conversão de Cilindradas para cavalos = litro * 0,736. CV - Cavalos de potência, CC - cilindradas
    public void mostrarDados(boolean escolhaCiPoten){
        super.mostrarDados();
        if (escolhaCiPoten){
            System.out.printf("Cilindradas em Cavalos de Potência: %.2f CV", (getCilindradas() * 0.736));
            System.out.println();
        }else{
            System.out.println("Cilindradas da moto: " + getCilindradas() + "cc");
        }
    }
}