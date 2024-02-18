import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner conta = new Scanner(System.in);

        // TODO:Conhecer e importar a classe scanner

        // TODO:Exibir as mensagens para nosso usuário

        // TODO:Obter pela scanner os valores digitados no terminal

        // TODO:Exibir a mensagem conta criada

        System.out.println("Seja bem vindo, digite o número da conta");

        int numero = conta.nextInt();

        System.out.println("Agora, informe o número da agência");

        String agencia = conta.next();

        System.out.println("Informe seu nome ");

        String nome = conta.next();

        double saldo = 237.48;

        System.out.println(" Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + numero + " e seu saldo R$ " + saldo + " já está disponível para saque.");

        System.out.println("Conta criada com sucesso");

    }
}
