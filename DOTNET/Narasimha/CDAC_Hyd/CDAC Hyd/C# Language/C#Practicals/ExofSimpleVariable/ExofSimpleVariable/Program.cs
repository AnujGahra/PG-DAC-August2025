using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ExofSimpleVariable
{
    class Program
    {
        static void Main(string[] args)
        {
            string name = "";
            Console.WriteLine("Enter Your Name  ");
            name = Console.ReadLine();
            Console.WriteLine("Hello  Your  Name  is  " + name);
            Console.ReadLine();

            int x;
            Console.WriteLine("Enter Your Number  ");
            x = int.Parse(Console.ReadLine());
            Console.WriteLine("You Entered Number  " + x.ToString());
            Console.ReadLine();
        }
    }
}
