using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
namespace ExofForEachLoop
{
    class Program
    {
        public static void Main()
        {
            string[] students = new string[]{"Ganesh","Raj","Gautam" };
            foreach (string x in students)
            {

                Console.WriteLine(x);

            }
            Console.ReadLine();
        }
    }

}
