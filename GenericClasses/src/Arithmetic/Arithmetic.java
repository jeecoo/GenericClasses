package Arithmetic;


public class Arithmetic<NUM1 extends Number, NUM2 extends Number> {
    private final NUM1 n1;
    private final NUM2 n2;

    public Arithmetic(NUM1 n1, NUM2 n2){
        this.n1 = n1;
        this.n2 = n2;
    }

    public NUM1 getN1(){
        return n1;
    }

    public NUM2 getN2(){
        return n2;
    }

    public double add() {
        return n1.doubleValue() + n2.doubleValue();
    }

    public double subtract() {
        return n1.doubleValue() - n2.doubleValue();
    }

    public double multiply() {
        return n1.doubleValue() * n2.doubleValue();
    }

    public double divide() {
        double divisor = n2.doubleValue();
        if (divisor == 0) {
            throw new ArithmeticException("Error: Division by zero!");
        }
        return n1.doubleValue() / divisor;
    }

    public double getMin() {
        return Math.min(n1.doubleValue(), n2.doubleValue());
    }

    public double getMax() {
        return Math.max(n1.doubleValue(), n2.doubleValue());
    }
}
