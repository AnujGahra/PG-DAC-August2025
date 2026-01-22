using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Collections;
namespace ExofArrayList
{
    class Program
    {
        static void Main(string[] args)
        {
            ArrayList Arr1 = new ArrayList();
            Arr1.Add(1);
            Arr1.Add("Amit");
            Arr1.Add("Karthik");
            Arr1.Add("Siddarth");
            Arr1.Add(100.25);
            Arr1.Add(DateTime.Now.ToShortDateString());
            Console.WriteLine("Data Present in Array List is ");
            Arr1.RemoveAt(3);
            Arr1.Insert(2, "Vandana");
            Arr1.Reverse();
            foreach (var x in Arr1)
            {
                Console.WriteLine(x);

            }
            Console.ReadLine();
        }
    }
}
