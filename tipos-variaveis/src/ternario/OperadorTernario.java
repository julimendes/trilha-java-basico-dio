package ternario;

public class OperadorTernario {
    public static void main(String[] args) {
        int a, b;
        a = 6;
        b = 6;
        String resultado = a == b ? "verdadeiro" : "falso";
        /*
         * EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
         * if (a == b)
         * resultado = "verdadeiro";
         * else
         * resultado = "falso";
         * System.out.println(resultado);
         */
        System.out.println(resultado);
        resultado = a + b == 12 ? "verdadeiro" : "falso";
        System.out.println(resultado);

        a = 5;
        b = 4;
        resultado = a + b == 12 ? "verdadeiro" : "falso";
        System.out.println(resultado);
        // DA MESMA FORMA PODERIA SE USAR UMA VARIAVEL TIPO INT, RETORNANDO NUMEROS AO
        // INVES DE TEXTO//

    }

}
