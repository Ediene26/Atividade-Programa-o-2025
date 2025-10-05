package Gestao_Bancaria;

import java.util.Scanner;
import java.util.Locale;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    sc.useLocale(Locale.US);
    ArrayList<Conta> cadastro = new ArrayList<>();

    while(true){
        System.out.println("------ MENU DE CADASTRO BANCÁRIO ------");        
        System.out.println("Selecione o tipo de conta (1, 2, 3):");
        System.out.println("1 - Conta-Corrente");
        System.out.println("2 - Conta-Poupança");
        System.out.println("3 - Conta-Investimento");
        System.out.println("4 - Listar contas");
        System.out.println("0 - Encerrar cadastro");
        
        int escolha = sc.nextInt();
        sc.nextLine();

        if(escolha == 0){
            System.out.println("Sistema encerrado! Tenha uma ótima semana!");
            break;
        }
        if(escolha == 1){
            System.out.println("Conta-Corrente selecionada!");
            ContaCorrente novaContaCorrente = new ContaCorrente();
            //Quero que o usuário digite o numero da conta
            System.out.print("Digite o número da conta: ");
            novaContaCorrente.setNumero(sc.nextLine());

            System.out.print("Digite o titular da conta: ");
            novaContaCorrente.setTitular(sc.nextLine());

            System.out.print("Digite o saldo da conta: ");
            novaContaCorrente.setSaldo(sc.nextDouble());

            System.out.print("Digite o limite de cheque: ");
            novaContaCorrente.setLimChequeEspeci(sc.nextDouble());
            sc.nextLine();
            
            System.out.print("Deseja visualizar o saldo com o limite do cheque? ");
            String respostaUsu = sc.nextLine().toLowerCase(); //entrada para manipular o booleano
            boolean detalhes = respostaUsu.equalsIgnoreCase("s") || respostaUsu.equalsIgnoreCase("sim");
            // ↑ - booleano sendo manipulado com a entrada do usuário

            novaContaCorrente.mostrarDados(detalhes);
            cadastro.add(novaContaCorrente);        
        }
        else if (escolha == 2){
            System.out.println("Conta-Poupança selecionada!");
            ContaPoupanca novaContaPoupanca = new ContaPoupanca();
            
            System.out.print("Digite o número da conta: ");
            novaContaPoupanca.setNumero(sc.nextLine());

            System.out.print("Digite o títular da conta: ");
            novaContaPoupanca.setTitular(sc.nextLine());

            System.out.print("Digite o saldo da conta: ");
            novaContaPoupanca.setSaldo(sc.nextDouble());

            System.out.print("Digite a taxa de rendimento mensal: ");
            novaContaPoupanca.setTaxaRendimentoMensal(sc.nextDouble());
            sc.nextLine();

            System.out.print("Deseja visualizar a taxa de rendimento anual? ");
            String respostaUsu = sc.nextLine().toLowerCase(); //deixando a entrada em minúsculo para padronizar
            boolean taxa = respostaUsu.equalsIgnoreCase("s") || respostaUsu.equalsIgnoreCase("sim");

            novaContaPoupanca.mostrarDados(taxa);
            cadastro.add(novaContaPoupanca);
        }
        else if (escolha == 3){
            System.out.println("Conta-Investimento selecionada!");
            ContaInvestimento novaContaInvestimento = new ContaInvestimento();

            System.out.print("Digite o número da conta: ");
            novaContaInvestimento.setNumero(sc.nextLine());

            System.out.print("Digite o titular da conta: ");
            novaContaInvestimento.setTitular(sc.nextLine());

            System.out.print("Digite o saldo da conta: ");
            novaContaInvestimento.setSaldo(sc.nextDouble());

            System.out.print("Digite a taxa de administração: ");
            novaContaInvestimento.setTaxaAdministracao(sc.nextDouble());
            sc.nextLine();

            System.out.print("Deseja visualizar o saldo com desconto da taxa de administração? ");
            String respostaUsu = sc.nextLine().toLowerCase();
            boolean taxaADM = respostaUsu.equalsIgnoreCase("s") || respostaUsu.equalsIgnoreCase("sim");
            
            novaContaInvestimento.mostrarDados(taxaADM);
            cadastro.add(novaContaInvestimento);
        }
        else if (escolha == 4){
            if (cadastro.isEmpty()){
                System.out.println("Nenhuma conta bancária está cadastrada!");
        }else{
            System.out.println("-------- CONTAS CADASTRADAS --------");
            for(Conta c: cadastro){
                c.mostrarDados();
            }
        }
    }
    }
    sc.close();
    }
}
