using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
namespace ExofForeGroundThread
{
    class Program
    {
        static void Main(string[] args)
        {
            Thread t1 = new Thread(Hello);
            Thread t2 = new Thread(Bye);
            t1.Start();
            t2.Start();
            //Hello();
            //Bye();
            Console.WriteLine("Main Execution Over");
            Console.ReadLine();
           
            Console.WriteLine("*************");
             Console.ReadLine();
            
            Console.ReadLine();
        }

        public static void Hello()
        {
            int i;
            for (i = 1; i <= 5; i++)
            {
                //Thread.Sleep(3000);
                Console.WriteLine("Hello Printed " + i + "  Times");
            }
        }


        public static void Bye()
        {
            int i;
            for (i = 1; i <= 5; i++)
            {
                //Thread.Sleep(3000);
                Console.WriteLine("Bye Printed " + i + "  Times");
            }
        }

    }
}
