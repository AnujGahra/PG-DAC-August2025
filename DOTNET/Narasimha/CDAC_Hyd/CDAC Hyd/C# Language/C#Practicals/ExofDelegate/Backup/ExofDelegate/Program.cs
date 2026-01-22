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

           // Test obj2 = new Test(MultipyNumbers);
            obj1(10, 10);
           // obj2(15, 5);  
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

       
    }
}
