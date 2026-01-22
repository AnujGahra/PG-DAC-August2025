// See https://aka.ms/new-console-template for more information

namespace QuestionPrintArray;
using System;

class Program
{
    static void Main()
    {
        Console.Write("Enter the number of elements (n): ");
        int n = Convert.ToInt32(Console.ReadLine());

        int[] arr = new int[n];
        int sum = 0;

        
        Console.WriteLine("Enter {0} elements:", n);
        for (int i = 0; i < n; i++)
        {
            Console.Write("Element {0}: ", i + 1);
            arr[i] = Convert.ToInt32(Console.ReadLine());
            sum += arr[i];
        }

        
        Console.WriteLine("\nSum of array elements = " + sum);

        
        Console.WriteLine("Array elements in reverse order:");
        for (int i = n - 1; i >= 0; i--)
        {
            Console.Write(arr[i] + " ");
        }

        Console.WriteLine(); 
    }
}
