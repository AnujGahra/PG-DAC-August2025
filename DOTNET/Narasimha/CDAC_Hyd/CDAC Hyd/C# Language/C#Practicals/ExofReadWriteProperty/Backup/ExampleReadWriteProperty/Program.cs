using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ExampleReadWriteProperty
{
    public class CustomerDetails
    {
        int cno = 10;
        string cname = "";
        public int CustomerNo
        {
            get
            {
                return cno;
            }
        }
        
        public string CustomerName
        {
            set
            {
                cname = value;
                Console.WriteLine("U Set Customer Name " + cname);
                Console.ReadLine();
            }
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            CustomerDetails obj = new CustomerDetails();
            Console.WriteLine("Your Customer No is " + obj.CustomerNo);
            Console.ReadLine();
            obj.CustomerName = "Sneha";
           
        }
    }
}
