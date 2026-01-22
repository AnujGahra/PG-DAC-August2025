using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ExofDynamicArray
{
    class Program
    {
        static void Main(string[] args)
        {
            int no,i;
            
            Console.Write("How many Marks You Want To Enter ");
            no = int.Parse(Console.ReadLine());
            int[] marks = new int[no];
            int j;
            for (i = 0; i < no; i++)
            {
                j=i+1;
                Console.Write("Enter Marks "+j+" ");
                marks[i] =int.Parse(Console.ReadLine());

            }
            Console.WriteLine("***Marks Entered By You***");
            int h;
            for (i = 0; i < no; i++)
            {
                h=i+1;
                Console.WriteLine("Marks " + h + " is " + marks[i]);
            }
            Console.ReadLine();
        }
    }
}
