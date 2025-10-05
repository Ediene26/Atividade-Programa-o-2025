package sistem_gestao_veic;

public class Carro extends Veiculo{
    private int numPortas;

    public Carro(){
        super();
    }
    public Carro (String placa, String marca, double preco, int numPortas){
        super(placa, marca, preco); //Vindo da superclasse
        this.numPortas = numPortas;
    }

    //Encapsulamento
    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }
    
    //Métodos - sobrescrita
    @Override
    public void mostrarDados(){
        System.out.println("Dados do carro:");
        super.mostrarDados();
        System.out.println("Número de portas do carro: " + getNumPortas());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}