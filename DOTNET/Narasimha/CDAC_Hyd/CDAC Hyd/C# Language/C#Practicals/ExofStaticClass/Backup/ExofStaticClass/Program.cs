using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
namespace ExofStaticClass
{
    public static class Test
    {
       static int x=0;
       static Test()
       {
           Console.WriteLine("Constructor Executed One Time");
           Console.ReadLine();
       }
       public static void Increment()
       {
           x = x + 1;
       }
       public static void Display()
       {
           Console.WriteLine("Value of X  Now  is  " + x);
           Console.ReadLine();
       }
    }
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("First Object Created");
            Test.Increment();
            Test.Display();

            Console.WriteLine("Second Object Created");
            Test.Increment();
            Test.Display();
            
            Console.WriteLine("Third Object Created");
            Test.Increment();
            Test.Display();
        }
    }
}
