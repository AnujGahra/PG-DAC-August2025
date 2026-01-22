using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace OurFirstProg
{
    class Program
    {
        static void Main(string[] args)
        {
            int total;
            total = AddNo();
            Console.Write("Add No Returned By Method is "+total.ToString());
            Console.ReadLine();

        }

        public static int  AddNo()
        {
            int fno, sno;
            
            Console.Write("Enter First No ");
            fno = int.Parse(Console.ReadLine());
            Console.Write("Enter Second No ");
            sno = int.Parse(Console.ReadLine());

            return fno + sno;
        }
    }
}
