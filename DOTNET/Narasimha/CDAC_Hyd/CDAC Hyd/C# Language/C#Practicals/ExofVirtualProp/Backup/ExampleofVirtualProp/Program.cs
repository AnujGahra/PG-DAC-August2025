using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ExampleofVirtualProp
{

    public class Customer
    {
       public string fname = "";
       public string lname = "";
       public string fullname = "";

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

    public class Bank:Customer
    {
        public override string Cflname
        {
            get
            {
               return "Hello "+fname + " " + lname;
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

            Bank obj = new Bank();
            obj.Cfname = n;
            obj.Clname = m;
            Console.WriteLine(obj.Cflname);
            Console.ReadLine();
        }
    }
}
