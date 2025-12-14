package tn.fss.lsi3.soa.tp3;

public class Operation {
    private double val1;
    private double val2;
    private String type;
    private double result;

    public Operation() {}

    public Operation(double val1, double val2, String type, double result) {
        this.val1 = val1;
        this.val2 = val2;
        this.type = type;
        this.result = result;
    }

    public double getVal1() {
        return val1;
    }

    public void setVal1(double val1) {
        this.val1 = val1;
    }

    public double getVal2() {
        return val2;
    }

    public void setVal2(double val2) {
        this.val2 = val2;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
