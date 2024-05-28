import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o seu número: ");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite apenas os número da sua Agència: ");
        int agencia = scanner.nextInt();

        System.out.println("Por favor, digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Por favor, digite o seu saldo: ");
        double saldo = scanner.nextDouble();
        
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$ 152"+ saldo + " já está disponível para saque.");
    }
}
