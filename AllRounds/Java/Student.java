public class Student {

    String name;
    int age;

    // Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Overriding toString() method
    @Override
    public String toString() {
        return "Student Name: " + name + ", Age: " + age;
    }

    // Main method
    public static void main(String[] args) {
        Student s1 = new Student("Anuj", 20);
        Student s2 = new Student("Rahul", 22);

        System.out.println(s1);
        System.out.println(s2);
    }
}

