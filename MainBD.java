public class MainBD {
    public static void main(String[] args){
        contaBD conta = new contaBD();

        conta.setTitular("Ediene");
        conta.setNumCon(123456);
        conta.setSaldo(200.00);

        System.out.println("Dados bancários do usuário:");
        System.out.println("Titular da conta: "+ conta.getTitular());
        System.out.println("Número da conta: "+ conta.getNumCon());
        System.out.printf("Saldo da conta:R$ . "+ conta.getSaldo());

        //Teste de depósito
        conta.depositar(400.00);
        System.out.println("Saldo atual:R$ " + conta.getSaldo());

        //Teste de saque
        conta.sacar(352.50);
        System.out.println("Saldo atual:R$ " + conta.getSaldo());

    }
}
//Nota: fazer com que o usuário digite o valor sozinho
//E colocar dentro de uma estrutura de repetião até ousuário socilitar sair
