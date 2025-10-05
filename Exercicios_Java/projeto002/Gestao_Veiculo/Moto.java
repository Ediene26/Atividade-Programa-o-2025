package sistem_gestao_veic;

public class Moto extends Veiculo{
    private int cilindradas;

    //Construtor vazio: iniciei assim pro usuário cadastrar a moto no maain
    public Moto(){

    }

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
        System.out.println("Cilindradas da moto: " + getCilindradas());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
