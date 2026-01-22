public class ClassCourse {

    String courseName;
    int enrolledStudents;

    // Static variable: shared by all courses
    static int maxCapacity = 50;

    // Constructor
    public ClassCourse(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = 0;
    }

    // Instance method: enroll student
    public void enrollStudent(String studentName) {
        if (enrolledStudents < maxCapacity) {
            enrolledStudents++;
            System.out.println(studentName + " has been enrolled in " + courseName + ".");
        } else {
            System.out.println("Cannot enroll " + studentName +
                    ". Course " + courseName + " is full.");
        }
    }

    // Instance method: unenroll student
    public void unenrollStudent(String studentName) {
        if (enrolledStudents > 0) {
            enrolledStudents--;
            System.out.println(studentName + " has been unenrolled from " + courseName + ".");
        } else {
            System.out.println("No students to unenroll from " + courseName + ".");
        }
    }

    // Static method: set max capacity for all courses
    public static void setMaxCapacity(int capacity) {
        maxCapacity = capacity;
        System.out.println("Max capacity for all courses set to " + maxCapacity);
    }

    public static void main(String[] args) {

        ClassCourse course1 = new ClassCourse("Mathematics");
        ClassCourse course2 = new ClassCourse("Physics");

        course1.enrollStudent("Alice");
        course1.enrollStudent("Bob");

        course2.enrollStudent("Charlie");

        System.out.println("Current max capacity: " + ClassCourse.maxCapacity);

        ClassCourse.setMaxCapacity(100);

        for (int i = 0; i < 98; i++) {
            course1.enrollStudent("Student" + (i + 3));
        }

        course1.enrollStudent("David");

        course1.unenrollStudent("Alice");
    }
}
