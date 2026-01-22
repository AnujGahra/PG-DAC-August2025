using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ExofConstDest
{
    class Liberty
    {
        //public Liberty()
        //{
        //    Console.WriteLine("Wel Come To Liberty");
        //    Console.ReadLine();
        //}

        public Liberty(string name)
        {
            Console.WriteLine("Wel Come To Liberty " + name);
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
            Console.WriteLine("Object To Be Killed Now");
            Console.ReadLine();
            GC.Collect();
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            //Liberty obj1 = new Liberty();
            //obj1.Courses();
            //obj1.Address();

            Liberty obj2 = new Liberty("Ujval");
            obj2.Courses();
            obj2.Address();
        }
    }
}
