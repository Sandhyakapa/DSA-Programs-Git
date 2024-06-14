import java.util.ArrayList;
import java.util.List;

public class GenericsExample {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(10);
        list.add("10");
        list.add(2.23);
        list.add(3.5f);

        ArrayList<Integer> lis = new ArrayList<Integer>();
        lis.add(20);
        lis.add(10);
        lis.add(40);
        lis.add(1,15);
        System.out.println(lis);
        //lis.add("10");// compile-time error
    }

}
