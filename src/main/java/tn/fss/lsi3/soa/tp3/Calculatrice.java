package tn.fss.lsi3.soa.tp3;

public class Calculatrice {

    public double somme(double a, double b) {
        return a + b;
    }

    public double difference(double a, double b) {
        return a - b;
    }

    public double produit(double a, double b) {
        return a * b;
    }

    public double quotient(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division par zéro impossible");
        }
        return a / b;
    }
}
