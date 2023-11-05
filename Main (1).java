
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Digite a operação (1 para soma, 2 para subtração, 3 para multiplicação, 4 para divisão): ");
        int operacao = scanner.nextInt();

        Calculadora calculadora = new Calculadora();
        calculadora.setNumero1(numero1);
        calculadora.setNumero2(numero2);

        switch (operacao) {
            case 1:
                calculadora.setOperacao(Operacao.SOMA);
                break;
            case 2:
                calculadora.setOperacao(Operacao.SUBTRAÇÃO);
                break;
            case 3:
                calculadora.setOperacao(Operacao.MULTIPLICAÇÃO);
                break;
            case 4:
                calculadora.setOperacao(Operacao.DIVISÃO);
                break;
        }

        double resultado = calculadora.calcular();

        System.out.println("O resultado é: " + resultado);
    }

}