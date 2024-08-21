import Clases.Operaciones;

import java.util.Scanner;

public class Ejecutar_Operaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Operaciones ops = new Operaciones();

        System.out.println("Ingrese el numero 1: ");
        ops.setNum1(sc.nextInt());

        System.out.println("Ingrese el numero 2: ");
        ops.setNum2(sc.nextInt());

        int seleccion;

        System.out.println("Elija una opcion: ");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        seleccion = sc.nextInt();

        switch (seleccion) {
            case 1:
                ops.suma();
                break;
            case 2:
                ops.resta();
                break;
            case 3:
                ops.multiplicacion();
                break;
            default:
                System.out.println("Opcion no valida");
        }

        System.out.println("El resultado es: " + ops.getResultado());

    }
}