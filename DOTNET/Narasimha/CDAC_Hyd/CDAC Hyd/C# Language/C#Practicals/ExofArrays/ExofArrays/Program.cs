using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ExofArrays
{
   class Program
    {
        static void Main()
        {
            int[] marks;
            marks = new int[5];
            marks[0] = 70;
            marks[1] = 60;
            marks[2] = 60;
            marks[3] = marks[1] + marks[2];
            Console.WriteLine("Enter Your Marks");
            marks[4] = int.Parse(Console.ReadLine());

            Console.WriteLine("Value of Array in 3rd Element is  " + marks[2]);
            Console.ReadLine();
            int i;
            for (i = 0; i < 5; i++)
            {
                Console.WriteLine("Marks " + marks[i]);

            }
            Console.ReadLine();
        }
    }
}
