using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Collections;
namespace ExampleofStack
{
    class Program
    {
        static void Main(string[] args)
        {
            Stack Customers = new Stack();

            Customers.Push("Krishna");
            Customers.Push("Amit");
            Customers.Push("Varun");
            Customers.Push("Akshay");

            Customers.Pop();
            Customers.Pop();

            foreach (object obj in Customers)
            {
                Console.WriteLine("Customers Left in Stack Are " + obj);
            }
            Console.ReadLine();
        }
    }
}
