import java.util.Scanner;

public class DeleteAnElement {



    // delete an element a specific element from an array.
    public static void deleteElement(int[] arr, int element) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                index = i; 
                break;
            }
        }

        if (index == -1) {
            System.out.println("Element not found in the array.");
            return;
        }

        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        System.out.println("Array after deleting element " + element + ":");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    

    public static void main(String[] args) {
        System.out.println("Delete an element from an array");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i =0; i<size; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to be deleted: ");
        int element = sc.nextInt();
        deleteElement(arr, element);    

        


    }
}
