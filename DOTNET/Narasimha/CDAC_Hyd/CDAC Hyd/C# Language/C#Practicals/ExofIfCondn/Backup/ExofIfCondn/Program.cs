using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ExofIfCondn
{
    class Abhijeet
    {
        static void Main(string[] args)
        {
            int marks;
            
            Console.WriteLine("Enter Your Marks");
            marks = int.Parse(Console.ReadLine());
            if(marks>=80)
            {
                Console.WriteLine("You Passed Dist");
                
            }
            else if (marks >= 60 && marks < 80)
            {
                Console.WriteLine("You Passed First Class");
            }
            else if (marks >= 35 && marks < 60)
            {
                Console.WriteLine("You Passed Pass Class");
            }

            else
            {
                Console.WriteLine("You Failed");
            }
            Console.ReadLine();
        }
       
    }
}
