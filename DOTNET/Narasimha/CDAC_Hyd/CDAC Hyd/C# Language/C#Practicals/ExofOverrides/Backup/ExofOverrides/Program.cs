using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ExofOverrides
{
    public class Student
    {
        public virtual void Course()
        {
            Console.WriteLine("Oracle is Tough Course");
            Console.ReadLine();
        }
    }

    public class StudentDetails:Student
    {
        public override void Course()
        {
            Console.WriteLine("Oracle is Easy Course");
            Console.ReadLine();
        }
        

    }
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Parent Class Object");
            Student obj1 = new Student();
            obj1.Course();

            Console.WriteLine("Child Class Object");
            StudentDetails obj2 = new StudentDetails();
            obj2.Course();
        }
    }
}
