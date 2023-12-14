package concatenacao;

public class OperadoresConcatenacao {
    public static void main(String[] args) {
        String nomeCompleto = "Linguagem" + " Java";
        System.out.println(nomeCompleto);
        String concatenacao = "?";
        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);
        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao);
        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao);
        concatenacao = "1" + (1 + 1 + 4);
        System.out.println(concatenacao);
    }
}
