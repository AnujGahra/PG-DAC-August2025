using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ExofDoLoop
{
    class Program
    {
        static void Main(string[] args)
        {
            int x = 100;
            do
            {
                Console.WriteLine(x);
                x = x + 1;
            }
            while (x <=10);
            
            Console.WriteLine("Program Over");
            Console.ReadLine();
            
        }
    }
}
