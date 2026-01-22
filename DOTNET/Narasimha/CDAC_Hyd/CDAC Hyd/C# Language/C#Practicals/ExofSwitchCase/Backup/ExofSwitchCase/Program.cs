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
                    Console.ReadLine();
                    break;
                case "B":
                case "b":
                    Console.WriteLine("You Are In Grade B");
                    Console.ReadLine();
                    goto s1;
                case "C":
                    Console.WriteLine("You Are In Grade C");
                    Console.ReadLine();
                    goto s1;
                    
                default:
                    Console.WriteLine("You Failed In Exam");
                    Console.ReadLine();
                    break;

                s1:

                    Console.WriteLine("Try To Achived Grade A");
                Console.ReadLine();
                break;
            }
        }
    }
}
