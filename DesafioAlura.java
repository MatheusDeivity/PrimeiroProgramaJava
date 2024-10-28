import java.util.Scanner;

public class DesafioAlura {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome = "Jacqueline Oliveira";
        String tipoConta = "Corrente";
        double saldoInicial = 2500.00;
        int opc = 0;

        System.out.println("********************************************");
        System.out.println("\nNome: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo inicial: " + "R$" + saldoInicial);
        System.out.println("\n********************************************");

        String menu = """
                **Operações:**
                Digite sua opção
                1- Ver saldo
                2- Transeferir dinheiro
                3- Receber dinheiro
                4- Sair
                
                """;

        while (opc != 4) {
            System.out.println(menu);
            opc = ler.nextInt();


            if (opc == 1) {
                System.out.println("Seu saldo é R$ " + saldoInicial);
            } else if (opc == 2) {
                System.out.println("Qual valor deseja transferir? ");
                double valor = ler.nextDouble();
                if (valor > saldoInicial) {
                    System.out.println("Não há saldo para realizar a transferência");
                } else {
                    saldoInicial -= valor;
                    System.out.println("Saldo atualizado R$ " + saldoInicial);
                }
            } else if (opc == 3) {
                System.out.println("Qual valor deseja receber? ");
                double valor = ler.nextDouble();
                saldoInicial += valor;
                System.out.println("Transferencia realizada, seu saldo autual é de: R$ " + saldoInicial);
            } else if (opc != 4) {
                System.out.println("Opçao inválida");

            }
        }
        ler.close();
    }
}

