using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ExofSwitchCase
{
    class Program
    {
        static void Main(string[] args)
        {

            string g;
            Console.WriteLine("Enter Your Grade");
            g = Console.ReadLine();
            switch (g)
            {
                case "A":
                case "a":
                    Console.WriteLine("You Are In Grade A");
                    goto s;
                case "B":
                case "b":
                    Console.WriteLine("You Are In Grade B");
                    goto s1;
                case "C":
                case "c":
                    Console.WriteLine("You Are In Grade C");
                   goto s1;
                    
                default:
                    Console.WriteLine("Invaild Grade");
                   break;
               s:

                   Console.WriteLine("Congrats For Achiving Grade A");
                   break;
                s1:

                   Console.WriteLine("Try To Achived Grade A");
               
                break;

            }
            Console.ReadLine();
        }
    }
}
