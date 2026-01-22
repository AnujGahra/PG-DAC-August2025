using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace MyFirstPr
{
    class Program
    {
        static void Main()
        {
            string course;
            Console.Write("Enter Your Course ");
            course = Console.ReadLine();
            if (course != "java")
            {
                Console.Write("You Are From Other Degree");
            }
            else
            {
                Console.Write("You Are From Engineering College");
            }
            Console.ReadLine();
        }
    }
    }

