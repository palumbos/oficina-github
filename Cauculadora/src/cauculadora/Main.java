package cauculadora;

import java.util.Scanner;

class Calculadora {

    public int somar(int a, int b) {
        return a + b;
    }

    public int subtrair(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public int dividir(int a, int b) {
        if (b == 0) {
            System.out.println("Erro: Divisão por zero!");
            return 0;
        }
        return a / b;
    }
}

public class Main {

    public static void main(String[] args) {
        int opcao, n1, n2, resultado = 0;

        Scanner input = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        System.out.println("Digite o primeiro número para fazer a operação: ");
        n1 = input.nextInt();

        System.out.println("Digite o segundo número para fazer a operação: ");
        n2 = input.nextInt();

        System.out.println("""
                           Digite o número do cálculo que você deseja fazer:
                           1- Soma.
                           2- Subtração.
                           3- Multiplicação.
                           4- Divisão.
                           """);
        opcao = input.nextInt();

        while (opcao < 1 || opcao > 4) {
            System.out.println("""
                               Opção Inválida, Tente novamente!!!:
                               1- Soma.
                               2- Subtração.
                               3- Multiplicação.
                               4- Divisão.
                               """);
            opcao = input.nextInt();
        }

        switch (opcao) {
            case 1 -> resultado = calc.somar(n1, n2);
            case 2 -> resultado = calc.subtrair(n1, n2);
            case 3 -> resultado = calc.multiplicar(n1, n2);
            case 4 -> resultado = calc.dividir(n1, n2);
        }

        System.out.println("Resultado: " + resultado);
        input.close();
    }
}
