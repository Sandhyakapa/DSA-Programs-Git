import java.util.Objects;

public class MainStudent {
   public static void main(String[] args) {
      Student s1 = new Student();
      Student s2 = new Student();
      System.out.println(s1);
      System.out.println(s2.toString());
      System.out.println(s1.hashCode());
      System.out.println(s2.hashCode());
      System.out.println(s1.equals(s2));
      System.out.println(s1.getClass());
      System.out.println("are objects equal :"+(s1 == s2));
   }
}
 class Student {
    String name = "Kapa Sandhya";
    int id = 1;

    /*@override
    public  boolean equals(Student s2) {
       if (this.id == s2.id) {
          return true;
       }
       else{
          return false;
       }*/

    @Override
    public boolean equals(Object o) {

       Student s2 = (Student) o;
       if (this.id == s2.id) {
          return true;
       }
       else{
          return false;
    }

 }

    @Override
    public String toString() {
       System.out.println("Name: "+ name + " Id: "+ id);
       return super.toString();
    }
 }

