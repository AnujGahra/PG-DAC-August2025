using System;
using System.IO;
class Program
{
    static void Main()
    {
        Console.Write("Enter the file path: ");
        string filePath = Console.ReadLine();

        try
        {
            
            string content = File.ReadAllText(filePath);
            Console.WriteLine("\nFile content:\n");
            Console.WriteLine(content);
        }
        catch (FileNotFoundException)
        {
            Console.WriteLine("\nError: The specified file was not found.");
        }
        catch (UnauthorizedAccessException)
        {
            Console.WriteLine("\nError: You do not have permission to access this file.");
        }
        catch (IOException ex)
        {
            Console.WriteLine("\nAn I/O error occurred: " + ex.Message);
        }
        catch (Exception ex)
        {
            Console.WriteLine("\nAn unexpected error occurred: " + ex.Message);
        }
    }
}