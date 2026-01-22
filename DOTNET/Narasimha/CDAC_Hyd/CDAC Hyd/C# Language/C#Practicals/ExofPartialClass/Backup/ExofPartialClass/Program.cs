using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ExofPartialClass
{
    class Program
    {
        static void Main(string[] args)
        {
            Test obj = new Test();
            obj.AddNumber(10, 10);
            obj.Hello("Akshay");
            obj.MultiplyNumbers(5, 5);
            obj.Bye();
           
        }
    }

    public partial class Test
    {
        public void AddNumber(int x, int y)
        {
            int z;
            z = x + y;
            Console.WriteLine("Result of Add is " + z);
            Console.ReadLine();
        }

        public void Hello(string name)
        {
            Console.WriteLine("Hello How Are You " + name);
            Console.ReadLine();
        }
    }

    public partial class Test
    {
        public void MultiplyNumbers(int x, int y)
        {
            int z;
            z = x * y;
            Console.WriteLine("Result of Mutl is " + z);
            Console.ReadLine();
        }
       
    }
}
