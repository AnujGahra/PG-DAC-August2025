using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ExofNulltype
{
    class Program
    {
        static void Main(string[] args)
        {
           
            Nullable<int> x;
           x = null;
          // x = 10;
            if (x.HasValue == true)
            {
                Console.WriteLine("X Has Value  " + x);
            }
            else
            {
                Console.WriteLine("X Has Null Value");
            }
            Console.ReadLine();
        }
    }
}
