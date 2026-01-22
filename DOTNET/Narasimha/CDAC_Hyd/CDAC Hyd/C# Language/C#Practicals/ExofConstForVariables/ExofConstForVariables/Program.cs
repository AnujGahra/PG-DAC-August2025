using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ExofConstForVariables
{
    class TestConst
    {
        int x=10;
        string s="LCC";
        bool b=true;
        public TestConst()
        {
            Console.WriteLine("Value of X is " + x);
            Console.WriteLine("Value of S is " + s);
            Console.WriteLine("Value of B  is " + b);
            Console.ReadLine();
        }
        public void Greeting()
        {
            Console.WriteLine("Hello How Are U");
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            TestConst obj = new TestConst();
            obj.Greeting();
            Console.ReadLine();
        }
    }
}
