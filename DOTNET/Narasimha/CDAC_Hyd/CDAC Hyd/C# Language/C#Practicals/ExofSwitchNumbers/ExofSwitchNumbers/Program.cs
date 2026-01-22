using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ExofSwitchNumbers
{
    class Program
    {
        static void Main(string[] args)
        {
            int no;
            Console.Write("Enter One No ");
            no = int.Parse(Console.ReadLine());
            switch (no)
            {
                case 1:
                    Console.Write("You Are In First Grade");
                    break;
                case 2:
                    Console.Write("You Are In Second Grade");
                    break;
                default:
                    Console.Write("Invalid No Entered");
                    break;
            }
            Console.ReadLine();
        }
    }
}
