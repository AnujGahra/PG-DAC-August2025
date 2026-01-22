using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ExofConstDest
{
    class Liberty
    {

        public Liberty()
        {
            Console.WriteLine("Wel Come To LCC");
            Console.ReadLine();
        }
        public Liberty(string name)
        {
            Console.WriteLine("Wel Come To Liberty " + name);
            Console.ReadLine();
        }
        public Liberty(int x, int y)
        {
            Console.WriteLine("Result of Add is " + (x + y).ToString());
            Console.ReadLine();
        }
        public void Courses()
        {
            Console.WriteLine("We Teach .Net Courses");
            Console.ReadLine();
        }
                
        public void Address()
        {
            Console.WriteLine("We Work At Vidyanagar Hubli");
            Console.ReadLine();
        }
        ~Liberty()
        {
            Console.WriteLine("Class To Be Cleared From Heap Now");
            Console.ReadLine();
            GC.Collect();
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            //Liberty obj1 = new Liberty();
            //Console.WriteLine("First Object Created");
            //obj1.Courses();
            //obj1.Address();

            Liberty obj2 = new Liberty(10, 40);
            Console.WriteLine("Second Object Created");
            obj2.Address();

            Liberty obj3 = new Liberty("Nandini");
            obj3.Courses();
        }
    }
}
