public class Abstraction {
    public static void main(String[] args) {

        Arithmetic_Operation op1 = new Addition();


        int a =20, b=10;

        // abstract method calling
        op1.doOperation(a,b);
        // Concrete method calling
        op1.isGreater(a,b);


        op1 = new Subtraction();
        op1.doOperation(a,b);



    }
}
