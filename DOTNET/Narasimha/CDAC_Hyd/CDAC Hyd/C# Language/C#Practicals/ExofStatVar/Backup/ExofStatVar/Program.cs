using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ExofStatVar
{
    class Students
    {
        static int ctr = 0;
        public void Increment()
        {
            ctr = ctr + 1;
        }
        public void Display()
        {
            Console.WriteLine("Value of Counter Now is  " + ctr);
            Console.ReadLine();
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            Students obj1 = new Students();
            obj1.Increment();
            obj1.Display();

            Students obj2 = new Students();
            obj2.Increment();
            obj2.Display();

            Students obj3 = new Students();
            obj3.Increment();
            obj3.Display();
        }
    }
}
