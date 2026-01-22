using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ExofWhileLoop
{
    class Program
    {
        static void Main(string[] args)
        {
            int x;
            x = 100;
            int sum = 0;
            while (x <= 10)
            {
                Console.WriteLine(x);
                x += 1;
                sum += x;
            }
            Console.ReadLine();
            Console.WriteLine("Total Sum is  " + sum.ToString());
            Console.WriteLine("Looping Ended");
            Console.ReadLine();
        }
       
    }
}
