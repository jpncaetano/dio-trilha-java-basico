import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da agência: ");
        String agencia = sc.nextLine();

        System.out.println("Por favor, digite o número da conta: ");
        int numeroConta = sc.nextInt();
        sc.nextLine(); // consumo da próxima linha

        System.out.println("Por favor, digite o nome do cliente: ");
        String nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o valor do deposito: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá, " + nomeCliente + "! Obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo de R$" + saldo + " já está disponível para saque.");
    }
}