using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ExofDynamicAndVar
{
    class Program
    {
        static void Main(string[] args)
        {
            var a = "Krishna";
            dynamic b = "Prashant";
            b = 10.55;
            b=DateTime.Now;
            Console.WriteLine("Value Stored in A is " + a);
            Console.WriteLine("Value Stored in B is " + b);
            Console.ReadLine();
        }
    }
}
