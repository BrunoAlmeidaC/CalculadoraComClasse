public class Calculadora {
    private double soma(double num1, double num2) {
        return num1 + num2;
    }

    private double subtracao(double num1, double num2) {
        return num1 - num2;
    }

    private double multiplicacao(double num1, double num2) {
        return num1 * num2;
    }

    private double divisao(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            return Double.NaN;
        }
    }
    private double potencia(double base, double expoente) {
        return Math.pow(base, expoente);
    }
    private double raizQuadrada(double num1){
        return (num1 >= 0) ? Math.sqrt(num1) : Math.sqrt(Math.abs(num1)) * Math.signum(num1);
    }
    private double fatorial(double num1) {
        if (num1 < 0) {
            return Double.NaN;
        } else if (num1 == 0 || num1 == 1) {
            return 1;
        } else {
            double resultado = 1;
            for (int i = 2; i <= num1; i++) {
                resultado *= i;
            }
            return resultado;
        }
    }

    public double calcular(double num1, double num2, char operacao) {
        return switch (operacao) {
            case '+' -> soma(num1, num2);
            case '-' -> subtracao(num1, num2);
            case '*' -> multiplicacao(num1, num2);
            case '/' -> divisao(num1, num2);
            case '^' -> potencia(num1, num2);
            case 'r' -> raizQuadrada(num1);
            case '!' -> fatorial(num1);
            default -> Double.NaN;
        };
    }

}
