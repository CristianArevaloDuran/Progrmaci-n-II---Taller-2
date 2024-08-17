package Clases;

public class Estaturas {
    private double[] estaturas = new double[25];
    private double tallest;
    private double shortest;

    public void setEstaturas(int pos, double num) {
        estaturas[pos] = num;
    }

    public void setTallest() {
        tallest = 0;
        for (int i = 0; i <= 24; i++) {
            if (estaturas[i] > tallest) {
                tallest = estaturas[i];
            }
        }
    }

    public void setShortest() {
        shortest = Double.MAX_VALUE;
        for (int i = 0; i <= 24; i++) {
            if (estaturas[i] < shortest) {
                shortest = estaturas[i];
            }
        }
    }

    public double getTallest() {
        return tallest;
    }

    public double getShortest() {
        return shortest;
    }
}
