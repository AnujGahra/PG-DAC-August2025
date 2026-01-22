using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ClassBasedArray
{
    class Student
    {
        public int stno;
        public string stname;
    }
    class Program
    {
        static void Main(string[] args)
        {
            Student[] Mystudents = new Student[3];
            Mystudents[0] = new Student();
            Mystudents[0].stno = 1;
            Mystudents[0].stname = "Sumit";

            Mystudents[1] = new Student();
            Mystudents[1].stno = 2;
            Mystudents[1].stname = "Sangamesh";

            Mystudents[2] = new Student();
            Mystudents[2].stno = 3;
            Mystudents[2].stname = "Vinayak";
            int i;
            for (i = 0; i <= 2; i++)
            {
                Console.WriteLine("Student No is "+Mystudents[i].stno);
                Console.WriteLine("Student Name is " + Mystudents[i].stname);
                
            }
            Console.ReadLine();
        }
    }
}
