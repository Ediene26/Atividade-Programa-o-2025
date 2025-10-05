package Gestao_Veiculo;

//Sistema de cadastramento de veículos
public class Veiculo{
    protected String placa, marca;
    protected double preco;

    //Construtor vazio
    public Veiculo(){
    }
    //Construtor - vai inicializar os atributos para as próximas classes
    public Veiculo(String placa, String marca, double preco){
        this.placa = placa;
        this.marca = marca;
        this.preco = preco;
    }

    //Encapsulamento - get e set
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    //métodos - ações
    public void mostrarDados(){
        System.out.println("Placa: " + getPlaca());
        System.out.println("Marca: " + getMarca());
        System.out.printf("Preço: R$ %.2f", getPreco());
        System.out.println();
    }
    //Sobrecarga - mostra o preço com desconto
    public void mostrarDados(double DescoPreco){
        double DescoApli = getPreco() - (getPreco() * (DescoPreco / 100)); 
        System.out.println("Placa: " + getPlaca());
        System.out.println("Marca: " + getMarca());
        System.out.printf("Preço: %.2f%", getPreco());
        System.out.println();
        System.out.printf("Preço com %.2f%% de desconto: R$ %.2f", DescoPreco, DescoApli);
        System.out.println();
    }
}