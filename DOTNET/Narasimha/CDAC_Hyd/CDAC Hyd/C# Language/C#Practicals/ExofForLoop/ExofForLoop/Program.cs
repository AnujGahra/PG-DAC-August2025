using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ExofForLoop
{
    class Program
    {
        static void Main(string[] args)
        {
            int no;
            Console.WriteLine("Enter A Number");
            no = int.Parse(Console.ReadLine());
            Console.WriteLine("You Entered Number " + no.ToString());
            Console.ReadLine();
            int i;
            int nm;
            if (no != 0)
            {
                for (i = 1; i <= 10; i++)
                {
                    nm = no * i;
                    Console.Write(no);
                    Console.Write("*");
                    Console.Write(i);
                    Console.Write("=");
                    Console.WriteLine(nm);
                }
                Console.ReadLine();

            }


            else
            {
                Console.WriteLine("No Entered is Zero Prog Stopped");
                Console.ReadLine();
            }
        }
    }
}
