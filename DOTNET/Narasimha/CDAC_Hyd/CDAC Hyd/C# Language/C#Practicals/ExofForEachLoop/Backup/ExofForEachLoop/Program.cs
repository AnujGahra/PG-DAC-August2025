using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
namespace ExofForEachLoop
{
    class Program
    {
        static void Main()
        {
            string[] names = {"Praveen","Muthu","Arsheen","Asma","Krishna" };
                      
            Console.WriteLine("Your Array Has Names");

            foreach (string x in names)
            {
                Console.WriteLine(x);
            }

            Console.ReadLine();
        }
    }
}
