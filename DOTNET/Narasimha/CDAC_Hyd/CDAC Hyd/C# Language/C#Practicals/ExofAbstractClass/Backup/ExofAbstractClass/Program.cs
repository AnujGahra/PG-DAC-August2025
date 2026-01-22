using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ExofAbstractClass
{
    public abstract class Liberty
    {
        public Liberty()
        {
            Console.WriteLine("Wel Come To Liberty");
            Console.ReadLine();
        }
        public void Courses()
        {
            Console.WriteLine("We Teach .Net Courses");
            Console.ReadLine();
        }
    }

    public class Employee:Liberty
    {
        public void Work()
        {
            Console.WriteLine("I Work As Proj Manager In Liberty");
            Console.ReadLine();
        }
        public void Address()
        {
            Console.WriteLine("We Work At Vidyanagar Hubli");
            Console.ReadLine();
        }
    }
    class Program
    {
        static void Main(string[] args)
        {

            
            Employee obj = new Employee();
            obj.Courses();
            obj.Work();
            obj.Address();
            
        }
    }
}
