using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ExofStaticPartialClass
{

    public static partial class Test
    {
       public static void Hello(string name)
        {
            Console.WriteLine("Hello How Are You   " + name);
            Console.ReadLine();
        }
    }

    public static partial class Test
    {
        public static void Bye(string name)
        {
            Console.WriteLine("Bye Good Night  " + name);
            Console.ReadLine();
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            Test.Hello("Ganesh");
            Test.Bye("Seshan");
        }
    }
}
