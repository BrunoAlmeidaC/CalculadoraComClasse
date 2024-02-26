import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculadora calculadoraComClasse = new Calculadora();

        Scanner input = new Scanner(System.in);
        char continuar = 'S';

        do {
            // Entradas do usuário
            System.out.print("Digite o primeiro número: ");
            double num1 = input.nextDouble();

            char operacao;

            if (num1 >= 0) {
                System.out.print("Digite a operação (+, -, *, /, ^ (potência), r (raiz quadrada), !): ");
                operacao = input.next().charAt(0);
            } else {
                System.out.print("Digite a operação (+, -, *, /, ^ (potência), r (raiz quadrada): ");
                operacao = input.next().charAt(0);

                if (operacao == 'r') {
                    // Se a operação for raiz quadrada, definir o segundo número como 0
                    System.out.println("A raiz quadrada de um número negativo será calculada como um número imaginário.");
                }
            }

            // Caso da raiz quadrada, onde apenas um número é necessário
            double num2 = 0;

            // Se não for raiz quadrada, pedir o segundo número
            if (operacao != 'r' && operacao != '!') {
                System.out.print("Digite o segundo número: ");
                num2 = input.nextDouble();
            }

            double resultado = calculadoraComClasse.calcular(num1, num2, operacao);

            System.out.println("Resultado da operação: " + resultado);

            System.out.print("Deseja realizar outra operação? (S/N): ");
            continuar = input.next().charAt(0);

        } while (continuar == 'S' || continuar == 's');
    }
}
