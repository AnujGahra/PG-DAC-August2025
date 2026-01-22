using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Collections;
namespace ExofQue
{
    class Program
    {
        static void Main(string[] args)
        {
            Queue Students = new Queue();
            Students.Enqueue("Vandana");
            Students.Enqueue("Priyanka");
            Students.Enqueue("Shrinidhi");
            Students.Enqueue("Karthik");
            Students.Enqueue("Amit");

            Students.Dequeue();
            Students.Dequeue();
            Console.WriteLine("Values Left in Que Are ");
            foreach (String x in Students)
            {
                Console.WriteLine(x);
            }
            Console.ReadLine();
        }
    }
}
