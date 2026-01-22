using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ExofPassByRef
{
    class Program
    {
        static void Main(string[] args)
        {
            int a;
            a = 10;
            Show(ref a);
            Console.WriteLine("Value of A Now is " + a);
            Console.ReadLine();
        }

        static void Show(ref int x)
        {
            x = x + 15;
            Console.WriteLine("Value of X Now is " + x);
            Console.ReadLine();
        }
    }
}
