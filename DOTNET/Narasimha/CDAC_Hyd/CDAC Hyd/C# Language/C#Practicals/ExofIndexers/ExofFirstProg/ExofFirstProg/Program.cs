using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ExofFirstProg
{
    class Program
    {
        static void Main(string[] args)
        {
            try
            {
                int no;
                string name = "";
                DateTime dt;

                Console.WriteLine("Hello Wel Come To First Prog");
                Console.ReadLine();

                Console.Write("Enter Your No  :");
                no = int.Parse(Console.ReadLine());

                Console.Write("Enter Your Name  :");
                name = Console.ReadLine();

                Console.Write("Enter Your Date of Joining  :");
                dt = DateTime.Parse(Console.ReadLine());


                Console.Write("Your No  is :" + no.ToString());
                Console.ReadLine();

                Console.Write("Your Name  is :" + name);
                Console.ReadLine();

                Console.Write("Your Doj is :" + dt.ToShortDateString());
                Console.ReadLine();
            }
            catch
            {
                Console.WriteLine("Invalid Data Entry");
                Console.ReadLine();
            }
        }
    }
}
