package Clases;

public class Operaciones {
    private int num1;
    private int num2;
    private int resultado;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void suma() {
        resultado = num1 + num2;
    }

    public void resta() {
        resultado = num1 - num2;
    }

    public void multiplicacion() {
        resultado = num1 * num2;
    }

    public int getResultado() {
        return resultado;
    }
}
