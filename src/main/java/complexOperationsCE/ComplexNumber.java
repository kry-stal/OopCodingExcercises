package complexOperationsCE;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

//    To add or subtract two complex numbers, just add or
//    subtract the corresponding real and imaginary parts.
//    For instance, the sum of 5 + 3i and 4 + 2i is 9 + 5i.
//    For another, the sum of 3 + i and –1 + 2i is 2 + 3i

    public void add (double real, double imaginary){
        this.real += real;
        this.imaginary += imaginary;
    }

    public void add (ComplexNumber complexNumber) {
        add(complexNumber.real, complexNumber.imaginary);
    }

    public void subtract (double real, double imaginary){
        this.real -= real;
        this.imaginary -= imaginary;
    }

    public void subtract (ComplexNumber complexNumber) {
        this.real -= complexNumber.getReal();
        this.imaginary -= complexNumber.getImaginary();

//        real = getReal() - complexNumber.real;
//        imaginary = this.getImaginary() - complexNumber.imaginary;
    }
}
