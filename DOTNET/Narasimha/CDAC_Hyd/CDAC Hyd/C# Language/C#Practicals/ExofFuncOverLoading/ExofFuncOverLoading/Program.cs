using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ExofFuncOverLoading
{
    class TestOverLoad
    {
       
        public void AddNumbers(int x, int y)
        {
            
            int z;
            z = x + y;
            Console.WriteLine("Result of Add Two Integers is   " + z.ToString());
            Console.ReadLine();
        }
        public void AddNumbers(int x, int y,int z)
        {
            int a;
            a = x + y+ z;
            Console.WriteLine("Result of Add Three Integers is   " + a.ToString());
            Console.ReadLine();
        }

        public void AddNumbers(double x, double y)
        {
            double z;
            z = x + y;
            Console.WriteLine("Result of Add Two Decimals is   " + z.ToString());
            Console.ReadLine();
        }

        public void AddNumbers(string  x, string y)
        {
           
            Console.WriteLine("Result of Concatinating Two Strings is   " + x + y);
            Console.ReadLine();
        }
    }
    class Program
    {
        static void Main()
        {
            TestOverLoad obj = new TestOverLoad();
            
            int a, b;
           
            Console.Write("Enter First No ");
            a = int.Parse(Console.ReadLine());

            Console.Write("Enter Second No ");
            b= int.Parse(Console.ReadLine());
           
            obj.AddNumbers(a, b);
            obj.AddNumbers(10, 10, 20);
            obj.AddNumbers(15.25, 10.50);
            obj.AddNumbers("Liberty ", " Computers");
        }
    }
}
