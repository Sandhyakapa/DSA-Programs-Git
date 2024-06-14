import java.util.ArrayList;

public class GenericArithmeticOperations {
    // Generic method to sum all numbers in an ArrayList
    public static <T extends Number> double sum(ArrayList<T> numbers) {
        double total = 0;
        for (T number : numbers) {
            total += number.doubleValue();
        }
        return total;
    }

    // Generic method to subtract all numbers in an ArrayList
    public static <T extends Number> double subtract(ArrayList<T> numbers) {
        double total = numbers.getFirst().doubleValue();
        for (int i = 1; i < numbers.size(); i++) {
            total -= numbers.get(i).doubleValue();
        }
        return total;
    }

    // Generic method to multiply all numbers in an ArrayList
    public static <T extends Number> double multiply(ArrayList<T> numbers) {
        double total = 1;
        for (T number : numbers) {
            total *= number.doubleValue();
        }
        return total;
    }

    // Generic method to divide all numbers in an ArrayList
    public static <T extends Number> double divide(ArrayList<T> numbers) {
        double total = numbers.getFirst().doubleValue();
        for (int i = 1; i < numbers.size(); i++) {
            double value = numbers.get(i).doubleValue();
            total /= value;
        }
        return total;
    }

    public static void main(String[] args) {
        // Integer ArrayList
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(12);
        intList.add(2);
        intList.add(3);

        // Double ArrayList
        ArrayList<Double> doubleList = new ArrayList<>();
        doubleList.add(12.0);
        doubleList.add(2.0);
        doubleList.add(3.0);
       // doubleList.add(1); Error

        System.out.println("Integer sum: " + (int)sum(intList));
        System.out.println("Integer subtraction: " + (int)subtract(intList));
        System.out.println("Integer multiplication: " + (int)multiply(intList));
        System.out.println("Integer division: " + (int)divide(intList));

        System.out.println("Double sum: " + sum(doubleList));
        System.out.println("Double subtraction: " + subtract(doubleList));
        System.out.println("Double multiplication: " + multiply(doubleList));
        System.out.println("Double division: " + divide(doubleList));
    }
    }


