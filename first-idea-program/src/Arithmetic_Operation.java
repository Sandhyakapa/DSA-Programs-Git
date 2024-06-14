abstract class Arithmetic_Operation {

    // abstract method
    abstract void doOperation(int a, int b);

    //concrete method
     void isGreater(int num1, int num2){
        if(num1 > num2){
            System.out.println(num1 + " is greater than "+num2);
        }
        else{
            System.out.println(num2 + " is greater than "+num1);
        }
    }
}
