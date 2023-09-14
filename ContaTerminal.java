import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        int numero  = 0; 
        double saldo = 0;
        String nomeCliente, agencia;
        
        System.out.println("Por favor, digite o número da agência: ");
        agencia = entrada.nextLine();

        System.out.println("Digite o seu nome: ");
        nomeCliente = entrada.nextLine();

        System.out.println("Digite o número da sua conta: ");
        numero = entrada.nextInt();

        System.out.println("Digite o saldo que quer sacar: ");
        saldo = entrada.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$ %.g2f já está disponível para saque." ,nomeCliente, agencia, numero, saldo);
        
    }
    
}
