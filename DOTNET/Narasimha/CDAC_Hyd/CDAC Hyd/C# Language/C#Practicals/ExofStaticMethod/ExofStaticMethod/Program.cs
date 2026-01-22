using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ExofStaticMethod
{
    class TestStatic
    {
        public static void AddNumbers(int x, int y)
        {
            int z;
            z = x + y;
            Console.WriteLine("Result of Add is  " + z);
            Console.ReadLine();
        }


        public void Show()
        {
            Console.WriteLine("Good Morning");
            Console.ReadLine();
        }
             
    }
    class Program
    {
        static void Main()
        {
            TestStatic obj = new TestStatic();
            obj.Show();
            TestStatic.AddNumbers(30, 70);       
          
            
        }
    }
}
