package baitap2;

public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Sơn");
        student1.setClasses("JV10");
        System.out.println(student1.getClasses());
        System.out.println(student1.getName());
    }
}
