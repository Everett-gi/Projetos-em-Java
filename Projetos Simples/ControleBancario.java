import java.util.Scanner;

public class ControleBancario {
    public static void main(String[] args) {
        String nome = "Arthur Morgan";
        String tipoConta = "Corrente";
        double saldo = 00.0;
        int opcao = 0;

        System.out.println("************************\n");
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo atual: ****");
        System.out.println("\n************************");

        String menuCliente = """
                ** Digite sua opção ""
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                """;

        Scanner Leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menuCliente);
            opcao = Leitura.nextInt();
        }
    }
}

