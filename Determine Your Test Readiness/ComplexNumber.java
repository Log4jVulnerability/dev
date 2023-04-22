class ComplexNumber {  // 1 point lost
    private double real;
    private double imaginary;

    public ComplexNumber() {}  // May lose a point?
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void add(ComplexNumber num1, ComplexNumber num2) {  // 2 points lost
        this.real = num1.getReal() + num2.getReal();
        this.imaginary = num1.getImaginary() + num2.getImaginary();
    }

    public void getReal() {return this.real;}
    public void getImaginary() {return this.imaginary;}
    public String toString() {return "(" + real + " + " + imaginary + "i)"}
}

class Main {
    public static void main(String[] args) {
        ComplexNumber x1 = new ComplexNumber(3.1, 6.4);
        ComplexNumber y1 = new ComplexNumber(-4.8, 2.9);
        ComplexNumber z1 = new ComplexNumber();
        z1 = z1.add(x1, y1);
        
        ComplexNumber x2 = new ComplexNumber(3.7, 1);
        ComplexNumber y2 = new ComplexNumber(2, -9.2);
        ComplexNumber z2 = new ComplexNumber();
        z2 = z2.add(x2, y2);
    }
}