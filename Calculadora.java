import java.math.BigDecimal;

public class Calculadora {

    private double numero1;
    private double numero2;
    private Operacao operacao;

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public void setOperacao(Operacao operacao) {
        this.operacao = operacao;
    }

    public double calcular() {
        double resultado = 0;

        switch (operacao) {
            case SOMA:
                resultado = numero1 + numero2;
                break;
            case SUBTRAÇÃO:
                resultado = numero1 - numero2;
                break;
            case MULTIPLICAÇÃO:
                resultado = numero1 * numero2;
                break;
            case DIVISÃO:
                resultado = numero1 / numero2;
                break;
        }

        return resultado;
    }

    public double raizQuadrada() {
        return Math.sqrt(numero1);
    }

    public double potencia(double expoente) {
        return Math.pow(numero1, expoente);
    }

}