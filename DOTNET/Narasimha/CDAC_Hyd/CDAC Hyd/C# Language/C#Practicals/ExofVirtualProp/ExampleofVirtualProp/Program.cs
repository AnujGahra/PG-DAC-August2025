using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ExampleofVirtualProp
{

    public class Customer
    {
       private string fname = "";
       private string lname = "";

       public string Cfname
        {
            set
            {
                fname = value;
            }
            get
            {
                return fname;
            }
          }
            public string Clname
             {
            set
            {
                lname = value;
            }
            get
            {
                return lname;
             }
           }

            public virtual string Cflname
            {
                get
                {
                    return fname + " " + lname;
                }
            }
    }

    

    class Program
    {
        static void Main(string[] args)
        {
            string n;
            string m;
            Console.Write("Enter First Name  :");
            n = Console.ReadLine();

            Console.Write("Enter Last Name  :");
            m = Console.ReadLine();

            Customer obj = new Customer();
            obj.Cfname = n;
            obj.Clname = m;
            Console.WriteLine("Your Customer Full Name is  "+obj.Cflname);
            Console.ReadLine();
        }
    }
}
