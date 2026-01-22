using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Collections;
namespace ExampleofSortList
{
    class Program
    {
        static void Main(string[] args)
        {
            SortedList students = new SortedList();
            students["vi"] = "Vinod";
            students["br"] = "Bharat";
            students["mn"] = "Mahalaxmi";
            students["am"] = "Amruta";
            students["sh"] = "Shivu";
            students["gn"] = "Ganesh";
            string sname = Convert.ToString(students.GetByIndex(2));
            Console.WriteLine("Second Student is  " + sname);
            Console.ReadLine();
            int i;
            for (i = 0; i < students.Count; i++)
            {
                Console.WriteLine(students.GetByIndex(i).ToString());
            }
            Console.ReadLine();
        }
    }
}

