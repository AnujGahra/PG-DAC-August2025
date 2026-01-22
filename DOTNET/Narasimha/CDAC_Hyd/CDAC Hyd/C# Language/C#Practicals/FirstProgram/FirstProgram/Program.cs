using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace FirstProgram
{
    class Student
    {
        public int sno = 1;
        public string sname = "Rakesh";
        public void ShowResult(int marks)
        {
           
            if (marks >= 35)
            {
                Console.WriteLine("You Have Passed In Exam");
            }
            else
            {
                Console.WriteLine("You Have Failed In Exam");
            }
        }
    }
    class Program
    {
        static void Main()
        {
            int m;
            Student obj;
            obj = new Student();
            Console.Write("Enter Your Marks ");
            m = int.Parse(Console.ReadLine());
            Console.WriteLine("***Student Details");
            Console.WriteLine("Student No is " + obj.sno);
            Console.WriteLine("Student Name is " + obj.sname);
            obj.ShowResult(m);
            Console.ReadLine();
        }
    }
}
