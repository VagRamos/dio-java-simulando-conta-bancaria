import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        System.out.println("Boas vindas ao sistema de cadastro de contas bancárias.\n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o número de sua conta: (XXXX)\n");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Por favor, digite o número de sua agência: (XXX-X)\n");
        String numeroAgencia = scanner.nextLine();

        System.out.print("Por favor, digite o nome completo:\n");
        String nomeCliente = scanner.nextLine().toUpperCase();

        System.out.print("Por favor, digite o saldo da conta:\n");
        double saldoConta = scanner.nextDouble();

        Locale localeBrasil = new Locale("pt", "BR");
        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(localeBrasil);
        String saldoFormatado = formatoMoeda.format(saldoConta);

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo de %s%n já está disponível para saque.\n",
                nomeCliente, numeroAgencia, numeroConta, saldoFormatado);

        scanner.close();
    }
}