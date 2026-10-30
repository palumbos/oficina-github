package cauculadora;

import java.util.Scanner;

class Calculadora {

    public int somar(int a, int b) {
        return a + b;
    }

    public int subtrair(int a, int b) {
        return a - b;
    }
}

public class Main {

    public static void main(String[] args) {
        int opcao, n1, n2, resultado = 0;

        Scanner input = new Scanner(System.in);

        Calculadora calc = new Calculadora();

        System.out.println("Digite o primeiro numero para fazer a operação: ");
        n1 = input.nextInt();

        System.out.println("Digite o segundo numero para fazer a operação: ");
        n2 = input.nextInt();

        System.out.println("""
                           Digite o numero do cáuculo que voce deseja fazer:
                           1- Soma.
                           2- Subtração.
                           """);
        opcao = input.nextInt();
        while (opcao < 1 || opcao > 2) {
            System.out.println("""
                           Opcao Invalida, Tente novamente!!!:
                           1- Soma.
                           2- Subtração.
                           """);
            opcao = input.nextInt();
        }

        switch (opcao) {

            case 1:
                resultado = calc.somar(n1, n2);

                break;

            case 2:
                resultado = calc.subtrair(n1, n2);

                break;

        }
        System.out.println(resultado);
        input.close();
    }
}
