using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ExofGenericsAddNo
{

    public class TestGenericsMaths
    {
        public void AddNo<T>(T x,T y )
        {
            dynamic a, b;
            int z;
            a = x;
            b = y;
            z = a + b;
            Console.WriteLine("Result Add Integer is " + z.ToString());
            Console.ReadLine();
            if (a > b)
            {
                Console.WriteLine(a + " is greater");

            }
            else if (b > a)
            {
                Console.WriteLine(b + " is greater");
            }
            else
            {
                Console.WriteLine(a + "And "+b+" Are Equal");
            }
            Console.ReadLine();
        }
    }


    class Program
    {
        static void Main(string[] args)
        {
            int num1, num2;
            Console.Write("Enter First Number :");
            num1 = int.Parse(Console.ReadLine());

            Console.Write("Enter Seocnd Number :");
            num2 = int.Parse(Console.ReadLine());
            TestGenericsMaths obj = new TestGenericsMaths();
            obj.AddNo<int>(num1, num2);
        }
    }
}
