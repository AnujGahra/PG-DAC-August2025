using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ExofSimpleClass
{

    public class SimpleMaths
    {
        public void AddNumbers(int x, int y)
        {
            int z;
            z = x + y;
            Console.WriteLine("Result of Add Numbers is " + z);
            Console.ReadLine();
        }

        public void SubtractNumbers(int x, int y)
        {
            int z;
            z = x - y;
            Console.WriteLine("Result of Subtract Numbers is " + z);
            Console.ReadLine();
        }

        public void MultiplyNumbers(int x, int y)
        {
            Console.WriteLine("Result of Multiply Numbers is " + x * y);
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

            SimpleMaths obj1 = new SimpleMaths();                        
            obj1.AddNumbers(a, b);
            obj1.SubtractNumbers(a, b);
            obj1.MultiplyNumbers(a, b);
        }

      }
}
