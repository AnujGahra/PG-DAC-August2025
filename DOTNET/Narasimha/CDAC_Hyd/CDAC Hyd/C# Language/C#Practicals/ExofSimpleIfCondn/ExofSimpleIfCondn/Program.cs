using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ExofSimpleIfCondn
{
    class Program
    {
        static void Main(string[] args)
        {
            int marks;
            Console.Write("Enter Your Marks  ");
            marks = int.Parse(Console.ReadLine());
            if (marks >= 35)
            {
                Console.Write("You Have Passed Exam");
            }
            else
            {
                Console.Write("You Have Failed Exam");
            }
            Console.ReadLine();
        }
    }
}
