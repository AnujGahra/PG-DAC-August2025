using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ExofPassingClassToList
{

    class Person
    {
        public string Name { get; set; }
    }

    class Program
    {
        static void Main(string[] args)
        {


            List<Person> List = new List<Person>();
            Person obj1 = new Person();
            obj1.Name = "Amit";
            List.Add(obj1);
            obj1= new Person();
            obj1.Name = "Karthik";
            List.Add(obj1);

            foreach (Person O in List)
            {
                Console.WriteLine(O.Name);
            }

            Console.ReadLine();
        }
    }
}
