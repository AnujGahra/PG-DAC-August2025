using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ExofDebug
{
    class Program
    {
        static void Main(string[] args)
        {
            int a, b;
            Show();
            b =5;
            Console.Write("Enter Number :");
            a = int.Parse(Console.ReadLine());
            Console.WriteLine("Result of Mult By 5 is " + (a * b).ToString());
            Console.ReadLine();
        }

        static void Show()
        {
            Console.WriteLine("Hello How Are You");
        }
    }
}
