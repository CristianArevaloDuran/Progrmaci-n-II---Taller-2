import Clases.Notas;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ejecutar_Calculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Notas notas = new Notas();

        for (int i = 0; i <= 14; i++) {
            System.out.println("Ingrese la nota #" + (i + 1) + ":");
            notas.setNotas(i, sc.nextDouble());
        }

        notas.calcHighest();
        notas.calcPerc();
        notas.calcAvg();
        notas.calcLowest();

        System.out.println("La nota mas alta es: " + notas.getHighest());
        System.out.println("El porcentaje de alumnos que obtuvieron 3.0 o mas es: " + notas.getPerc() + "%");
        System.out.println("El promedio de las notas es: " + notas.getAvg());
        System.out.println("La nota mas baja se encuentra en la posicion " + (notas.getLowest() + 1) + " del arreglo");
    }
}