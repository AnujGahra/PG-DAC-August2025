package tech.codehunt.logic;

import java.util.Scanner;

import tech.codehunt.crud.Crud;
import tech.codehunt.dto.EmployeeDTO;

public class Logic {

    private final int INSERT_DATA = 1;
    private final int READ_DATA = 2;
    private final int UPDATE_DATA = 3;
    private final int DELETE_DATA = 4;
    private final int EXIT = 5;
    private static final int MAX_ATTEMPTS = 3;
    
    private String username;
    private String password;
    private String fullname;
    private String address;
    private int salary;
    

    private Crud crud;

    public Logic() {
        crud = new Crud();
    }

    public void doStart() {

        Scanner scanner = new Scanner(System.in);
        int attempt = 0;

        while (true) {

            System.out.println("\n============= MENU ==============");
            System.out.println("Press-1 : INSERT DATA");
            System.out.println("Press-2 : READ DATA");
            System.out.println("Press-3 : UPDATE DATA");
            System.out.println("Press-4 : DELETE DATA");
            System.out.println("Press-5 : EXIT\n");
            System.out.print("Enter Your Choice: ");

            int choice = 0;

            try {
                choice = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid Input! Please enter a number from 1 to 5.\n");
                scanner.nextLine(); // clear buffer
                attempt++;

                if (attempt >= MAX_ATTEMPTS) {
                    System.out.println("You have reached the max attempt limit.");
                    scanner.close();
                    return;
                }

                continue;
            }

            if (choice < 1 || choice > 5) {
                System.out.println("Invalid Input! Please enter a value from 1 to 5.\n");
                attempt++;

                if (attempt >= MAX_ATTEMPTS) {
                    System.out.println("You have reached the max attempt limit.");
                    scanner.close();
                    return;
                }
                continue;
            }

            scanner.nextLine(); // important fix: clear extra newline

            switch (choice) {

                case INSERT_DATA:
                    System.out.println("*************** Insert Data *************** ");

                    System.out.print("Enter Username: ");
                    username = scanner.nextLine();

                    System.out.print("Enter Password: ");
                    password = scanner.nextLine();

                    System.out.print("Enter Full Name: ");
                    fullname = scanner.nextLine();

                    System.out.print("Enter Address: ");
                    address = scanner.nextLine();

                    System.out.print("Enter Salary: ");
                    salary = scanner.nextInt();
                    scanner.nextLine();

                    EmployeeDTO employeeDTO = new EmployeeDTO(username, password, fullname, address, salary);

                    crud.insert(employeeDTO);
                    break;

                case READ_DATA:
                    System.out.println("*************** Read Data ***************");
                    System.out.println("ENTER USERNAME");
                    username=scanner.next();
                    System.out.println("ENTER PASSWORD");
                    password=scanner.next();
                    crud.read(username, password);
                    break;

                case UPDATE_DATA:
                    System.out.println("*************** Update Data ***************");
                    System.out.println("ENTER USERNAME");
                    username=scanner.next();
                    System.out.println("ENTER SALARY");
                    salary=scanner.nextInt();
                    crud.update(username, salary);
                    break;

                case DELETE_DATA:
                    System.out.println("*************** Delete Data ***************");
                    System.out.println("ENTER USERNAME");
                    username=scanner.next();
                    crud.delete(username);
                    break;

                case EXIT:
                    System.out.println("EXITING...");
                    scanner.close();
                    return;
            }
        }
    }
}
