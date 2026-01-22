using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ExofIterators
{
    class Program
    {
        static void Main(string[] args)
        {
            foreach(int no in OddNumbers())
            {
                Console.WriteLine("Number is  " + no.ToString());
                
            }
            Console.ReadLine();
        }

        public static System.Collections.IEnumerable OddNumbers()
        {
            yield return 3;
            yield return 5;
            yield return 7;
        }
    }
}
