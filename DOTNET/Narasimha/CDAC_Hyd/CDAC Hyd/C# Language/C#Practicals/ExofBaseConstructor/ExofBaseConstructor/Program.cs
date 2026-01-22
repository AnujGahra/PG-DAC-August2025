using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ExofBaseConstructor
{
    public class Test
    {
        public Test()
        {
            Console.WriteLine("Zero Parameter Parent Const Executed");
        }
        public Test(string name)
        {
            Console.WriteLine("Parameter Parent Const Executed Hello"+name);
        }

        public void Show()
        {
            Console.WriteLine("I am Parent Class Method");
        }
    }


    public class ChildTest:Test
    {
        public ChildTest():base(" Shweta")
        {
            Console.WriteLine("Child Class Const Executed");
        }

        public void Display()
        {
            Console.WriteLine("I am Child Class Method");
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            ChildTest obj = new ChildTest();
            obj.Show();
            obj.Display();
            Console.ReadLine();
        }
    }
}
