using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ExofArrayInput
{
    class Program
    {
        static void Main(string[] args)
        {
            int no,i;
            Console.Write("How Many Marks You Want To Enter ");
            no = int.Parse(Console.ReadLine());
            int[] marks = new int[no];
            for (i = 0; i < no; i++)
            {
                Console.WriteLine("Enter Marks ");
                marks[i] = int.Parse(Console.ReadLine());
            }
            Console.WriteLine("***Marks Entered By You Are***");
            for (i = 0; i < no; i++)
            {

                Console.WriteLine(marks[i]);
            }
            Console.ReadLine();
        }

    }
}
