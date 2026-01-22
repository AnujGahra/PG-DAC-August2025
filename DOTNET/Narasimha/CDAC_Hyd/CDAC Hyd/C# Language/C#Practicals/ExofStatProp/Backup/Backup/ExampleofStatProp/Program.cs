using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ExampleofStatProp
{
    public class Liberty
    {
        private static string stname = "";
        public Liberty()
        {
            Console.WriteLine("Wel Come To Liberty");
        }
        public static string StudentName
        {
            get
            {
                return stname;
            }
            set
            {
                stname = value;
            }
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            
            Liberty obj = new Liberty();
           // Liberty.StudentName = "KRISHNA";
            Console.WriteLine("You Set Student Name " + Liberty.StudentName);
            Console.ReadLine();
        }
    }

}