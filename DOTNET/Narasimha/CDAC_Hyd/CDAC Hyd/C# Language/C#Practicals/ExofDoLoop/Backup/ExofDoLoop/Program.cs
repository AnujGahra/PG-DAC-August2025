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
            int x = 1;
            int sum = 0;
            do
            {
                Console.WriteLine(x);
                sum = sum + x;
                x = x + 1;
            }
            while (x <=10);
            Console.ReadLine();
            Console.WriteLine("Total Sum is  " + sum.ToString());
            Console.ReadLine();
            
        }
    }
}
