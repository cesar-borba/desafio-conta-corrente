import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "César";
        String tipoConta = "Corrente";
        double saldo = 2999.99;
        double transfer = 0;
        int opcao = 0;

        System.out.println("************************");
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println(String.format("Saldo atual: R$ %.2f", saldo));
        System.out.println("************************");

        String menu = """
                
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();
            switch (opcao) {

                case 1:
                    System.out.println(String.format("Saldo: R$ %.2f", saldo));
                    break;

                case 2:
                    System.out.println("Valor que será transferido: ");
                    transfer = leitura.nextDouble();
                    if (transfer > saldo || transfer <= 0) {
                        System.out.println("A transferência não pôde ser efetuada.");
                    }
                    else {
                        saldo -= transfer;
                        System.out.println("Transferência concluída!");
                    }
                    break;

                case 3:
                    System.out.println("Valor que será recebido: ");
                    transfer = leitura.nextDouble();
                    if (transfer <= 0) {
                        System.out.println("O recebimento não pôde ser efetuado.");
                    }
                    else {
                        saldo += transfer;
                        System.out.println("Recebimento concluído!");
                    }
                    break;

                case 4:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;

            }
        }
    }
}