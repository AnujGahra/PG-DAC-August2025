using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ConsoleApplication1
{
    public interface ICustomer
    {
        void PrintDetails();
    }

    class CurrentAccount : ICustomer
    {
        public void PrintDetails()
        {
            Console.WriteLine("Details Of Current Account..");
        }
    }
    class SavingAccount : ICustomer
    {
        public void PrintDetails()
        {
            Console.WriteLine("Details Of Saving Account..");
        }
    }

    class Customer
    {
        private ICustomer cust;

        public Customer(ICustomer ct) // Parameterized Constructor
        {
            this.cust = ct;
        }

        public void PrintAccounts()
        {
            cust.PrintDetails();
        }

    }

    class Program
    {
        static void Main(string[] args)
        {
            ICustomer ca = new CurrentAccount();
            Customer a = new Customer(ca);
            a.PrintAccounts();

            ICustomer sa = new SavingAccount();
            Customer a2 = new Customer(sa);
            a2.PrintAccounts();

            Console.ReadLine();

        }
    }
}
