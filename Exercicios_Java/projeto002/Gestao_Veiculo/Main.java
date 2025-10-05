package Gestao_Veiculo;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Locale;

public class Main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    sc.useLocale(Locale.US);
    ArrayList<Veiculo> estoque = new ArrayList<>(); //Criando uma lista vazia para os veiculos cadastrados

    //Menu de seleção
    while(true){
        System.out.println("------- MENU DE CADASTRAMENTO -------");
        System.out.println("Digite o tipo de veículo para o cadastro:");
        System.out.println("-Carro-");
        System.out.println("-Moto-");
        System.out.println("-Caminhao-");
        System.out.println("Listar"); // mostra os veículos cadastrados
        System.out.println("Encerrar");
        String escolha = sc.nextLine().toLowerCase();

        if (escolha.equals("encerrar")){
            System.out.println("Programa encerrado. Tenha uma boa semana!");
            break;
        }
        if (escolha.equals("carro")){
            Carro novoCarro = new Carro();

            System.out.println("---- CARRO ----");
            System.out.print("Informe a marca do carro: ");
            novoCarro.setMarca(sc.nextLine());

            System.out.print("Informe a placa do carro: ");
            novoCarro.setPlaca(sc.nextLine());
            
            System.out.print("Informe o preço do carro: ");
            novoCarro.setPreco(sc.nextDouble());

            System.out.print("Informe a quantidade de portas: ");
            novoCarro.setNumPortas(sc.nextInt());
            sc.nextLine();

            System.out.print("Deseja visualizar a quantide de portas? ");
            String respostaUso = sc.nextLine().toLowerCase();
            boolean visu = respostaUso.equalsIgnoreCase("s") || respostaUso.equalsIgnoreCase("sim");
            
            novoCarro.mostrarDados(visu);
            estoque.add(novoCarro);
        }
        else if(escolha.equals("moto")){
            Moto novaMoto = new Moto();

            System.out.println("---- MOTO ----");
            System.out.print("Informe a marca da moto: ");
            novaMoto.setMarca(sc.nextLine());

            System.out.print("Informe a placa da moto: ");
            novaMoto.setPlaca(sc.nextLine());

            System.out.print("Informe o preço da moto: ");
            novaMoto.setPreco(sc.nextDouble());

            System.out.print("Informe a quantidade de cilindradas: ");
            novaMoto.setCilindradas(sc.nextInt());
            sc.nextLine();

            System.out.print("Deseja visualizar os cavalos de potência da moto? ");
            String respostaUso = sc.nextLine().toLowerCase();
            boolean visu = respostaUso.equalsIgnoreCase("s") || respostaUso.equalsIgnoreCase("sim");
            
            novaMoto.mostrarDados(visu);
            estoque.add(novaMoto);
            
        }
        else if (escolha.equals("caminhao")){
            Caminhao novoCaminhao = new Caminhao();

            System.out.println("---- CAMINHÃO ----");
            System.out.print("Informe a marca do caminhão: ");
            novoCaminhao.setMarca(sc.nextLine());

            System.out.print("Informe a placa do caminhão: ");
            novoCaminhao.setPlaca(sc.nextLine());

            System.out.print("Informe o preço do caminhão: ");
            novoCaminhao.setPreco(sc.nextDouble());

            System.out.print("Informe a carga do caminhão: ");
            novoCaminhao.setCapaciCarga(sc.nextDouble());
            sc.nextLine();

            System.out.print("Deseja visualizar a carga em quilogramas? ");
            String respostaUso = sc.nextLine().toLowerCase();
            boolean visu = respostaUso.equalsIgnoreCase("s") || respostaUso.equalsIgnoreCase("sim");

            novoCaminhao.mostrarDados(visu);
            estoque.add(novoCaminhao);
            
        }
        else if (escolha.equals("listar")){
            if (estoque.isEmpty()){
                System.out.println("Nenhum veículo cadastrado no estoque!");
            }else {
                System.out.println("-------- VEICULOS CADASTRADOS --------");
                for(Veiculo q: estoque){
                q.mostrarDados();
                }
        }
    }
    }
    sc.close();   
    }
}