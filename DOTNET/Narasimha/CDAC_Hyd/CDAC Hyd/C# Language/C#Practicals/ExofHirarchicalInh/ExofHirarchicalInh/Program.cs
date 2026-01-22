using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ExofHirarchicalInh
{

    public class Liberty
    {
        public Liberty()
        {
            Console.WriteLine("Wel Come To Liberty");
        }

        public void Address()
        {
            Console.WriteLine("We Work At Vidyanagar Hubli");
        }

    }

    public class CourseOracle:Liberty
    {
        public void Details()
        {
            Console.WriteLine("You Have Taken Oracle Course");
        }
    }

    public class CourseJava : Liberty
    {
        public void Details()
        {
            Console.WriteLine("You Have Taken Java Course");
        }
    }


    class Program
    {
        static void Main(string[] args)
        {
            CourseOracle obj1 = new CourseOracle();
            obj1.Details();
            obj1.Address();

            CourseJava obj2 = new CourseJava();
            obj2.Details();
            obj2.Address();
            Console.ReadLine();
        }
    }
}
