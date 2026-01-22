using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ExofWhyGenerics
{
    public class Test
    {
        public void BigNumber(int x, int y)
        {
            if (x > y)
            {
                Console.WriteLine(x + "  is  Bigger");
            }
            else if (y > x)
            {
                Console.WriteLine(y + "  is  Bigger");
            }
            else
            {
                Console.WriteLine("Both Are Equal");
            }
            Console.ReadLine();
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            int a, b;
            
            Console.WriteLine("Enter First Number");
            a = int.Parse(Console.ReadLine());

            Console.WriteLine("Enter Second Number");
            b = int.Parse(Console.ReadLine());

            Test obj = new Test();
            obj.BigNumber(a, b);
        }
    }
}
