using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ConsoleApplication1
{
    class Student
    {
       public int stno = 1;
       public string stname = "Krishna";
        DateTime ExamDate = DateTime.Now;
        public void ShowResult(int marks)
        {
            if (marks >= 35)
            {
                Console.WriteLine("You Have Passed  In Exam");
            }
            else
            {
                Console.WriteLine("You Have Failed In Exam");
            }
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            int m;
            Student obj;
            obj = new Student();
            Console.Write("Enter Your Marks ");
            m =int.Parse(Console.ReadLine());
            Console.WriteLine("***Student Details***");
            Console.WriteLine("Student No is " + obj.stno);
            Console.WriteLine("Student Name is " + obj.stname);
            obj.ShowResult(m);
            Console.ReadLine();
        }
    }
}
