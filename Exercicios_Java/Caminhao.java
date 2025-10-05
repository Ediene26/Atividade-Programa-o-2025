package sistem_gestao_veic;

public class Caminhao extends Veiculo {
    private double capaciCarga;
    

    public Caminhao(){

    }
    //Construtor com os parâmetros da superclasse
    public Caminhao(String placa, String marca, double preco, double capaciCarga){
        super(placa, marca, preco);
        this.capaciCarga = capaciCarga;
    }

    public double getCapaciCarga() {
        return capaciCarga;
    }

    public void setCapaciCarga(double capaciCarga) {
        this.capaciCarga = capaciCarga;
    }

    @Override
    public void mostrarDados(){
        System.out.println("Dados do caminhão:");
        super.mostrarDados();
        System.out.println("Capacidade de carga: " + getCapaciCarga() + " toneladas");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
