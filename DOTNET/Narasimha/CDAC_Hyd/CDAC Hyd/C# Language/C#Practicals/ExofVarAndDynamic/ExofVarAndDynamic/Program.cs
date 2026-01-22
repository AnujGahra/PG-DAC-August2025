using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ExofVarAndDynamic
{
    class Program
    {
        static void Main(string[] args)
        {
            var n = 10;
            //n = "krishna";
            dynamic a;
            a = 10.10;

            Console.WriteLine("Value of N is " + n);
            Console.ReadLine();

            Console.WriteLine("Value of A is " + a);
            a = "Lcc";
            Console.WriteLine("Value of A is " + a);
            Console.ReadLine();
            a = DateTime.Now;
            Console.WriteLine("Value of A is " + a);
            Console.ReadLine();
        }
    }
}
