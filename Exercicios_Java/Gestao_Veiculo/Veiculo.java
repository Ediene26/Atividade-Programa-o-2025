package sistem_gestao_veic;

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
        System.out.println("Preço: " + getPreco());
    }
}
