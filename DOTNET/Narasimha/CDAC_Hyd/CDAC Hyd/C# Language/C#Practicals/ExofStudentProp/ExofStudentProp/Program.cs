using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ExofStudentProp
{
    public class StudentDetails
    {
        private int sno;
        private string sname;

        public string StudentName
        {
            get
            { 
                return sname;
            }
            set
            {
                if (value != "")
                {
                    sname = value;
                }
                else
                {
                    Console.WriteLine("Student Name Cant Be Blank");
                    Console.ReadLine();
                }
            }
        }

        public int StudentNo
        {
            get
            {
                return sno;
            }
            set
            {
                if (value <= 0)
                {
                    Console.WriteLine("Student No Cant Be Zero Or Negativ");
                    Console.ReadLine();
                }
                else
                {
                    sno = value;
                }
            }
        }

    }
    class Program
    {
        static void Main(string[] args)
        {
            

            int n;
            string m;
            Console.WriteLine("Enter Student No");
            n = int.Parse(Console.ReadLine());

            Console.WriteLine("Enter Student Name");
            m = Console.ReadLine();

            StudentDetails obj = new StudentDetails();

            obj.StudentNo = n;
            obj.StudentName = m;
            if (obj.StudentNo != 0)
            {
                Console.WriteLine("You Set Student No " + obj.StudentNo);
            }
            if (obj.StudentName != null)
            {
                Console.WriteLine("You Set Student Name " + obj.StudentName);
            }
                
                Console.ReadLine();
        }
    }
}
