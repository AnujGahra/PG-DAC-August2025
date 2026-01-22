import java.util.Scanner;

public class arrayQuestion1 {

    public static void main(String[] args) {
      System.out.print("Enter no. of employees: "); 
      
      Scanner sc = new Scanner(System.in);

      int count = sc.nextInt();

      Employee emp[] = new Employee[count];

        for (int i = 0; i < count; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");
            
            System.out.print("ID: ");
            int id = sc.nextInt();
            
            System.out.print("Age: ");
            byte age = sc.nextByte();
            
            System.out.print("Height: ");
            float height = sc.nextFloat();
            
           Employee e = new Employee(id, age, height);

            emp[i] = e;
        }

        for( Employee e : emp) {
            System.out.println("Employee ID: " + e.getId() + ", Age: " + e.getAge() + ", Height: " + e.getHeight());
        }
    }
}