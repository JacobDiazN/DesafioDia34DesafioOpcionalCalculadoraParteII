package cl.jacob;

public class Calculadora {
    private float resultado;

    public float suma(float primerNumero, float segundoNumero){
        return primerNumero + segundoNumero;
    }

    public float resta(float primerNumero, float segundoNumero){
        return primerNumero - segundoNumero;
    }

    public float multiplicacion(float primerNumero, float segundoNumero){
        return primerNumero * segundoNumero;
    }

    public float division(float primerNumero, float segundoNumero) {
        if (segundoNumero == 0) {
            throw new ArithmeticException("El divisor debe ser distinto de 0");
        }
        return primerNumero / segundoNumero;
    }
}
