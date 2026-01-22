using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ExofAnonyMousMethod
{
    class Program
    {

        delegate void Test(int x, int y,string opr);
        static void Main(string[] args)
        {
            Test obj = delegate(int x,int y,string opr)
            {
                if (opr == "add")
                {
                    Console.WriteLine("Result of Add is " + (x + y).ToString());
                }
                else if (opr == "subt")
                {
                    Console.WriteLine("Result of Subt is " + (x - y).ToString());
                }
                Console.ReadLine();
            };

            int a, b;
            string operation;
            Console.Write("Enter First Number :");
            a = int.Parse(Console.ReadLine());

            Console.Write("Enter Second Number :");
            b = int.Parse(Console.ReadLine());
            Console.Write("Enter Your Operation :");
            operation = Console.ReadLine();
            obj(a, b, operation);
        }
    }
}
