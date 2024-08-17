package Clases;

public class Notas {
    private double[] notas = new double[15];
    private double highest;
    private double perc;
    private double avg;
    private double lowest = 5.0;
    private int lowestIndex;

    public void setNotas(int pos, double num) {
        notas[pos] = num;
    }

    public void calcHighest() {
        for (int i = 0; i <= 14; i++) {
            if (notas[i] > highest) {
                highest = notas[i];
            }
        }
    }

    public void calcPerc() {
        double counter = 0;
        for (int i = 0; i <= 14; i++) {
            if (notas[i] >= 3.0) {
                counter = counter + 1;
            }
        }
        perc = (counter / 15) * 100;
    }

    public void calcAvg() {
        double suma = 0;
        for (int i = 0; i <= 14; i++) {
            suma = suma + notas[i];
        }
        avg = suma / 15;
    }

    public void calcLowest() {
        for (int i = 0; i <= 14; i++) {
            if (notas[i] < lowest) {
                lowest = notas[i];
                lowestIndex = i;
            }
        }
    }

    public double getHighest() {
        return highest;
    }

    public double getPerc() {
        return perc;
    }

    public double getAvg() {
        return avg;
    }

    public int getLowest() {
        return lowestIndex;
    }
}
