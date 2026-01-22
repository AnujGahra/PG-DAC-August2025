using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ExofPartialMethod
{
    public partial class Customer
    {
        partial void CustomerAdded(string cn);

        public void AddingCustomer(string cn)
        {            
            Console.WriteLine("Adding Customer  " + cn);
            CustomerAdded(cn);
        }
    }

    public partial class Customer
    {
        partial void CustomerAdded(string cn)
        {
            Console.WriteLine("Customer " + cn + "  Added To Class Now");
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            string name = "";
            Console.WriteLine("Enter Your Customer Name   ");
            name = Console.ReadLine();
            
            Customer obj = new Customer();
            obj.AddingCustomer(name);
           
            Console.ReadLine();
        }
    }
}
