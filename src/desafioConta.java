import java.sql.SQLOutput;
import java.util.Scanner;

public class desafioConta {
    public static void main(String[] args) {
        String nome = "Léo Rosembauer";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int opcao = 0;

        System.out.println("******************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n******************");

        String menu = """
                ** Digite uma opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                                
                """;

        Scanner leitura = new Scanner(System.in);
        while (opcao != 4) { // enquanto a opcao não for a 4 exibir menu
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 4) { // se a opcao desejada for a 4 imprimir msg abaixo
                System.out.println("Obrigado por usar nosso serviço bancário");
            }

            if (opcao == 1) { // se opcao for a 1 exibir msg abaixo
                System.out.println("O saldo atualizado é " + saldo);
            } else if (opcao == 2) { // senão exbir msg abaixo
                System.out.println("Qual valor deseja transferir?");
                double valor = leitura.nextDouble();
                if (valor > saldo) { // se o valor de transferencia for maior que o saldo exibir msg abaixo
                    System.out.println("Não há saldo suficiente para está operação");
                } else { // senão executar operacao saldo menos valor de transferencia
                    saldo = saldo - valor;
                    System.out.println("Novo saldo:" + saldo);
                }
            } else if (opcao == 3) {// se operacao for de receber executar operacao saldo + valor
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo = saldo + valor;
                System.out.println("Novo saldo:" + saldo);
            } else if (opcao != 4) { // se executar opcao fora do menu exibir msga abaixo
                System.out.println("Opção inválida");
            }
        }
    }
}
