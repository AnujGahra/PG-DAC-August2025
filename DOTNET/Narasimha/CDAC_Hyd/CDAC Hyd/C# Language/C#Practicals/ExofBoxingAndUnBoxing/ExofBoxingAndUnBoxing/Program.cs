using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Collections;
namespace ExofBoxingAndUnBoxing
{
    class Program
    {
        static void Main(string[] args)
        {
            int i = 10;
            ArrayList arrlst = new ArrayList();

           
            arrlst.Add(i); // Boxing occurs Here

            int j = (int)arrlst[0]; // Unboxing occurs

            Console.Write("Value of J is  " + j.ToString());
            Console.ReadLine();
        }
    }
}
