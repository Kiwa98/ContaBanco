import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor insira o numero da Conta: ");
        int numero = scan.nextInt();

        System.out.println("Por favor insira o numero da agencia: ");
        String agencia = scan.next();

        System.out.println("Por favor insira o seu nome: ");
        String nome = scan.next();

        System.out.println("Digite o Saldo: ");

        double saldo = scan.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " Já está disponivel para saque." );

        }

}
