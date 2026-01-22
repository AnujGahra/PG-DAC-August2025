using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ExCommandLineParam
{
    class Program
    {
        static void Main(string[] args)
        {
            int i;
            Console.WriteLine("You Passed Command Parameters "+ args.Length);
            Console.ReadLine();
            for (i = 0; i < args.Length; i++)
            {
                Console.WriteLine("{0}", args[i]);
            }
            Console.ReadLine();
        }
    }
}
