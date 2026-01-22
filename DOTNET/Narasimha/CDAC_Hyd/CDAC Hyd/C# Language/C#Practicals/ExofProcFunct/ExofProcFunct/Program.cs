using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ExofProcFunct
{
    class Program
    {
        static void Main(string[] args)
        {
            int res;
            Program obj = new Program();
            obj.Addnumbers(10, 15);
            res = obj.MultiplyNumbers(10, 5);
            Console.WriteLine("Result of Multiply  is " + res);
            Console.ReadLine();
        }

        public void Addnumbers(int x, int y)
        {
            int z;
            z = x + y;
            Console.WriteLine("Result of Add is  " + z);
            Console.ReadLine();
        }

        public int MultiplyNumbers(int x, int y)
        {
            return x * y;
        }
    }
}
