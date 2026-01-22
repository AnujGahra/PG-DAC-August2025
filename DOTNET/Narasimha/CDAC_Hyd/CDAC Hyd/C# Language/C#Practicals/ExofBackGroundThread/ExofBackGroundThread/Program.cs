using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
namespace ExofBackGroundThread
{
    class Program
    {
        static void Main(string[] args)
        {
            Thread t1 = new Thread(Function1);
            t1.IsBackground = true;
            t1.Start();
            Console.WriteLine("Main Function Finished");
            Console.ReadLine();
        }


        static void Function1()
        {
           
             Console.WriteLine("Function 1 Started");
             Console.WriteLine("Press Any Key To Continue");
             Console.ReadLine();
             Console.WriteLine("Function 1 Stopped");
             Console.ReadLine();
        }
    }
}
