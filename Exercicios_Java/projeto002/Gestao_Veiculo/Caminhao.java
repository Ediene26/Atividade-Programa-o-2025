package Gestao_Veiculo;

public class Caminhao extends Veiculo {
    private double capaciCarga;
    
    //Construtor vazio
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
    public void mostrarDados(boolean VisuTipoCarga){
        super.mostrarDados();
        double cargaKg = getCapaciCarga() * 1000;
        if(VisuTipoCarga){
            System.out.println("Capacidade da carga em " + cargaKg + "Kg");
        }else{
            System.out.println("Capacidade da carga em: " + getCapaciCarga() + " toneladas");
        }
    }
}
