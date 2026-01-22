using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Collections;
namespace ExampleofStack
{
    class Program
    {
        static void Main(string[] args)
        {
            Stack last = new Stack();
            
            last.Push("Item 1");
            last.Push("Item 2");
            last.Push("Item 3");
            last.Push("Item 4");

            last.Pop();
            last.Pop();

            foreach (object obj in last)
            {
                Console.WriteLine("Items in Left in Stack Are :{0}", obj);
            }
            Console.ReadLine();
        }
    }
}
