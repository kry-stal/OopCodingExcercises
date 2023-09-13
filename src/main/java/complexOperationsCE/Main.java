package complexOperationsCE;

public class Main {
    public static void main(String[] args) {
        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());
        System.out.println();
        ComplexNumber number1 = new ComplexNumber(1,1);
        number1.subtract(2,2);
        System.out.println("number1.real= " + number1.getReal());
        System.out.println("number1.imaginary= " + number1.getImaginary());
        System.out.println();
        ComplexNumber number2 = new ComplexNumber(3.0,7.0);
        number2.add(7.0,3.0);
        System.out.println(number2.getImaginary());
        System.out.println(number2.getReal());
        System.out.println();
        ComplexNumber number3 = new ComplexNumber(4,6);
        number3.subtract(4,6);
        System.out.println(number3.getReal());
        System.out.println(number3.getImaginary());

//→ OUTPUT
//        one.real= 2.0
//        one.imaginary= 2.0
//        one.real= -0.5
//        one.imaginary= 3.5
//        number.real= 3.0
//        number.imaginary= -5.0


    }
}
