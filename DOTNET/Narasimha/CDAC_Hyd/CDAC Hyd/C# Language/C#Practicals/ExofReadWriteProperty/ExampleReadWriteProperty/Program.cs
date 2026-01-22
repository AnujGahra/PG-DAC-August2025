using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ExampleReadWriteProperty
{
    public class StudentDetails
    {
       private int MinMarks = 35;
       private int MaxMarks;
        public int StudentMinMarks
        {
            get
            {
                return MinMarks;
            }
        }

        public int StudentMaxMarks
        {
            set
            {
                if (value <=100 && value>35)
                {
                    MaxMarks = value;
                    Console.WriteLine("U Set Max Marks  As  " + MaxMarks.ToString());
                }
                else
                {
                    Console.WriteLine("Max Marks Set Wrongly");
                }
            }
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            StudentDetails obj = new StudentDetails();
            Console.WriteLine("Min Marks For Exam is " + obj.StudentMinMarks);
            Console.Write("Enter Max Marks For Exam :");
            obj.StudentMaxMarks = int.Parse(Console.ReadLine());
            Console.ReadLine();
        }
    }
}
