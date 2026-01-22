using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ExofAutoImpArray
{
    class Program
    {
        static void Main(string[] args)
        {
            int no;
            int i;
            Console.Write("How Many Names You Want To Enter  ");
            no = int.Parse(Console.ReadLine());
            string[] m = new String[no];
            for (i = 0; i < no; i++)
            {
                Console.Write("Enter Name ");
                m[i] = Console.ReadLine();
            }

         string[] names = new List<string>(m).ToArray() ;
         foreach(string x in names)
        {
            Console.WriteLine(x);
        }

         Console.ReadLine();
        
         }
    }
}
