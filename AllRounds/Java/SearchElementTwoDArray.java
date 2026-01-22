import java.util.Scanner;

public class SearchElementTwoDArray {


    public static void SearchElement(int[][] matrix, int target) {
        boolean found = false;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        if (found) {
            System.out.println("Element " + target + " found in the matrix.");
        } else {
            System.out.println("Element " + target + " not found in the matrix.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int[][] matrix = {
        //     {1, 2, 3},
        //     {4, 5, 6},
        //     {7, 8, 9}
        // };

        // int target = 5;

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the element to search: ");
        int target = sc.nextInt();
        



        SearchElement(matrix, target);
        // boolean found = false;

        // for (int i = 0; i < matrix.length; i++) {
        //     for (int j = 0; j < matrix[i].length; j++) {
        //         if (matrix[i][j] == target) {
        //             found = true;
        //             break;
        //         }
        //     }
        //     if (found) {
        //         break;
        //     }
        // }

        // if (found) {
        //     System.out.println("Element " + target + " found in the matrix.");
        // } else {
        //     System.out.println("Element " + target + " not found in the matrix.");
        // }
    }
    
}
