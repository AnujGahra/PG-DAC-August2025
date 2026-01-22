using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ExofPropException
{
    class CustomerDetails
    {
        private int cno;
        private string cname;
        public int CustomerNo
        {
            get
            {
                return cno;
            }
            set
            {
                if (value <= 0)
                {
                    throw new ArgumentOutOfRangeException();
                }
                else
                {
                    cno = value;
                }
            }
        }
        public string CustomerName
        {
            get
            {
                return cname;
            }
            set
            {
                if (string.IsNullOrEmpty(value))
                {
                    throw new Exception("Customer Name Cant Be Blank");
                }
                else
                {
                    cname = value;
                }
            }
        }

        

    }

    class Program
    {
        static void Main(string[] args)
        {
            CustomerDetails obj = new CustomerDetails();
            
            try
            {
                int no;
                string name;
                Console.WriteLine("Enter Customer No");
                no = int.Parse(Console.ReadLine());
                obj.CustomerNo = no;

                Console.WriteLine("Enter Customer Name");
                name = Console.ReadLine();
                obj.CustomerName = name;

                Console.WriteLine("You Entered Customer No " + obj.CustomerNo);
                Console.WriteLine("You Entered Customer Name " + obj.CustomerName);

            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
            Console.ReadLine();
        }
    }
}
