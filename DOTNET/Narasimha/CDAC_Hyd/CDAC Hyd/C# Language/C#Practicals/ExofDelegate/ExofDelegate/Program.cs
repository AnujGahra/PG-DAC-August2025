using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ExofDelegate
{
    class Program
    {
        public delegate void Test(int x, int y);
        static void Main(string[] args)
        {
            Test obj1 = new Test(AddNumbers);
            obj1 = obj1 + new Test(MultipyNumbers);
            obj1 = obj1 + new Test(DivideNo);
            //Test obj2 = new Test(MultipyNumbers);
            obj1(10, 5);
            //obj2(20, 10);  
        }

        static void AddNumbers(int x, int y)
        {
            int z;
            z = x + y;
            Console.WriteLine("Result of Add Numbers  is  " + z);
            Console.ReadLine();
        }
        
        static void MultipyNumbers(int x, int y)
        {
            int z;
            z = x * y;
            Console.WriteLine("Result of Multiply Numbers  is  " + z);
            Console.ReadLine();
        }
        static void DivideNo(int x, int y)
        {
            int z;
            z = x / y;
            Console.WriteLine("Result of Div Numbers  is  " + z);
            Console.ReadLine();
        }
     
    }
}
