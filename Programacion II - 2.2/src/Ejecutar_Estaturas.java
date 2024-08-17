import Clases.Estaturas;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ejecutar_Estaturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Estaturas estaturas = new Estaturas();

        for (int i = 0; i <= 24; i++) {
            System.out.println("Ingrese la estatura #" + (i + 1) + ":");
            estaturas.setEstaturas(i, sc.nextDouble());
        }

        estaturas.setTallest();
        estaturas.setShortest();

        System.out.println("La estatura mas alta registrada es: " + estaturas.getTallest());
        System.out.println("La estatura mas baja registrada es: " + estaturas.getShortest());
    }
}