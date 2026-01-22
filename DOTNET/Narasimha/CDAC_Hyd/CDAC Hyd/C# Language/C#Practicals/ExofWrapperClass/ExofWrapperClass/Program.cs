using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ExofWrapperClass
{
    class TestWrapper //Wrapper Class
    {
        class InnerClass //Inner Class
        {
           public int IncrementValue(int no)
            {
               return no + 1;

            }

        }

       public int CallRapper()
        {

            TestWrapper.InnerClass wpr = new TestWrapper.InnerClass(); // Internally call to Wrapper class.

            return wpr.IncrementValue(100);

        }

    }

   class Program
    {
        static void Main(string[] args)
        {
            int no;
            TestWrapper obj = new TestWrapper();
            no=obj.CallRapper();
            Console.WriteLine("Value of No After Increment From Wrapper is " + no.ToString());
            Console.ReadLine();
        }
    }
}
