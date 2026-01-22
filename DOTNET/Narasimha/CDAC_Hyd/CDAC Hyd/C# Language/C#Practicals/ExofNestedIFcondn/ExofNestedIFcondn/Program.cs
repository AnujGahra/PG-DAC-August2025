using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ExofNestedIFcondn
{
    class Program
    {
        static void Main(string[] args)
        {
            int p, c, m;

            Console.Write("Enter Your Physics Marks ");
            p = int.Parse(Console.ReadLine());

            Console.Write("Enter Your Chemistry Marks ");
            c = int.Parse(Console.ReadLine());

            Console.Write("Enter Your Maths Marks ");
            m = int.Parse(Console.ReadLine());

            if (p > 34 && c > 34 && m > 34)
            {
                int total;
                total = p + c + m;
                if (total >= 183)
                {
                    Console.WriteLine("Passed First Class");

                }
                else
                {
                    Console.WriteLine("Passed");
                }
            }
            else
            {
                Console.WriteLine("Failed In One Or More Subject");
            }
            Console.ReadLine();
        }
       
    }
}
