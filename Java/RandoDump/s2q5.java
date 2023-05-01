package pocket;

public class s2q5 {
    public static void main(String[] args) {
        ComplexNumber x = new ComplexNumber(10, 8);
        ComplexNumber y = new ComplexNumber(0, 0);
        x.isSame(y);
    }
}

class ComplexNumber{

    private double real;
    private double imag;

    ComplexNumber(){
        this.real = 0;
        this.imag = 0;
    }

    ComplexNumber(double r,double i){
        this.real = r;
        this.imag = i;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imag;
    }

    public boolean isSame(ComplexNumber c) {
        return (this.real == c.getReal()) && (this.imag == c.getImaginary());
    }

    public String toString(){
        return real + " " + imag;
    }
}